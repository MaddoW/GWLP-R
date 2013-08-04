
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P146_DisplayDialogue
    extends GWAction
{

    private long agentID;
    private String name;
    private short type;
    private String text;

    @Override
    public short getHeader() {
        return  146;
    }

    public void setAgentID(long agentID) {
        this.agentID = agentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(short type) {
        this.type = type;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P146_DisplayDialogue[");
        sb.append("agentID=").append(this.agentID).append(",name=").append(this.name.toString()).append(",type=").append(this.type).append(",text=").append(this.text.toString()).append("]");
        return sb.toString();
    }

}
