  
    public class AddDigits{

        public static int addingNumbers(int number){

        int digit  = 0;
        while(number != 0){

           int index = number % 10;

           digit += index;

            number /= 10;


} 
        return digit;

}
              


        public static void main(String [] args){

            int sumResult = addingNumbers(50);
            System.out.println(sumResult);


}
}
