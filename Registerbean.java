package com.example.demo.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Register;
import com.example.demo.repository.RegisterRepository;

@Component
public class Registerbean {
	@Autowired
	RegisterRepository repo;

	public void saveRegister(Register r) {
		repo.save(r);

		System.out.println("name saved-->" + r.getloginName());
		System.out.println("password saved-->" + r.getpassword());
		System.out.println("emailid saved-->" + r.getemailId());
		System.out.println("contactnumber saved-->" + r.getcontactNumber());
		System.out.println("gender saved-->" + r.getgender());
	}
	

}
