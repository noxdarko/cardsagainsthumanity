package de.CardsAgainstHumanity.Server.Interfaces;

import java.util.List;

/**
 *
 * @author Timo
 */
public interface Lobby {
    
    public static int REGISTER_SUCCESS = 0;
    public static int REGISTER_FAILED_NAME_ALLREADY_USED = 1;
    public static int REGISTER_FAILED_LOBBY_FULL = 2;
    
    public static enum Gametype{
        STANDARD;
        
        public static Gametype fromString(String type){
            if(type.equals("Standard")){
                return STANDARD;
            }
            return null;
        }
        
        public static String toString(Gametype type){
            switch(type){
                case STANDARD:
                    return "Standard";
                default:
                    return "null";
            }
        }
    }
    
    /**
     * Returns an integer representing the success of the registering!
     * Can return
     *  REGISTER_SUCCESS = 0
     *  REGISTER_FAILED_NAME_ALLREADY_USED = 1
     *  REGISTER_FAILED_LOBBY_FULL = 2;
     * 
     * @param name
     * @param callback
     * @return 
     */
    public int canAddPlayer(String name);
    
    public void addPlayer(SessionInterface session);
    
    public void removePlayer(SessionInterface session);
    
    public void sendMessageToPlayer(String player, String msg);
    
    public void broadcastMessage(String msg);
    
    public void startGame();
    
    public void stopGame();
    
    public boolean isGameRunning();
    
    public List<String> getPlayers();
    
    public Gametype getGametype();
    
    public String getLobbyName();
}
