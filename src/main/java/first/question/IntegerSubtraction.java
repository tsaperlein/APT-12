package first.question;

public class IntegerSubtraction {
    public static void main(String[] args) {
    	String message = subtractAndReturn(5,3);
    	System.out.println(message);
    }

    public static String subtractAndReturn(int a, int b) {
        int result = a - b;
        if (result >= 0) {
            return "Positive";
        } else {
            return "Negative";
        }
    }
}