
package gwlpr.protocol.loginserver.inbound;

import java.util.Arrays;
import gwlpr.protocol.serialization.GWMessage;
import gwlpr.protocol.util.IsArray;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P032_Unknown
    extends GWMessage
{

    private long unknown1;
    @IsArray(constant = false, size = 512, prefixLength = 2)
    private byte[] unknown2;

    @Override
    public short getHeader() {
        return  32;
    }

    public long getUnknown1() {
        return unknown1;
    }

    public byte[] getUnknown2() {
        return unknown2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P032_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(Arrays.toString(this.unknown2)).append("]");
        return sb.toString();
    }

}
