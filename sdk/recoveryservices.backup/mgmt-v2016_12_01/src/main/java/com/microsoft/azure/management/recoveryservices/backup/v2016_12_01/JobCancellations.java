/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01;

import rx.Completable;
import com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.implementation.JobCancellationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing JobCancellations.
 */
public interface JobCancellations extends HasInner<JobCancellationsInner> {
    /**
     * Cancels a job. This is an asynchronous operation. To know the status of the cancellation, call GetCancelOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param jobName Name of the job to cancel.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable triggerAsync(String vaultName, String resourceGroupName, String jobName);

}
