/**
 * For copyright information see the LICENSE document.
 */

/**
 * Auto-generated by PacketCodeGen, on 2012-07-19
 */

package com.gamerevision.gwlpr.actions.gameserver.ctos;

import com.realityshard.shardlet.EventAggregator;
import com.realityshard.shardlet.GenericEventAction;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/**
 * This is an automatically generated ShardletAction.
 * It resembles the packet template that has been 
 * parsed from our packet templates xml.
 *
 * Auto generated 
 *
 * @author GWLPR Template Updater
 */
public final class P127_UnknownAction extends GenericEventAction
{

    private short unknown1;
    private short unknown2;
    private short[] unknown3;
    private byte unknown4;
    private byte unknown5;
    private byte unknown6;


    public short getHeader()
    {
        return 127;
    }


    public short getUnknown1()
    {
        return unknown1;
    }


    public short getUnknown2()
    {
        return unknown2;
    }


    public short[] getUnknown3()
    {
        return unknown3;
    }


    public byte getUnknown4()
    {
        return unknown4;
    }


    public byte getUnknown5()
    {
        return unknown5;
    }


    public byte getUnknown6()
    {
        return unknown6;
    }


    @Override
    public boolean deserialize()
    {
        ByteBuffer buffer = getBuffer();
        int bufferPosition = buffer.position();

        try
        {
            unknown1 = buffer.getShort();
            unknown2 = buffer.getShort();
            short prefix_unknown3 = buffer.getShort();
            unknown3 = new short[prefix_unknown3];
            
            for (int i = 0; i < prefix_unknown3; i++)
            {
                unknown3[i] = buffer.getShort();
            }
            unknown4 = buffer.get();
            unknown5 = buffer.get();
            unknown6 = buffer.get();
        }
        catch (BufferUnderflowException e)
        {
            buffer.position(bufferPosition);
            return false;
        }

        return true;
    }


    @Override
    public void triggerEvent(EventAggregator aggregator)
    {
        aggregator.triggerEvent(this);
    }
}