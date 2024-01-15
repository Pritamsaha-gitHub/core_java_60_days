package com.example.Core.Java.Reflection;

import com.example.Core.Java.StreamAPIQuestions.ModelClasses.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class IsClassHasAAnnotation {

    public static void main(String[] args) {
        try {
            Person person = new Person("personname",27);
            Testclass test = new Testclass();
            System.out.println(ispreentannotation(person.getClass(), AllArgsConstructor.class));
            System.out.println(ispreentannotation(test.getClass(),MyAnnotation.class));
        }catch (Exception e){
            System.out.println(e);
        }

    }
    public static boolean ispreentannotation(Class<?>clazz,Class<? extends Annotation> annotation){
        return clazz.isAnnotationPresent(annotation);
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{}

@MyAnnotation
class Testclass{}