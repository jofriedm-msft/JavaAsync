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
 * The Block model.
 */
public class Block {
    /**
     * The base64 encoded block ID.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The block size in bytes.
     */
    @JsonProperty(value = "size")
    private Integer size;

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
     * @return the Block object itself.
     */
    public Block withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the size value.
     *
     * @return the size value
     */
    public Integer size() {
        return this.size;
    }

    /**
     * Set the size value.
     *
     * @param size the size value to set
     * @return the Block object itself.
     */
    public Block withSize(Integer size) {
        this.size = size;
        return this;
    }

}
