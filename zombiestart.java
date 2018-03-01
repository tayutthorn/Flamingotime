import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class zombiestart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class zombiestart extends Actor
{
    private GreenfootImage[] images=new GreenfootImage[9];
    private int zombie=10,num=0,deltax=2;

    public void addedToWorld(World startgame)
    {
        for(int i=0;i<images.length;i++){
            images[i] = new GreenfootImage("rewalkingdead"+i+".png");
        }
        setImage(images[0]);
    }

    public void act() 
    {
        if(zombie==0)zombie=10;
        if(zombie==1){
            setImage(images[num]);
            num++;
            if(num>=images.length)num=0;
            setLocation(getX()+deltax,getY());
        }
        if(zombie>0)zombie--;

    }    
}

