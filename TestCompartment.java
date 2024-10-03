import java.util.Random;

public class TestCompartment {

    public static void main(String[] args) {
        int[] Compartments = new int[10];
        Random rand = new Random();
        int n = rand.nextInt(1,5);
        FirstClass f=new FirstClass();
        Ladies l=new Ladies();
        General g=new General();
        Luggage lg=new Luggage();
        switch(n){
            case 1:
                System.out.println(f);
                break;
            case 2:
                System.out.println(l);
                break;
            case 3:
                System.out.println(g);
                break;
            case 4:
                System.out.println(lg);
        }

    }
}
