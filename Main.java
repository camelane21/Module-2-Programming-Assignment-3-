import java.util.Scanner;

public class TestBinaryFormatException {
    
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

}