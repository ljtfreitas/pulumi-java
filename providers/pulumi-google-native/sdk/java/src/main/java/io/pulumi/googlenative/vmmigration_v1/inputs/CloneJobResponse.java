// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.vmmigration_v1.inputs.ComputeEngineTargetDetailsResponse;
import io.pulumi.googlenative.vmmigration_v1.inputs.StatusResponse;
import java.lang.String;
import java.util.Objects;


public final class CloneJobResponse extends io.pulumi.resources.InvokeArgs {

    public static final CloneJobResponse Empty = new CloneJobResponse();

    @InputImport(name="computeEngineTargetDetails", required=true)
    private final ComputeEngineTargetDetailsResponse computeEngineTargetDetails;

    public ComputeEngineTargetDetailsResponse getComputeEngineTargetDetails() {
        return this.computeEngineTargetDetails;
    }

    @InputImport(name="createTime", required=true)
    private final String createTime;

    public String getCreateTime() {
        return this.createTime;
    }

    @InputImport(name="error", required=true)
    private final StatusResponse error;

    public StatusResponse getError() {
        return this.error;
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="state", required=true)
    private final String state;

    public String getState() {
        return this.state;
    }

    @InputImport(name="stateTime", required=true)
    private final String stateTime;

    public String getStateTime() {
        return this.stateTime;
    }

    public CloneJobResponse(
        ComputeEngineTargetDetailsResponse computeEngineTargetDetails,
        String createTime,
        StatusResponse error,
        String name,
        String state,
        String stateTime) {
        this.computeEngineTargetDetails = Objects.requireNonNull(computeEngineTargetDetails, "expected parameter 'computeEngineTargetDetails' to be non-null");
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.error = Objects.requireNonNull(error, "expected parameter 'error' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.stateTime = Objects.requireNonNull(stateTime, "expected parameter 'stateTime' to be non-null");
    }

    private CloneJobResponse() {
        this.computeEngineTargetDetails = null;
        this.createTime = null;
        this.error = null;
        this.name = null;
        this.state = null;
        this.stateTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloneJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComputeEngineTargetDetailsResponse computeEngineTargetDetails;
        private String createTime;
        private StatusResponse error;
        private String name;
        private String state;
        private String stateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(CloneJobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeEngineTargetDetails = defaults.computeEngineTargetDetails;
    	      this.createTime = defaults.createTime;
    	      this.error = defaults.error;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.stateTime = defaults.stateTime;
        }

        public Builder setComputeEngineTargetDetails(ComputeEngineTargetDetailsResponse computeEngineTargetDetails) {
            this.computeEngineTargetDetails = Objects.requireNonNull(computeEngineTargetDetails);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setError(StatusResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setStateTime(String stateTime) {
            this.stateTime = Objects.requireNonNull(stateTime);
            return this;
        }

        public CloneJobResponse build() {
            return new CloneJobResponse(computeEngineTargetDetails, createTime, error, name, state, stateTime);
        }
    }
}