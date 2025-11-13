package oop;

public class PersonBis {

    private String name;
    private int age;
    private final String country;

    PersonBis(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    String getCountry() {
        return country;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }
}
