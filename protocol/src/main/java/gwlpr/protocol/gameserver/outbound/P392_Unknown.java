
package gwlpr.protocol.gameserver.outbound;

import java.util.Arrays;
import gwlpr.protocol.serialization.GWAction;
import gwlpr.protocol.util.IsArray;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P392_Unknown
    extends GWAction
{

    @IsArray(constant = false, size = 1024, prefixLength = 2)
    private byte[] unknown1;

    @Override
    public short getHeader() {
        return  392;
    }

    public void setUnknown1(byte[] unknown1) {
        this.unknown1 = unknown1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P392_Unknown[");
        sb.append("unknown1=").append(Arrays.toString(this.unknown1)).append("]");
        return sb.toString();
    }

}
