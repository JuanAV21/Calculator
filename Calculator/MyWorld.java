import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(420, 400, 1);
        background();
        prepare();
    }
    public void background(){
        GreenfootImage img = new GreenfootImage(400,400);
        img.setColor(Color.GRAY);
        img.fill();
        setBackground(img);
    }
    private void prepare()
    {
       String operators[] = {"C","+","-","="};
       addObject(new Screen(), 150, 40);
       addObject(new History(),320,40);
       
       int nums = 1;
       for(int y = 120; y < (120+(80*3)); y = y + 80){
            for(int i = 0; i <= 2 ; i++){
                addObject(new Buttons(nums++),60+(i*100), y);
            }
        }
       nums = 0;
       addObject(new Buttons(0),160,360);
       addObject(new function("NO"),60,360);
       addObject(new function("."),260,360);
       
       for (int i = 120; i < 360+80; i = i + 80){
           addObject(new function(operators[nums++]),360,i);
        }
    }
}
