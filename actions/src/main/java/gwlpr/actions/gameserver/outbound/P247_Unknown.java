
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P247_Unknown
    extends GWAction
{

    public short unknown1;

    @Override
    public short getHeader() {
        return  247;
    }

    public void setUnknown1(short unknown1) {
        this.unknown1 = unknown1;
    }

}
