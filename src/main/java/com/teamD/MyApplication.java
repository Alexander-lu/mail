package com.teamD;

import com.teamD.bean.Student;
import com.teamD.dao.StudentDao;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;
import com.teamD.service.FansQueryService;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.util.List;
import java.util.Map;
/**
*myApplication会自动扫描com.teadD包下的所有java文件
 * @author teamD
 * @version 1.0
 * 20220628
 **/
@MapperScan("com/teamD/dao")
@RestController
@EnableAutoConfiguration
@ComponentScan("com/teamD/service")
@RequestMapping("/api")
public class MyApplication {
    @Autowired
    private StudentDao dao;
    @Resource
    private FansQueryService fansQueryService;
    /**
     * 发送邮件
     * @param data mail，保存在一个Map里
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
     * 往数据库里增加账号密码
     * @param data username和password，保存在一个Map里
     * @param response http回复
     * @return 登陆结果，以json字符串返回
     */
    @PostMapping("/insert")
    public String insert(@RequestBody Map<String, String> data, HttpServletResponse response) {
        String username = data.get("username");
        String password = data.get("password");
        String mail = data.get("mail");
        Student newS = new Student(username,password,mail);
        dao.insertStudent(newS);
        return "{\"status\": \"good\"}";
    }
    /**
     * 往数据库里更改账号密码
     * @param data
     * @param response http回复
     * @return 登陆结果，以json字符串返回
     */
    @PostMapping("/update")
    public String update(@RequestBody Map<String, String> data, HttpServletResponse response) {
        String username = data.get("username");
        String password = data.get("password");
        Student newS = new Student(username,password);
        dao.updateStudent2(newS);
        return "{\"status\": \"good\"}";
    }
    /**
     * 往数据库里删除账号密码
     * @param data username和password
     * @param response http回复
     * @return 登陆结果，以json字符串返回
     */
    @PostMapping("/delete")
    public String delete(@RequestBody Map<String, String> data, HttpServletResponse response) {
        String username = data.get("username");
        dao.deleteStudent(username);
        return "{\"status\": \"good\"}";
    }

    @GetMapping("/select")
    List<Student> select() {
        List<Student> students = dao.selectStudent();
        return students;
    }

    /**
     * 登陆
     * @param data username和password，保存在一个Map里
     * @param response HTTP回复
     * @return 登陆结果，以json字符串返回
     */
    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> data, HttpServletResponse response) {
        String username = data.get("username");
        String password = data.get("password");
        String responseJson;
        List<Student> students = dao.selectStudent();
        boolean ifExist = false;
        for (Student student : students) {
            if(student.getUsername().equals(username)&&student.getPassword().equals(password)){
                ifExist = true;
            }
        }
        if(ifExist){
            responseJson = "{\"status\": \"good\"}";
        }else {
            responseJson = "{\"status\": \"bad\", \"errMsg\": \"用户名密码错误\"}";
        }
        return responseJson;
    }

    /**
     * 启动服务器
     */
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(MyApplication.class, args);
        DataSource bean = applicationContext.getBean(DataSource.class);
        System.out.println(bean);
    }
}