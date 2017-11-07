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

import com.microsoft.rest.v2.DateTimeRfc1123;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for GetPageRanges operation.
 */
public class PageBlobsGetPageRangesHeaders {
    /**
     * Returns the date and time the container was last modified. Any operation
     * that modifies the blob, including an update of the blob's metadata or
     * properties, changes the last-modified time of the blob.
     */
    @JsonProperty(value = "Last-Modified")
    private String lastModified;

    /**
     * The ETag contains a value that you can use to perform operations
     * conditionally. If the request version is 2011-08-18 or newer, the ETag
     * value will be in quotes.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /**
     * The size of the blob in bytes.
     */
    @JsonProperty(value = "x-ms-blob-content-length")
    private Integer blobContentLength;

    /**
     * This header uniquely identifies the request that was made and can be
     * used for troubleshooting the request.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String requestId;

    /**
     * Indicates the version of the Blob service used to execute the request.
     * This header is returned for requests made against version 2009-09-19 and
     * above.
     */
    @JsonProperty(value = "x-ms-version")
    private String version;

    /**
     * UTC date/time value generated by the service that indicates the time at
     * which the response was initiated.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /**
     * Get the lastModified value.
     *
     * @return the lastModified value
     */
    public String lastModified() {
        return this.lastModified;
    }

    /**
     * Set the lastModified value.
     *
     * @param lastModified the lastModified value to set
     * @return the PageBlobsGetPageRangesHeaders object itself.
     */
    public PageBlobsGetPageRangesHeaders withLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * Get the eTag value.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the eTag value.
     *
     * @param eTag the eTag value to set
     * @return the PageBlobsGetPageRangesHeaders object itself.
     */
    public PageBlobsGetPageRangesHeaders withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the blobContentLength value.
     *
     * @return the blobContentLength value
     */
    public Integer blobContentLength() {
        return this.blobContentLength;
    }

    /**
     * Set the blobContentLength value.
     *
     * @param blobContentLength the blobContentLength value to set
     * @return the PageBlobsGetPageRangesHeaders object itself.
     */
    public PageBlobsGetPageRangesHeaders withBlobContentLength(Integer blobContentLength) {
        this.blobContentLength = blobContentLength;
        return this;
    }

    /**
     * Get the requestId value.
     *
     * @return the requestId value
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set the requestId value.
     *
     * @param requestId the requestId value to set
     * @return the PageBlobsGetPageRangesHeaders object itself.
     */
    public PageBlobsGetPageRangesHeaders withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version value.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set
     * @return the PageBlobsGetPageRangesHeaders object itself.
     */
    public PageBlobsGetPageRangesHeaders withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the dateProperty value.
     *
     * @return the dateProperty value
     */
    public DateTime dateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.dateTime();
    }

    /**
     * Set the dateProperty value.
     *
     * @param dateProperty the dateProperty value to set
     * @return the PageBlobsGetPageRangesHeaders object itself.
     */
    public PageBlobsGetPageRangesHeaders withDateProperty(DateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

}
