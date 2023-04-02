public class CountingDuckFactory extends AbstractFactory {
    
    CountDuckDecorator getBird(String variable){
        if(variable.equalsIgnoreCase("CountDuck")){
            return new CountDuckDecorator(new Duck());
        } 
        else return null;
    }
}
