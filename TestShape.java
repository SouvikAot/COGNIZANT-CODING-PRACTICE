import java.awt.*;

public class TestShape {
    public static void main(String[] args) {
        shape c=new Circle();
        c.draw();
        c.erase();
        shape t=new Triangle();
        t.draw();
        t.erase();
        shape s=new Square();
        s.draw();
        s.erase();
    }
}
