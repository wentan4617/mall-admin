package com.mall.admin.model.mybatis.base;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BaseOrder0DaoImpl extends BaseDaoImpl {

	@Autowired
	public void setMySqlSessionFactory(@Qualifier("sqlSessionOrder0Factory") SqlSessionFactory sqlSessionFactory) {
		this.setSqlSessionFactory(sqlSessionFactory);
	}
}
