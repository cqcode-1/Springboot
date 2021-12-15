package com.example.sb.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;

import java.util.List;

//import javax.validation.constraints.Email;

@ConfigurationProperties(prefix = "person")
@Repository
//@Validated
public class Person {
//   @Value("${person.name}")
//   @Email
   String lastName;
//   @Value("#{person.age}")
   int age;
   List<String> likes;

   public Person() {
   }

   public Person(String name, int age, List<String> likes) {
      this.lastName = name;
      this.age = age;
      this.likes = likes;
   }


   public String getLastName() {
      return lastName;
   }
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public List<String> getLikes() {
      return likes;
   }

   public void setLikes(List<String> likes) {
      this.likes = likes;
   }

   @Override
   public String toString() {
      return "Person{" +
              "name='" + lastName + '\'' +
              ", age=" + age +
              ", likes=" + likes +
              '}';
   }
}
