
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P217_SkillRecharge
    extends GWAction
{

    private long agentID;
    private int skillID;
    private long skillInstance;
    private long recharge;

    @Override
    public short getHeader() {
        return  217;
    }

    public void setAgentID(long agentID) {
        this.agentID = agentID;
    }

    public void setSkillID(int skillID) {
        this.skillID = skillID;
    }

    public void setSkillInstance(long skillInstance) {
        this.skillInstance = skillInstance;
    }

    public void setRecharge(long recharge) {
        this.recharge = recharge;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P217_SkillRecharge[");
        sb.append("agentID=").append(this.agentID).append(",skillID=").append(this.skillID).append(",skillInstance=").append(this.skillInstance).append(",recharge=").append(this.recharge).append("]");
        return sb.toString();
    }

}
