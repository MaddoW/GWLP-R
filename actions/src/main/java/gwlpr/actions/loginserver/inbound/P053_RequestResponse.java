
package gwlpr.actions.loginserver.inbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P053_RequestResponse
    extends GWAction
{

    public long loginCount;

    @Override
    public short getHeader() {
        return  53;
    }

    public long getLoginCount() {
        return loginCount;
    }

}
