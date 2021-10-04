package OOP;

public class Sum {
    private int sumInt;
    private double sumDouble;

    public Sum(){
        sumInt = 0;
        sumDouble = 0.0;
    }

    public int add(int num1, int num2){
        sumInt = 0;
        sumDouble = 0;
        sumInt += num1 + num2;
        return sumInt;
    }

    public double add(int num1, double num2){
        sumInt = 0;
        sumDouble = 0;
        sumDouble += num1 + num2;
        return sumDouble;
    }

    public double add(double num1, int num2){
        sumInt = 0;
        sumDouble = 0;
        sumDouble += num1 + num2;
        return sumDouble;
    }

    public double add(double num1, double num2){
        sumInt = 0;
        sumDouble = 0;
        sumDouble += num1 + num2;
        return sumDouble;
    }

    public int add(int num1, int num2, int num3){
        sumInt = 0;
        sumDouble = 0;
        sumInt += num1 + num2 + num3;
        return sumInt;
    }


}
