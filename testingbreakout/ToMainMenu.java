import greenfoot.*;  


public class ToMainMenu extends Buttons
{
    private GreenfootSound gameover = new GreenfootSound ("gameover.wav");
        public ToMainMenu()
    {
        super();
        GreenfootImage ToMainMenuButton = new GreenfootImage(250,250);
        Font adjFont = new Font(true, false, 25);
        ToMainMenuButton.setFont(adjFont);
        ToMainMenuButton.setColor(Color.RED);
        ToMainMenuButton.drawString("TO MAIN MENU",0,25);
        setImage(ToMainMenuButton);
        
    }

    public void act() 
    {
         checkMouse();
         gameover.play();
        if (Greenfoot.mouseClicked(this))
        {
            gameover.stop();
            Greenfoot.setWorld(new Start());
        }
        
    }    
}
