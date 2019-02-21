import java.io.*;
import java.util.Scanner;

public class Bag {

    private int current_redPotion;
    private int current_orangePotion;
    private int current_yellowPotion;
    private int current_whitePotion;



    public Bag(){
        this.current_redPotion = 20;
        this.current_orangePotion = 15;
        this.current_yellowPotion = 5;
        this.current_whitePotion = 0;

        Item item = new Item();
        
    }
    public int getcurrent_redPotion(){
        return current_redPotion;
    }
    public int getcurrent_orangePotion(){
        return current_orangePotion;
    }
    public int getcurrent_yellowPotion(){
        return current_yellowPotion;
    }
    public int getcurrent_whitePotion(){
        return current_whitePotion;
    }


    
}