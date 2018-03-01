import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Display here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Display extends World
{
    public static GreenfootSound myMusic = new GreenfootSound("trollsong.mp3");
    private int score =0;

    /**
     * Constructor for objects of class Display.
     * 
     */
    public Display()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        prepare();
    }

    private void prepare()
    {
        flamin fl = new flamin();
        addObject(fl,400,400);

        zombie zb = new zombie();
        addObject(zb,50,700);
        zombie zb2 = new zombie();
        addObject(zb2,50,100);
        zombie zb3 = new zombie();
        addObject(zb3,750,700);
        zombie zb4 = new zombie();
        addObject(zb4,750,100);
        goldenegg gde = new goldenegg();
        goldenegg gde2 = new goldenegg();
        goldenegg gde3 = new goldenegg();
        goldenegg gde4 = new goldenegg();
        //if(Greenfoot.getRandomNumber(10) == 1)

        //addObject(gde,Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
        //goldenegg gde2 = new goldenegg();
        addObject(gde2,400,50);
        //goldenegg gde3 = new goldenegg();
        addObject(gde3,400,750);

        // goldenegg gde4 = new goldenegg();
        addObject(gde4,700,400);

        
    }

    public void act()
    {   
        myMusic.play();
        showText("Score = " + score, 100, 20);
        //Gameover.myMusic.stop(); 

    
    }

    public void increaseScore()
    {
        score = score +10;
    }

}
