public class Bird extends Animal {
    void eat(){
        System.out.println("Bird class eat method");
    }
    void sleep(){
        System.out.println("Bird class sleep method");
    }
    void fly(){
        System.out.println("Bird class fly method");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.sleep();

        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();
    }
}
