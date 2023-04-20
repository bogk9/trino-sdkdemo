/* *************************************************** */

/* (C) Copyright IBM Corp. 2022                        */

/* *************************************************** */
package com.yourorganizationname.connect.sdkdemo;

import java.util.List;

import org.apache.arrow.flight.Ticket;

import com.ibm.connect.sdk.api.RowBasedConnector;
import com.ibm.wdp.connect.common.sdk.api.models.ConnectionActionConfiguration;
import com.ibm.wdp.connect.common.sdk.api.models.ConnectionActionResponse;
import com.ibm.wdp.connect.common.sdk.api.models.ConnectionProperties;
import com.ibm.wdp.connect.common.sdk.api.models.CustomFlightAssetDescriptor;
import com.ibm.wdp.connect.common.sdk.api.models.CustomFlightAssetsCriteria;

@SuppressWarnings({ "PMD.AvoidDollarSigns", "PMD.ClassNamingConventions" })
public class SdkdemoConnector
        extends RowBasedConnector<SdkdemoSourceInteraction, SdkdemoTargetInteraction>
{
    /**
     * Creates a row-based connector.
     *
     * @param properties
     *            connection properties
     */
    public SdkdemoConnector(ConnectionProperties properties)
    {
        super(properties);
    }

    @Override
    public void close() throws Exception
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void connect()
    {
        // TODO Auto-generated method stub

    }

    @Override
    public List<CustomFlightAssetDescriptor> discoverAssets(CustomFlightAssetsCriteria criteria) throws Exception
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SdkdemoSourceInteraction getSourceInteraction(CustomFlightAssetDescriptor asset, Ticket ticket)
    {
        // TODO include your ticket info
        return new SdkdemoSourceInteraction(this, asset);
    }

    @Override
    public SdkdemoTargetInteraction getTargetInteraction(CustomFlightAssetDescriptor asset)
    {
        return new SdkdemoTargetInteraction(this, asset);
    }

    @Override
    public ConnectionActionResponse performAction(String action, ConnectionActionConfiguration conf)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void commit()
    {
        // TODO Auto-generated method stub

    }

}
