package dao;

import bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface StudentDao {
    //增
    @Update("INSERT into student(name,password) VALUES(#{name},#{password});")
    public boolean insertStudent(Student student);

    //删
    @Update("delete from student where id=#{id};")
    public boolean deleteStudent(Integer id);

    //改
    @Update("update student set name=#{name},password=#{password} where id=#{id};")
    public boolean updateStudent(Student student);

    //查
    @Select("SELECT * FROM `student`;")
    public List<Student> selectStudent();

}
