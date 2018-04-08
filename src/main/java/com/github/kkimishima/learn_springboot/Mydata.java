package com.github.kkimishima.learn_springboot;

import sun.security.util.Length;

import javax.persistence.*;

@Entity
@Table(name = "mydate")
public class Mydata {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column
  private long id;

  @Column(length = 50,nullable = false)
  private String name;

  @Column(length = 200,nullable = true)
  private String mail;

  @Column(nullable = true)
  private Integer age;

  @Column(nullable = true)
  private String memo;

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

  public long getId() {
    return id;
  }

  public String getMail() {
    return mail;
  }

  public String getMemo() {
    return memo;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  public void setName(String name) {
    this.name = name;
  }
}
