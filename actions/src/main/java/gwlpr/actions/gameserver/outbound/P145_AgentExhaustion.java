
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P145_AgentExhaustion
    extends GWAction
{

    public long agent;
    public long amount;
    public long regeneration;

    @Override
    public short getHeader() {
        return  145;
    }

    public void setAgent(long agent) {
        this.agent = agent;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public void setRegeneration(long regeneration) {
        this.regeneration = regeneration;
    }

}
