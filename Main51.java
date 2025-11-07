package ex51;

public class Main51 {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(20, 20);
        System.out.println(p1);
        System.out.println(p2);

        Line l1 = new Line(p1, p2);
        System.out.println(l1);
        System.out.println("Length: " + l1.getLength());
        System.out.printf("Gradient (radians): %.2f%n", l1.getGradient());

    }
}
