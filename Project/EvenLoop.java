package Project;

public class EvenLoop {
    int sumTotal = 0;

    private void Even_odd(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println("EVEN: " + i);
            } if(i % 2 == 1)  {
                System.out.println("ODD: " + i);
            }


        }
    }
    private void SumOfNumbers(){
        for (int i = 0; i <= 100; i++){
            sumTotal+=i;
            System.out.printf("%n %n The current iterator %d is sumed to the current iterator %d",i,sumTotal);
            if (i == 100){
                System.out.println("Sum: "+ sumTotal);
            }
        }
    }

    public static void main(String[] args) {
        EvenLoop num = new EvenLoop();
        //num.Even_odd(1,50);
        num.SumOfNumbers();

    }
}