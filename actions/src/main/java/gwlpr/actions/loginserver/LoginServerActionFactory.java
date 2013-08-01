/**
 * For copyright information see the LICENSE document.
 */

package gwlpr.actions.loginserver;

import gwlpr.actions.AbstractGWActionFactory;
import gwlpr.actions.GWAction;
import gwlpr.actions.GWActionSerializationRegistry;
import static gwlpr.actions.gameserver.GameServerActionFactory.registerInbound;
import static gwlpr.actions.gameserver.GameServerActionFactory.registerOutbound;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Register the login server packets here.
 * 
 * @author _rusty
 */
public class LoginServerActionFactory extends AbstractGWActionFactory
{
    
    private final static Logger LOGGER = LoggerFactory.getLogger(LoginServerActionFactory.class);
    private final static Map<Integer, Class<? extends GWAction>> ACTIONS = new ConcurrentHashMap<>();
            
    
    static 
    {
        for (Class<? extends GWAction> clazz : new Reflections("gwlpr.actions.loginserver.inbound").getSubTypesOf(GWAction.class)) 
        {
           registerInbound(clazz);
        }
        
        for (Class<? extends GWAction> clazz : new Reflections("gwlpr.actions.loginserver.outbound").getSubTypesOf(GWAction.class)) 
        {
           registerOutbound(clazz);
        }
    }
    
    
    /**
     * Register an inbound action.
     * 
     * @param action 
     */
    public static void registerInbound(Class<? extends GWAction> action)
    {
        try 
        {
            ACTIONS.put((int)action.newInstance().getHeader(), action);
        } 
        catch (InstantiationException | IllegalAccessException ex) 
        {
            LOGGER.error("Couldnt register an action: Couldnt create an instance of it.", ex);
            return;
        }
        
        GWActionSerializationRegistry.register(action);
    }
    
    
    /**
     * Register an outbound action.
     * 
     * @param action 
     */
    public static void registerOutbound(Class<? extends GWAction> action)
    {
        GWActionSerializationRegistry.register(action);
    }
    
    
    @Override
    protected Class<? extends GWAction> getByHeader(int header) 
    {
        return ACTIONS.get(header);
    }
}
