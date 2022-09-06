import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class History here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class History extends Actor
{
    /**
     * Act - do whatever the History wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public History(){
        GreenfootImage img = new GreenfootImage(100,60);
        img.setColor(Color.BLUE);
        img.fill();
        img.setColor(Color.BLACK);
        img.drawRect(5,5,90,50);
        img.drawString("History",30,30);
        setImage(img);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
