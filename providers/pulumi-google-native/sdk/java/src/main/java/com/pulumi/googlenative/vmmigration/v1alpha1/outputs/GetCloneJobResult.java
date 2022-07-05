// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.vmmigration.v1alpha1.outputs.CloneStepResponse;
import com.pulumi.googlenative.vmmigration.v1alpha1.outputs.ComputeEngineTargetDetailsResponse;
import com.pulumi.googlenative.vmmigration.v1alpha1.outputs.StatusResponse;
import com.pulumi.googlenative.vmmigration.v1alpha1.outputs.TargetVMDetailsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCloneJobResult {
    /**
     * @return Details of the target VM in Compute Engine.
     * 
     */
    private final ComputeEngineTargetDetailsResponse computeEngineTargetDetails;
    /**
     * @return Details of the VM in Compute Engine. Deprecated: Use compute_engine_target_details instead.
     * 
     * @deprecated
     * Output only. Details of the VM in Compute Engine. Deprecated: Use compute_engine_target_details instead.
     * 
     */
    @Deprecated /* Output only. Details of the VM in Compute Engine. Deprecated: Use compute_engine_target_details instead. */
    private final TargetVMDetailsResponse computeEngineVmDetails;
    /**
     * @return The time the clone job was created (as an API call, not when it was actually created in the target).
     * 
     */
    private final String createTime;
    /**
     * @return The time the clone job was ended.
     * 
     */
    private final String endTime;
    /**
     * @return Provides details for the errors that led to the Clone Job&#39;s state.
     * 
     */
    private final StatusResponse error;
    /**
     * @return The name of the clone.
     * 
     */
    private final String name;
    /**
     * @return State of the clone job.
     * 
     */
    private final String state;
    /**
     * @return The time the state was last updated.
     * 
     */
    private final String stateTime;
    /**
     * @return The clone steps list representing its progress.
     * 
     */
    private final List<CloneStepResponse> steps;
    /**
     * @return Details of the VM to create as the target of this clone job. Deprecated: Use compute_engine_target_details instead.
     * 
     * @deprecated
     * Output only. Details of the VM to create as the target of this clone job. Deprecated: Use compute_engine_target_details instead.
     * 
     */
    @Deprecated /* Output only. Details of the VM to create as the target of this clone job. Deprecated: Use compute_engine_target_details instead. */
    private final TargetVMDetailsResponse targetDetails;

    @CustomType.Constructor
    private GetCloneJobResult(
        @CustomType.Parameter("computeEngineTargetDetails") ComputeEngineTargetDetailsResponse computeEngineTargetDetails,
        @CustomType.Parameter("computeEngineVmDetails") TargetVMDetailsResponse computeEngineVmDetails,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("error") StatusResponse error,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("stateTime") String stateTime,
        @CustomType.Parameter("steps") List<CloneStepResponse> steps,
        @CustomType.Parameter("targetDetails") TargetVMDetailsResponse targetDetails) {
        this.computeEngineTargetDetails = computeEngineTargetDetails;
        this.computeEngineVmDetails = computeEngineVmDetails;
        this.createTime = createTime;
        this.endTime = endTime;
        this.error = error;
        this.name = name;
        this.state = state;
        this.stateTime = stateTime;
        this.steps = steps;
        this.targetDetails = targetDetails;
    }

    /**
     * @return Details of the target VM in Compute Engine.
     * 
     */
    public ComputeEngineTargetDetailsResponse computeEngineTargetDetails() {
        return this.computeEngineTargetDetails;
    }
    /**
     * @return Details of the VM in Compute Engine. Deprecated: Use compute_engine_target_details instead.
     * 
     * @deprecated
     * Output only. Details of the VM in Compute Engine. Deprecated: Use compute_engine_target_details instead.
     * 
     */
    @Deprecated /* Output only. Details of the VM in Compute Engine. Deprecated: Use compute_engine_target_details instead. */
    public TargetVMDetailsResponse computeEngineVmDetails() {
        return this.computeEngineVmDetails;
    }
    /**
     * @return The time the clone job was created (as an API call, not when it was actually created in the target).
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The time the clone job was ended.
     * 
     */
    public String endTime() {
        return this.endTime;
    }
    /**
     * @return Provides details for the errors that led to the Clone Job&#39;s state.
     * 
     */
    public StatusResponse error() {
        return this.error;
    }
    /**
     * @return The name of the clone.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return State of the clone job.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The time the state was last updated.
     * 
     */
    public String stateTime() {
        return this.stateTime;
    }
    /**
     * @return The clone steps list representing its progress.
     * 
     */
    public List<CloneStepResponse> steps() {
        return this.steps;
    }
    /**
     * @return Details of the VM to create as the target of this clone job. Deprecated: Use compute_engine_target_details instead.
     * 
     * @deprecated
     * Output only. Details of the VM to create as the target of this clone job. Deprecated: Use compute_engine_target_details instead.
     * 
     */
    @Deprecated /* Output only. Details of the VM to create as the target of this clone job. Deprecated: Use compute_engine_target_details instead. */
    public TargetVMDetailsResponse targetDetails() {
        return this.targetDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloneJobResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComputeEngineTargetDetailsResponse computeEngineTargetDetails;
        private TargetVMDetailsResponse computeEngineVmDetails;
        private String createTime;
        private String endTime;
        private StatusResponse error;
        private String name;
        private String state;
        private String stateTime;
        private List<CloneStepResponse> steps;
        private TargetVMDetailsResponse targetDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCloneJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeEngineTargetDetails = defaults.computeEngineTargetDetails;
    	      this.computeEngineVmDetails = defaults.computeEngineVmDetails;
    	      this.createTime = defaults.createTime;
    	      this.endTime = defaults.endTime;
    	      this.error = defaults.error;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.stateTime = defaults.stateTime;
    	      this.steps = defaults.steps;
    	      this.targetDetails = defaults.targetDetails;
        }

        public Builder computeEngineTargetDetails(ComputeEngineTargetDetailsResponse computeEngineTargetDetails) {
            this.computeEngineTargetDetails = Objects.requireNonNull(computeEngineTargetDetails);
            return this;
        }
        public Builder computeEngineVmDetails(TargetVMDetailsResponse computeEngineVmDetails) {
            this.computeEngineVmDetails = Objects.requireNonNull(computeEngineVmDetails);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder error(StatusResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder stateTime(String stateTime) {
            this.stateTime = Objects.requireNonNull(stateTime);
            return this;
        }
        public Builder steps(List<CloneStepResponse> steps) {
            this.steps = Objects.requireNonNull(steps);
            return this;
        }
        public Builder steps(CloneStepResponse... steps) {
            return steps(List.of(steps));
        }
        public Builder targetDetails(TargetVMDetailsResponse targetDetails) {
            this.targetDetails = Objects.requireNonNull(targetDetails);
            return this;
        }        public GetCloneJobResult build() {
            return new GetCloneJobResult(computeEngineTargetDetails, computeEngineVmDetails, createTime, endTime, error, name, state, stateTime, steps, targetDetails);
        }
    }
}
