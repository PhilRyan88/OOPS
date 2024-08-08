public class Program2 {
    public static void TestMethod(){
        System.out.println("Test Method 1");
    }
    public static void TestMethod2(){
        System.out.println("Test Method 2");
    }
    public static void main(String[] args){
        System.out.println("Main Method Running");
        TestMethod();
        TestMethod2();
        System.out.println("Main Method Ended");
    }
}
