
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P368_ColorScreenTextDisplay
    extends GWAction
{

    public short color;

    @Override
    public short getHeader() {
        return  368;
    }

    public void setColor(short color) {
        this.color = color;
    }

}
