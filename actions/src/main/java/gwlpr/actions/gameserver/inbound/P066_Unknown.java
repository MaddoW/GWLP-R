
package gwlpr.actions.gameserver.inbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P066_Unknown
    extends GWAction
{

    public long agentID1;

    @Override
    public short getHeader() {
        return  66;
    }

    public long getAgentID1() {
        return agentID1;
    }

}
