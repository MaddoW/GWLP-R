
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P293_GuildAnnouncement
    extends GWAction
{

    private String announcement;
    private String characterName;

    @Override
    public short getHeader() {
        return  293;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P293_GuildAnnouncement[");
        sb.append("announcement=").append(this.announcement.toString()).append(",characterName=").append(this.characterName.toString()).append("]");
        return sb.toString();
    }

}
