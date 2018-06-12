package com.alireza.fourthproject;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {	
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String indexDate(Model model) {
		SimpleDateFormat time = new SimpleDateFormat("dd'th' yyyy/MM");
		java.util.Date Date = new java.util.Date();
		String strDate = "Current time is : " + time.format(Date);
		model.addAttribute("date", strDate);
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String indexTime(Model model) {
		SimpleDateFormat time = new SimpleDateFormat("hh:mm a");
		java.util.Date ourTimeDate = new java.util.Date();
		
		String str = "Current time is : " + time.format(ourTimeDate);
	      model.addAttribute("time", str);
		return "time.jsp";
	}
}
