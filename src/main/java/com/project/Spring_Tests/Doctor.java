package com.project.Spring_Tests;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    private String qualification;
//
//    public Doctor(String qualification) {
//        this.qualification = qualification;
//    }

    //private Nurse nurse;
    public void assist(){
        System.out.println("The Doc is assisting");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public void setBeanName(String name){
        System.out.println("Set Bean name method is called");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Post Construct Method is called");
    }

}
