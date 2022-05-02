package Calculator;

import java.util.function.*;

public class Calculator {
    public static Supplier<Calculator> instance = Calculator::new;
    public BinaryOperator<Integer> plus = (x, y) -> x + y;
    public BinaryOperator<Integer> minus = (x, y) -> x - y;
    public BinaryOperator<Integer> multiply = (x, y) -> x * y;
    //public BinaryOperator<Integer> devide = (x, y) -> x / y; //If y = 0 trows exception divide by zero
    public BinaryOperator<Integer> devide = (x, y) -> y == 0 ? 0 : x / y; //Вариант простой
    /*public BinaryOperator<Integer> devide = (x, y) -> { //Немного извращенный вариант
        try {
            return x / y;
        } catch (ArithmeticException e){
            System.out.println("Деление на 0");
        }
        return 0;
    };*/
    public UnaryOperator<Integer> pow = x -> x * x;
    public UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    public Predicate<Integer> isPositive = x -> x > 0;
    public Consumer<Integer> println = System.out::println;
}
