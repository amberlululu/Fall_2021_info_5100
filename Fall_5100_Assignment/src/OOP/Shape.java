package OOP;
import java.util.*;
public class Shape {
    private String name;
    private String color;
    private int area;
    private int perimeter;

    public Shape(){}

    public Shape(String name, String color){
        this.name = name;
        this.color = color;
    }

    public Shape(String name, String color, int perimeter, int area){
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getArea(){
        return area;
    }

    public int getPerimeter(){
        return this.perimeter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public String printShape(){

        return "The " + name + " has a " + color + " color";
    }




}
