
package gwlpr.actions.gameserver.inbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P096_Unknown
    extends GWAction
{

    public long unknown1;
    public short unknown2;
    public int unknown3;
    public short unknown4;

    @Override
    public short getHeader() {
        return  96;
    }

    public long getUnknown1() {
        return unknown1;
    }

    public short getUnknown2() {
        return unknown2;
    }

    public int getUnknown3() {
        return unknown3;
    }

    public short getUnknown4() {
        return unknown4;
    }

}
