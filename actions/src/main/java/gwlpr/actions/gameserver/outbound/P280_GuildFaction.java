
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P280_GuildFaction
    extends GWAction
{

    public int localID;
    public short allegiance;
    public long amount;

    @Override
    public short getHeader() {
        return  280;
    }

    public void setLocalID(int localID) {
        this.localID = localID;
    }

    public void setAllegiance(short allegiance) {
        this.allegiance = allegiance;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

}
