
package gwlpr.actions.loginserver.inbound;

import gwlpr.actions.GWAction;
import gwlpr.actions.utils.IsArray;
import gwlpr.actions.utils.NestedMarker;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P044_Unknown
    extends GWAction
{

    public long unknown1;
    public long unknown2;
    public long unknown3;
    public long unknown4;
    public long unknown5;
    public long unknown6;
    public String unknown7;
    public String unknown8;
    public String unknown9;
    public String unknown10;
    public String unknown11;
    public String unknown12;
    public String unknown13;
    public String unknown14;
    public String unknown15;
    public String unknown16;
    public String unknown17;
    public String unknown18;
    public String unknown19;
    public String unknown20;
    @IsArray(constant = false, size = 128, prefixLength = 2)
    public P044_Unknown.NestedUnknown21 [] unknown21;
    @IsArray(constant = false, size = 128, prefixLength = 2)
    public P044_Unknown.NestedUnknown22 [] unknown22;

    @Override
    public short getHeader() {
        return  44;
    }

    public long getUnknown1() {
        return unknown1;
    }

    public long getUnknown2() {
        return unknown2;
    }

    public long getUnknown3() {
        return unknown3;
    }

    public long getUnknown4() {
        return unknown4;
    }

    public long getUnknown5() {
        return unknown5;
    }

    public long getUnknown6() {
        return unknown6;
    }

    public String getUnknown7() {
        return unknown7;
    }

    public String getUnknown8() {
        return unknown8;
    }

    public String getUnknown9() {
        return unknown9;
    }

    public String getUnknown10() {
        return unknown10;
    }

    public String getUnknown11() {
        return unknown11;
    }

    public String getUnknown12() {
        return unknown12;
    }

    public String getUnknown13() {
        return unknown13;
    }

    public String getUnknown14() {
        return unknown14;
    }

    public String getUnknown15() {
        return unknown15;
    }

    public String getUnknown16() {
        return unknown16;
    }

    public String getUnknown17() {
        return unknown17;
    }

    public String getUnknown18() {
        return unknown18;
    }

    public String getUnknown19() {
        return unknown19;
    }

    public String getUnknown20() {
        return unknown20;
    }

    public P044_Unknown.NestedUnknown21 [] getUnknown21() {
        return unknown21;
    }

    public P044_Unknown.NestedUnknown22 [] getUnknown22() {
        return unknown22;
    }

    public final static class NestedUnknown21
        implements NestedMarker
    {

        public long unknown1;

        public long getUnknown1() {
            return unknown1;
        }

    }

    public final static class NestedUnknown22
        implements NestedMarker
    {

        public long unknown1;

        public long getUnknown1() {
            return unknown1;
        }

    }

}
