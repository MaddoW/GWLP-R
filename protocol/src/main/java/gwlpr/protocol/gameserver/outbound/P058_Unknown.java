
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P058_Unknown
    extends GWAction
{

    private long unknown1;
    private long unknown2;
    private long agentID3;

    @Override
    public short getHeader() {
        return  58;
    }

    public void setUnknown1(long unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(long unknown2) {
        this.unknown2 = unknown2;
    }

    public void setAgentID3(long agentID3) {
        this.agentID3 = agentID3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P058_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2).append(",agentID3=").append(this.agentID3).append("]");
        return sb.toString();
    }

}
