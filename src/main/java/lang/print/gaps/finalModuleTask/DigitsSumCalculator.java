package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int first = number/1000;
        int second = number/100 - first*10;
        int third = number/10 - first*100 - second*10;
        int forth = number - first*1000 - second*100 - third*10;
        int sum = first + second + third + forth;
        System.out.println(sum);
    }
}
