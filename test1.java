public class test1 {
    public static void main(String[] args) {
    //System.out.println("Hello World");
    int sum=0;
    for(int i=0;i<100;i++){
        if(num(i)){
            System.out.print(i+" ");
            sum++;
    }
}
System.out.println("總共有"+sum+"個質數");
}
private static boolean num(int i){
    for(int j=2;j<i;j++){
        if(i%j==0){
            return false;
        }
    }

return true;
}
}

    