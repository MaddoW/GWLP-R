
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P335_Unknown
    extends GWMessage
{

    private long unknown1;
    private int unknown2;

    @Override
    public short getHeader() {
        return  335;
    }

    public void setUnknown1(long unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(int unknown2) {
        this.unknown2 = unknown2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P335_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2).append("]");
        return sb.toString();
    }

}
