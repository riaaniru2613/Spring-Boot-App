package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.LoginData;
import com.example.demo.service.LoginDataService;


@Controller
@RequestMapping("/master")
public class LoginDataController {
	//inject user service 
	   @Autowired 
		private LoginDataService 	loginDataService ; 
		
		public LoginDataController(LoginDataService theuserService) {
			loginDataService = theuserService ;
		}
		
		//expose "/users" and return list of employees
		@GetMapping("/")
		public String findAll(Model model ){
			List<LoginData> li = loginDataService.findAll();
			List<String> arr_dist = new ArrayList<String>();
			List<String> arr_zone = new ArrayList<String>();
			List<String> arr_town = new ArrayList<String>();
			List<String> arr_area = new ArrayList<String>();
			
			for (LoginData person: li) {		   
			    arr_dist.add(person.getDistrict());
			    arr_zone.add(person.getZone());
			    arr_town.add(person.getTown());
			    arr_area.add(person.getArea());
			    
			}
			model.addAttribute("arealist",arr_area);
			model.addAttribute("districtlist",arr_dist);
			model.addAttribute("zonelist",arr_zone);
			model.addAttribute("townlist",arr_town);
			System.out.println(arr_dist+"arrzone:"+arr_zone);
			return "master";
		}
		

}
