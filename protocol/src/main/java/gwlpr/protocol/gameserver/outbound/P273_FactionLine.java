
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P273_FactionLine
    extends GWAction
{

    private long unknown1;
    private short position;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P273_FactionLine[");
        sb.append("unknown1=").append(this.unknown1).append(",position=").append(this.position).append("]");
        return sb.toString();
    }

}
