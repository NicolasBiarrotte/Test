package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import dao.IEleveDAO;
import entities.Eleve;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(SpringBootApplication.class, args);
		IEleveDAO elevedao = ctx.getBean(dao.IEleveDAO.class);
		
		Eleve e = new Eleve("Biarrotte", "Nicolas", null);
		elevedao.save(e);
	}

}
