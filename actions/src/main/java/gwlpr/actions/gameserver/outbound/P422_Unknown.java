
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P422_Unknown
    extends GWAction
{

    public short unknown1;
    public short unknown2;
    public String unknown3;
    public long unknown4;
    public short unknown5;
    public long unknown6;

    @Override
    public short getHeader() {
        return  422;
    }

    public void setUnknown1(short unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(short unknown2) {
        this.unknown2 = unknown2;
    }

    public void setUnknown3(String unknown3) {
        this.unknown3 = unknown3;
    }

    public void setUnknown4(long unknown4) {
        this.unknown4 = unknown4;
    }

    public void setUnknown5(short unknown5) {
        this.unknown5 = unknown5;
    }

    public void setUnknown6(long unknown6) {
        this.unknown6 = unknown6;
    }

}
