
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWAction;
import gwlpr.protocol.util.Vector2;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P091_FlagTeam
    extends GWAction
{

    private Vector2 position;
    private int plane;

    @Override
    public short getHeader() {
        return  91;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public void setPlane(int plane) {
        this.plane = plane;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P091_FlagTeam[");
        sb.append("position=").append(this.position.toString()).append(",plane=").append(this.plane).append("]");
        return sb.toString();
    }

}
