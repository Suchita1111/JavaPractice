package Exception;

public class exception {
    public static void main(String[] args)
    {
//        System.out.println("First step");
        try{
            Thread.sleep(3000);
            System.out.println(10/0);
            }
        catch(InterruptedException e){
            System.out.println("Sleep method has generated exeption but I have handled it");
             }
//        catch (ArithmeticException e) {
//            System.out.println(10 / 0);
//            System.out.println("Exception caused by 10/0 operation");
//        }
//        System.out.println("Second step");
//        try {
//            System.out.println(2.0/0);
//        } catch (ArithmeticException e) {
//            System.out.println("Arthemetic Exception");
//        }

    }

}
