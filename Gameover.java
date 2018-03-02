import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gameover extends World
{
    //GreenfootSound myMusic = new GreenfootSound("trollsong.mp3");
    //public int score =0;
     
    
    /**
     * Constructor for objects of class Gameover.
     * 
     */
    public Gameover()
    {    

        super(1180, 700, 1); 

    }

    public void act()
    {
        Display.myMusic.stop(); 
        if(Greenfoot.isKeyDown("R"))
            Greenfoot.setWorld(new Display());
       
        showText("Your Score is = "+ Display.score ,1000,600);
    }


    //
}
