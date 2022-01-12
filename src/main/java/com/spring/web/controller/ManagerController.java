package com.spring.web.controller;


import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.web.entity.Manager;
import com.spring.web.service.ManagerRepository;

@Controller
@RequestMapping("manager")
public class ManagerController {
	@Autowired
	private ManagerRepository managerRepository;
	
	@GetMapping("/")
	public ModelAndView getManagers() {
		List<Manager> employees = managerRepository.findAll();
		HashMap<String, List<Manager>> model = new HashMap<>();
		model.put("list", employees);
		return new ModelAndView("managerList", model);
	}

}
