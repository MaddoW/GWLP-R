
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P157_PlaySound
    extends GWAction
{

    public long agentID;
    public long soundFile;

    @Override
    public short getHeader() {
        return  157;
    }

    public void setAgentID(long agentID) {
        this.agentID = agentID;
    }

    public void setSoundFile(long soundFile) {
        this.soundFile = soundFile;
    }

}
