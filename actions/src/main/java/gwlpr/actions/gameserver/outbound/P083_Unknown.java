
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P083_Unknown
    extends GWAction
{

    public long agentID1;
    public short unknown2;
    public String unknown3;

    @Override
    public short getHeader() {
        return  83;
    }

    public void setAgentID1(long agentID1) {
        this.agentID1 = agentID1;
    }

    public void setUnknown2(short unknown2) {
        this.unknown2 = unknown2;
    }

    public void setUnknown3(String unknown3) {
        this.unknown3 = unknown3;
    }

}
