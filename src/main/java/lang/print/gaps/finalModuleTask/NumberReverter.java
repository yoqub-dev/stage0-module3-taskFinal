package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int first  = number % 10;
        int second  = number % 100/10;
        int tree  = number % 1000/100;
        System.out.println(first+""+second+""+tree);
    }
}
