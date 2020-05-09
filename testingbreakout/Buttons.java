import greenfoot.*; 
public class Buttons extends Actor
{
    private GreenfootSound music = new GreenfootSound ("beforeclick.wav");
    private boolean mouseOver = false;
    public void checkMouse(){
        if (Greenfoot.mouseMoved(null)){
            mouseOver = Greenfoot.mouseMoved(this);
        }
        if (mouseOver){
            music.play();
        }
        else{
            music.stop();
        }
        
    }
    public void act() 
    {
        checkMouse();
    }    
}
