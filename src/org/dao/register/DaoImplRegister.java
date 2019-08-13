package org.dao.register;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.modelo.register.Register;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

public class DaoImplRegister implements DaoRegister{
	
	@SessionTarget
	private Session session;
	
	@TransactionTarget
	private Transaction transaction;
	
	
	@Override
	public void addRegister(Register register) 
	{
		try {
			session.saveOrUpdate(register);
		} catch (HibernateException e) {
			System.out.println("Exception add:" + e.getMessage());
			transaction.rollback();
		}
		
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Register> listRegisters() {
		List<Register> list = null;
		try {
			list = (List<Register>) session.createQuery("from Register").list();
		} catch (HibernateException e) {
			System.out.println("Exception list:" + e.getMessage());
			transaction.rollback();
		}
		return list;
	}

	@Override
	public Register getRegisterById(int id) {
		Register register = null;
		try {
			register = (Register) session.get(Register.class, id);
			
		} catch (HibernateException e) {
			System.out.println("Exception getById:" + e.getMessage());
			transaction.rollback();
		}
		return register;
	}

	@Override
	public void deleteRegister(int id) {
		Register register = null;
		try {
			register = (Register)session.get(Register.class, id);
			session.delete(register);
		} catch (HibernateException e) {
			System.out.println("Exception delete:" + e.getMessage());
			transaction.rollback();
		}
		
	}

}
