public abstract class QuackableDecorator implements Quackable {
    protected Quackable decoratedQuackable;

    public QuackableDecorator(Quackable dq){
        this.decoratedQuackable = dq;
    }
    @Override
    public void quack(String s) {
        decoratedQuackable.quack(s);
    }
}