
package gwlpr.actions.gameserver.inbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P075_Unknown
    extends GWAction
{

    public long agentID1;
    public long unknown2;

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

}
