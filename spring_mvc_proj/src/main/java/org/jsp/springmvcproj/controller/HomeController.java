package org.jsp.springmvcproj.controller;

import org.jsp.springmvcproj.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = "/open-home")
	public String openHome(Model model) {
		model.addAttribute("username", "Madhu");
		return "home.jsp";

	}

	@RequestMapping(value = "/findsum")
	public ModelAndView findSum(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2) {
		String result = "the Sum is:" + (n1 + n2);
		ModelAndView view = new ModelAndView();
		view.addObject("result", result);
		view.setViewName("print.jsp");
		return view;

	}

	@RequestMapping(value = "/finddiff")
	public ModelAndView finddiff(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2) {
		String result = "the diff is:" + (n1 - n2);
		ModelAndView view = new ModelAndView();
		view.addObject("result", result);
		view.setViewName("print.jsp");
		return view;

	}

	@RequestMapping(value = "/findmultiplication")
	public ModelAndView findmultiplication(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2) {
		String result = "the multiplication is:" + (n1 * n2);
		ModelAndView view = new ModelAndView();
		view.addObject("result", result);
		view.setViewName("print.jsp");
		return view;

	}

	@RequestMapping(value = "/finddivision")
	public ModelAndView finddivision(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2) {
		String result = "the quotient is:" + (n1 / n2);
		ModelAndView view = new ModelAndView();
		view.addObject("result", result);
		view.setViewName("print.jsp");
		return view;

	}
	@RequestMapping(value = "/print")
	public ModelAndView PrintDetails(@ModelAttribute User u) {
		System.out.println("Name:"+u.getName());
		System.out.println("Phone"+u.getPhone());
		System.out.println("Age"+u.getAge());
		System.out.println("Email Id:"+u.getEmail());
		System.out.println("Password:"+u.getPassword());
		ModelAndView view =new ModelAndView();
		view.setViewName("print.jsp");
		view.addObject("result","The details are printed");
		return view;
	}
}
