
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P042_Unknown
    extends GWAction
{

    public long agentID1;
    public long unknown2;
    public long unknown3;

    @Override
    public short getHeader() {
        return  42;
    }

    public void setAgentID1(long agentID1) {
        this.agentID1 = agentID1;
    }

    public void setUnknown2(long unknown2) {
        this.unknown2 = unknown2;
    }

    public void setUnknown3(long unknown3) {
        this.unknown3 = unknown3;
    }

}
