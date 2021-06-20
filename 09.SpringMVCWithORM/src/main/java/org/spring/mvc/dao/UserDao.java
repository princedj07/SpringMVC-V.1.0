package org.spring.mvc.dao;

import javax.transaction.Transactional;

import org.spring.mvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveUser(User user) {
		
		int id = (Integer)this.hibernateTemplate.save(user);
		System.out.println("UserDao.saveUser()---: "+id);
		return id;
		
	}
}
