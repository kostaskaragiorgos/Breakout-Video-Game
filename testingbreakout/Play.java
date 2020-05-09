import greenfoot.*; 


public class Play extends Buttons
{
    
    public Play()
    {
        super();
        GreenfootImage playButton = new GreenfootImage(100,60);
        Font adjFont = new Font(true, false, 30);
        playButton.setFont(adjFont);
        playButton.setColor(Color.RED);
        playButton.drawString("PLAY",0,30);
        setImage(playButton);
        
    }

    public void act() 
    {
        checkMouse();
        if (Greenfoot.mouseClicked(this))
        {
            
            Greenfoot.setWorld(new MyWorld());
        }
        
    }    
}
