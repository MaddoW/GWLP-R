
package gwlpr.protocol.gameserver.inbound;

import gwlpr.protocol.serialization.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P052_PressDialogButton
    extends GWAction
{

    private long buttonID;

    @Override
    public short getHeader() {
        return  52;
    }

    public long getButtonID() {
        return buttonID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P052_PressDialogButton[");
        sb.append("buttonID=").append(this.buttonID).append("]");
        return sb.toString();
    }

}
