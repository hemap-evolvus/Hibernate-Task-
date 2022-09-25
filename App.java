package com.Hiber.Hibernatenew;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.Hiber.Hibernatenew.Song;

public class App {

	public static void main(String[] args) {
		Configuration configuration =new Configuration();
		
    	configuration.configure("hibernate.cfg.xml");
    	
    	configuration.addAnnotatedClass(Song.class);
    	
    	SessionFactory sessionFactory=configuration.buildSessionFactory();
    	
    	
    	
    	Session session=sessionFactory.openSession();
     Song song1=new Song();
     song1.setSongid(1);
     song1.setSongName("aaa");
     //song1.setSongartist("ssss");
     
     session.beginTransaction();
     session.save(song1);
     session.getTransaction().commit();
     
     System.out.println("saved..... check DB");
     
    }
	

}
