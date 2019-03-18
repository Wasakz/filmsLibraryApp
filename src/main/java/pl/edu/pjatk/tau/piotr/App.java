package pl.edu.pjatk.tau.piotr;

/**
 * Hello world!
 *
 */
public class App 
{
   public double add (double x, double y){
       return x+y;
   }

   public double sumTen (double x){
       int sum = 0;
       for (int i=0; i<10; i++){
           sum += x;
       }
       return sum;
   }
}
