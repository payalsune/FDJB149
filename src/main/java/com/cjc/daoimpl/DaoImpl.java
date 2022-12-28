package com.cjc.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.dao.HomeDao;
import com.cjc.model.Student;

@Repository
public class DaoImpl implements HomeDao{

	@Autowired
	SessionFactory sf;
	
	public void saveData(Student s) {
		Session session =sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(s);
		tx.commit();
		
	}

	public void logincheck(String un, String ps) {
		Session session =sf.openSession();
		Transaction tx=session.beginTransaction();
		Query q=session.createQuery("from Student where uname='"+un+"' and password='"+ps+"'");
		tx.commit();
	}

	public List<Student> displayAllData() {
		Session session =sf.openSession();
		Transaction tx=session.beginTransaction();
		Criteria cr=session.createCriteria(Student.class);
		List<Student>list=cr.list();
		tx.commit();
		return list;
	}

	public void deleteData(int uid) {
		Session session =sf.openSession();
		Transaction tx=session.beginTransaction();
		Query q=session.createQuery("delete from Student where uid='"+uid+"'");
		q.executeUpdate();
		tx.commit();
	}

	public Student editData(Student s)
	{
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Query<Student>q=session.createQuery("from Student where uid='"+s.getUid()+"'");
		//q.setParameter(0, uid);
		Student ss=q.getSingleResult();
	
		tx.commit();
		session.close();
		return ss;
	}
	
	public void updateData(Student s)
	{
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Query<Student>q=session.createQuery("Update Student set name=?, uname=? ,password=? where uid=?");
		q.setParameter(0, s.getName());
		q.setParameter(1, s.getUname());
		q.setParameter(2, s.getPassword());
		q.setParameter(3, s.getUid());
		q.executeUpdate();
		tx.commit();
	}

}
