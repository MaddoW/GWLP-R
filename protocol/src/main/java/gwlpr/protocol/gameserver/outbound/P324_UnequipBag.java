
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P324_UnequipBag
    extends GWMessage
{

    private int itemStreamID;
    private int pageID;

    @Override
    public short getHeader() {
        return  324;
    }

    public void setItemStreamID(int itemStreamID) {
        this.itemStreamID = itemStreamID;
    }

    public void setPageID(int pageID) {
        this.pageID = pageID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P324_UnequipBag[");
        sb.append("itemStreamID=").append(this.itemStreamID).append(",pageID=").append(this.pageID).append("]");
        return sb.toString();
    }

}
