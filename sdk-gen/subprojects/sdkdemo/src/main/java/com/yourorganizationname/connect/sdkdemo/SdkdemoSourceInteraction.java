/* *************************************************** */

/* (C) Copyright IBM Corp. 2022                        */

/* *************************************************** */
package com.yourorganizationname.connect.sdkdemo;

import java.util.List;

import org.apache.arrow.flight.Ticket;

import com.ibm.connect.sdk.api.Record;
import com.ibm.connect.sdk.api.RowBasedSourceInteraction;
import com.ibm.wdp.connect.common.sdk.api.models.CustomFlightAssetDescriptor;
import com.ibm.wdp.connect.common.sdk.api.models.CustomFlightAssetField;

@SuppressWarnings({ "PMD.AvoidDollarSigns", "PMD.ClassNamingConventions" })
public class SdkdemoSourceInteraction extends RowBasedSourceInteraction<SdkdemoConnector>
{
    protected SdkdemoSourceInteraction(SdkdemoConnector connector, CustomFlightAssetDescriptor asset)
    {
        super();
        setConnector(connector);
        setAsset(asset);
    }

    @Override
    public Record getRecord()
    {
        // TODO implement this
        return null;
    }

    @Override
    public void close() throws Exception
    {
        super.close();
    }

    @Override
    public List<Ticket> getTickets() throws Exception
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<CustomFlightAssetField> getFields()
    {
        // TODO Auto-generated method stub
        return null;
    }

}
