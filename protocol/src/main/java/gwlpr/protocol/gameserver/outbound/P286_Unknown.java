
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P286_Unknown
    extends GWAction
{

    private String unknown1;

    @Override
    public short getHeader() {
        return  286;
    }

    public void setUnknown1(String unknown1) {
        this.unknown1 = unknown1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P286_Unknown[");
        sb.append("unknown1=").append(this.unknown1 .toString()).append("]");
        return sb.toString();
    }

}
