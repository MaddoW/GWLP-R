
package gwlpr.actions.gameserver.inbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P080_Unknown
    extends GWAction
{

    public long unknown1;

    @Override
    public short getHeader() {
        return  80;
    }

    public long getUnknown1() {
        return unknown1;
    }

}
