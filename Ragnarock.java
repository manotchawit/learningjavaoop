import java.io.*;
import java.util.Scanner;

public class Ragnarock {
    public static void main(String[] args){
        Novice novice = new Novice();
        Scanner Scan = new Scanner(System.in);
        int number;
        System.out.println("Plese Enter Number For Select Choise");
        System.out.println("1 For Kill Poring");
        System.out.println("2 For Kill Minotaurus");
        System.out.println("3 For Kill Anubis");
        System.out.println("4 for Use Potion");
        System.out.println("0 For Exit");

    do{
        System.out.print("Enter number : ");
        number = Scan.nextInt();

        if(number == 1){
            if(novice.getstamina() > 3){
                novice.killPoring();
                novice.showstatus();
            }
            else
                System.out.println("Not enough stamina " );
        }
        
        if(number == 2){
            if(novice.getstamina() > 100){
                novice.killMinotaurus();
                novice.showstatus();
                /*System.out.println("Your level is " + novice.lvlUp() );
                System.out.println("Your joblvl is " + novice.joblvlUp() );
                System.out.println("Your Currentexp is " + novice.exp + "/" + novice.maxexp  );
                System.out.println("Your Currentjobexp is " + novice.jobexp + "/" + novice.maxjobexp );
                System.out.println("Your Currentstamina is " + novice.stamina + "/500"  ); 
                System.out.println("Your HP == " + novice.hp + "/" + novice.maxhp); */
            }
            else
                System.out.println("Not enough stamina" );
        }

        if(number == 3){
            if(novice.getstamina() >= 350){
                novice.killAnubis();
                novice.showstatus();
                /*System.out.println("Your level is " + novice.lvlUp() );
                System.out.println("Your joblvl is " + novice.joblvlUp() );
                System.out.println("Your Currentexp is " + novice.exp + "/" + novice.maxexp  );
                System.out.println("Your Currentjobexp is " + novice.jobexp + "/" + novice.maxjobexp );
                System.out.println("Your Currentstamina is " + novice.stamina + "/500"  );
                System.out.println("Your HP == " + novice.hp + "/" + novice.maxhp);*/
            }
            else
                System.out.println("Not enough stamina" );
        }

        if(number == 4){
            System.out.println("Sorry this function is currently under construction. ");
            //novice.usePotion();
            //novice.showstatus();
            /*
            System.out.println("Your level is " + novice.lvlUp() );
            System.out.println("Your joblvl is " + novice.joblvlUp() );
            System.out.println("Your Currentexp is " + novice.exp + "/" + novice.maxexp  );
            System.out.println("Your Currentjobexp is " + novice.jobexp + "/" + novice.maxjobexp );
            System.out.println("Your Currentstamina is " + novice.stamina + "/500"  );
            System.out.println("Your HP == " + novice.hp + "/" + novice.maxhp);*/
        }

    }while (number != 0);
}
}