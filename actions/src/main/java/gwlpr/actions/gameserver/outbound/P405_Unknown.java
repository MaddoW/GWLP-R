
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;
import gwlpr.actions.utils.Vector2;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P405_Unknown
    extends GWAction
{

    public long agentID1;
    public int unknown2;
    public short unknown3;
    public long unknown4;
    public short unknown5;
    public short unknown6;
    public long unknown7;
    public Vector2 unknown8;
    public int unknown9;
    public short unknown10;
    public short unknown11;
    public String unknown12;

    @Override
    public short getHeader() {
        return  405;
    }

    public void setAgentID1(long agentID1) {
        this.agentID1 = agentID1;
    }

    public void setUnknown2(int unknown2) {
        this.unknown2 = unknown2;
    }

    public void setUnknown3(short unknown3) {
        this.unknown3 = unknown3;
    }

    public void setUnknown4(long unknown4) {
        this.unknown4 = unknown4;
    }

    public void setUnknown5(short unknown5) {
        this.unknown5 = unknown5;
    }

    public void setUnknown6(short unknown6) {
        this.unknown6 = unknown6;
    }

    public void setUnknown7(long unknown7) {
        this.unknown7 = unknown7;
    }

    public void setUnknown8(Vector2 unknown8) {
        this.unknown8 = unknown8;
    }

    public void setUnknown9(int unknown9) {
        this.unknown9 = unknown9;
    }

    public void setUnknown10(short unknown10) {
        this.unknown10 = unknown10;
    }

    public void setUnknown11(short unknown11) {
        this.unknown11 = unknown11;
    }

    public void setUnknown12(String unknown12) {
        this.unknown12 = unknown12;
    }

}
