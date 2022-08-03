package com.example.bootwithpostgres2;

import org.springframework.stereotype.Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void createTable()
    {
        String query = "create table student(id SERIAL PRIMARY KEY , name varchar(255) NOT NULL, ciy VARCHAR(255))";
        int update=this.jdbcTemplate.update(query);
        System.out.println(update);
    }

    public void insertData(String name, String city)
    {

        String query = "insert into student(name, city) values (?,?)";
        int update  =  this.jdbcTemplate.update(query,name,city);
        System.out.println(update+" rows added ");


    }

    public void deleteData(int id)
    {
        String query = "delete from student where id = ?";
        int update = this.jdbcTemplate.update(query,id);
        System.out.println(update+" row deleted ");
    }

    public void updateData()
    {
        String query = "update student set name = 'xyz' where id = 2";
        int update = this.jdbcTemplate.update(query);
        System.out.println(update+ " updated successfully ");

    }



}
