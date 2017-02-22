package com.npickard;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by npickard on 2/22/2017.
 */
@Component
public class MySample {

    @Autowired
    SessionFactory sessionFactory;

    public MySample(){}

    public void doThis(){
        System.out.println("Do this in sample");
        if (sessionFactory==null){
            System.out.println("SessionFactory is null");
        } else {
            sessionFactory.openSession();
            sessionFactory.close();
            System.out.println("SessionFactory opened and closed a session");
        }
    }


}
