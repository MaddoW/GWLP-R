
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P003_Unknown
    extends GWAction
{

    public long unknown1;
    public long unknown2;
    public String unknown3;
    public String unknown4;

    @Override
    public short getHeader() {
        return  3;
    }

    public void setUnknown1(long unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(long unknown2) {
        this.unknown2 = unknown2;
    }

    public void setUnknown3(String unknown3) {
        this.unknown3 = unknown3;
    }

    public void setUnknown4(String unknown4) {
        this.unknown4 = unknown4;
    }

}
