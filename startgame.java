import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startgame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startgame extends World
{
    //GreenfootSound myMusic = new GreenfootSound("trollsong.mp3");

    /**
     * Constructor for objects of class startgame.
     * 
     */
    public startgame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 500, 1); 
        prepare();
        
    }
    private void prepare()
  {
      //startbutton sbt = new startbutton();
      //addObject(sbt,512,100);
      zombiestart zb = new zombiestart();
      addObject(zb,75,400);
      flastart fs = new flastart();
      addObject(fs,200,400);
      
}
     public void act()
   {  
     if(Greenfoot.isKeyDown("Enter"))
     Greenfoot.setWorld(new Display());
     
     
    
    }
}
