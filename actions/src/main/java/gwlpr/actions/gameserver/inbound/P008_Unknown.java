
package gwlpr.actions.gameserver.inbound;

import gwlpr.actions.GWAction;
import gwlpr.actions.utils.IsArray;
import gwlpr.actions.utils.NestedMarker;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P008_Unknown
    extends GWAction
{

    public long agentID1;
    @IsArray(constant = false, size = 16, prefixLength = 2)
    public P008_Unknown.NestedUnknown2 [] unknown2;
    @IsArray(constant = false, size = 16, prefixLength = 2)
    public P008_Unknown.NestedUnknown3 [] unknown3;

    @Override
    public short getHeader() {
        return  8;
    }

    public long getAgentID1() {
        return agentID1;
    }

    public P008_Unknown.NestedUnknown2 [] getUnknown2() {
        return unknown2;
    }

    public P008_Unknown.NestedUnknown3 [] getUnknown3() {
        return unknown3;
    }

    public final static class NestedUnknown2
        implements NestedMarker
    {

        public long unknown1;

        public long getUnknown1() {
            return unknown1;
        }

    }

    public final static class NestedUnknown3
        implements NestedMarker
    {

        public long unknown1;

        public long getUnknown1() {
            return unknown1;
        }

    }

}
