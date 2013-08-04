
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P350_ChestItem
    extends GWAction
{

    private int itemID;
    private int chestID;

    @Override
    public short getHeader() {
        return  350;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public void setChestID(int chestID) {
        this.chestID = chestID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P350_ChestItem[");
        sb.append("itemID=").append(this.itemID).append(",chestID=").append(this.chestID).append("]");
        return sb.toString();
    }

}
