
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P205_UpdateSkill
    extends GWAction
{

    public long agentID;
    public short slot;
    public int skillID;
    public long skillInstance;

    @Override
    public short getHeader() {
        return  205;
    }

    public void setAgentID(long agentID) {
        this.agentID = agentID;
    }

    public void setSlot(short slot) {
        this.slot = slot;
    }

    public void setSkillID(int skillID) {
        this.skillID = skillID;
    }

    public void setSkillInstance(long skillInstance) {
        this.skillInstance = skillInstance;
    }

}
