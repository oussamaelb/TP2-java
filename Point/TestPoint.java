class TestPoint{
    public static void main(String[] args) {

        Point pt = new Point(2,5);
        System.out.println(pt.toString());

        Point p = new Point();
        Point q = new Point(5,2); 

        Point A = new Point();
        A.setX(1);
        A.setY(2);

        Point B = new Point();
        B.setX(1);
        B.setY(2);

        
        Object P = A;
        Object Q = B;

        System.out.println("p equal q : (valeurs) "+p.equals(q));

        /*Point p = new Point();
        Point a = new Point();
        a.setX(1);
        a.setY(2);
        p.setX(1);
        p.setY(2);
        System.out.println("p equal q : (valeurs) "+p.equals(a));*/

        /*Point p = new Point();
        Point q = p;
        System.out.println("p equal q : "+p.equals(q)); // false car ils pointe vers la meme case*/

        /*Point p = new Point();
        Point q = new Point();
        System.out.println("p equal q : "+p.equals(q)); // false car il ne pointe pas vers la meme case  */ 


        /*Point a = new Point();
        a.setX(1);
        a.setY(2);
        Point b=new Point();
        b.setX(2);
        b.setY(3);

        System.out.println("La distance entre Point a et le point b : "+a.distance(b));  vers 1 : l'appel à la fonction par l'instance du point a
        System.out.println("La distance entre Point p et le point b : "+Point.distance(a, b)); vers 2 : l'appel à la fonction seulement avec le nom de la class*/



    
        /*Point p = new Point();
        p.setX(3);
        p.setY(4);
        System.out.println(p.getX());
        System.out.println(p.getY());
        p.deplacement(1, 2);
        p.reset();
        System.out.println(p.getX());
        System.out.println(p.getY()); */
        
        
    }
}