
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;
import gwlpr.actions.utils.IsArray;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P250_CinematicData
    extends GWAction
{

    @IsArray(constant = false, size = 1024, prefixLength = 2)
    public byte[] data;

    @Override
    public short getHeader() {
        return  250;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

}
