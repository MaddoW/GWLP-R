/**
 * For copyright information see the LICENSE document.
 */

package com.gamerevision.gwlpr.loginshard.controllers;

import com.gamerevision.gwlpr.actions.loginserver.ctos.P1024_ClientVersionAction;
import com.gamerevision.gwlpr.actions.loginserver.ctos.P16896_ClientSeedAction;
import com.gamerevision.gwlpr.loginshard.models.EncryptionDataHolder;
import com.gamerevision.gwlpr.loginshard.models.HandshakeModel;
import com.gamerevision.gwlpr.loginshard.views.HandshakeView;
import com.realityshard.shardlet.EventHandler;
import com.realityshard.shardlet.GenericShardlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * This shardlet handles the handshake process for GW clients.
 * It establishes an encrypted session.
 * 
 * @author miracle444
 */
public class Handshake extends GenericShardlet
{
    
    private static Logger LOGGER = LoggerFactory.getLogger(Handshake.class);
    private HandshakeView handshakeView;
    
    
    /**
     * Initialize this shardlet
     */
    @Override
    protected void init() 
    {
        this.handshakeView = new HandshakeView(getShardletContext());
        
        LOGGER.debug("Handshake shardlet initialized!");
    }
    
    
    /**
     * Event handler.
     * 
     * @param action 
     */
    @EventHandler
    public void clientVersionHandler(P1024_ClientVersionAction action)
    {
        LOGGER.debug("Got the client version packet");
        
        int clientVersion = action.getUnknown2();
        
        // lets's ask the model to check the version for us
        if (!HandshakeModel.verifyClientVersion(clientVersion))
        {
            // create the sever seed out of the EncryptionData
            handshakeView.wrongClientVersion(action.getSession());
        }        
    }
    
    
    /**
     * Event handler.
     * 
     * @param action 
     */
    @EventHandler
    public void clientSeedHandler(P16896_ClientSeedAction action)
    {        
        LOGGER.debug("Got the client seed packet");
        
        byte[] clientSeed = action.getClientSeed();
        
        // get the encryption data needed by the protocol filter
        EncryptionDataHolder data = HandshakeModel.getEncrpytionData(clientSeed);
        
        // create the server seed packet out of that and send it (indirectly)
        handshakeView.sendServerSeed(action.getSession(), data);
    }
}
