
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P363_Unknown
    extends GWAction
{

    private long unknown1;
    private int unknown2;
    private short unknown3;
    private String unknown4;

    @Override
    public short getHeader() {
        return  363;
    }

    public void setUnknown1(long unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(int unknown2) {
        this.unknown2 = unknown2;
    }

    public void setUnknown3(short unknown3) {
        this.unknown3 = unknown3;
    }

    public void setUnknown4(String unknown4) {
        this.unknown4 = unknown4;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P363_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2).append(",unknown3=").append(this.unknown3).append(",unknown4=").append(this.unknown4 .toString()).append("]");
        return sb.toString();
    }

}
