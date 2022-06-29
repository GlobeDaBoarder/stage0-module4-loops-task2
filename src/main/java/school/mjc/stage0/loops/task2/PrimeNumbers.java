package school.mjc.stage0.loops.task2;

import org.w3c.dom.ls.LSOutput;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive == 0 || printToInclusive == 1)
            return;

        System.out.println(2);
        int i = 3;
        boolean flag = true;
        while (i <= printToInclusive){
            for (int j = 2; j <= Math.sqrt(i); ++j){
                if (i % j == 0){
                    flag = false;
                    break;
                }
            }

            if(flag == true){
                System.out.println(i);
            }

            flag = true;
            ++i;
        }
    }
}
