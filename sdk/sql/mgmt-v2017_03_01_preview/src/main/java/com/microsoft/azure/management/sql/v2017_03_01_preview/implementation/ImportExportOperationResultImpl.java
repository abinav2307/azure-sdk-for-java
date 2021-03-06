/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.microsoft.azure.management.sql.v2017_03_01_preview.ImportExportOperationResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.UUID;

class ImportExportOperationResultImpl extends WrapperImpl<ImportExportOperationResultInner> implements ImportExportOperationResult {
    private final SqlManager manager;
    ImportExportOperationResultImpl(ImportExportOperationResultInner inner, SqlManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public String blobUri() {
        return this.inner().blobUri();
    }

    @Override
    public String databaseName() {
        return this.inner().databaseName();
    }

    @Override
    public String errorMessage() {
        return this.inner().errorMessage();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String lastModifiedTime() {
        return this.inner().lastModifiedTime();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String queuedTime() {
        return this.inner().queuedTime();
    }

    @Override
    public UUID requestId() {
        return this.inner().requestId();
    }

    @Override
    public String requestType() {
        return this.inner().requestType();
    }

    @Override
    public String serverName() {
        return this.inner().serverName();
    }

    @Override
    public String status() {
        return this.inner().status();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
