abstract class Animal1 {
    abstract void eat();

    public void drink() {

    }
}

class Dog extends Animal1 {
    public void eat() {
    }
}

public class AbstratctionClassDemo {
    public static void main(String[] args) {
//        Animal1 a1 = new Animal1();
        Dog d1 = new Dog();
    }
}
// ctrl alt l