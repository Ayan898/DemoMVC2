package com.ayan;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ayan.service.CalculateModal;

@Controller
public class CalculateController
{
	
	
	@RequestMapping(value="controller", method  = RequestMethod.GET)
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response)
	{
		
		ModelAndView mv = new ModelAndView();
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		String op = request.getParameter("operation");
		System.out.println(op);
		
		CalculateModal calc = new CalculateModal(i, j, op);
		int k = calc.calculate();
		
		
		mv.addObject("result",k);
		mv.setViewName("display.jsp");
		
		
		
		return mv;
		
	}
}