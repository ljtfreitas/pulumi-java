// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.vmmigration_v1alpha1.outputs.ComputeEngineTargetDetailsResponse;
import io.pulumi.googlenative.vmmigration_v1alpha1.outputs.StatusResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCutoverJobResult {
    /**
     * Details of the target VM in Compute Engine.
     * 
     */
    private final ComputeEngineTargetDetailsResponse computeEngineTargetDetails;
    /**
     * The time the cutover job was created (as an API call, not when it was actually created in the target).
     * 
     */
    private final String createTime;
    /**
     * Provides details for the errors that led to the Cutover Job's state.
     * 
     */
    private final StatusResponse error;
    /**
     * The name of the cutover job.
     * 
     */
    private final String name;
    /**
     * The current progress in percentage of the cutover job.
     * 
     */
    private final Integer progress;
    /**
     * The current progress in percentage of the cutover job.
     * 
     */
    private final Integer progressPercent;
    /**
     * State of the cutover job.
     * 
     */
    private final String state;
    /**
     * A message providing possible extra details about the current state.
     * 
     */
    private final String stateMessage;
    /**
     * The time the state was last updated.
     * 
     */
    private final String stateTime;

    @CustomType.Constructor
    private GetCutoverJobResult(
        @CustomType.Parameter("computeEngineTargetDetails") ComputeEngineTargetDetailsResponse computeEngineTargetDetails,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("error") StatusResponse error,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("progress") Integer progress,
        @CustomType.Parameter("progressPercent") Integer progressPercent,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("stateMessage") String stateMessage,
        @CustomType.Parameter("stateTime") String stateTime) {
        this.computeEngineTargetDetails = computeEngineTargetDetails;
        this.createTime = createTime;
        this.error = error;
        this.name = name;
        this.progress = progress;
        this.progressPercent = progressPercent;
        this.state = state;
        this.stateMessage = stateMessage;
        this.stateTime = stateTime;
    }

    /**
     * Details of the target VM in Compute Engine.
     * 
    */
    public ComputeEngineTargetDetailsResponse getComputeEngineTargetDetails() {
        return this.computeEngineTargetDetails;
    }
    /**
     * The time the cutover job was created (as an API call, not when it was actually created in the target).
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Provides details for the errors that led to the Cutover Job's state.
     * 
    */
    public StatusResponse getError() {
        return this.error;
    }
    /**
     * The name of the cutover job.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The current progress in percentage of the cutover job.
     * 
    */
    public Integer getProgress() {
        return this.progress;
    }
    /**
     * The current progress in percentage of the cutover job.
     * 
    */
    public Integer getProgressPercent() {
        return this.progressPercent;
    }
    /**
     * State of the cutover job.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * A message providing possible extra details about the current state.
     * 
    */
    public String getStateMessage() {
        return this.stateMessage;
    }
    /**
     * The time the state was last updated.
     * 
    */
    public String getStateTime() {
        return this.stateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCutoverJobResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComputeEngineTargetDetailsResponse computeEngineTargetDetails;
        private String createTime;
        private StatusResponse error;
        private String name;
        private Integer progress;
        private Integer progressPercent;
        private String state;
        private String stateMessage;
        private String stateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCutoverJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeEngineTargetDetails = defaults.computeEngineTargetDetails;
    	      this.createTime = defaults.createTime;
    	      this.error = defaults.error;
    	      this.name = defaults.name;
    	      this.progress = defaults.progress;
    	      this.progressPercent = defaults.progressPercent;
    	      this.state = defaults.state;
    	      this.stateMessage = defaults.stateMessage;
    	      this.stateTime = defaults.stateTime;
        }

        public Builder computeEngineTargetDetails(ComputeEngineTargetDetailsResponse computeEngineTargetDetails) {
            this.computeEngineTargetDetails = Objects.requireNonNull(computeEngineTargetDetails);
            return this;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
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

        public Builder progress(Integer progress) {
            this.progress = Objects.requireNonNull(progress);
            return this;
        }

        public Builder progressPercent(Integer progressPercent) {
            this.progressPercent = Objects.requireNonNull(progressPercent);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder stateMessage(String stateMessage) {
            this.stateMessage = Objects.requireNonNull(stateMessage);
            return this;
        }

        public Builder stateTime(String stateTime) {
            this.stateTime = Objects.requireNonNull(stateTime);
            return this;
        }
        public GetCutoverJobResult build() {
            return new GetCutoverJobResult(computeEngineTargetDetails, createTime, error, name, progress, progressPercent, state, stateMessage, stateTime);
        }
    }
}
