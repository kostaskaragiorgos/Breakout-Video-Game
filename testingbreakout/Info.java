import greenfoot.*; 
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Info extends Buttons
{
    public Info(){
        GreenfootImage infoButton = new GreenfootImage(100,60);
        Font adjFont = new Font(true, false, 30);
        infoButton.setFont(adjFont);
        infoButton.setColor(Color.RED);
        infoButton.drawString("INFO",0,30);
        setImage(infoButton);
        
    }
    public void act() 
    {
        checkMouse();
        if (Greenfoot.mouseClicked(this)){
            JFrame frame = new JFrame("Info");
            JOptionPane.showMessageDialog(frame,"Using a single ball, the player must knock down as many bricks as possible by using the walls and/or the paddle below to ricochet the ball against"
            +"the bricks and eliminate them. If the player's paddle misses the ball's rebound, they will lose a live.if lives get below zero you lose the game."+
            "Move the mouse horizontally to move the player ",
            "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
    }    
}
