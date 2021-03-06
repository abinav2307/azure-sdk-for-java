/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.advisor.v2017_04_19;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.advisor.v2017_04_19.implementation.SuppressionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Suppressions.
 */
public interface Suppressions extends SupportsCreating<SuppressionContract.DefinitionStages.Blank>, HasInner<SuppressionsInner> {
    /**
     * Retrieves the list of snoozed or dismissed suppressions for a subscription. The snoozed or dismissed attribute of a recommendation is referred to as a suppression.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SuppressionContract> listAsync();

    /**
     * Obtains the details of a suppression.
     *
     * @param resourceUri The fully qualified Azure Resource Manager identifier of the resource to which the recommendation applies.
     * @param recommendationId The recommendation ID.
     * @param name The name of the suppression.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SuppressionContract> getAsync(String resourceUri, String recommendationId, String name);

    /**
     * Enables the activation of a snoozed or dismissed recommendation. The snoozed or dismissed attribute of a recommendation is referred to as a suppression.
     *
     * @param resourceUri The fully qualified Azure Resource Manager identifier of the resource to which the recommendation applies.
     * @param recommendationId The recommendation ID.
     * @param name The name of the suppression.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceUri, String recommendationId, String name);

}
