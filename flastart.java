import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flastart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flastart extends Actor
{
    private GreenfootImage[] images=new GreenfootImage[36];
     private int fla=10,num=0,deltax=2;
     
     public void addedToWorld(World startgame)
     {
         for(int i=1;i<images.length;i++){
             images[i] = new GreenfootImage("Flamingo"+i+".png");
            }
            setImage(images[1]);
        }
    /**
     * Act - do whatever the flastart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(fla==0)fla=10;
        if(fla==1){
            setImage(images[num]);
            num++;
            if(num>=images.length)num=0;
            setLocation(getX()+deltax,getY());
        }
        if(fla>0)fla--;
    }    
}
