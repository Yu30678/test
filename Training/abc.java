abstract class Shape {
    // 抽象方法（沒有實作，需由子類別實現）
    abstract double getArea();
     String shap;
     //一般方法
    public void setshap(String str) {
       shap=str;
       
        System.out.println("這是一個"+shap);
    }
       public  void display() {
        
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
   
    //@Override
    public void setshap(){
        //System.out.println("這是一個"+shap);
        //System.out.println("這是一個長方形");
    }
    
    @Override
    double getArea() {
        return width * height;
    }
}


public class abc
{
	public static void main(String[] args) {
	    
		System.out.println("Hello World");
		Shape rec = new Rectangle(4, 6); // 矩形，寬為 4，高為 6
		rec.setshap("長方形");
		
		
		System.out.println(rec.getArea());
		
	}
	
	//static int xxx(int oo){return 0;}
}

