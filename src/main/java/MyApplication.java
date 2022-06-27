import bean.Student;
import dao.StudentDao;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.FansQueryService;

import javax.annotation.Resource;
import java.util.List;

@MapperScan("dao")
@RestController
@EnableAutoConfiguration
@ComponentScan("service")
public class MyApplication {
    @Autowired
    private StudentDao dao;
    @Resource
    private FansQueryService fansQueryService;

    @GetMapping("/sendMail")
    String sendMail() throws Exception {
        fansQueryService.fansQuery();
        return "ok";
    }

    @GetMapping("/insert")
    String insert() {
        Student s = new Student();
        s.setName("a");
        s.setPassword("123456");
        dao.insertStudent(s);
        return "ok";
    }

    @GetMapping("/update")
    String update() {
        Student s = new Student();
        s.setId(2);
        s.setName("b");
        s.setPassword("123456");
        dao.updateStudent(s);
        return "ok";
    }

    @GetMapping("/delete")
    String delete(Integer id) {
        dao.deleteStudent(id);
        return "ok";
    }

    @GetMapping("/select")
    List<Student> select() {
        List<Student> students = dao.selectStudent();
        return students;
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}