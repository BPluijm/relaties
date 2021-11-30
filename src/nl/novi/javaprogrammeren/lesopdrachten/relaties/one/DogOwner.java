package nl.novi.javaprogrammeren.lesopdrachten.relaties.one;

public class DogOwner {

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
//public class DogOwner {
//    private String name;
//    private String sex;
//    private Dog dog;
//
//    public DogOwner(String name, String sex) {
//        this.name = name;
//        this.sex = sex;
//    }
//
//    @Override
//    public String toString() {
//        return name + " has a " + dog.getSex() + " it is " + dog.getAge() + " years old and is a: " + dog.getSpecies() + ". De dog's name is " + dog.getName();
//    }
//
//    public voide setDog (Dog dog) { this.dog = dog; }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//}