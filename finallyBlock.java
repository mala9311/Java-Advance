public class finallyBlock {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("Hello world");
        // try{
        //     System.out.println(a[8]);
        // }
        // catch(Exception e){
        //     System.out.println("Exception handled");
        // }
        // finally{
        //     System.out.println("i will run always");
        // }
        try{
            getNumberFromArray(a);
             }catch(Exception e){
                System.out.println("catched the exception " + e.getMessage());
             }}
             static int getNumberFromArray(int a[]) throws ArithmeticException{
                return a[8];
             }
       // System.out.println("BYE WORLD");
    }

