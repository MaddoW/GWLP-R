
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P317_WeaponBarItem
    extends GWAction
{

    public int itemStreamID;
    public short slot;
    public long leadHand;
    public long offHand;

    @Override
    public short getHeader() {
        return  317;
    }

    public void setItemStreamID(int itemStreamID) {
        this.itemStreamID = itemStreamID;
    }

    public void setSlot(short slot) {
        this.slot = slot;
    }

    public void setLeadHand(long leadHand) {
        this.leadHand = leadHand;
    }

    public void setOffHand(long offHand) {
        this.offHand = offHand;
    }

}
