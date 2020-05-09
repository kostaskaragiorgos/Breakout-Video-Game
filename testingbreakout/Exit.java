import greenfoot.*;  


public class Exit extends Buttons
{
    public Exit()
    {
        super();
        GreenfootImage exitButton = new GreenfootImage(100,60);
        Font adjFont = new Font(true, false, 30);
        exitButton.setFont(adjFont);
        exitButton.setColor(Color.RED);
        exitButton.drawString("EXIT",0,30);
        setImage(exitButton);
    }

    public void act() 
    {
        checkMouse();
          if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.stop();
        }
        
    }    
}
