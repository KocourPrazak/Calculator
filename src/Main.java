import Calculator.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 3);
        int b = calc.minus.apply(1,1); //Результат выражения "0"
        int d = calc.abs.apply(b);
        int c = calc.devide.apply(a, d); //Исключение "деление на 0"
        calc.println.accept(c);
    }
}
