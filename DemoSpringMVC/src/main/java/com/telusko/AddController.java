package com.telusko;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.service.AddService;

@Controller
public class AddController {
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int a , @RequestParam("t2") int b, HttpServletRequest req , HttpServletResponse res) {
//		int a = Integer.parseInt(req.getParameter("t1"));
//		int b = Integer.parseInt(req.getParameter("t2"));
		
		AddService as  = new AddService();
		int sum = as.add(a, b);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result" , sum);
		return mv;
	}

}
