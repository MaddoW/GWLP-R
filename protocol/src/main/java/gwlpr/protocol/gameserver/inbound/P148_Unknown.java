
package gwlpr.protocol.gameserver.inbound;

import gwlpr.protocol.serialization.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P148_Unknown
    extends GWAction
{

    private short unknown1;

    @Override
    public short getHeader() {
        return  148;
    }

    public short getUnknown1() {
        return unknown1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P148_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append("]");
        return sb.toString();
    }

}
