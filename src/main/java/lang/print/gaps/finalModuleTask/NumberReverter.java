package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int first = number / 100;
        int second = (number - first*100)/10;
        int third = number - first*100 - second*10;
        int revert = third*100 + second*10 + first;
        System.out.println(revert);
    }
}
