package progjar;

import java.io.Serializable;

public class Person implements Serializable {
  private static final long serialVersionUID = 1L;
  private String fullname;
  private int age;

  public Person(){
    this.fullname = "";
    this.age = 0;
  }

  public String getFullName(){
    return this.fullname;
  }

  public void setFullName(String fullName){
    this.fullname = fullName;
  }

  public int getAge(){
    return this.age;
  }

  public void setAge(int age){
    this.age = age;
  }
}
