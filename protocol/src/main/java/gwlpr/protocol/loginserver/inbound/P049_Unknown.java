
package gwlpr.protocol.loginserver.inbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P049_Unknown
    extends GWMessage
{

    private long unknown1;

    @Override
    public short getHeader() {
        return  49;
    }

    public long getUnknown1() {
        return unknown1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P049_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append("]");
        return sb.toString();
    }

}