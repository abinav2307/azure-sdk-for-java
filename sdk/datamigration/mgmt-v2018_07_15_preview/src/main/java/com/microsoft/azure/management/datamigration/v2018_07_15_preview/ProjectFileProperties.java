/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Base class for file properties.
 */
public class ProjectFileProperties {
    /**
     * Optional File extension. If submitted it should not have a leading
     * period and must match the extension from filePath.
     */
    @JsonProperty(value = "extension")
    private String extension;

    /**
     * Relative path of this file resource. This property can be set when
     * creating or updating the file resource.
     */
    @JsonProperty(value = "filePath")
    private String filePath;

    /**
     * Modification DateTime.
     */
    @JsonProperty(value = "lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModified;

    /**
     * File content type. This property can be modified to reflect the file
     * content type.
     */
    @JsonProperty(value = "mediaType")
    private String mediaType;

    /**
     * File size.
     */
    @JsonProperty(value = "size", access = JsonProperty.Access.WRITE_ONLY)
    private Long size;

    /**
     * Get optional File extension. If submitted it should not have a leading period and must match the extension from filePath.
     *
     * @return the extension value
     */
    public String extension() {
        return this.extension;
    }

    /**
     * Set optional File extension. If submitted it should not have a leading period and must match the extension from filePath.
     *
     * @param extension the extension value to set
     * @return the ProjectFileProperties object itself.
     */
    public ProjectFileProperties withExtension(String extension) {
        this.extension = extension;
        return this;
    }

    /**
     * Get relative path of this file resource. This property can be set when creating or updating the file resource.
     *
     * @return the filePath value
     */
    public String filePath() {
        return this.filePath;
    }

    /**
     * Set relative path of this file resource. This property can be set when creating or updating the file resource.
     *
     * @param filePath the filePath value to set
     * @return the ProjectFileProperties object itself.
     */
    public ProjectFileProperties withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * Get modification DateTime.
     *
     * @return the lastModified value
     */
    public DateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Get file content type. This property can be modified to reflect the file content type.
     *
     * @return the mediaType value
     */
    public String mediaType() {
        return this.mediaType;
    }

    /**
     * Set file content type. This property can be modified to reflect the file content type.
     *
     * @param mediaType the mediaType value to set
     * @return the ProjectFileProperties object itself.
     */
    public ProjectFileProperties withMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    /**
     * Get file size.
     *
     * @return the size value
     */
    public Long size() {
        return this.size;
    }

}
