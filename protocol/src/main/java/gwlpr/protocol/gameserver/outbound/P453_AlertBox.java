
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P453_AlertBox
    extends GWAction
{

    private String text;

    @Override
    public short getHeader() {
        return  453;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P453_AlertBox[");
        sb.append("text=").append(this.text.toString()).append("]");
        return sb.toString();
    }

}
