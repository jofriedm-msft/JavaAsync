/**
 * Copyright Microsoft Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.microsoft.azure.storage.blob;

import com.microsoft.azure.storage.pipeline.Pipeline;

/**
 * Represents a URL to a page blob.
 */
public final class PageBlobURL extends BlobUrl {

    /**
     * Creates a new {@link PageBlobURL} object.
     * @param url
     *      A {@code String} representing a URL to a page blob.
     * @param pipeline
     *      A {@link Pipeline} object representing the pipeline for requests.
     */
    public PageBlobURL(String url, Pipeline pipeline) {
        super(url, pipeline);
    }

    /**
     * Creates a new {@link PageBlobURL} with the given pipeline.
     * @param pipeline
     *      A {@link Pipeline} object to set.
     * @return
     *      A {@link PageBlobURL} object with the given pipeline.
     */
    public PageBlobURL withPipeline(Pipeline pipeline) {
        return new PageBlobURL(this.url, pipeline);
    }
}