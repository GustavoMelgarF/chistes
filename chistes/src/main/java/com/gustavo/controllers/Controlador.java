package com.gustavo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gustavo.services.ChisteApp;

@Controller
public class Controlador {
	
	private ChisteApp chisteApp;
	
	@Autowired
	public Controlador(ChisteApp chisteApp) {
		this.chisteApp = chisteApp;
	}



	@RequestMapping({"/", ""})
	public String Chiste(Model model) {
		
		model.addAttribute("chiste", chisteApp.obtenerChiste());
		
		return "chiste";
	}

}
