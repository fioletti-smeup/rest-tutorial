package com.smeup.tutorial.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("")
public class TutorialApplication extends javax.ws.rs.core.Application {

    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> s = new HashSet<>();
        s.add(Hello.class);
        s.add(Contacts.class);
        s.add(NotFoundExceptionMapper.class);
        return s;
    }
}
