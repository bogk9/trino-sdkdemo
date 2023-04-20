/* *************************************************** */

/* (C) Copyright IBM Corp. 2022                        */

/* *************************************************** */
package com.yourorganizationname.connect.sdkdemo;

import java.util.Arrays;

import com.ibm.connect.sdk.api.ConnectorFactory;
import com.ibm.wdp.connect.common.sdk.api.models.ConnectionProperties;
import com.ibm.wdp.connect.common.sdk.api.models.CustomFlightDatasourceTypes;

@SuppressWarnings({ "PMD.AvoidDollarSigns", "PMD.ClassNamingConventions" })
public class SdkdemoConnectorFactory implements ConnectorFactory
{
    private static final SdkdemoConnectorFactory INSTANCE = new SdkdemoConnectorFactory();

    /**
     * A connector factory instance.
     *
     * @return a connector factory instance
     */
    public static SdkdemoConnectorFactory getInstance()
    {
        return INSTANCE;
    }

    /**
     * Creates a connector for the given data source type.
     *
     * @param datasourceTypeName
     *            the name of the data source type
     * @param properties
     *            connection properties
     * @return a connector for the given data source type
     */
    @Override
    public SdkdemoConnector createConnector(String datasourceTypeName, ConnectionProperties properties)
    {
        if ("sdkdemo".equals(datasourceTypeName)) {
            return new SdkdemoConnector(properties);
        }
        throw new UnsupportedOperationException(datasourceTypeName + " is not supported!");
    }

    @Override
    public CustomFlightDatasourceTypes getDatasourceTypes()
    {
        return new CustomFlightDatasourceTypes().datasourceTypes(Arrays.asList(new SdkdemoDatasourceType()));
    }
}
