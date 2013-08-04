
package gwlpr.protocol.gameserver.outbound;

import java.util.Arrays;
import gwlpr.protocol.serialization.GWAction;
import gwlpr.protocol.util.IsArray;
import gwlpr.protocol.util.NestedMarker;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P075_NPCModel
    extends GWAction
{

    private long localID;
    @IsArray(constant = false, size = 8, prefixLength = 2)
    private P075_NPCModel.NestedModelFile[] modelFile;

    @Override
    public short getHeader() {
        return  75;
    }

    public void setLocalID(long localID) {
        this.localID = localID;
    }

    public void setModelFile(P075_NPCModel.NestedModelFile[] modelFile) {
        this.modelFile = modelFile;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P075_NPCModel[");
        sb.append("localID=").append(this.localID).append(",modelFile=").append(Arrays.toString(this.modelFile)).append("]");
        return sb.toString();
    }

    public final static class NestedModelFile
        implements NestedMarker
    {

        private long unknown1;

        public void setUnknown1(long unknown1) {
            this.unknown1 = unknown1;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("NestedModelFile[");
            sb.append("unknown1=").append(this.unknown1).append("]");
            return sb.toString();
        }

    }

}
