
package gwlpr.protocol.gameserver.outbound;

import java.util.Arrays;
import gwlpr.protocol.serialization.GWMessage;
import gwlpr.protocol.util.IsArray;
import gwlpr.protocol.util.NestedMarker;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P047_SetAttributes
    extends GWMessage
{

    private long agentID;
    @IsArray(constant = false, size = 48, prefixLength = 2)
    private P047_SetAttributes.NestedData[] data;

    @Override
    public short getHeader() {
        return  47;
    }

    public void setAgentID(long agentID) {
        this.agentID = agentID;
    }

    public void setData(P047_SetAttributes.NestedData[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P047_SetAttributes[");
        sb.append("agentID=").append(this.agentID).append(",data=").append(Arrays.toString(this.data)).append("]");
        return sb.toString();
    }

    public final static class NestedData
        implements NestedMarker
    {

        private long unknown1;

        public void setUnknown1(long unknown1) {
            this.unknown1 = unknown1;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("NestedData[");
            sb.append("unknown1=").append(this.unknown1).append("]");
            return sb.toString();
        }

    }

}
