package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if(power < 0){
            System.out.println("too much power");
            return;
        }

        int i = 0;
        while(i <= power){
            System.out.println((int)Math.pow(2, i));
            ++i;
        }
    }
}
