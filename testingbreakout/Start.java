import greenfoot.*;  


public class Start extends World
{
    
    public Start()
    {    
        super(600, 400, 1); 
        prepare();
    }

    private void prepare()
    {
        Play play = new Play();
        addObject(play,300,100);
        Info info = new Info();
        addObject(info,300,200);
        Exit exit = new Exit();
        addObject(exit,300,300);
    }
}
