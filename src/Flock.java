import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {
    public List<Quackable> duckFlock = new ArrayList<Quackable>();
    public void add(Quackable quackable) {
        duckFlock.add(quackable);
    }

    public void quack(String s) {
        Iterator iterator = duckFlock.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable)iterator.next();
            duck.quack(s);
        }
    }
}