public class FactoryProducer {
    public static AbstractFactory getFactory(boolean count){
        if(count) return new CountingDuckFactory();        
        else return new DuckFactory();
    }
}
