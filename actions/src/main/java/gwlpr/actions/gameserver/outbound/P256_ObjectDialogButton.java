
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P256_ObjectDialogButton
    extends GWAction
{

    public short icon;
    public String caption;
    public long buttonID;
    public int skillID;

    @Override
    public short getHeader() {
        return  256;
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

    public void setSkillID(int skillID) {
        this.skillID = skillID;
    }

}
