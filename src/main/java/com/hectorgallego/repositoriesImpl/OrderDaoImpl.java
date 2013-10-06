package com.hectorgallego.repositoriesImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hectorgallego.repositories.OrderDao;
import com.hectorgallego.vo.OrderVO;


@Repository
public class OrderDaoImpl extends BaseDaoImpl<OrderVO> implements OrderDao {

	
	//injecting the session
	@Autowired
	public OrderDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
		setClazz(OrderVO.class);
	}

	// In this class you should put the non-generic methods.
	
	
	
}
