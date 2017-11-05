package com.sda.hibernate.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibarnateUtility {

    private static final SessionFactory sessionFactory = new Configuration().buildSessionFactory();

    private static Session session = sessionFactory.openSession();

    public HibarnateUtility() {
    }

    public static  Session getHibernateSession() {
        if (session == null){
            session = (Session) new HibarnateUtility();
        }
        return session;
    }
}
