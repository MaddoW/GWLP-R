
package gwlpr.actions.gameserver.inbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P171_Unknown
    extends GWAction
{

    public short unknown1;

    @Override
    public short getHeader() {
        return  171;
    }

    public short getUnknown1() {
        return unknown1;
    }

}
