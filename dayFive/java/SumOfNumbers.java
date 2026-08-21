 public class SumOfNumbers{

    public static int suming(int firstNumber, int secondNumber){
            int sum = firstNumber + secondNumber;
        return sum;

}
    public static  int divide(int numberOne){

      int even = numberOne;

            if(numberOne % 2 == 0){

            return even;
        }

        public static int squaring(int numberOne){

        int square = numberOne * numberOne;

        return square;
}
         public static int largestNumber(int numberOne, int numberTwo, int numberthree){

            int largest = 0;
            if(numberOne > numberTwo && numberOne > numberThree);

                largest = numberOne;                
            if(numberTwo > numberOne && numberTwo > numberThree)

                    largest = numberTwo;
            if (numberThree > numberOne && numberThree > numberTwo){
                    largest = numberThree; 
       
       
     }
            return largest; 
   }

            public static int reversingOfNumber(int numberOne){

                 int reversenumber = 0;
                 int index = 0;
                    while(number > 0){
                    index = number % 10;
                    reversenumber = (reversenumber % 10) + index;
                    number /= 10;

}
            
        return reverser;

    }



        public static void main(String [] args){
           int sumResult = suming(7, 3);
            System.out.println(sumResult); 

            int evenResult = divide(30);
            System.out.println("even number is " + evenResult);

            int squareResult = squaring(10);
             System.out.println("square is " + squareResult);
    
            int largestResult =  largestNumber(10,20,5);
              System.out.println("Largest number " + largestResult);

            int ReversedResult = reversingOfNumber (54321);
                System.out.println("reversed number is " + ReversedResult);
         



}

}

