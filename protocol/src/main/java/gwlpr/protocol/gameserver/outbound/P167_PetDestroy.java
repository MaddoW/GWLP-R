
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P167_PetDestroy
    extends GWMessage
{

    private long pet;

    @Override
    public short getHeader() {
        return  167;
    }

    public void setPet(long pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P167_PetDestroy[");
        sb.append("pet=").append(this.pet).append("]");
        return sb.toString();
    }

}
