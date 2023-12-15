
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.afficher();
        System.out.println(rectangle.surface()); //surface de rectangle 1

        rectangle.zoom(10, 20);
        rectangle.afficher();
        System.out.println(rectangle.surface()); //surface de rectangle 1 aprés le zoom
        

        Point haut = new Point(5, 5);
        Point bas = new Point(10, 10);
        Rectangle rectangle2 = new Rectangle(haut, bas);
        rectangle2.afficher();
        System.out.println(rectangle2.surface());//surface de rectangle 2

        rectangle2.zoom(5, 5);
        rectangle2.afficher();
        System.out.println(rectangle2.surface());//surface de rectangle2 aprés le zoom
    }
}