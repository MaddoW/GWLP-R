
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P081_Unknown
    extends GWAction
{

    private String unknown1;

    @Override
    public short getHeader() {
        return  81;
    }

    public void setUnknown1(String unknown1) {
        this.unknown1 = unknown1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P081_Unknown[");
        sb.append("unknown1=").append(this.unknown1 .toString()).append("]");
        return sb.toString();
    }

}
