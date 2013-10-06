package com.hectorgallego.repositoriesImpl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hectorgallego.repositories.BaseDao;
import com.hectorgallego.vo.BaseVO;

/* this class executes the queries through Hibernate for all the DAO's 
 * in a generic way. All the Dao's extends this class*/

public class BaseDaoImpl<T extends BaseVO> extends HibernateDaoSupport implements BaseDao<T> {

    protected Class<T> clazz;

    public void setClazz(Class<T> clazz) {
        this.clazz = clazz;
    }
	
	
	@Autowired
	public BaseDaoImpl(SessionFactory sessionFactory){
		setSessionFactory(sessionFactory);
	}
	
	
	public  T create(T vo){
		getHibernateTemplate().saveOrUpdate(vo);
		getHibernateTemplate().flush();
		return vo;
	}
	

	public void delete(T vo){
		getHibernateTemplate().delete(vo);
		getHibernateTemplate().flush();
	}
	

	@SuppressWarnings("unchecked")
	public List<T> getAll(){
		Criteria criteria = super.getSession().createCriteria(clazz).setResultTransformer(Criteria.ROOT_ENTITY);
		return (List<T>)criteria.list();
		
	}
	
	
}
