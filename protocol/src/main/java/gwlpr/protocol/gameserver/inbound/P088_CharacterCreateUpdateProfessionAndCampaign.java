
package gwlpr.protocol.gameserver.inbound;

import gwlpr.protocol.serialization.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P088_CharacterCreateUpdateProfessionAndCampaign
    extends GWAction
{

    private short campaign;
    private short profession;

    @Override
    public short getHeader() {
        return  88;
    }

    public short getCampaign() {
        return campaign;
    }

    public short getProfession() {
        return profession;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P088_CharacterCreateUpdateProfessionAndCampaign[");
        sb.append("campaign=").append(this.campaign).append(",profession=").append(this.profession).append("]");
        return sb.toString();
    }

}
