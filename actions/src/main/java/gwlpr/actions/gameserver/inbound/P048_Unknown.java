
package gwlpr.actions.gameserver.inbound;

import gwlpr.actions.GWAction;
import gwlpr.actions.utils.IsArray;
import gwlpr.actions.utils.NestedMarker;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P048_Unknown
    extends GWAction
{

    public long unknown1;
    @IsArray(constant = false, size = 4, prefixLength = 2)
    public P048_Unknown.NestedUnknown2 [] unknown2;

    @Override
    public short getHeader() {
        return  48;
    }

    public long getUnknown1() {
        return unknown1;
    }

    public P048_Unknown.NestedUnknown2 [] getUnknown2() {
        return unknown2;
    }

    public final static class NestedUnknown2
        implements NestedMarker
    {

        public long unknown1;

        public long getUnknown1() {
            return unknown1;
        }

    }

}
