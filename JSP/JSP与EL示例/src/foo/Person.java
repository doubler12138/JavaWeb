package foo;

public class Person {
    String name;
    Dog dog = new Dog();

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setDog(Dog dog){
        this.dog = dog;
    }
    public Dog getDog(){
        return this.dog;
    }

}
