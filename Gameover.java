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

    /**
     * Constructor for objects of class Gameover.
     * 
     */
    public Gameover()
    {    

        super(1280, 720, 1); 

    }

    public void act()
    {
        Display.myMusic.stop(); 
        if(Greenfoot.isKeyDown("R"))
            Greenfoot.setWorld(new Display());

    }

    //

}
