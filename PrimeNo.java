public class PrimeNo{
    public static boolean isprime (int number) {
         if (number<=1) {
         return false;
         }
         for (int i=2;i<=Math.sqrt(number);i++) {
         if (number % i==0){
         return false;
         }
         }
         return true;
         }     
         public static void main(String[] args){
         int[] a = {2,3,4,5,16,17,18,19,20};
         for (int i=0; i< a.length;i++){
         System.out.println(a[i] + " is prime :"+ isprime (a[i]));
         }
     }
 }