public  class FatherAndSonsAge{

    public static int fatherAges(int fatherAge, int sonAge){

         int Twice_Of_Age = 0;    
        
        if(fatherAge > sonAge *2)
            
        Twice_Of_Age = fatherAge - (sonAge * 2);

    
        else if(fatherAge < sonAge *2)
       Twice_Of_Age = (sonAge *2) - fatherAge;

    return Twice_Of_Age;    
}
        
        

     public static void main(String [] args){

            int fathersAge= 60;
            int sonsAge = 15;


    System.out.print("the father was twice his sons" + fatherAges(fathersAge, sonsAge));

         int fathersAge= 60;
            int sonsAge = 20; 

    System.out.print("father will be " + fatherAges(fathersAge, sonsAge))

}


}



