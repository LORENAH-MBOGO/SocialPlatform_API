package models;

import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private String profession;
    private String interests;
    private int id;
    private static ArrayList<User> instances = new ArrayList<>();

    public User(String name, int age, String profession, String interests) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.interests = interests;
        instances.add(this);
        this.id = instances.size();
    }
   public String getName() {return this.name;}
    //    public String getCv() {
//        String cv = this.name && this.profession;
//    }
    public int getAge() {return this.age;}
    public String getProfession() {return this.profession;}
    public String getInterests() {return this.interests;}
    public static ArrayList<User> getAllInstances() {return instances;}
    public static void clearAllUsers(){instances.clear();}
    public int getId(){return id;}
    public static User findById(int id) {return instances.get(id-1);}

    public static User setUpNewUser(){
        return new User("Skylar",25,"Software Engineer","Music, Arts and IT");
    }
    public static User setUpNewUser1(){
        return new User("Craig",23,"Android Developer","Movies, Music and IT");
    }
    public static User setUpNewUser2(){
        return new User("Thomas",29,"FullStacks Developer","Travelling, Hiking and Music");
    }
}

