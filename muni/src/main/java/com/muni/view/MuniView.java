package com.muni.view;

import java.util.*;

import com.muni.controller.MuniController;
import com.muni.controller.MuniControllerInterface;

public class MuniView {

	public static void main(String[] args) {
		
		String s = "y";
		
		Scanner sc = new Scanner(System.in);
		
		while(s.equals("y")) {
			
			System.out.println("********** Main Menu **********");
			System.out.println("Press 1 to Create Profile");
			
			System.out.println("Enter your choice: ");
			int ch = sc.nextInt();
			
			MuniControllerInterface mc = new MuniController();
			
			switch(ch) {
				case 1:
					mc.createProfileController();
					break;
				
				default:
					System.out.println("Wrong Choice");
			}
			System.out.println("Press y to continue");
			s = sc.next();
		}

	}

}
