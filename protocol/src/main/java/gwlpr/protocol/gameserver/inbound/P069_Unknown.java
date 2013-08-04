
package gwlpr.protocol.gameserver.inbound;

import java.util.Arrays;
import gwlpr.protocol.serialization.GWAction;
import gwlpr.protocol.util.IsArray;
import gwlpr.protocol.util.NestedMarker;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P069_Unknown
    extends GWAction
{

    private short unknown1;
    private short unknown2;
    private long unknown3;
    @IsArray(constant = false, size = 16, prefixLength = 2)
    private P069_Unknown.NestedUnknown4 [] unknown4;
    private long unknown5;
    @IsArray(constant = false, size = 16, prefixLength = 2)
    private P069_Unknown.NestedUnknown6 [] unknown6;

    @Override
    public short getHeader() {
        return  69;
    }

    public short getUnknown1() {
        return unknown1;
    }

    public short getUnknown2() {
        return unknown2;
    }

    public long getUnknown3() {
        return unknown3;
    }

    public P069_Unknown.NestedUnknown4 [] getUnknown4() {
        return unknown4;
    }

    public long getUnknown5() {
        return unknown5;
    }

    public P069_Unknown.NestedUnknown6 [] getUnknown6() {
        return unknown6;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P069_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2).append(",unknown3=").append(this.unknown3).append(",unknown4=").append(Arrays.toString(this.unknown4)).append(",unknown5=").append(this.unknown5).append(",unknown6=").append(Arrays.toString(this.unknown6)).append("]");
        return sb.toString();
    }

    public final static class NestedUnknown4
        implements NestedMarker
    {

        private long unknown1;

        public long getUnknown1() {
            return unknown1;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("NestedUnknown4[");
            sb.append("unknown1=").append(this.unknown1).append("]");
            return sb.toString();
        }

    }

    public final static class NestedUnknown6
        implements NestedMarker
    {

        private long unknown1;

        public long getUnknown1() {
            return unknown1;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("NestedUnknown6[");
            sb.append("unknown1=").append(this.unknown1).append("]");
            return sb.toString();
        }

    }

}
