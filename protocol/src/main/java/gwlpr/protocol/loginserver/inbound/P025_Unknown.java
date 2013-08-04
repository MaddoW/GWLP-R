
package gwlpr.protocol.loginserver.inbound;

import java.util.Arrays;
import gwlpr.protocol.serialization.GWAction;
import gwlpr.protocol.util.IsArray;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P025_Unknown
    extends GWAction
{

    private long unknown1;
    private long unknown2;
    @IsArray(constant = true, size = 20, prefixLength = -1)
    private byte[] unknown3;
    @IsArray(constant = true, size = 20, prefixLength = -1)
    private byte[] unknown4;

    @Override
    public short getHeader() {
        return  25;
    }

    public long getUnknown1() {
        return unknown1;
    }

    public long getUnknown2() {
        return unknown2;
    }

    public byte[] getUnknown3() {
        return unknown3;
    }

    public byte[] getUnknown4() {
        return unknown4;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P025_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2).append(",unknown3=").append(Arrays.toString(this.unknown3)).append(",unknown4=").append(Arrays.toString(this.unknown4)).append("]");
        return sb.toString();
    }

}
