public class Example {
    // 靜態屬性
    static int staticCounter = 0;

    // 實例屬性
    int instanceCounter = 0;

    // 靜態區塊
    static {
        System.out.println("靜態區塊執行：初始化靜態成員");
        staticCounter = 100;
    }

    // 建構式
    public Example() {
        System.out.println("建構式執行：初始化物件");
        instanceCounter++;
    }

    // 靜態方法
    public static void staticMethod() {
        System.out.println("靜態方法執行，staticCounter = " + staticCounter);
    }

    // 實例方法
    public void instanceMethod() {
        System.out.println("實例方法執行，instanceCounter = " + instanceCounter);
    }

    public static void main(String[] args) {
        System.out.println("Main 方法開始");

        // 靜態成員可以直接使用
        Example.staticMethod();

        // 創建物件
        Example obj1 = new Example();
        Example obj2 = new Example();

        // 使用實例方法
        obj1.instanceMethod();
        obj2.instanceMethod();

        // 靜態屬性對所有物件共享
        Example.staticCounter++;
        System.out.println("靜態屬性 staticCounter = " + Example.staticCounter);

        // 實例屬性對每個物件獨立
        obj1.instanceCounter++;
        obj2.instanceCounter += 2;
        System.out.println("obj1.instanceCounter = " + obj1.instanceCounter);
        System.out.println("obj2.instanceCounter = " + obj2.instanceCounter);
    }
}
