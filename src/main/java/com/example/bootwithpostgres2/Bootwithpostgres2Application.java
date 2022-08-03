package com.example.bootwithpostgres2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Bootwithpostgres2Application implements CommandLineRunner {

	@Autowired
	private StudentDao studentDao;

	public static void main(String[] args) {
		SpringApplication.run(Bootwithpostgres2Application.class, args);
		System.out.println("Hello world");
	}

	@Override
	public void run(String... args) throws Exception {
		//this.studentDao.createTable();
		this.studentDao.insertData("abc","Nashik");
		//this.studentDao.deleteData(1);
		//this.studentDao.updateData();
	}
}
