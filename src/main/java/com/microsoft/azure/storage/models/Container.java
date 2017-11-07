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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An Azure Storage container.
 */
public class Container {
    /**
     * The name property.
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * The properties property.
     */
    @JsonProperty(value = "Properties")
    private ContainerProperties properties;

    /**
     * The metadata property.
     */
    @JsonProperty(value = "Metadata")
    private Map<String, String> metadata;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the Container object itself.
     */
    public Container withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public ContainerProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the Container object itself.
     */
    public Container withProperties(ContainerProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the metadata value.
     *
     * @return the metadata value
     */
    public Map<String, String> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set
     * @return the Container object itself.
     */
    public Container withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

}
