import greenfoot.*; 

public class Score extends Actor
{
    private String label;
    private int score, fontsize;
    private Color textColor, backgroundColor;

    public Score(int score){
        this.score = score;
        fontsize = 24;
        textColor = Color.BLACK;
        backgroundColor = new Color(0,0,0,0);
        this.label = ""+score;
        updateImage();
    }
    
    public void updateScore(int update){
        score += update;
        setLabel(""+score);
    }
    
        public void updateImage()
    {
        GreenfootImage myImage = new GreenfootImage(label, fontsize, textColor, backgroundColor);
        setImage(myImage);
        
    }
    
    public void setLabel(String text)
    {
        this.label = text;
        updateImage(); 
    }
    

}
