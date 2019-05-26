 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        BigInteger answer = BigInteger.valueOf(1);
        
        for (Integer i = 1; i <= value; i++) {
            answer = answer.multiply(BigInteger.valueOf(i));
        }   
        return answer;
    }
}
