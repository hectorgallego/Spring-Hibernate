package com.hectorgallego.repositories;

import java.io.Serializable;
import java.util.List;

import com.hectorgallego.vo.BaseVO;

public interface BaseDao<T extends BaseVO> {


	public abstract T create(T vo);

	public abstract void delete(T vo);
	
	public List<T> getAll();

}