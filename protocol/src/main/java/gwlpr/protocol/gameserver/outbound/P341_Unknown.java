
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P341_Unknown
    extends GWMessage
{

    private long unknown1;
    private long unknown2;
    private short unknown3;
    private short unknown4;
    private int unknown5;
    private int unknown6;
    private short unknown7;
    private long unknown8;
    private long unknown9;

    @Override
    public short getHeader() {
        return  341;
    }

    public void setUnknown1(long unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(long unknown2) {
        this.unknown2 = unknown2;
    }

    public void setUnknown3(short unknown3) {
        this.unknown3 = unknown3;
    }

    public void setUnknown4(short unknown4) {
        this.unknown4 = unknown4;
    }

    public void setUnknown5(int unknown5) {
        this.unknown5 = unknown5;
    }

    public void setUnknown6(int unknown6) {
        this.unknown6 = unknown6;
    }

    public void setUnknown7(short unknown7) {
        this.unknown7 = unknown7;
    }

    public void setUnknown8(long unknown8) {
        this.unknown8 = unknown8;
    }

    public void setUnknown9(long unknown9) {
        this.unknown9 = unknown9;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P341_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2).append(",unknown3=").append(this.unknown3).append(",unknown4=").append(this.unknown4).append(",unknown5=").append(this.unknown5).append(",unknown6=").append(this.unknown6).append(",unknown7=").append(this.unknown7).append(",unknown8=").append(this.unknown8).append(",unknown9=").append(this.unknown9).append("]");
        return sb.toString();
    }

}
