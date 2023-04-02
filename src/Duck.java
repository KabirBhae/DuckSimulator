public class Duck implements Quackable {
    @Override
    public void quack(String s) {
        System.out.println("\n" +s+ " is quacking");
    }
}
