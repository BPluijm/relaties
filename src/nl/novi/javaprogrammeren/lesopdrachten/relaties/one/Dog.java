package nl.novi.javaprogrammeren.lesopdrachten.relaties.one;

public class Dog {

    private String name;
    private String sex;

    private Dog dog;

    public DogOwner(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void ageDog() {
        if (dog != null) {
            this.dog.age();
        }
    }

    @Override
    public String toString() {
        String s = name + " heeft een " + dog.getSex() + " deze is " + dog.getAge();
        return s;
    }
}
//public class Dog {
//    String name;
//    String species;
//    int age;
//    String sex;
//
//    public Dog(String name, String species, int age, String sex) {
//        this.name = name;
//        this.species = species;
//        this.age = age;
//        this.sex = sex;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getSpecies() {
//        return species;
//    }
//
//    public String getSex() {
//        return sex;
//    }
//
//}
