
package gwlpr.actions.gameserver.inbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P165_Unknown
    extends GWAction
{

    public int unknown1;

    @Override
    public short getHeader() {
        return  165;
    }

    public int getUnknown1() {
        return unknown1;
    }

}
