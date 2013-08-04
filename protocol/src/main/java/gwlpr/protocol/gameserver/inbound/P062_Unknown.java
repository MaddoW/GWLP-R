
package gwlpr.protocol.gameserver.inbound;

import java.util.Arrays;
import gwlpr.protocol.serialization.GWAction;
import gwlpr.protocol.util.IsArray;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P062_Unknown
    extends GWAction
{

    @IsArray(constant = false, size = 256, prefixLength = 2)
    private byte[] unknown1;

    @Override
    public short getHeader() {
        return  62;
    }

    public byte[] getUnknown1() {
        return unknown1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P062_Unknown[");
        sb.append("unknown1=").append(Arrays.toString(this.unknown1)).append("]");
        return sb.toString();
    }

}
