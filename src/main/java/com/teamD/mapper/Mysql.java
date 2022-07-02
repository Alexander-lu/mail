package com.teamD.mapper;

import com.teamD.entity.Convertedfile;
import com.teamD.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
/**
 *Mysql是处理数据库的类
 * mysql语法可以参考下面的网址
 * <a href="https://www.runoob.com/mysql/mysql-tutorial.html">mysql教程</a>
 * @author teamD
 * @version 1.0
 * 20220628
 **/
@Mapper
public interface Mysql {
    /**
     * MySQL 表中使用 INSERT INTO SQL语句来插入数据。
     *INSERT INTO table_name ( field1, field2,...fieldN )
     *                        VALUES
     *                        ( value1, value2,...valueN );
     *如果数据是字符型，必须使用单引号或者双引号，如："value"。
     * SQL 语句的命令结束符为分号 ;
     * @param student 需要插入的数据
     */
    @Update("INSERT into user(username,password,mail) VALUES(#{username},#{password},#{mail});")
    public void insertStudent(Student student);
    @Update("INSERT into store(a,b) VALUES(#{a},#{b});")
    public void insertFile(Convertedfile convertedfile);

//    @Update("INSERT into store(a,b) VALUES(#{a},#{b});")
//    public void insertFile(Convertedfile filename);


    /**
     * 语法:
     * DELETE FROM 表名 [WHERE 条件] [ORDER BY...] [LIMIT row_count];
     * DELETE FROM要求指定从中删除数据的表名，WHERE子句过滤要删除的行，ORDER BY子句按照指定的顺序对行进行删除操作，LIMIT子句限制可删除的行数
     * DELETE不需要列名或通配符。DELETE删除整行而不是删除列，为了删除指定的列，可使用UPDATE语句
     * @param username 需要删除的账号名
     */
    @Update("delete from user where username=#{username};")
    public void deleteStudent(String username);

    /**
     * 如果我们需要修改或更新 MySQL 中的数据，我们可以使用 SQL UPDATE 命令来操作。
     * UPDATE table_name SET field1=new-value1, field2=new-value2
     * [WHERE Clause]
     * @param student 需要修改的数据
     */
    @Update("update user set username=#{username},password=#{password},mail=#{mail} where username=#{username};")
    public void updateStudent(Student student);
    @Update("update user set username=#{username},password=#{password} where username=#{username};")
    public void updateStudent2(Student student);



    /**
     * MySQL 数据库使用SQL SELECT语句来查询数据。
     * SELECT column_name,column_name
     * FROM table_name
     * [WHERE Clause]
     * [LIMIT N][ OFFSET M]
     * 你可以使用星号（*）来代替其他字段，SELECT语句会返回表的所有字段数据
     * @return 所有的数据
     */
    @Select("SELECT * FROM `user`;")
    public List<Student> selectStudent();

    @Select("SELECT * FROM `store`;")
    public List<Convertedfile> selectConvertedfile();

}
