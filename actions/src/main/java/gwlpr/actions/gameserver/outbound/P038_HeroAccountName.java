
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P038_HeroAccountName
    extends GWAction
{

    public String accountName;

    @Override
    public short getHeader() {
        return  38;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

}
