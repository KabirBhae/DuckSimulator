public class Main {

    public static void main(String[] args) {
        //task1
        System.out.println("Task1");
        Duck duck = new Duck();
        duck.quack("Duck");

        //task2
        System.out.println("\nTask2");
        Goose goose = new Goose(duck);
        goose.quack("Goose");

        //task3
        System.out.println("\nTask3");
        CountDuckDecorator cdd = new CountDuckDecorator(duck);
        cdd.quack("CountDuckDecorator");
        cdd.quack("CountDuckDecorator");
        cdd.quack("CountDuckDecorator");

        //task4
        System.out.println("Task4");
        AbstractFactory factory = FactoryProducer.getFactory(true);
        Quackable quakable = factory.getBird("CountDuck");
        quakable.quack("Factory_counting_duck");

        //task5
        System.out.println("Task5");
        Flock flock = new Flock();
        flock.add(duck);
        flock.quack("Flock duck");
        // flock.add(cdd);
        // flock.quack("CountDuckDecorator");

        //task6
        System.out.println("\nTask6");
        Subject s1 = new Subject();
        new DuckObserver(s1,duck);
        s1.notifyAllObservers();
    }
}
