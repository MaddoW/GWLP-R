
package gwlpr.actions.loginserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P011_Unknown
    extends GWAction
{

    public long unknown1;
    public String unknown2;
    public String unknown3;

    @Override
    public short getHeader() {
        return  11;
    }

    public void setUnknown1(long unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(String unknown2) {
        this.unknown2 = unknown2;
    }

    public void setUnknown3(String unknown3) {
        this.unknown3 = unknown3;
    }

}
