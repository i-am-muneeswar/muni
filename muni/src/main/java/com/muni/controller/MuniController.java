package com.muni.controller;

import java.util.Scanner;

import com.muni.entity.MuniUser;
import com.muni.service.MuniService;
import com.muni.service.MuniServiceInterface;

public class MuniController implements MuniControllerInterface {

	public void createProfileController() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = sc.next();
		
		System.out.println("Enter password: ");
		String password = sc.next();
		
		System.out.println("Enter email: ");
		String email = sc.next();
		
		System.out.println("Enter address: ");
		String address = sc.next();
		
		MuniUser mu = new MuniUser();
		mu.setName(name);
		mu.setPassword(password);
		mu.setEmail(email);
		mu.setAddress(address);
		
		MuniServiceInterface mc = new MuniService();
		int i = mc.createProfileService(mu);
		
		if(i>0) {
			System.out.println("Your Profile is created "+name);
		}
		
		else {
			System.out.println("Profile not created");
		}

	}

}
