
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P257_ObjectDialogBody
    extends GWAction
{

    public String body;

    @Override
    public short getHeader() {
        return  257;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
