/* *************************************************** */
/*                                                     */
/* (C) Copyright IBM Corp. 2022                        */
/*                                                     */
/* *************************************************** */
package com.yourorganizationname.connect.sdkdemo;

import com.ibm.connect.sdk.api.ConnectorFactory;
import com.ibm.connect.sdk.api.ConnectorFlightProducer;

/**
 * A  Flight producer for connectors.
 */
@SuppressWarnings({ "PMD.AvoidDollarSigns", "PMD.ClassNamingConventions" })
public class SdkdemoFlightProducer extends ConnectorFlightProducer
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected ConnectorFactory getConnectorFactory()
    {
        return SdkdemoConnectorFactory.getInstance();
    }

}
