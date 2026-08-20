import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


    public class TransactionAppTest{

         @Test

    public void testThatAmountIsAddedToAccountBalance(){

//        given

    double depositedAmount = 100.00;
    double accountBalance = 0.00;
    double  Balance = accountBalance + depositedAmount;

//            when


    double actualAccountBalance =TransactionApp.addingAmountToBalance();
    double expectedAccountBalance = 100.00;
   
//                Check

    assertEquals(actualAccountBalance, expectedAccountBalance);

      
}


        @Test

    public void testThatTheAccountBalanceIs(){

    //        given
     double depositedAmount = 100.0;
    double accountBalance = 00.00;
    double  Balance = accountBalance + depositedAmount;

//            when

    double actualAccountBalance = TransactionApp.firstAmountDeposited(100.0); 

    double expectedAccountBalance = 100.0;
   
//                Check
   assertEquals(actualAccountBalance, expectedAccountBalance);


}

       
}



