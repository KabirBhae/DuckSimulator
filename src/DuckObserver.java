public class DuckObserver extends Observer {
    Quackable duck;
    public DuckObserver(Subject s, Quackable d){
        this.subject = s;
        this.subject.attach(this);

        this.duck = d;
    }
    
    String s = "DuckObserver";
    public void update(){
        this.duck.quack(s);
    }
}