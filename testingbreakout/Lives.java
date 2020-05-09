import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Lives extends Actor
{
    private String label;
    private int lives, fontsize;
    private Color textColor, backgroundColor;
    
    public Lives(int lives){
        this.lives = lives;
        fontsize = 24;
        textColor = Color.BLACK;
        backgroundColor = new Color(0,0,0,0);
        this.label = "Lives:"+lives;
        updateImage();
    }
        public void updateLives(int update){
        lives -= update;
        setLabel("Lives:"+lives);
    }
    
       public void updateImage()
    {
        GreenfootImage myImage = new GreenfootImage(label, fontsize, textColor, backgroundColor);
        setImage(myImage);
        
    }
    
    public int getLives(){
      return (int) lives;
   }
    
    public void setLabel(String text)
    {
        this.label = text;
        updateImage(); 
    }
    
}
