package com.teamD.controllor;

import com.convertapi.client.Config;
import com.convertapi.client.ConvertApi;
import com.teamD.entity.Student;
import com.teamD.mapper.Mysql;
import org.apache.catalina.mapper.Mapper;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.teamD.Service.FansQueryService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Controller则负责对数据和页面进行协调
 * MapperScan("com/teamD/mapper")表明需要在mapper文件里面扫描Mysql这个类
 * ComponentScan("com/teamD/Service")表明需要在Service文件夹里扫描FansQueryService这个类
 *
 * @author teamD
 * @version 1.0
 * 20220628
 **/
@RestController
@EnableAutoConfiguration
@MapperScan("com/teamD/mapper")
@ComponentScan("com/teamD/Service")
public class Controller {
    @Autowired
    private Mysql mysql;
    @Resource
    private FansQueryService fansQueryService;

    /**
     * 发送邮件
     *
     * @param data     mail，保存在一个Map里
     * @param response http回复
     * @return 登陆结果，以json字符串返回
     * @throws Exception 发送邮件异常
     */
    @PostMapping("/sendMail")
    public String sendMail(@RequestBody Map<String, String> data, HttpServletResponse response) throws Exception {
        String mail = data.get("mail");
        fansQueryService.fansQuery(mail);
        return "{\"status\": \"good\"}";
    }

    /**
     * 往数据库里增加账号密码邮箱
     *
     * @param data     username和password，保存在一个Map里
     * @param response http回复
     * @return 登陆结果，以json字符串返回
     */
    @PostMapping("/insert")
    public String insert(@RequestBody Map<String, String> data, HttpServletResponse response) {
        String username = data.get("username");
        String password = data.get("password");
        String mail = data.get("mail");
        Student newS = new Student(username, password, mail);
        mysql.insertStudent(newS);
        return "{\"status\": \"good\"}";
    }

    /**
     * 往数据库里更改账号密码
     *
     * @param data
     * @param response http回复
     * @return 登陆结果，以json字符串返回
     */
    @PostMapping("/update")
    public String update(@RequestBody Map<String, String> data, HttpServletResponse response) {
        String username = data.get("username");
        String password = data.get("password");
        Student newS = new Student(username, password);
        mysql.updateStudent2(newS);
        return "{\"status\": \"good\"}";
    }

    /**
     * 往数据库里删除账号
     *
     * @param data     username和password
     * @param response http回复
     * @return 登陆结果，以json字符串返回
     */
    @PostMapping("/delete")
    public String delete(@RequestBody Map<String, String> data, HttpServletResponse response) {
        String username = data.get("username");
        mysql.deleteStudent(username);
        return "{\"status\": \"good\"}";
    }

    /**
     * 查看数据库的所有数据
     *
     * @return 数据库的所有数据
     */
    @GetMapping("/select")
    List<Student> select() {
        List<Student> students = mysql.selectStudent();
        return students;
    }

    /**
     * 登陆
     *
     * @param data     username和password，保存在一个Map里
     * @param response HTTP回复
     * @return 登陆结果，以json字符串返回
     */
    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> data, HttpServletResponse response) {
        String username = data.get("username");
        String password = data.get("password");
        String responseJson;
        List<Student> students = mysql.selectStudent();
        boolean ifExist = false;
        for (Student student : students) {
            if (student.getUsername().equals(username) && student.getPassword().equals(password)) {
                ifExist = true;
            }
        }
        if (ifExist) {
            responseJson = "{\"status\": \"good\"}";
        } else {
            responseJson = "{\"status\": \"bad\", \"errMsg\": \"用户名密码错误\"}";
        }
        return responseJson;
    }

    @PostMapping("/url2pdf")
    public String convert(@RequestBody Map<String, String> data, HttpServletResponse response) {
        String responseJson;
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date today = Calendar.getInstance()
                .getTime();
        String dateToString = formatter.format(today);
        String url = data.get("url");
        Config.setDefaultSecret("J0uMB0UBPUgTI3zJ");
        ConvertApi.convertUrl(url, "src/convertedPDFs/" + dateToString + ".pdf");
        File convertedfile = new File("src/convertedPDFs/" + dateToString + ".pdf");
        if (convertedfile.exists()) {
            responseJson = "{\"status\": \"good\", \"msg\": \" success\"}";
        } else {
            responseJson = "{\"status\": \"bad\", \"msg\": \" fail\"}";
        }
        return responseJson;
    }
//    @RequestMapping(value = "/download", method = GET)
//    public ResponseEntity download() throws IOException {
//        File file = new File("HelloWorld.pdf");
//        InputStream in = new FileInputStream(file);
//        final HttpHeaders headers = new HttpHeaders();
//        headers.add("Content-Type", "application/pdf");
//        headers.add("Content-Disposition", "attachment; filename=" + file.getName() );
//        return new ResponseEntity<>(IOUtils., headers, HttpStatus.OK);
//    }
}
