
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P157_PlaySound
    extends GWAction
{

    private long agentID;
    private long soundFile;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P157_PlaySound[");
        sb.append("agentID=").append(this.agentID).append(",soundFile=").append(this.soundFile).append("]");
        return sb.toString();
    }

}
