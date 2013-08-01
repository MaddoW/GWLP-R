
package gwlpr.actions.gameserver.inbound;

import gwlpr.actions.GWAction;
import gwlpr.actions.utils.IsArray;
import gwlpr.actions.utils.NestedMarker;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P127_Unknown
    extends GWAction
{

    public int unknown1;
    public int unknown2;
    @IsArray(constant = false, size = 4, prefixLength = 2)
    public P127_Unknown.NestedUnknown3 [] unknown3;
    public short unknown4;
    public short unknown5;
    public short unknown6;

    @Override
    public short getHeader() {
        return  127;
    }

    public int getUnknown1() {
        return unknown1;
    }

    public int getUnknown2() {
        return unknown2;
    }

    public P127_Unknown.NestedUnknown3 [] getUnknown3() {
        return unknown3;
    }

    public short getUnknown4() {
        return unknown4;
    }

    public short getUnknown5() {
        return unknown5;
    }

    public short getUnknown6() {
        return unknown6;
    }

    public final static class NestedUnknown3
        implements NestedMarker
    {

        public int unknown1;

        public int getUnknown1() {
            return unknown1;
        }

    }

}
