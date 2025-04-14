// 抽象類別
abstract class Shape {
    // 抽象方法（沒有實作，需由子類別實現）
    abstract double getArea();
    
    String shap;
    public void setshap(String str) {
       shap=str;
       
        System.out.println("這是一個"+shap);
    }
    
    // 一般方法
    
}

// 子類別：圓形
class Circle extends Shape {
    private double radius;
    
    public Circle(){
    }
    //建構式
    public Circle(double radius) {
        this.radius = radius;
    }
     public void setshap(){}
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

// 子類別：矩形
class Rectangle extends Shape {
    private double width;
    private double height;
    
    //建構式
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setshap(){}
    @Override
    double getArea() {
        return width * height;
    }
}

//triangle
abstract class triangle extends Shape
{
    private double d;
    
}


public class extend
{
	public static void main(String[] args) {
	    
	    Circle circle= new Circle(3.0);
		System.out.println("Hello World");
		Shape rectangle = new Rectangle(4, 6); // 矩形，寬為 4，高為 6
		circle.setshap("圓形");
        System.out.println("圓形的面積: " + circle.getArea());

        rectangle.setshap("矩形");
        System.out.println("矩形的面積: " + rectangle.getArea());
	}
	
}
