public class Exception01 {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("hello java");
    
        try{
             int result = 5/0;
            System.out.println(a[8]);
         }
        // catch(ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e){
        //     System.out.println("Handling the exception.");}
        // catch(ArithmeticException e){
        //     System.out.println(e.getStackTrace());
        //     System.out.println(e.getMessage());
        //     System.out.println(e.toString());
        // }
        catch(Exception e){
            System.out.println("All exception handled");
        }
        System.out.println(" Bye java");

    
}
    }