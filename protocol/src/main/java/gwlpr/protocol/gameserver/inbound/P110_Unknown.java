
package gwlpr.protocol.gameserver.inbound;

import gwlpr.protocol.serialization.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P110_Unknown
    extends GWAction
{

    private long unknown1;
    private long unknown2;
    private int unknown3;
    private short unknown4;

    @Override
    public short getHeader() {
        return  110;
    }

    public long getUnknown1() {
        return unknown1;
    }

    public long getUnknown2() {
        return unknown2;
    }

    public int getUnknown3() {
        return unknown3;
    }

    public short getUnknown4() {
        return unknown4;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P110_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2).append(",unknown3=").append(this.unknown3).append(",unknown4=").append(this.unknown4).append("]");
        return sb.toString();
    }

}
