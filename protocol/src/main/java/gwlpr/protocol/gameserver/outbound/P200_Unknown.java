
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P200_Unknown
    extends GWAction
{


    @Override
    public short getHeader() {
        return  200;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P200_Unknown[");
        sb.append("]");
        return sb.toString();
    }

}
