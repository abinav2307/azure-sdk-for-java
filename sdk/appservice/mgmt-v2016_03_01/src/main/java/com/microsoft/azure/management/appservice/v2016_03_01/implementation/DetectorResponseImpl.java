/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01.implementation;

import com.microsoft.azure.management.appservice.v2016_03_01.DetectorResponse;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.appservice.v2016_03_01.DiagnosticData;
import com.microsoft.azure.management.appservice.v2016_03_01.DetectorInfo;

class DetectorResponseImpl extends IndexableRefreshableWrapperImpl<DetectorResponse, DetectorResponseInner> implements DetectorResponse {
    private final AppServiceManager manager;
    private String resourceGroupName;
    private String name;
    private String detectorName;

    DetectorResponseImpl(DetectorResponseInner inner,  AppServiceManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "hostingEnvironments");
        this.detectorName = IdParsingUtils.getValueFromIdByName(inner.id(), "detectors");
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<DetectorResponseInner> getInnerAsync() {
        DiagnosticsInner client = this.manager().inner().diagnostics();
        return client.getHostingEnvironmentDetectorResponseAsync(this.resourceGroupName, this.name, this.detectorName);
    }



    @Override
    public List<DiagnosticData> dataset() {
        return this.inner().dataset();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public DetectorInfo metadata() {
        return this.inner().metadata();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
