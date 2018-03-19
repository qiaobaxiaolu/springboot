package com.liu.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liu.pojo.Me;

/**
 *@Project Name:springboot 
 * @author 刘佳瑞
 * @Package Name:com.liu.controller
 * @date 2018年3月14日下午11:37:28
 */
@Controller
@RequestMapping("/ftl")
public class FTLController {
	@Autowired
	private Me me;
	@RequestMapping("/index")
	public String index(ModelMap model){
		model.addAttribute("me", me);
		return "freemark/index";
	}
	@RequestMapping("/center")
	public String center(Model model){
		model.addAttribute("me", me);
		return "/freemark/center/center";
		
	}
	
}
