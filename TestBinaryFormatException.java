import java.util.Scanner;

public class TestBinaryFormatException {
    /** 
     * Converts a binary string into its decimal equivalent.
     * @throws BinaryFormatException if the string contains any character other than '0' or '1'
     */
    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        int decimalValue = 0;
        for (char c : binaryString.toCharArray()) {
            if (c != '0' && c != '1') {
                throw new BinaryFormatException("Not a binary number");
            }
            decimalValue = decimalValue * 2 + (c - '0');
        }
        return decimalValue;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = input.nextLine();

        try {
            int decimal = bin2Dec(binaryString);
            System.out.println("The decimal value is " + decimal);
        } 
        catch (BinaryFormatException ex) {
            System.out.println("Not a binary number");
        }
    }
}

//A custom checked exception thrown when the input string is not a valid binary number.
class BinaryFormatException extends Exception {
    public BinaryFormatException(String message) {
        super(message);
    }
}
