package OOP;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(int side){
        this.width = side;
        this.height = side;
    }



    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(String name, String color, int width, int height){
        super(name,color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }

    @Override
    public int getPerimeter() {
        return 2*(width + height);
    }



}
