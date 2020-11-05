public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        
        int number = input.getInt("Enter an integer:");
        System.out.println("number = " + number);

        double decimal = input.getDouble("Enter a double:");
        System.out.println("decimal = " + decimal);
    }    
}
