import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class function here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class function extends Actor
{
    /**
     * Act - do whatever the function wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String operator;
    static String operation = "";
    
    public function(String str){
        GreenfootImage img = new GreenfootImage(60,60);
        img.setColor(Color.BLACK);
        img.fill();
        img.setColor(Color.GRAY);
        img.drawRect(3,3,47,47);
        img.setColor(Color.WHITE);
        img.drawString(str,30,30);
        setImage(img);
        operator = str;
    }
    public void act() 
    {
        functions();
        equals();
    }    
    public void functions(){
        if (operator == "C" && Greenfoot.mouseClicked(this)){
            Screen.Display = "0";
        }
        if (operator == "+" && Greenfoot.mouseClicked(this)){
            Screen.Display = Screen.Display + operator;
            operation = "+";
        }
        if (operator == "-" && Greenfoot.mouseClicked(this)){
            Screen.Display = Screen.Display + operator;
            operation = "-";
        }
        if (operator == "." && Greenfoot.mouseClicked(this)){
            Screen.Display = Screen.Display + operator;
        }
    }
    public void equals(){
        String str = Screen.Display;
        
        if(operator.equals("=") && Greenfoot.mouseClicked(this)){
            if(operation == "+"){
                String[] Astr = str.split("\\+");
                double sum = 0;
                for (String a: Astr){
                    sum = sum + Double.parseDouble(a);
                }
                Screen.Display = Double.toString(sum);
            }
            if(operation == "-"){
                String[] Astr = str.split("-");
                double sum = Double.parseDouble(Astr[0]);
                for (int i = 1; i < Astr.length; i++){
                    sum = sum - Double.parseDouble(Astr[i]);
                }
                Screen.Display = Double.toString(sum);
            }
        }
    }
}
