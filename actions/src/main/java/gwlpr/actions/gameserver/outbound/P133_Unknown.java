
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;
import gwlpr.actions.utils.IsArray;
import gwlpr.actions.utils.NestedMarker;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P133_Unknown
    extends GWAction
{

    public int unknown1;
    public long unknown2;
    @IsArray(constant = false, size = 16, prefixLength = 2)
    public P133_Unknown.NestedUnknown3 [] unknown3;

    @Override
    public short getHeader() {
        return  133;
    }

    public void setUnknown1(int unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(long unknown2) {
        this.unknown2 = unknown2;
    }

    public void setUnknown3(P133_Unknown.NestedUnknown3 [] unknown3) {
        this.unknown3 = unknown3;
    }

    public final static class NestedUnknown3
        implements NestedMarker
    {

        public long unknown1;

        public void setUnknown1(long unknown1) {
            this.unknown1 = unknown1;
        }

    }

}
