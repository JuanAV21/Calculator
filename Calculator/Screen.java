import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Screen extends Actor
{
    /**
     * Act - do whatever the Screen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static String Display = "0";
    public Screen(){
        changeDisplay("0");
    }
    public void act() 
    {
        changeDisplay(Display);
    }
    public void changeDisplay(String equation){
        GreenfootImage img = new GreenfootImage(200,60);
        img.clear();
        img.setColor(Color.WHITE);
        img.fill();
        img.setColor(Color.BLACK);
        img.drawRect(0,0,199,59);
        img.drawString(Display,img.getWidth()-((Display.length()*8)+30),40);
        setImage(img);
    }
}
