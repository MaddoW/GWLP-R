
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P219_Unknown
    extends GWAction
{

    private long agentID1;
    private int unknown2;
    private long unknown3;

    @Override
    public short getHeader() {
        return  219;
    }

    public void setAgentID1(long agentID1) {
        this.agentID1 = agentID1;
    }

    public void setUnknown2(int unknown2) {
        this.unknown2 = unknown2;
    }

    public void setUnknown3(long unknown3) {
        this.unknown3 = unknown3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P219_Unknown[");
        sb.append("agentID1=").append(this.agentID1).append(",unknown2=").append(this.unknown2).append(",unknown3=").append(this.unknown3).append("]");
        return sb.toString();
    }

}
