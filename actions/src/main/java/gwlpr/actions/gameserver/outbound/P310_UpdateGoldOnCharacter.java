
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P310_UpdateGoldOnCharacter
    extends GWAction
{

    public int streamID;
    public long gold;

    @Override
    public short getHeader() {
        return  310;
    }

    public void setStreamID(int streamID) {
        this.streamID = streamID;
    }

    public void setGold(long gold) {
        this.gold = gold;
    }

}
