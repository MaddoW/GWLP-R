
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P006_Unknown
    extends GWAction
{

    public int unknown1;

    @Override
    public short getHeader() {
        return  6;
    }

    public void setUnknown1(int unknown1) {
        this.unknown1 = unknown1;
    }

}
