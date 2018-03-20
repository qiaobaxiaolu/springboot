package com.liu.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liu.pojo.Me;
import com.liu.pojo.User1;

/**
 * @Project Name:springboot
 * @author 刘佳瑞
 * @Package Name:com.liu.controller
 * @date 2018年3月14日下午11:37:28
 */
@Controller
@RequestMapping("/th")
public class THYController {
	@Autowired
	private Me me;

	@RequestMapping("/index")
	public String index(ModelMap map) {
		System.out.println("123");
		return "thymeleaf/index";
	}

	@RequestMapping("center")
	public String center() {
		return "thymeleaf/center/center";
	}

	@RequestMapping("/test")
	public String test(ModelMap map) {

		User1 u = new User1();
		u.setName("superadmin");
		u.setAge(10);
		u.setPassword("123465");
		u.setBirthday(new Date());
		u.setDesc("<font color='green'><b>hello imooc</b></font>");

		map.addAttribute("User1", u);

		User1 u1 = new User1();
		u1.setAge(19);
		u1.setName("imooc");
		u1.setPassword("123456");
		u1.setBirthday(new Date());

		User1 u2 = new User1();
		u2.setAge(17);
		u2.setName("LeeCX");
		u2.setPassword("123456");
		u2.setBirthday(new Date());

		List<User1> User1List = new ArrayList<>();
		User1List.add(u);
		User1List.add(u1);
		User1List.add(u2);

		map.addAttribute("User1List", User1List);

		return "thymeleaf/test";
	}

	@PostMapping("/postform")
	public String postform(User1 u) {

		System.out.println("姓名：" + u.getName());
		System.out.println("年龄：" + u.getAge());

		return "redirect:/th/test";
	}

	@RequestMapping("showerror")
	public String showerror(User1 u) {

		int a = 1 / 0;

		return "redirect:/th/test";
	}

}
