
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P168_Unknown
    extends GWAction
{

    public long agentID1;
    public String unknown2;

    @Override
    public short getHeader() {
        return  168;
    }

    public void setAgentID1(long agentID1) {
        this.agentID1 = agentID1;
    }

    public void setUnknown2(String unknown2) {
        this.unknown2 = unknown2;
    }

}
