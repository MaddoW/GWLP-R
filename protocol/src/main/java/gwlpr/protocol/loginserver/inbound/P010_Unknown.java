
package gwlpr.protocol.loginserver.inbound;

import gwlpr.protocol.serialization.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P010_Unknown
    extends GWAction
{

    private long unknown1;
    private String unknown2;

    @Override
    public short getHeader() {
        return  10;
    }

    public long getUnknown1() {
        return unknown1;
    }

    public String getUnknown2() {
        return unknown2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P010_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2 .toString()).append("]");
        return sb.toString();
    }

}
