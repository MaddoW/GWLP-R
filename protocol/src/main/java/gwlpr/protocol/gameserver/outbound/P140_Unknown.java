
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P140_Unknown
    extends GWAction
{

    private short unknown1;
    private long unknown2;
    private long unknown3;
    private long unknown4;

    @Override
    public short getHeader() {
        return  140;
    }

    public void setUnknown1(short unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(long unknown2) {
        this.unknown2 = unknown2;
    }

    public void setUnknown3(long unknown3) {
        this.unknown3 = unknown3;
    }

    public void setUnknown4(long unknown4) {
        this.unknown4 = unknown4;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P140_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2).append(",unknown3=").append(this.unknown3).append(",unknown4=").append(this.unknown4).append("]");
        return sb.toString();
    }

}
