package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Homecontroller {
	@Autowired
	EmpService st;
	
	
  @RequestMapping("/")
  public String getdata()
  {
	  return "index";///index page
  }
  @PostMapping("/next")
  
  public String disp(@ModelAttribute("e1")Emp e1)
  {
	  st.myinfo(e1);
	  
	  return "redirect:/welcome";//welcome
  }
  
  @RequestMapping("/welcome")
  public String display(ModelMap m)
  {
	  List<Emp> l1= st.getinfo();
	  m.addAttribute("l1",l1);
	  return "welcome";//welcome jsp
	 
  }
  
 @GetMapping("/deletestud")
 public String del(@RequestParam("id")int id)
 {
	 st.deletedata(id);
	return "redirect:/welcome";
	 
 }
 
 @GetMapping("/editstud")
	public String edit(@RequestParam("id") int id,Model m)
  {
		Emp e1= st.getonestud(id);
		m.addAttribute("e1",e1);
		return "edit";
					
  }
 
 
 @RequestMapping("/edit")
	public String editdata(@ModelAttribute("s1") Emp s1) {
		
		Emp e1= new Emp();
		e1.setId(s1.getId());
		e1.setName(s1.getName());
		e1.setDis(s1.getDis());
		
		
         st.myinfo(e1);
		
		
		return "redirect:/welcome";
		
	}
 
 
 
 
 
 
 /**********update******************/
 /*
 @RequestMapping("/update")
 public String display1(ModelMap m)
 {
	  List<Emp> l2= st.getinfo();
	  m.addAttribute("l2",l2);
	  return "indexUpdata";
	 
 }

@RequestMapping("/nik")
public String IndexUpdate(@ModelAttribute("e1") Emp e1) {
	
	Empupdata e4= new Empupdata();
	e4.setId(e1.getId());
	e4.setName(e1.getName());
	e4.setDis(e1.getDis());
	
	
	ut.myupinfo(e4);
	return "redirect:/welcomeUpdata";
	
}*/


  
}
