import greenfoot.Greenfoot;

/**
 * Subclass that handles GAMELEVELCOMPLETED state
 * 
 * 
 * @author Niyat Patel
 * @version 1.0
 */

public class GameLevelCompletedState extends GameState {

    public GameLevelCompletedState( GameManager gm )
    {
        super( gm ) ;
    }

    @Override
    public void setStateStart() {
       Greenfoot.setWorld(new HomeWorld());
       game_manager.setState(GameStates.START);
    }
    
    @Override
    public void setStateStopped() {
       System.exit(1);
       game_manager.setState(GameStates.STOPPED);
    }
    
    
    @Override
    public void setStateRunning() { 
       Greenfoot.setWorld(new MyWorld());
       game_manager.setState(GameStates.RUNNING);
    }
    
}