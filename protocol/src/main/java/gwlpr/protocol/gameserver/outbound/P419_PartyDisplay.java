
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P419_PartyDisplay
    extends GWAction
{

    private int partyId;
    private short isInviteEnabled;

    @Override
    public short getHeader() {
        return  419;
    }

    public void setPartyId(int partyId) {
        this.partyId = partyId;
    }

    public void setIsInviteEnabled(short isInviteEnabled) {
        this.isInviteEnabled = isInviteEnabled;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P419_PartyDisplay[");
        sb.append("partyId=").append(this.partyId).append(",isInviteEnabled=").append(this.isInviteEnabled).append("]");
        return sb.toString();
    }

}
