
package gwlpr.protocol.gameserver.inbound;

import java.util.Arrays;
import gwlpr.protocol.serialization.GWAction;
import gwlpr.protocol.util.IsArray;
import gwlpr.protocol.util.NestedMarker;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P127_Unknown
    extends GWAction
{

    private int unknown1;
    private int unknown2;
    @IsArray(constant = false, size = 4, prefixLength = 2)
    private P127_Unknown.NestedUnknown3 [] unknown3;
    private short unknown4;
    private short unknown5;
    private short unknown6;

    @Override
    public short getHeader() {
        return  127;
    }

    public int getUnknown1() {
        return unknown1;
    }

    public int getUnknown2() {
        return unknown2;
    }

    public P127_Unknown.NestedUnknown3 [] getUnknown3() {
        return unknown3;
    }

    public short getUnknown4() {
        return unknown4;
    }

    public short getUnknown5() {
        return unknown5;
    }

    public short getUnknown6() {
        return unknown6;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P127_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2).append(",unknown3=").append(Arrays.toString(this.unknown3)).append(",unknown4=").append(this.unknown4).append(",unknown5=").append(this.unknown5).append(",unknown6=").append(this.unknown6).append("]");
        return sb.toString();
    }

    public final static class NestedUnknown3
        implements NestedMarker
    {

        private int unknown1;

        public int getUnknown1() {
            return unknown1;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("NestedUnknown3[");
            sb.append("unknown1=").append(this.unknown1).append("]");
            return sb.toString();
        }

    }

}
