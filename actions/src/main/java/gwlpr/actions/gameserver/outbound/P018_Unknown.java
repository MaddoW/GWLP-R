
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;
import gwlpr.actions.utils.IsArray;
import gwlpr.actions.utils.NestedMarker;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P018_Unknown
    extends GWAction
{

    @IsArray(constant = false, size = 128, prefixLength = 2)
    public P018_Unknown.NestedUnknown1 [] unknown1;

    @Override
    public short getHeader() {
        return  18;
    }

    public void setUnknown1(P018_Unknown.NestedUnknown1 [] unknown1) {
        this.unknown1 = unknown1;
    }

    public final static class NestedUnknown1
        implements NestedMarker
    {

        public long unknown1;

        public void setUnknown1(long unknown1) {
            this.unknown1 = unknown1;
        }

    }

}
