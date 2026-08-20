import java.util.Scanner;

    public class  TaskTwo{

        public static void main(String [] args){

           
                    Scanner input = new Scanner (System.in);
              

                  int sum = 0;
                  int average = 0;
                 

                   for(int count = 1; count <=10; count++){

                        System.out.print("Enter Scores: ");
                         int scores = input.nextInt();

                        sum += count;
                         average =  sum / 10;
                           System.out.println("sum is"+sum);
                        System.out.println("Average is"+average);
}

}



}
