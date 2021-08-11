//  A Java program to withdraw balance. The program takes the password as an input.
//  If the password is incorrect then it thorws InvalidPassword error, if amount is less than 0 then it throws InvalidAmount error,
//  if the amount is greater than the available balance then it throws InsufficientFunds error

import java.util.Scanner;
import java.lang.Exception;

class InvalidAmount extends Exception {
    public InvalidAmount(String e) {
        super(e);
    }
}

class InsufficientFunds extends Exception {
    public InsufficientFunds(String e) {
        super(e);
    }
}

class IncorrectPassword extends Exception {
    public IncorrectPassword(String e) {
        super(e);
    }
}

public class Account {
    
    private double balance = 10000;
    private String password = "RandomPassword";
    
    public void withdraw(double amt)
    throws InvalidAmount, InsufficientFunds {
    
        if (amt < 0) {
        throw new InvalidAmount("Invalid amount. Amount cannot be negative");
        }
        
        if (balance < amt) {
        throw new InsufficientFunds("Low account balance");
        }
    
        balance -= amt;
    }
    
    public void verify(String passcode)
    throws IncorrectPassword {

        if(passcode!=password) {
        throw new IncorrectPassword("Incorrect Password");
        }
        System.out.println("Welcome\n");
    }
    // etc.
}

public Error_Handling() {

    public static void main(String[] args) {
        
        Account acc = new Account();
        Scanner ob = new Scanner(System.in);

        double amt;
        System.out.println("Password: ");
        String password = ob.nextLine();

        try {
            acc.verify(password);
        }
        catch(IncorrectPassword e)
        {
            System.out.println("Something went wrong...");
        }
        
        try {
            System.out.println("amount to withdraw: ");
            amt = ob.nextDouble();
        }
        catch(InsufficientFunds e) {
            System.out.println("Something went wrong");
        }
        catch(InvalidAmount e) {
            System.out.println("Something went wrong");
        }

        ob.close();        
    }
}
   