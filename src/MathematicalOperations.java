import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MathematicalOperations {

    public void derivationMultiples(){

        for(Integer indexValue = 1; indexValue<=100; indexValue++){
            Boolean isIndexValueMultipleSeven = indexValue % 7 == 0;
            Boolean isIndexValueMultipleTwo = indexValue % 2 == 0;

            if(isIndexValueMultipleSeven && isIndexValueMultipleTwo) {
                System.out.println("TwoSeven");
            }else if(isIndexValueMultipleSeven){
                System.out.println("Seven");
            }else if(isIndexValueMultipleTwo){
                System.out.println("Two");
            }else{
                System.out.println(indexValue);
            }
        }
    }

    public Boolean functionCalculate(){


        Scanner in = new Scanner(System.in);
        System.out.print("Input natural m: ");
        int m = in.nextInt();

        System.out.print("Input natural r: ");
        int r = in.nextInt();

        Boolean isCorrectValues = r<=m;

        if(isCorrectValues) {
            System.out.println(getFunctionValue(m, r));
        }

        return isCorrectValues;
    }

    private BigInteger getFunctionValue(int m, int r) {
        BigInteger mFactorial = getFactorial(m);
        BigInteger rFactorial = getFactorial(r);
        BigInteger mrFactorial = getFactorial(m - r);

        BigInteger resultMultiply = rFactorial.multiply(mrFactorial);
        BigInteger resultDivide = mFactorial.divide(resultMultiply);

        return resultDivide;
    }


    private BigInteger getFactorial(int numberСalculateFactorial) {
            if (numberСalculateFactorial < 2) {
                return BigInteger.valueOf(1);
            }
            else {
                return IntStream.rangeClosed(2, numberСalculateFactorial).mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();
            }
        }
    }

