
package gwlpr.protocol.gameserver.inbound;

import gwlpr.protocol.serialization.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P066_Unknown
    extends GWAction
{

    private long agentID1;

    @Override
    public short getHeader() {
        return  66;
    }

    public long getAgentID1() {
        return agentID1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P066_Unknown[");
        sb.append("agentID1=").append(this.agentID1).append("]");
        return sb.toString();
    }

}
