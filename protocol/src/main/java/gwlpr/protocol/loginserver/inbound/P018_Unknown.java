
package gwlpr.protocol.loginserver.inbound;

import java.util.Arrays;
import gwlpr.protocol.serialization.GWAction;
import gwlpr.protocol.util.IsArray;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P018_Unknown
    extends GWAction
{

    private long unknown1;
    private long unknown2;
    @IsArray(constant = true, size = 20, prefixLength = -1)
    private byte[] unknown3;
    private String unknown4;
    private String unknown5;
    private String unknown6;
    private String unknown7;

    @Override
    public short getHeader() {
        return  18;
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

    public String getUnknown4() {
        return unknown4;
    }

    public String getUnknown5() {
        return unknown5;
    }

    public String getUnknown6() {
        return unknown6;
    }

    public String getUnknown7() {
        return unknown7;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P018_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2).append(",unknown3=").append(Arrays.toString(this.unknown3)).append(",unknown4=").append(this.unknown4 .toString()).append(",unknown5=").append(this.unknown5 .toString()).append(",unknown6=").append(this.unknown6 .toString()).append(",unknown7=").append(this.unknown7 .toString()).append("]");
        return sb.toString();
    }

}
