import greenfoot.*; 


public class GameOverText extends Actor
{
    public GameOverText(){
        GreenfootImage GameOver = new GreenfootImage(150,150);
        Font adjFont = new Font(true, false, 25);
        GameOver.setFont(adjFont);
        GameOver.setColor(Color.RED);
        GameOver.drawString("GameOver",0,25);
        setImage(GameOver);
    }
    public void act() 
    {
        
    }    
}
