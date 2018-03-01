import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class goldenegg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class goldenegg extends Actor
{
    /**
     * Act - do whatever the goldenegg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        spawn();
        // Add your action code here.
    }    

    public void spawn()
    {
        if(Greenfoot.getRandomNumber(300) == 1)
            getWorld().addObject(new goldenegg(),Greenfoot.getRandomNumber(800),Greenfoot.getRandomNumber(800));
    }
}
