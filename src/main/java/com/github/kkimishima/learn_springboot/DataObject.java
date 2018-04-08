package com.github.kkimishima.learn_springboot;

public class DataObject {
  private int id;
  private String name;
  private int age;
  public DataObject(int id,String name,int age){
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
