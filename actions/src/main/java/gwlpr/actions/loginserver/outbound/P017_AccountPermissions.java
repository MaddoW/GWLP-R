
package gwlpr.actions.loginserver.outbound;

import gwlpr.actions.GWAction;
import gwlpr.actions.utils.IsArray;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P017_AccountPermissions
    extends GWAction
{

    public long loginCount;
    public long territory;
    public long territoryChanges;
    @IsArray(constant = true, size = 8, prefixLength = -1)
    public byte[] unknown1;
    @IsArray(constant = true, size = 8, prefixLength = -1)
    public byte[] unknown2;
    @IsArray(constant = true, size = 16, prefixLength = -1)
    public byte[] unknown3;
    @IsArray(constant = true, size = 16, prefixLength = -1)
    public byte[] unknown4;
    public long changeAccountSettings;
    @IsArray(constant = false, size = 200, prefixLength = 2)
    public byte[] accountFeatures;
    public short eulaAccepted;
    public long unknown5;

    @Override
    public short getHeader() {
        return  17;
    }

    public void setLoginCount(long loginCount) {
        this.loginCount = loginCount;
    }

    public void setTerritory(long territory) {
        this.territory = territory;
    }

    public void setTerritoryChanges(long territoryChanges) {
        this.territoryChanges = territoryChanges;
    }

    public void setUnknown1(byte[] unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(byte[] unknown2) {
        this.unknown2 = unknown2;
    }

    public void setUnknown3(byte[] unknown3) {
        this.unknown3 = unknown3;
    }

    public void setUnknown4(byte[] unknown4) {
        this.unknown4 = unknown4;
    }

    public void setChangeAccountSettings(long changeAccountSettings) {
        this.changeAccountSettings = changeAccountSettings;
    }

    public void setAccountFeatures(byte[] accountFeatures) {
        this.accountFeatures = accountFeatures;
    }

    public void setEulaAccepted(short eulaAccepted) {
        this.eulaAccepted = eulaAccepted;
    }

    public void setUnknown5(long unknown5) {
        this.unknown5 = unknown5;
    }

}
