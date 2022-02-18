// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.azurenative.deploymentmanager.inputs.CloudErrorBodyResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Detailed runtime information of the rollout.
 * 
 */
public final class RolloutOperationInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final RolloutOperationInfoResponse Empty = new RolloutOperationInfoResponse();

    /**
     * The start time of the rollout in UTC. This property will not be set if the rollout has not completed yet.
     * 
     */
    @InputImport(name="endTime", required=true)
    private final String endTime;

    public String getEndTime() {
        return this.endTime;
    }

    /**
     * The detailed error information for any failure.
     * 
     */
    @InputImport(name="error", required=true)
    private final CloudErrorBodyResponse error;

    public CloudErrorBodyResponse getError() {
        return this.error;
    }

    /**
     * The ordinal count of the number of retry attempts on a rollout. 0 if no retries of the rollout have been performed. If the rollout is updated with a PUT, this count is reset to 0.
     * 
     */
    @InputImport(name="retryAttempt", required=true)
    private final Integer retryAttempt;

    public Integer getRetryAttempt() {
        return this.retryAttempt;
    }

    /**
     * True, if all steps that succeeded on the previous run/attempt were chosen to be skipped in this retry attempt. False, otherwise.
     * 
     */
    @InputImport(name="skipSucceededOnRetry", required=true)
    private final Boolean skipSucceededOnRetry;

    public Boolean getSkipSucceededOnRetry() {
        return this.skipSucceededOnRetry;
    }

    /**
     * The start time of the rollout in UTC.
     * 
     */
    @InputImport(name="startTime", required=true)
    private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    public RolloutOperationInfoResponse(
        String endTime,
        CloudErrorBodyResponse error,
        Integer retryAttempt,
        Boolean skipSucceededOnRetry,
        String startTime) {
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.error = Objects.requireNonNull(error, "expected parameter 'error' to be non-null");
        this.retryAttempt = Objects.requireNonNull(retryAttempt, "expected parameter 'retryAttempt' to be non-null");
        this.skipSucceededOnRetry = Objects.requireNonNull(skipSucceededOnRetry, "expected parameter 'skipSucceededOnRetry' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private RolloutOperationInfoResponse() {
        this.endTime = null;
        this.error = null;
        this.retryAttempt = null;
        this.skipSucceededOnRetry = null;
        this.startTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RolloutOperationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTime;
        private CloudErrorBodyResponse error;
        private Integer retryAttempt;
        private Boolean skipSucceededOnRetry;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(RolloutOperationInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.error = defaults.error;
    	      this.retryAttempt = defaults.retryAttempt;
    	      this.skipSucceededOnRetry = defaults.skipSucceededOnRetry;
    	      this.startTime = defaults.startTime;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setError(CloudErrorBodyResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setRetryAttempt(Integer retryAttempt) {
            this.retryAttempt = Objects.requireNonNull(retryAttempt);
            return this;
        }

        public Builder setSkipSucceededOnRetry(Boolean skipSucceededOnRetry) {
            this.skipSucceededOnRetry = Objects.requireNonNull(skipSucceededOnRetry);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public RolloutOperationInfoResponse build() {
            return new RolloutOperationInfoResponse(endTime, error, retryAttempt, skipSucceededOnRetry, startTime);
        }
    }
}
