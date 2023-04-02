class Goose {
    private Quackable quackable_object;
    Goose(Quackable q){
        this.quackable_object = q;
    }
    void quack(String s){
        quackable_object.quack(s);
    }
}
