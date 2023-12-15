class Point{
    private int[] sauvegard = new int[2];
    private int x ;
    private int y ;

    public Point(){this(0,0);}
    // La facon 1 : 
    // public Point(){
    //     this(0);
    // }
    public Point(int a, int b ){x = a; y = b;}

    public Point(int a){
        this.x = 0;
        this.y = 0;
    }

    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    // La facon 2 :
    // public Point(int a) {
    //     this();
    //     this.x = a;
    // }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }  
    public void setX(int x){
        this.x=x;
        sauvegard[0]=x;
    }
    public void setY(int y){
        this.y=y;
        sauvegard[1]=y;
    }
    public void deplacement(int x , int y){
        this.x+=x;
        this.y+=y;
        System.out.println("dans l'axe de  x : "+this.x+" dans l'axe de y : "+this.y);
    }
    public void reset(){
        this.x=sauvegard[0];
        this.y=sauvegard[1];
    }
    public double distance(Point b){
        return Math.sqrt(Math.pow((this.x-b.x), 2)+Math.pow((this.y-b.y), 2));
    }
    public static double distance(Point a ,Point b){
        return Math.sqrt(Math.pow((a.x-b.x), 2)+Math.pow((a.y-b.y), 2));
    }
    public boolean equals(Point a){
        return this.x == a.x && this.y == a.y;
    }
    public boolean equals(Object a){
        return (this.x == ((Point)a).x && this.y == ((Point)a).y);
    }
    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}