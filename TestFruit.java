public class TestFruit {
    public static void main(String[] args) {
        Apple a=new Apple();
        a.eat();
        System.out.println("Name :"+a.name);
        System.out.println("Taste : "+a.taste);
        Orange o=new Orange();
        o.eat();
        System.out.println("Name :"+o.name);
        System.out.println("Taste : "+o.taste);
    }
}
