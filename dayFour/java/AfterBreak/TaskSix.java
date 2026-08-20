import java.util.Scanner;

    public class  TaskSix{

        public static void main(String [] args){

           
                    Scanner input = new Scanner (System.in);
              

                  int sum = 0;
                    int average = 0;

                   for(int count = 1; count <=10; count++){

                        System.out.print("Enter Scores: ");
                         int scores = input.nextInt();
                            if(scores % 2 == 0){
}
                            sum += scores;
                            average = scores / 10;
                     
                           System.out.println("average is: " + average);
                      
}

}



}
