
package gwlpr.protocol.loginserver.inbound;

import gwlpr.protocol.serialization.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P017_Unknown
    extends GWAction
{

    private String unknown1;

    @Override
    public short getHeader() {
        return  17;
    }

    public String getUnknown1() {
        return unknown1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P017_Unknown[");
        sb.append("unknown1=").append(this.unknown1 .toString()).append("]");
        return sb.toString();
    }

}
