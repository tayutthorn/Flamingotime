import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class zombie extends Actor
{  
    private GreenfootImage myImage = getImage();
    private String[]imageNames = {"walkingdead1.png","walkingdead2.png","walkingdead3.png"
        ,"walkingdead4.png","walkingdead5.png","walkingdead6.png","walkingdead7.png"
        ,"walkingdead8.png","walkingdead9.png"};
    private int currentImage =0;
    int xPos;
    int yPos;
    public void addedToWorld(World w)
    { xPos = getX();
        yPos = getY();
    }

    public void act() 
    {
        //move(3);

        if(Greenfoot.getRandomNumber(20)==1)
        {
            setLocation(getX(), getY()-20);

        }
        if(Greenfoot.getRandomNumber(20)==2)
        {
            setLocation(getX(), getY()+20);

        }
        if(Greenfoot.getRandomNumber(20)==3)
        {
            setLocation(getX()-20, getY());

        }
        if(Greenfoot.getRandomNumber(20)==4)
        {
            setLocation(getX()+20, getY());
        }
        animateOnMove();
        
    }

    private void animateOnMove()
    {
        if(getX()!=xPos || getY()!=yPos)
        {
            currentImage++;
            if(currentImage >= imageNames.length)
                currentImage=0;
            GreenfootImage newImage = new GreenfootImage(imageNames[currentImage]);

            if(getX()<xPos)
                newImage.mirrorHorizontally();

            setImage(newImage);
            myImage=getImage();
        }
        xPos = getX();
        yPos = getY();   
    }
    {

    }
}
      