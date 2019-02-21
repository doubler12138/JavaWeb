package foo;

public class Dog {
    private String name;
    private Toy[] toys;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setToys(Toy[] toys){
        this.toys = toys;
    }
    public Toy[] getToys(){
        return this.toys;
    }
}
