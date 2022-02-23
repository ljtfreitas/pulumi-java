// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.JobInputAssetResponse;
import io.pulumi.azurenative.media.outputs.JobInputClipResponse;
import io.pulumi.azurenative.media.outputs.JobInputHttpResponse;
import io.pulumi.azurenative.media.outputs.JobInputSequenceResponse;
import io.pulumi.azurenative.media.outputs.JobInputsResponse;
import io.pulumi.azurenative.media.outputs.JobOutputAssetResponse;
import io.pulumi.azurenative.media.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetJobResult {
    /**
     * Customer provided key, value pairs that will be returned in Job and JobOutput state events.
     * 
     */
    private final @Nullable Map<String,String> correlationData;
    /**
     * The UTC date and time when the customer has created the Job, in 'YYYY-MM-DDThh:mm:ssZ' format.
     * 
     */
    private final String created;
    /**
     * Optional customer supplied description of the Job.
     * 
     */
    private final @Nullable String description;
    /**
     * The UTC date and time at which this Job finished processing.
     * 
     */
    private final String endTime;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The inputs for the Job.
     * 
     */
    private final Object input;
    /**
     * The UTC date and time when the customer has last updated the Job, in 'YYYY-MM-DDThh:mm:ssZ' format.
     * 
     */
    private final String lastModified;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The outputs for the Job.
     * 
     */
    private final List<JobOutputAssetResponse> outputs;
    /**
     * Priority with which the job should be processed. Higher priority jobs are processed before lower priority jobs. If not set, the default is normal.
     * 
     */
    private final @Nullable String priority;
    /**
     * The UTC date and time at which this Job began processing.
     * 
     */
    private final String startTime;
    /**
     * The current state of the job.
     * 
     */
    private final String state;
    /**
     * The system metadata relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"correlationData","created","description","endTime","id","input","lastModified","name","outputs","priority","startTime","state","systemData","type"})
    private GetJobResult(
        @Nullable Map<String,String> correlationData,
        String created,
        @Nullable String description,
        String endTime,
        String id,
        Object input,
        String lastModified,
        String name,
        List<JobOutputAssetResponse> outputs,
        @Nullable String priority,
        String startTime,
        String state,
        SystemDataResponse systemData,
        String type) {
        this.correlationData = correlationData;
        this.created = Objects.requireNonNull(created);
        this.description = description;
        this.endTime = Objects.requireNonNull(endTime);
        this.id = Objects.requireNonNull(id);
        this.input = Objects.requireNonNull(input);
        this.lastModified = Objects.requireNonNull(lastModified);
        this.name = Objects.requireNonNull(name);
        this.outputs = Objects.requireNonNull(outputs);
        this.priority = priority;
        this.startTime = Objects.requireNonNull(startTime);
        this.state = Objects.requireNonNull(state);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Customer provided key, value pairs that will be returned in Job and JobOutput state events.
     * 
     */
    public Map<String,String> getCorrelationData() {
        return this.correlationData == null ? Map.of() : this.correlationData;
    }
    /**
     * The UTC date and time when the customer has created the Job, in 'YYYY-MM-DDThh:mm:ssZ' format.
     * 
     */
    public String getCreated() {
        return this.created;
    }
    /**
     * Optional customer supplied description of the Job.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The UTC date and time at which this Job finished processing.
     * 
     */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The inputs for the Job.
     * 
     */
    public Object getInput() {
        return this.input;
    }
    /**
     * The UTC date and time when the customer has last updated the Job, in 'YYYY-MM-DDThh:mm:ssZ' format.
     * 
     */
    public String getLastModified() {
        return this.lastModified;
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The outputs for the Job.
     * 
     */
    public List<JobOutputAssetResponse> getOutputs() {
        return this.outputs;
    }
    /**
     * Priority with which the job should be processed. Higher priority jobs are processed before lower priority jobs. If not set, the default is normal.
     * 
     */
    public Optional<String> getPriority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * The UTC date and time at which this Job began processing.
     * 
     */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * The current state of the job.
     * 
     */
    public String getState() {
        return this.state;
    }
    /**
     * The system metadata relating to this resource.
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> correlationData;
        private String created;
        private @Nullable String description;
        private String endTime;
        private String id;
        private Object input;
        private String lastModified;
        private String name;
        private List<JobOutputAssetResponse> outputs;
        private @Nullable String priority;
        private String startTime;
        private String state;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.correlationData = defaults.correlationData;
    	      this.created = defaults.created;
    	      this.description = defaults.description;
    	      this.endTime = defaults.endTime;
    	      this.id = defaults.id;
    	      this.input = defaults.input;
    	      this.lastModified = defaults.lastModified;
    	      this.name = defaults.name;
    	      this.outputs = defaults.outputs;
    	      this.priority = defaults.priority;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setCorrelationData(@Nullable Map<String,String> correlationData) {
            this.correlationData = correlationData;
            return this;
        }

        public Builder setCreated(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInput(Object input) {
            this.input = Objects.requireNonNull(input);
            return this;
        }

        public Builder setLastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOutputs(List<JobOutputAssetResponse> outputs) {
            this.outputs = Objects.requireNonNull(outputs);
            return this;
        }

        public Builder setPriority(@Nullable String priority) {
            this.priority = priority;
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetJobResult build() {
            return new GetJobResult(correlationData, created, description, endTime, id, input, lastModified, name, outputs, priority, startTime, state, systemData, type);
        }
    }
}
