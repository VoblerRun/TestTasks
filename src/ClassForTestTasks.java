

public class ClassForTestTasks {

    public static void main(String[] args){
        MathematicalOperations mathematicalOperations = new MathematicalOperations();
        mathematicalOperations.derivationMultiples();

        Boolean isExitLoop = true;

        while(isExitLoop) {
            isExitLoop = !mathematicalOperations.functionCalculate();

            if(isExitLoop){
                System.out.println("r должна быть меньше или равна m и являться натуральным числом");
            }

        }

        ReaderText readerText = new ReaderText();
        readerText.getNumberOccurrences("C://textFiles/ASPusikan-Onegin.txt");


    }

}
