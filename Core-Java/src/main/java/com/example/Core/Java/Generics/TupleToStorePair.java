package com.example.Core.Java.Generics;

import com.example.Core.Java.StreamAPIQuestions.ModelClasses.Person;
import com.example.Core.Java.StreamAPIQuestions.ModelClasses.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TupleToStorePair {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("name",12));
        personList.add(new Person("name2",32));
        personList.add(new Person("newName",15));
        personList.add(new Person("newName2",8));
        Map<String,Person> personMap = listToMap(personList,Person::getName);

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("name",23,11));
        studentList.add(new Student("name2",20,8));
        studentList.add(new Student("Newname",21,9));
        studentList.add(new Student("Newname2",27,1));
        Map<Integer,Student> studentMap = listToMap(studentList,Student::getRoll);
    }

    public static <T,R>Map<R,T> listToMap(List<T>dataList, Function<T,R>keyExtractor) {
        return dataList.stream().collect(Collectors.toMap(keyExtractor,Function.identity()));
    }
}
