
package gwlpr.actions.loginserver.outbound;

import gwlpr.actions.GWAction;
import gwlpr.actions.utils.IsArray;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P014_Unknown
    extends GWAction
{

    public long unknown1;
    public long unknown2;
    @IsArray(constant = false, size = 32, prefixLength = 2)
    public byte[] unknown3;

    @Override
    public short getHeader() {
        return  14;
    }

    public void setUnknown1(long unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(long unknown2) {
        this.unknown2 = unknown2;
    }

    public void setUnknown3(byte[] unknown3) {
        this.unknown3 = unknown3;
    }

}
