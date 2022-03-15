// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.OverrideTaskStepPropertiesResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TaskRunRequestResponse {
    /**
     * The dedicated agent pool for the run.
     * 
     */
    private final @Nullable String agentPoolName;
    /**
     * The value that indicates whether archiving is enabled for the run or not.
     * 
     */
    private final @Nullable Boolean isArchiveEnabled;
    /**
     * The template that describes the repository and tag information for run log artifact.
     * 
     */
    private final @Nullable String logTemplate;
    /**
     * Set of overridable parameters that can be passed when running a Task.
     * 
     */
    private final @Nullable OverrideTaskStepPropertiesResponse overrideTaskStepProperties;
    /**
     * The resource ID of task against which run has to be queued.
     * 
     */
    private final String taskId;
    /**
     * The type of the run request.
     * Expected value is 'TaskRunRequest'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private TaskRunRequestResponse(
        @CustomType.Parameter("agentPoolName") @Nullable String agentPoolName,
        @CustomType.Parameter("isArchiveEnabled") @Nullable Boolean isArchiveEnabled,
        @CustomType.Parameter("logTemplate") @Nullable String logTemplate,
        @CustomType.Parameter("overrideTaskStepProperties") @Nullable OverrideTaskStepPropertiesResponse overrideTaskStepProperties,
        @CustomType.Parameter("taskId") String taskId,
        @CustomType.Parameter("type") String type) {
        this.agentPoolName = agentPoolName;
        this.isArchiveEnabled = isArchiveEnabled;
        this.logTemplate = logTemplate;
        this.overrideTaskStepProperties = overrideTaskStepProperties;
        this.taskId = taskId;
        this.type = type;
    }

    /**
     * The dedicated agent pool for the run.
     * 
    */
    public Optional<String> getAgentPoolName() {
        return Optional.ofNullable(this.agentPoolName);
    }
    /**
     * The value that indicates whether archiving is enabled for the run or not.
     * 
    */
    public Optional<Boolean> getIsArchiveEnabled() {
        return Optional.ofNullable(this.isArchiveEnabled);
    }
    /**
     * The template that describes the repository and tag information for run log artifact.
     * 
    */
    public Optional<String> getLogTemplate() {
        return Optional.ofNullable(this.logTemplate);
    }
    /**
     * Set of overridable parameters that can be passed when running a Task.
     * 
    */
    public Optional<OverrideTaskStepPropertiesResponse> getOverrideTaskStepProperties() {
        return Optional.ofNullable(this.overrideTaskStepProperties);
    }
    /**
     * The resource ID of task against which run has to be queued.
     * 
    */
    public String getTaskId() {
        return this.taskId;
    }
    /**
     * The type of the run request.
     * Expected value is 'TaskRunRequest'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskRunRequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String agentPoolName;
        private @Nullable Boolean isArchiveEnabled;
        private @Nullable String logTemplate;
        private @Nullable OverrideTaskStepPropertiesResponse overrideTaskStepProperties;
        private String taskId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskRunRequestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentPoolName = defaults.agentPoolName;
    	      this.isArchiveEnabled = defaults.isArchiveEnabled;
    	      this.logTemplate = defaults.logTemplate;
    	      this.overrideTaskStepProperties = defaults.overrideTaskStepProperties;
    	      this.taskId = defaults.taskId;
    	      this.type = defaults.type;
        }

        public Builder agentPoolName(@Nullable String agentPoolName) {
            this.agentPoolName = agentPoolName;
            return this;
        }

        public Builder isArchiveEnabled(@Nullable Boolean isArchiveEnabled) {
            this.isArchiveEnabled = isArchiveEnabled;
            return this;
        }

        public Builder logTemplate(@Nullable String logTemplate) {
            this.logTemplate = logTemplate;
            return this;
        }

        public Builder overrideTaskStepProperties(@Nullable OverrideTaskStepPropertiesResponse overrideTaskStepProperties) {
            this.overrideTaskStepProperties = overrideTaskStepProperties;
            return this;
        }

        public Builder taskId(String taskId) {
            this.taskId = Objects.requireNonNull(taskId);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public TaskRunRequestResponse build() {
            return new TaskRunRequestResponse(agentPoolName, isArchiveEnabled, logTemplate, overrideTaskStepProperties, taskId, type);
        }
    }
}
