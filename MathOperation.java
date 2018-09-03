package cwiczenia;
@FunctionalInterface
public interface MathOperation {

    double operate(double a, double b); // funkcja, której implementację podajemy w lambdzie!!!

//    default double operation2(int a, int b){
//        return 1.0;
//    }

}
