
package gwlpr.actions.gameserver.inbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P104_Unknown
    extends GWAction
{

    public long unknown1;
    public long unknown2;

    @Override
    public short getHeader() {
        return  104;
    }

    public long getUnknown1() {
        return unknown1;
    }

    public long getUnknown2() {
        return unknown2;
    }

}
