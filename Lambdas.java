package cwiczenia;

public class Lambdas {
    public static void main(String[] args) {
        //f(x) -> x*x
        // nie trzeba podawać typów zmiennych, bo kompilator wie, z MathOperation jakie był rodziaj zmiennych
        // nie trzeba pisać return
        MathOperation addition = (a, b) -> a+b;

        double additionResult = executeOperation(3.0,14.0, addition);
        System.out.println("Wynik operacji (a, b) -> a+b: " + additionResult);

        MathOperation subtraction = (a,b) -> a-b;

        double subtractionResult = executeOperation(20.0, 3.0, subtraction);
        System.out.println("============================================");
        System.out.println("Wynik operacji (a,b) -> a-b: " + subtractionResult);

        MathOperation multiplication = (a,b) -> a*b;
        double multiplicationResult = executeOperation(3.0, 4.0, multiplication);
        System.out.println("============================================");
        System.out.println("Wynik operacji (a,b) -> a*b: " + multiplicationResult);

        MathOperation division = (a,b) -> a/b;
        double divisionResult = executeOperation(15.0, 3.0, division);
        System.out.println("============================================");
        System.out.println("Wynik operacji (a,b) -> a/b: " + divisionResult);


    }


    static double executeOperation(double a, double b, MathOperation operation){
        // metoda przyjmuje dwa argumenty liczbowe oraz przyjmuje jako argument inferfejs funkcyjny
        double result = operation.operate(a , b);
        return result;

    }
}
