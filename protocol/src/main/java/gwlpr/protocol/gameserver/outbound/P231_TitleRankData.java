
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P231_TitleRankData
    extends GWAction
{

    private long rankId;
    private long unknown1;
    private long rank;
    private String name;

    @Override
    public short getHeader() {
        return  231;
    }

    public void setRankId(long rankId) {
        this.rankId = rankId;
    }

    public void setUnknown1(long unknown1) {
        this.unknown1 = unknown1;
    }

    public void setRank(long rank) {
        this.rank = rank;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P231_TitleRankData[");
        sb.append("rankId=").append(this.rankId).append(",unknown1=").append(this.unknown1).append(",rank=").append(this.rank).append(",name=").append(this.name.toString()).append("]");
        return sb.toString();
    }

}
