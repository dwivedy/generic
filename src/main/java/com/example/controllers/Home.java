package com.example.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.GetArticle;
import com.fasterxml.jackson.databind.ser.std.ArraySerializerBase;

@Controller
public class Home {

	GetArticle article = new GetArticle();

	@RequestMapping("/")
	public String home(Model model) {
		ArrayList results = article.getArticles();
		if (results != null) {
			model.addAttribute("articles", results);
		}
		return "home";
	}

}
