
package gwlpr.actions.gameserver.inbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P135_Unknown
    extends GWAction
{

    public long unknown1;

    @Override
    public short getHeader() {
        return  135;
    }

    public long getUnknown1() {
        return unknown1;
    }

}
