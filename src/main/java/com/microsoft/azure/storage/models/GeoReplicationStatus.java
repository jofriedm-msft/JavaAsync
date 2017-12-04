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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for GeoReplicationStatus.
 */
public enum GeoReplicationStatus {
    /** Enum value live. */
    LIVE("live"),

    /** Enum value bootstrap. */
    BOOTSTRAP("bootstrap"),

    /** Enum value unavailable. */
    UNAVAILABLE("unavailable");

    /** The actual serialized value for a GeoReplicationStatus instance. */
    private String value;

    GeoReplicationStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a GeoReplicationStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed GeoReplicationStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static GeoReplicationStatus fromString(String value) {
        GeoReplicationStatus[] items = GeoReplicationStatus.values();
        for (GeoReplicationStatus item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}