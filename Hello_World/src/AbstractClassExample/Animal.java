package AbstractClassExample;

public abstract class Animal {
    String name;

    public Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println("I am an animal and I am eating food");
    }
    public abstract void speak();




}