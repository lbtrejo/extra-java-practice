public class MethodsExercises {
    public static int addition(int firstOperand, int secondOperand){
        System.out.println(firstOperand + secondOperand);
        return firstOperand + secondOperand;
    }
    public static int subtraction(int firstOperand, int secondOperand){
        System.out.println(firstOperand - secondOperand);
        return firstOperand - secondOperand;
    }
    public static int multiplication(int firstOperand, int secondOperand){
        System.out.println(firstOperand * secondOperand);
        return firstOperand * secondOperand;
    }
    public static int division(int firstOperand, int secondOperand){
        System.out.println(firstOperand / secondOperand);
        return firstOperand / secondOperand;
    }

    public static void main(String[] args) {
        addition(4, 2);
        subtraction(4, 2);
        multiplication(4, 2);
        division(4, 2);
    }
}
