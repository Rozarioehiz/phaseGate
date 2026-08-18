public class MeanMedian{

    public static void main (String[] args){

    int number1 = 10;
    int number2 = 15;
    int number3 = 5;
    
    int mean = 0; 
    if(number2 > number1 && number2 > number3){

        mean = number2;
   }
    else if(number2 > number1 && number2 > number3){

        mean = number2;
       }
        else if (number3 > number1 && number3 > number2 ){

        mean = number3;
            
}

    System.out.print(mean);

}




}
