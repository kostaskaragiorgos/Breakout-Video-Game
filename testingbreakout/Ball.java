import greenfoot.*; 


public class Ball extends Actor
{
   private int dy;
   private int dx;
   public Player player;
    public Ball(Player player){
        this.player = player;
        dy =5;
        dx = 0;
        
    }
    
    public void  updateDy(int updatevalue)
    {
        dy = dy + updatevalue;
    }
    
    public void  move(){
        setLocation(getX() + dx, getY() + dy);
    }
    
    public void bounce(){
        
        /// only if it hits the eage of the player hard 
        if (isTouching(Player.class)){
         Greenfoot.playSound("bounce.wav");
        }
        if (isTouching(Player.class) && this.player.getX() > getX() + 50)
        {
            dy = -dy;
            dx -= 6;
        }
        else if (isTouching(Player.class)  && this.player.getX() < getX() - 50)
        {
            dy = -dy;
            dx += 6;
        }
        else if (isTouching(Player.class) || isTouching(Brick.class))
        {
            dy  = -dy; 
        }
        

    }
    
    public void edgeBounce()
    
        {
            if (getX() >= getWorld().getWidth()-1)
            {
                dx = -dx;
            }
            if (getX() <=0){
                dx = -dx;
            }
            if (getY() <=0){
                dy = -dy;
            }
        }
       
    public void loss(){
        MyWorld world = (MyWorld)getWorld();
        Lives lives = world.getLives();
        if ((getY()) >= getWorld().getHeight() -1)
        {
            lives.updateLives(1);
            setLocation(325,270);
        }
        if (lives.getLives() < 0){
            world.stopmusic();
            Greenfoot.setWorld(new GameOver());
        }
    }
    public void hitBrick(){
        Actor brick = getOneIntersectingObject(Brick.class);
        MyWorld world = (MyWorld)getWorld();
        Score score = world.getScore();
         if (isTouching(Brick.class)){
             score.updateScore(100);
         Greenfoot.playSound("bricktouch.wav");
         
         
        }
        if((brick != null) && (brick.getX()> getX() + 30))
        {
            getWorld().removeObject(brick);
            dx = -dx;
        }
        else if ((brick != null) && ( brick.getX()> getX() -30))
        {
            getWorld().removeObject(brick);
            dx = -dx;
        }
        else if (brick !=null){
            getWorld().removeObject(brick);
        }
}
    
    public void act() 
    {
        move();
        bounce();
        edgeBounce();
        hitBrick();
        loss();
    }    
}
