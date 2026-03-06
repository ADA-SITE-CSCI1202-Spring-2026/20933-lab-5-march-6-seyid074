public class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(5,10);
        Rectangle r2 = new Rectangle(5,10);

        System.out.println(r1.equals(r2));

        Square s = new Square(6);
        System.out.println(s);

        Point p = new Point(2,3);
        p.moveUp();
        p.moveRight();
        System.out.println(p);

        Circle c = new Circle(new Point(0,0),5);
        c.moveRight();
        c.moveUp();
        System.out.println(c);
    }
}
