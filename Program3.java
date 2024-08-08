public class Program3 {
    public static void Testmethod(){
        System.out.println("Test method1 running");
    }
    public static void TestMethod2(){
        System.out.println("Test Method 2 running");
        Testmethod();
        System.out.println("Test Method 2 finished");
    }
    public static void main(String [] args){
        System.out.println("Main method Running");
        TestMethod2();
        System.out.println("Main Method ended");
    }
}
