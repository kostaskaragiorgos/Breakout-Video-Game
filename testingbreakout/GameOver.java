import greenfoot.*;


public class GameOver extends World
{
    public GameOver()
    {    
        super(600, 400, 1); 
        prepare();
    }

  

    private void prepare()
    {
        GameOverText gameOverText = new GameOverText();
        addObject(gameOverText,305,74);
        ToMainMenu toMainMenu = new ToMainMenu();
        addObject(toMainMenu,320,328);

    }
}
