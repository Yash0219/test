package test.java;

// import java.util.Scanner;

class guessno{

    public static void guessgame(int guessedNum){

        int correctNum= 50;
        int attempts = 5;

        // Scanner sc=new Scanner(System.in);
        System.out.println("Guess the no between 1 to 100");
        System.out.println("You have 5 attempts");
        System.out.println("Make your guess");
        // int guessedNum=sc.nextInt();
        while (attempts>0){
            if (guessedNum>=1 && guessedNum<=100) {

                if (attempts==0){
                    System.out.println("you ran out of attempts correct number is "+correctNum);
                }
    
                else if (guessedNum == correctNum) {
                    System.out.println("your guess is Right you won ");
                }
                else if(guessedNum < correctNum){
                    attempts--;
                    if (attempts==0){
                        System.out.println("you ran out of attempts correct number is "+correctNum);
                    }
                    System.out.println("the number is smaller then the guessed no");
                } 
                else if (guessedNum > correctNum){
                    attempts--;
                    if (attempts==0){
                        System.out.println("you ran out of attempts correct number is "+correctNum);
                    }
                    System.out.print("the number is greater than gussed no");
    
                }
            } 
            else{
                System.out.println("gussed number is incorrect");
            }
        }   

    }

    public static void main(String[] args) {

      guessgame(56);
            
    }
}