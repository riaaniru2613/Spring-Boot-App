package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.LoginData;
import com.example.demo.entity.UserRegister;
import com.example.demo.service.LoginDataService;
import com.example.demo.service.UserRegisterService;

@Controller
@RequestMapping("/")
public class UserRegisterController {
	//inject user service 
	private UserRegisterService userRegisterService ; 
	private LoginDataService 	loginDataService ; 
	@Autowired 
	public UserRegisterController(UserRegisterService theuserRegisterService,LoginDataService theuserService) {
		userRegisterService = theuserRegisterService ;
		loginDataService = theuserService ;
	}
	@GetMapping("/")
	public String redirectToLogin() {
		return "redirect:/login";
	}
	
	//registration mapping 
	@GetMapping("/register")
	public String getMappingRegister(Model model) {
		UserRegister userRegister = new UserRegister();
		model.addAttribute("userRegister", userRegister);
		return "register" ; 
	} 
	//Post mapping for registration 
	@PostMapping("/register")
	public String postMappingRegister(@ModelAttribute("userRegister") UserRegister userRegister,Model model) {
		//redirection to getUserbyEmail() in userFormController
		userRegister.setId(0);
		model.addAttribute("userRegister", userRegister);		
		userRegisterService.save(userRegister);
		
		//String email = userRegister.getEmail();		
		return "redirect:/login" ;
		
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		System.out.println("helo");
		List<LoginData> li = loginDataService.findAll();
		List<String> arr_dist = new ArrayList<String>();
		List<String> arr_zone = new ArrayList<String>();
		List<String> arr_town = new ArrayList<String>();
		List<String> arr_area = new ArrayList<String>();
		
		for (LoginData field: li) {		   
		    arr_dist.add(field.getDistrict());
		    arr_zone.add(field.getZone());
		    arr_town.add(field.getTown());
		    arr_area.add(field.getArea());
		    
		}
		model.addAttribute("arealist",arr_area);
		model.addAttribute("districtlist",arr_dist);
		model.addAttribute("zonelist",arr_zone);
		model.addAttribute("townlist",arr_town);
		System.out.println(arr_dist+"arrzone:"+arr_zone);
		return "login";
	}
	
	
	@PostMapping("/login")
	public String postMappingLogin(Model model) {
		//redirection to getUserbyEmail() in userFormController
		//model.addAttribute("userLogin", userRegister);		
		
		//System.out.println(model);
		//String email = userRegister.getEmail();	
		
		//return "master";
		return "redirect:/email/" ;
		
	}

}
