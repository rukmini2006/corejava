package com.tutorial.spring.orm_03._03SpringHibernateApproach2;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

public class DemoImpl implements DemoInter {

	private HibernateTemplate ht = null;

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	public Iterator getData() throws Exception {
		System.out.println("In spring class getData()");
		List l = ht.find("from User");
		Iterator i1 = l.iterator();
		return i1;

	}

}
