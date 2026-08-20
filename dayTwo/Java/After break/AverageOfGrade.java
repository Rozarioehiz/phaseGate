import java.util.Scanner;

public class AverageOfGrade{

    public int grading(int scoreOne,int scoreTwo, int scorethree){

        int totalScore = scoreOne + scoreTwo + scoreThree;

        int averageScore = totalScore / 3;


            if (totalscore < 90 && totalScore <= 100)
                
                letter = "A";

            else if (totalscore > 80 && totalscore <= 90)
                letter = "B";

            else if(totalscore > 70 && totalscore <= 80)
                letter = "C";

            else if (totalscore >= 60 && totalscore <= 70)

                letter = "D";

            else:
                    letter = "F";


    return letter;


        
}



    public static void main(String [] args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first score: ");
    int Score1 = scanner.nextInt();

    System.out.print("Enter second Score: ");
    int Score2 = scanner.nextInt();

    System.out.print("Enter third Score: ");
    int Score3 = scanner.nextInt();
        
       
 Scores = grading(Score1, Score2, Score3); 
 System.out.print("grade of Scores " +Scores)
}



}





