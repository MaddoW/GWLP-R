
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P240_VanquishProgress
    extends GWAction
{

    private long foesVanquished;
    private long foesRemaining;

    @Override
    public short getHeader() {
        return  240;
    }

    public void setFoesVanquished(long foesVanquished) {
        this.foesVanquished = foesVanquished;
    }

    public void setFoesRemaining(long foesRemaining) {
        this.foesRemaining = foesRemaining;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P240_VanquishProgress[");
        sb.append("foesVanquished=").append(this.foesVanquished).append(",foesRemaining=").append(this.foesRemaining).append("]");
        return sb.toString();
    }

}
