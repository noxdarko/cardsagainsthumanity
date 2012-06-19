package de.CardsAgainstHumanity.Client;

import de.CardsAgainstHumanity.Client.Interfaces.ClientCallback;
import de.root1.simon.SimonUnreferenced;
import de.root1.simon.annotation.SimonRemote;

/**
 *
 * @author Timo
 */
@SimonRemote(value = {ClientCallback.class})
public class ClientCallbackImpl implements ClientCallback, SimonUnreferenced{
    
    private static final long serialVersionUID = 1L;
    

    private Client c;
    
    public ClientCallbackImpl(Client c){
        this.c = c;
    }
    
    @Override
    public void sendMessage(String s) {
        System.out.println("Message: "+s);
    }

    @Override
    public void sendSystemMessage(String s) {
        System.out.println("System: "+s);
    }

    @Override
    public void disconnect() {
        
    }

    @Override
    public void unreferenced() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}