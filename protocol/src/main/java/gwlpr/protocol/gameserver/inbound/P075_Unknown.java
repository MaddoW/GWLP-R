
package gwlpr.protocol.gameserver.inbound;

import gwlpr.protocol.serialization.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P075_Unknown
    extends GWAction
{

    private long agentID1;
    private long unknown2;

    @Override
    public short getHeader() {
        return  75;
    }

    public long getAgentID1() {
        return agentID1;
    }

    public long getUnknown2() {
        return unknown2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P075_Unknown[");
        sb.append("agentID1=").append(this.agentID1).append(",unknown2=").append(this.unknown2).append("]");
        return sb.toString();
    }

}
