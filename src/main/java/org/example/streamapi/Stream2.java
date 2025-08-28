package org.example.streamapi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 20, "Math"),
                new Student("Bob", 21, "Physics"),
                new Student("Charlie", 20, "Math"),
                new Student("Diana", 22, "English"),
                new Student("Eve", 21, "Physics")
        );
students.stream().
        collect(Collectors.groupingBy(Student::getAge,Collectors.mapping(Student::getName,Collectors.toList()))).
        entrySet().stream().
        forEach(e-> System.out.println("Age = " + e.getKey() + " Names = " + e.getValue()));
students.stream().collect(Collectors.groupingBy(Student::getDepartment)).entrySet().stream().forEach(e-> System.out.println("Department = " + e.getKey() + " Students = " + e.getValue().toString()));

        String sentence = "This is a test sentence and this is a test";
        findtheOccuranceOfEachWord(sentence);
        remove("Hello World", 'l');


    }
    private static void findtheOccuranceOfEachWord(String sentence) {
        Stream.of(sentence.split(" ")).collect(Collectors.groupingBy(word-> word,Collectors.counting())).forEach((w,c)->System.out.println("word = " + w + " count = " + c));
    }

  public static void   remove(String word, char removeThis){
   //    word= word.chars().filter(c->c!=removeThis).mapToObj(c->(char)c).collect(Collectors.toList()).toString().replaceAll("[\\[\\],\\s]", "");
        int index=word.indexOf(removeThis);
        word=word.substring(0,index)+word.substring(index+1);
        System.out.println("word = " + word);
  }
  private static String getStringArrayAsString(String arr) {
        arr = Arrays.stream(arr.split(","))
                .map(String::trim)
                .collect(Collectors.joining(", "));
        return arr;
  }
}
