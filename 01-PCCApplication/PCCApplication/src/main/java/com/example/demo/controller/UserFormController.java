package com.example.demo.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.User;
import com.example.demo.entity.UserRegister;
import com.example.demo.service.UserService;

@Controller
@RequestMapping("/email")
public class UserFormController {
	//inject user service 
		private UserService userService ; 
		
		@Autowired 
		public UserFormController(UserService theuserService) {
			userService = theuserService ;
		}	
		
		@GetMapping("/")
		public String EmptyForm( Model model) {	
			//User user = new User();
			//model.addAttribute("user", user);
			return "form";
		}
		
		@PostMapping("/")
		public String postForm(@ModelAttribute("user") User theUser,Model model) {		
			//theUser.setId(0);
			//userService.save(theUser);
			return "redirect:/email/profile";
		}
		
	//add mapping for get user id 
		@GetMapping("/{mobile}")
		public String getUserbyEmail(@PathVariable String mobile,Model model) {
			System.out.println(mobile);
			User theUser = userService.findByMobile(mobile);
			System.out.println(theUser);
			if (theUser == null) {
				return "form";
			}
			Date dob = theUser.getBirthdate(); 			
			String pattern = "yyyy-MM-dd";
			DateFormat df = new SimpleDateFormat(pattern);
			String date = df.format(dob);
			
			model.addAttribute("formid",theUser.getId());
			model.addAttribute("name",theUser.getName());
			model.addAttribute("fathername",theUser.getFatherName());
			model.addAttribute("dob",date);
			model.addAttribute("gender",theUser.getGender());			
			model.addAttribute("nomineename",theUser.getNomineeName());
			model.addAttribute("relationship",theUser.getRelationship());			
			model.addAttribute("mobile",mobile);
			model.addAttribute("phone",theUser.getPhoneNumber());
			model.addAttribute("email",theUser.getEmail());
			model.addAttribute("houseNumber",theUser.getHouseNumber());
			model.addAttribute("locality",theUser.getLocality());
			model.addAttribute("street",theUser.getStreet());
			model.addAttribute("landmark",theUser.getLandmark());
			model.addAttribute("pin",theUser.getPin());
			
			return "form" ;
			}
		
		@GetMapping("/profile")
		public String profileRedirect() {
			System.out.println("profile");
			return "profile";
		}
		
		@GetMapping("/habits")
		public String habitsRedirect() {
			System.out.println("habits");
			return "habits";
		}
		
		@GetMapping("/payment")
		public String login() {
			System.out.println("payment");
			return "dummy";
		}

}
