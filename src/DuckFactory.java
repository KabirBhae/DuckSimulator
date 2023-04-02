public class DuckFactory extends AbstractFactory {

    Quackable getBird(String variable) {
        if (variable.equalsIgnoreCase("duck")) {
            return new Duck();
        }
        else return null;
    }
}
