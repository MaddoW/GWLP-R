
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P302_HandbookEntry
    extends GWAction
{

    public long handbookID;
    public short page;
    public String pageName1;
    public String pageName2;
    public String pageText1;
    public String pageText2;

    @Override
    public short getHeader() {
        return  302;
    }

    public void setHandbookID(long handbookID) {
        this.handbookID = handbookID;
    }

    public void setPage(short page) {
        this.page = page;
    }

    public void setPageName1(String pageName1) {
        this.pageName1 = pageName1;
    }

    public void setPageName2(String pageName2) {
        this.pageName2 = pageName2;
    }

    public void setPageText1(String pageText1) {
        this.pageText1 = pageText1;
    }

    public void setPageText2(String pageText2) {
        this.pageText2 = pageText2;
    }

}
