import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flamin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flamin extends Actor
{
    GreenfootSound myMusic = new GreenfootSound("trollsong.mp3");

    private GreenfootImage myImage = getImage();
    private String[]imageNames =
        {"Flamingo1.png","Flamingo2.png","Flamingo3.png","Flamingo4.png","Flamingo5.png",
            "Flamingo6.png","Flamingo7.png","Flamingo8.png","Flamingo9.png","Flamingo10.png","Flamingo11.png","Flamingo12.png"
        ,"Flamingo13.png","Flamingo14.png","Flamingo15.png","Flamingo16.png","Flamingo17.png","Flamingo18.png",
            "Flamingo19.png","Flamingo20.png","Flamingo21.png","Flamingo22.png","Flamingo23.png","Flamingo24.png",
            "Flamingo25.png","Flamingo26.png","Flamingo27.png","Flamingo28.png","Flamingo29.png","Flamingo30.png",
            "Flamingo31.png","Flamingo32.png","Flamingo33.png","Flamingo34.png","Flamingo35.png","Flamingo36.png",};
    private int currentImage =0;
    int xPos;
    int yPos;
    public void addedToWorld(World w)
    { xPos = getX();
        yPos = getY();
    }

    /**
     * Act - do whatever the flamin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //this.getImage().scale(75,150);
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-7);

        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+7);

        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-7, getY());

        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+7, getY());
        }
        if(isTouching(zombie.class)){
            Gameover over = new Gameover();
            Greenfoot.setWorld(over);
            
            Greenfoot.playSound("gameover.mp3");
            myMusic.stop();
           
        }

        //reset();
        animateOnMove();
        Actor goldenegg = getOneIntersectingObject(goldenegg.class);
        Display dp = (Display)getWorld();
        
        if(goldenegg!=null){
            dp.removeObject(goldenegg);
            dp.increaseScore();
            
            
            Greenfoot.playSound("Collecteditem.mp3");
            //reset();
        }
        

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

    }}


