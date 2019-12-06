package com.company;

public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameLengthException{
        if(name.length()>20){
            this.name = name;
            throw new IllegalNameLengthException("Your name is out of limit: ");
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException{
        if (age > 1 && age <100){
            this.age = age;

        }else {
            throw new IllegalAgeException("Your age is out of 1-100: ");
        }

    }
    public void getInfo(){
        System.out.println("name:" + getName() + "\n" +
                "age: " + getAge());
    }
}
