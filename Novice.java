//import java.io.*;
//import java.util.*;

//import javax.lang.model.util.ElementScanner6;

public class Novice{
    
    private int exp;
    private int maxexp;
    private int lvl;
    private int jobexp;
    private int joblvl;
    private int maxjobexp;
    private int stamina;
    private int hp;
    private int maxhp;

    private Bag bag;

    Bag bag = new Bag();
    //Scanner Sc = new Scanner(System.in);
    //int number;

    public Novice(){
        this.exp = 0;
        this.maxexp = 50;
        this.lvl = 1;
        this.jobexp = 0;
        this.joblvl = 1;
        this.maxjobexp = 75;
        this.stamina = 500;
        this.hp = 500;
        this.maxhp = 500;
        
        Bag bag = new Bag();
        Scanner Sc = new Scanner(System.in);
        int number;

    }
        public int getexp(){
            return exp;
        }
        public int getmaxexp(){
            return maxexp;
        }
        public int getlvl(){
            return lvl;
        }
        public int getjobexp(){
            return jobexp;
        }
        public int getjoblvl(){
            return jobexp;
        }
        public int getmax(){
            return maxjobexp;
        }
        public int getstamina(){
            return stamina;
        }
        public int gethp(){
            return hp;
        }
        public int getmaxhp(){
            return maxhp;
        }
        public void showstatus(){
            System.out.println("Your level is " + lvlUp() );
                System.out.println("Your joblvl is " + joblvlUp() );
                System.out.println("Your Currentexp is " + exp + "/" + maxexp  );
                System.out.println("Your Currentjobexp is " + jobexp + "/" + maxjobexp );
                System.out.println("Your Currentstamina is " + stamina + "/500"  );
                System.out.println("Your HP == " + hp + "/" + maxhp);
        }
        /*
        public int usePotion(){

            System.out.println("Plese Enter Number For Select Choise");
            System.out.println("1 For use RedPotion");
            System.out.println("2 For use OrangePotion");
            System.out.println("3 For use YellowPotion");
            System.out.println("4 for Use WhitePotion");
            System.out.println("0 For Exit");
            
            do {
                System.out.print("Enter number : ");
                number = Scan.nextInt();
                
                if(number == 1){
                    if(bag.getcurrent_redPotion() != 0){
                        if(hp >=(maxhp-50))
                            hp = maxhp;
                        else
                            hp += 50;   
                        
                        return hp;

                        novice.killPoring();
                        novice.showstatus();
                    }
                    else
                        System.out.println("Not enough stamina " );
                }  

            }while (num != 0);
            
        }
        */
        public int lvlUp(){
            if(exp >= maxexp) {
                lvl = lvl + 1;
                maxexp = 50 + (lvl * 578);
                maxhp = 500 +(lvl*164);
                hp = maxhp;
            }
            return lvl;
        }

        public int joblvlUp(){
            if(exp >= maxjobexp){
                joblvl = joblvl + 1;
                maxjobexp = 75 + (lvl * 964);
            }
            return joblvl;
        }

        public void killPoring(){
            if(stamina >= 3){
                exp += 5;
                jobexp += 3;
                stamina = stamina - 3;
            }

        }

        public void killMinotaurus(){
            if(stamina >= 100){
                exp += 136;
                jobexp += 84;
                stamina -= 100;
                hp -= 80;
            }
        }

        public void killAnubis(){
            if(stamina >= 350){
                exp += 312;
                jobexp += 287;
                stamina -= 350;
                hp -= 300;
            }
 

        }

}