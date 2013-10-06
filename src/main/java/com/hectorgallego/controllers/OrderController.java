package com.hectorgallego.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hectorgallego.services.OrderService;

@Controller
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public Object getList(){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("orders", orderService.getAll());		
		ModelAndView mav = new ModelAndView();
		mav.addObject(map);
		mav.setViewName("order/orderList");
		return mav;
	}
}
