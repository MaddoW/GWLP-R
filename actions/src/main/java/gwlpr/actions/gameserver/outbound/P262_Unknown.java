
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P262_Unknown
    extends GWAction
{

    public int unknown1;
    public long unknown2;

    @Override
    public short getHeader() {
        return  262;
    }

    public void setUnknown1(int unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(long unknown2) {
        this.unknown2 = unknown2;
    }

}
