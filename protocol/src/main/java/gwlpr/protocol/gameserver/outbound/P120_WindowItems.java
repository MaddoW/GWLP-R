
package gwlpr.protocol.gameserver.outbound;

import java.util.Arrays;
import gwlpr.protocol.serialization.GWAction;
import gwlpr.protocol.util.IsArray;
import gwlpr.protocol.util.NestedMarker;


/**
 * Auto-generated by PacketCodeGen.
 * This can be used to add items to a window, such as
 * at a material trader.
 * 
 */
public final class P120_WindowItems
    extends GWAction
{

    @IsArray(constant = false, size = 16, prefixLength = 2)
    private P120_WindowItems.NestedItemLocalIDs[] itemLocalIDs;

    @Override
    public short getHeader() {
        return  120;
    }

    public void setItemLocalIDs(P120_WindowItems.NestedItemLocalIDs[] itemLocalIDs) {
        this.itemLocalIDs = itemLocalIDs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P120_WindowItems[");
        sb.append("itemLocalIDs=").append(Arrays.toString(this.itemLocalIDs)).append("]");
        return sb.toString();
    }

    public final static class NestedItemLocalIDs
        implements NestedMarker
    {

        private long unknown1;

        public void setUnknown1(long unknown1) {
            this.unknown1 = unknown1;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("NestedItemLocalIDs[");
            sb.append("unknown1=").append(this.unknown1).append("]");
            return sb.toString();
        }

    }

}
