
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * Will display text of hard coded string IDs in the
 * chat box
 * 
 */
public final class P455_InformationChat
    extends GWAction
{

    public short text;

    @Override
    public short getHeader() {
        return  455;
    }

    public void setText(short text) {
        this.text = text;
    }

}
