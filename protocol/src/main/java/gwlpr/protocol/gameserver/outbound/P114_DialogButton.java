
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P114_DialogButton
    extends GWAction
{

    private short icon;
    private String caption;
    private long buttonID;
    private long skillID;

    @Override
    public short getHeader() {
        return  114;
    }

    public void setIcon(short icon) {
        this.icon = icon;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public void setButtonID(long buttonID) {
        this.buttonID = buttonID;
    }

    public void setSkillID(long skillID) {
        this.skillID = skillID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P114_DialogButton[");
        sb.append("icon=").append(this.icon).append(",caption=").append(this.caption.toString()).append(",buttonID=").append(this.buttonID).append(",skillID=").append(this.skillID).append("]");
        return sb.toString();
    }

}
