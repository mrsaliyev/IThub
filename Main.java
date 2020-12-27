
//  ---------- Rsaliyev Madiyar ----------

public class Main {

    public static void main(String[] args) {

        Circle c1 = new Circle();

        System.out.println("The circle 1 has radius of "
                + c1.getRadius() + ", area of " + c1.getArea() + " and circumference of " + c1.getCircumference());


        Circle c2 = new Circle(2.0);

        System.out.println("The circle 2 has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());

        Circle c3 = new Circle(3.0, "blue");

        System.out.println("The circle 3 has radius of "
                + c3.getRadius() + ", area of " + c3.getArea() + " and color " + c3.getColor());


        Circle c4 = new Circle();
        c4.setRadius(5.5);

        System.out.println("radius is: " + c4.getRadius());

        c4.setColor("green");

        System.out.println("color is: " + c4.getColor());

        Circle c5 = new Circle(5.5);
        System.out.println(c5.toString());

        Circle c6 = new Circle(6.6);
        System.out.println (c6.toString());
        System.out.println (c6);
        System.out.println ("Оператор '+' также вызывает toString ():" + c6);

        Date d1 = new Date(2, 6, 2020);
        System.out.println(d1);

        Account ac1 = new Account("111", "Bob", 100);
        Account ac2 = new Account("222", "John", 100);

        ac1.transferTo(ac2, 50);

        System.out.println(ac1.getBalance());
        System.out.println(ac2.getBalance());

        Time t1 = new Time(2, 6, 9);
        System.out.println(t1);

        Ball b1 = new Ball(0, 0, 1, 5, 2);
        b1.move();
        System.out.println(b1);
        b1.reflectHorizontal();
        b1.move();
        System.out.println(b1);
    }
}
