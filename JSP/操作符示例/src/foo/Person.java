package foo;

public class Person {
    private Dog dog;
    private String name;

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
