package com.example.Core.Java.StreamAPIQuestions;

import com.example.Core.Java.StreamAPIQuestions.ModelClasses.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByPersonAge {

    public static void main(String[] args) {
    List<Person> personList = new ArrayList<>();
        personList.add(new Person("Pritam",12));
        personList.add(new Person("Deiva",22));
        personList.add(new Person("Shivam",32));

        Map<Integer,Person> personMap = personList.stream().collect(Collectors.toMap(Person::getAge,person -> person));

        for(Integer age : personMap.keySet()) {
            System.out.println(age);
        }
    }
}
