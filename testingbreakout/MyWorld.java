import greenfoot.*;  


public class MyWorld extends World
{
    private Player player;
    private Score score;
    private Lives lives;
    private Ball ball;
    private GreenfootSound menu = new GreenfootSound ("background.wav");
    public MyWorld()
    {    

        super(600, 400, 1);
        player = new Player();
        ball = new Ball(player);
        score = new Score(0);
        lives = new Lives(2);
        prepare();
    }
    
    public MyWorld(Player p , Ball b, Score score, Lives lives) {
        super(600, 400, 1);
        this.player = p;
        this.ball = b;
        this.ball.updateDy(2);
        this.score = score;
        this.lives = lives;
        
        prepare();


    }

    private void prepare()
    {

        addObject(player,292,366);
        player.setLocation(294,366);
        menu.play();
        addObject(ball,325,270);
        ball.setLocation(280,244);
        addObject(score, 580, score.getImage().getHeight()/2);
        addObject(lives , lives.getImage().getHeight()/5, 540);
        for (int i = 0; i <7; i++)
            for (int j = 0; j<4;j++)
                addObject(new Brick(), 50+80 * i, 20+30 *j);
        lives.setLocation(45,373);
    }

    public void stopmusic(){
        menu.stop();
    }
    public Lives getLives(){
        return lives;
    }
    
    public Score getScore(){
        return score;
    }
    
    public void act(){
       
        if (getObjects(Brick.class).size()  == 0){
            menu.stop();
            Greenfoot.setWorld(new MyWorld(player, ball, score, lives));
            
        }
    }
}
