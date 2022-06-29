package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int i = 1;
        while (i != lastPrinted + 1){
            System.out.println(i);
            ++i;
        }
    }
}
