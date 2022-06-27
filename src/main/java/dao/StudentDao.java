package dao;

import bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface StudentDao {

    @Update("INSERT into student(name,password) VALUES(#{name},#{password});")
    public boolean insertStudent(Student student);

    @Select("SELECT * FROM `student`;")
    public List<Student> selectStudent();

    @Update("delete from student where id=#{id};")
    public boolean deleteStudent(Integer id);

    @Update("update student set name=#{name},password=#{password} where id=#{id};")
    public boolean updateStudent(Student student);
}
