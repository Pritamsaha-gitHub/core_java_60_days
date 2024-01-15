package com.example.Core.Java.StreamAPIQuestions;

import com.example.Core.Java.StreamAPIQuestions.ModelClasses.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PerformDistinctOperationOnObjects {
    public static void main(String[] args) {

        List<Person> personList =new ArrayList<>();
        personList.add(new Person("Pritam",12));
        personList.add(new Person("Deiva",22));
        personList.add(new Person("Shivam",17));
        personList.add(new Person("Pritam2",19));
        personList.add(new Person("Deiva1",12));
        personList.add(new Person("Shivam3",33));

        List<Person> filterPersonList = personList.stream().collect(Collectors.toMap(Person::getAge, Function.identity(), (oidValue, newValue)->oidValue)).values().stream().toList();

        for (Person person : filterPersonList) {
            System.out.println(person.getName());
        }
    }
}
