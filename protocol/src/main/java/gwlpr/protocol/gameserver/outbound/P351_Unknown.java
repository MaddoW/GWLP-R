
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P351_Unknown
    extends GWAction
{

    private short unknown1;
    private long unknown2;

    @Override
    public short getHeader() {
        return  351;
    }

    public void setUnknown1(short unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(long unknown2) {
        this.unknown2 = unknown2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P351_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2).append("]");
        return sb.toString();
    }

}
