
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P442_Unknown
    extends GWAction
{

    private int unknown1;

    @Override
    public short getHeader() {
        return  442;
    }

    public void setUnknown1(int unknown1) {
        this.unknown1 = unknown1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P442_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append("]");
        return sb.toString();
    }

}
