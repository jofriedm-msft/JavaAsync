/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.storage.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Stats for the storage service.
 */
public class StorageServiceStats {
    /**
     * Geo-Replication information for the Secondary Storage Service.
     */
    @JsonProperty(value = "GeoReplication")
    private GeoReplication geoReplication;

    /**
     * Get the geoReplication value.
     *
     * @return the geoReplication value
     */
    public GeoReplication geoReplication() {
        return this.geoReplication;
    }

    /**
     * Set the geoReplication value.
     *
     * @param geoReplication the geoReplication value to set
     * @return the StorageServiceStats object itself.
     */
    public StorageServiceStats withGeoReplication(GeoReplication geoReplication) {
        this.geoReplication = geoReplication;
        return this;
    }

}
