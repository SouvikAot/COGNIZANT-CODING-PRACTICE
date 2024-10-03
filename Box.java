public class Box {
    int length;
    int width;
    int height;
    Box(int l,int b, int h){
        length = l;
        width = b;
        height = h;
    }
    int volume(){
        return length*width*height;
    }
    public static void main(String[] args) {
        Box box = new Box(5,5,5);
        int vol=box.volume();
        System.out.println("VOULUME IS : "+vol);
    }
}
