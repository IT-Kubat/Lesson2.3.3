package com.company;

public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameLengthException{
        if(name.length()>20){
            throw new IllegalNameLengthException("Your name is out of limit: ");
        }
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException{
        if (age > 100 || age <0){
            throw new IllegalAgeException("Your age is out of 1-100: ");
        }
        this.age = age;
    }
    public void getInfo(){
        System.out.println("name:" + getName() + "\n" +
                "age: " + getAge());
    }
}
