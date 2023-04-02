public class CountDuckDecorator extends QuackableDecorator {
    private int quackCount = 0;
    CountDuckDecorator(Quackable dq){
        super(dq);
    }
    @Override
    public void quack(String s) {
        super.quack(s);
        countDucks();
    }

    private void countDucks(){
        quackCount++;
        System.out.println("number of Quacks:" + quackCount+"\n");
    }
}