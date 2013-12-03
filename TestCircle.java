class Point {
    private double x;
    private double y;
    Point(double x1, double y1) { 
    	x = x1; 
    	y = y1;
    }
    public double getX() { return x; }
    public double getY() { return y; }
    public void setX(double i) { x = i; }
    public void setY(double i) { y = i; }
}

class Circle {
    private Point o;
    private double radius;
    Circle(Point p, double r) {
    	o = p; 
    	radius = r;
    }
    Circle(double r) {
        o = new Point(0.0, 0.0);
        radius = r;
    }
    
    boolean contains(Point p) {
    	double x = p.getX() - o.getX();
    	double y = p.getY() - o.getY();
    	if(x*x + y*y > radius * radius) return false;
    	else return true;
    }
    
    
    public void setO(double x, double y) {
        o.setX(x); 
        o.setY(y);
    }
    public Point getO() { return o; }
    public double getRadius() { return radius;}
    public void setRadius(double r) { radius = r;}
    public double area() { 
        return 3.14 * radius * radius;
    }
}

public class TestCircle {
    public static void main(String args[]) {
        Circle c1 = new Circle(new Point(1.0,2.0), 2.0);
        // c1是以（1.0,2.0）为圆心，半径为2.0的圆
        Circle c2 = new Circle(5.0);
        // c2是以原点为圆心，半径为5.0的圆
        System.out.println("c1:("+c1.getO().getX()+","
            +c1.getO().getY()+"),"+c1.getRadius());
            // 输出c1的圆心坐标及半径
        System.out.println("c2:("+c2.getO().getX()
            +","+c2.getO().getY()+"),"+c2.getRadius());
            // 输出c2的圆心坐标及半径
        System.out.println("c1 area = "+c1.area());
        System.out.println("c1 area = "+c2.area());
        // 求c1,c2的面积
        c1.setO(5,6);
        // 改c1圆心
        c2.setRadius(9.0);
        // 改c2半径
        System.out.println("c1:("+c1.getO().getX()+","
            +c1.getO().getY()+"),"+c1.getRadius());
            // 输出改后c1的圆心和半径
        System.out.println("c2:("+c2.getO().getX()+","
            +c2.getO().getY()+"),"+c2.getRadius());
            // 输出改后c2的圆心和半径
        System.out.println("c1 area = "+c1.area());
        System.out.println("c1 area = "+c2.area());
        // 新的c1,c2面积
        
        Point p1 = new Point(5.2, 6.3);
        System.out.println(c1.contains(p1));
        // p1是否包含在c1中
        System.out.println(c1.contains(new Point(10.0,9.0)));
        // (10.0,9.0)是否包含在c1中
    }
}
