/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input definition for planned failover.
 */
public class TestFailoverInput {
    /**
     * Planned failover input properties.
     */
    @JsonProperty(value = "properties")
    private TestFailoverInputProperties properties;

    /**
     * Get planned failover input properties.
     *
     * @return the properties value
     */
    public TestFailoverInputProperties properties() {
        return this.properties;
    }

    /**
     * Set planned failover input properties.
     *
     * @param properties the properties value to set
     * @return the TestFailoverInput object itself.
     */
    public TestFailoverInput withProperties(TestFailoverInputProperties properties) {
        this.properties = properties;
        return this;
    }

}
