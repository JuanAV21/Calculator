import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buttons extends Actor
{
    /**
     * Act - do whatever the Buttons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public String buttonNumber;
    public Buttons(int num){
        GreenfootImage img = new GreenfootImage(60,60);
        img.setColor(Color.BLACK);
        img.fill();
        img.setColor(Color.GRAY);
        img.drawRect(3,3,47,47);
        img.setColor(Color.WHITE);
        img.drawString(Integer.toString(num),30,30);
        setImage(img);
        buttonNumber = Integer.toString(num);
    }
    public void act() 
    {
        click();
        
    }    
    public void click(){
        if(Greenfoot.mouseClicked(this)){
            if (Screen.Display == "0"){
                Screen.Display = buttonNumber;
            }
            else{
                Screen.Display = Screen.Display + buttonNumber;
            }
        }
    }
}
