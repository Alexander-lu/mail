package com.teamD.mapper;

import com.teamD.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface Mysql {
    //增
    @Update("INSERT into user(username,password,mail) VALUES(#{username},#{password},#{mail});")
    public void insertStudent(Student student);

    //删
    @Update("delete from user where username=#{username};")
    public void deleteStudent(String username);

    //改
    @Update("update user set username=#{username},password=#{password},mail=#{mail} where username=#{username};")
    public void updateStudent(Student student);
    @Update("update user set username=#{username},password=#{password} where username=#{username};")
    public void updateStudent2(Student student);
    //查
    @Select("SELECT * FROM `user`;")
    public List<Student> selectStudent();

}
