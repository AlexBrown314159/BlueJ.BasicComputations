 
import java.util.Scanner;

public class IntegerPrinter {

    public String printIntegerAsBinary(int value){
        String answer = Integer.toBinaryString(value);
        //System.out.println(answer);
        return answer;
    }

    public String printIntegerAsOctal(int value){
        String answer = Integer.toOctalString(value);
        //System.out.println(answer);
        return answer;
    }

    public String printIntegerAsHexadecimal(int value){
        String answer = Integer.toHexString(value);
        //System.out.println(answer);
        return answer;
    }

    public void main(String[] args){
           
    }
}
