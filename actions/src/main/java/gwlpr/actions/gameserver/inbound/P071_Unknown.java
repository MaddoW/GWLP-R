
package gwlpr.actions.gameserver.inbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P071_Unknown
    extends GWAction
{

    public short unknown1;
    public String unknown2;

    @Override
    public short getHeader() {
        return  71;
    }

    public short getUnknown1() {
        return unknown1;
    }

    public String getUnknown2() {
        return unknown2;
    }

}
