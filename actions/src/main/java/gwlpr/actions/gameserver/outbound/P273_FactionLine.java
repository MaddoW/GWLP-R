
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P273_FactionLine
    extends GWAction
{

    public long unknown1;
    public short position;

    @Override
    public short getHeader() {
        return  273;
    }

    public void setUnknown1(long unknown1) {
        this.unknown1 = unknown1;
    }

    public void setPosition(short position) {
        this.position = position;
    }

}
