/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The execution options of a job step.
 */
public class JobStepExecutionOptions {
    /**
     * Execution timeout for the job step.
     */
    @JsonProperty(value = "timeoutSeconds")
    private Integer timeoutSeconds;

    /**
     * Maximum number of times the job step will be reattempted if the first
     * attempt fails.
     */
    @JsonProperty(value = "retryAttempts")
    private Integer retryAttempts;

    /**
     * Initial delay between retries for job step execution.
     */
    @JsonProperty(value = "initialRetryIntervalSeconds")
    private Integer initialRetryIntervalSeconds;

    /**
     * The maximum amount of time to wait between retries for job step
     * execution.
     */
    @JsonProperty(value = "maximumRetryIntervalSeconds")
    private Integer maximumRetryIntervalSeconds;

    /**
     * The backoff multiplier for the time between retries.
     */
    @JsonProperty(value = "retryIntervalBackoffMultiplier")
    private Double retryIntervalBackoffMultiplier;

    /**
     * Get execution timeout for the job step.
     *
     * @return the timeoutSeconds value
     */
    public Integer timeoutSeconds() {
        return this.timeoutSeconds;
    }

    /**
     * Set execution timeout for the job step.
     *
     * @param timeoutSeconds the timeoutSeconds value to set
     * @return the JobStepExecutionOptions object itself.
     */
    public JobStepExecutionOptions withTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    /**
     * Get maximum number of times the job step will be reattempted if the first attempt fails.
     *
     * @return the retryAttempts value
     */
    public Integer retryAttempts() {
        return this.retryAttempts;
    }

    /**
     * Set maximum number of times the job step will be reattempted if the first attempt fails.
     *
     * @param retryAttempts the retryAttempts value to set
     * @return the JobStepExecutionOptions object itself.
     */
    public JobStepExecutionOptions withRetryAttempts(Integer retryAttempts) {
        this.retryAttempts = retryAttempts;
        return this;
    }

    /**
     * Get initial delay between retries for job step execution.
     *
     * @return the initialRetryIntervalSeconds value
     */
    public Integer initialRetryIntervalSeconds() {
        return this.initialRetryIntervalSeconds;
    }

    /**
     * Set initial delay between retries for job step execution.
     *
     * @param initialRetryIntervalSeconds the initialRetryIntervalSeconds value to set
     * @return the JobStepExecutionOptions object itself.
     */
    public JobStepExecutionOptions withInitialRetryIntervalSeconds(Integer initialRetryIntervalSeconds) {
        this.initialRetryIntervalSeconds = initialRetryIntervalSeconds;
        return this;
    }

    /**
     * Get the maximum amount of time to wait between retries for job step execution.
     *
     * @return the maximumRetryIntervalSeconds value
     */
    public Integer maximumRetryIntervalSeconds() {
        return this.maximumRetryIntervalSeconds;
    }

    /**
     * Set the maximum amount of time to wait between retries for job step execution.
     *
     * @param maximumRetryIntervalSeconds the maximumRetryIntervalSeconds value to set
     * @return the JobStepExecutionOptions object itself.
     */
    public JobStepExecutionOptions withMaximumRetryIntervalSeconds(Integer maximumRetryIntervalSeconds) {
        this.maximumRetryIntervalSeconds = maximumRetryIntervalSeconds;
        return this;
    }

    /**
     * Get the backoff multiplier for the time between retries.
     *
     * @return the retryIntervalBackoffMultiplier value
     */
    public Double retryIntervalBackoffMultiplier() {
        return this.retryIntervalBackoffMultiplier;
    }

    /**
     * Set the backoff multiplier for the time between retries.
     *
     * @param retryIntervalBackoffMultiplier the retryIntervalBackoffMultiplier value to set
     * @return the JobStepExecutionOptions object itself.
     */
    public JobStepExecutionOptions withRetryIntervalBackoffMultiplier(Double retryIntervalBackoffMultiplier) {
        this.retryIntervalBackoffMultiplier = retryIntervalBackoffMultiplier;
        return this;
    }

}
