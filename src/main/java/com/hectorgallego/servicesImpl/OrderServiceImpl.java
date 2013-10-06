package com.hectorgallego.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hectorgallego.repositories.OrderDao;
import com.hectorgallego.services.OrderService;
import com.hectorgallego.vo.OrderVO;


@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao orderDao;
	

	public List<OrderVO> getAll(){
		
		
		return orderDao.getAll();
		
	}
	
	
}
