 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        Integer i = integers[0];
        if (integers[1] > i) i = integers[1];
        if (integers[2] > i) i = integers[2];
        return i;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        Integer i = Math.max(integers[0], integers[1]);
        i = Math.max(i, integers[2]);
        return i;
    }
}
