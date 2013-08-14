
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P232_TitleRankDisplay
    extends GWMessage
{

    private int characterLocalID;
    private long rankID;

    @Override
    public short getHeader() {
        return  232;
    }

    public void setCharacterLocalID(int characterLocalID) {
        this.characterLocalID = characterLocalID;
    }

    public void setRankID(long rankID) {
        this.rankID = rankID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P232_TitleRankDisplay[");
        sb.append("characterLocalID=").append(this.characterLocalID).append(",rankID=").append(this.rankID).append("]");
        return sb.toString();
    }

}