import java.util.Scanner;

    public class  TaskOne{

        public static void main(String [] args){

           
                    Scanner input = new Scanner (System.in);
              

                  int sum = 0;

                   for(int count = 1; count < 10; count++){

                     

                         System.out.print("Enter Scores: ");
  int scores = input.nextInt();

                    sum += count;
                System.out.println(sum);
}

}



}
