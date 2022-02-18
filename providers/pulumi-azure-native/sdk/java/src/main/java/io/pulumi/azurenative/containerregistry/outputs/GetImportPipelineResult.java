// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.IdentityPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.ImportPipelineSourcePropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.PipelineTriggerPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetImportPipelineResult {
    /**
     * The resource ID.
     * 
     */
    private final String id;
    /**
     * The identity of the import pipeline.
     * 
     */
    private final @Nullable IdentityPropertiesResponse identity;
    /**
     * The location of the import pipeline.
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The list of all options configured for the pipeline.
     * 
     */
    private final @Nullable List<String> options;
    /**
     * The provisioning state of the pipeline at the time the operation was called.
     * 
     */
    private final String provisioningState;
    /**
     * The source properties of the import pipeline.
     * 
     */
    private final ImportPipelineSourcePropertiesResponse source;
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The properties that describe the trigger of the import pipeline.
     * 
     */
    private final @Nullable PipelineTriggerPropertiesResponse trigger;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","identity","location","name","options","provisioningState","source","systemData","trigger","type"})
    private GetImportPipelineResult(
        String id,
        @Nullable IdentityPropertiesResponse identity,
        @Nullable String location,
        String name,
        @Nullable List<String> options,
        String provisioningState,
        ImportPipelineSourcePropertiesResponse source,
        SystemDataResponse systemData,
        @Nullable PipelineTriggerPropertiesResponse trigger,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.options = options;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.source = Objects.requireNonNull(source);
        this.systemData = Objects.requireNonNull(systemData);
        this.trigger = trigger;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The identity of the import pipeline.
     * 
     */
    public Optional<IdentityPropertiesResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * The location of the import pipeline.
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The list of all options configured for the pipeline.
     * 
     */
    public List<String> getOptions() {
        return this.options == null ? List.of() : this.options;
    }
    /**
     * The provisioning state of the pipeline at the time the operation was called.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The source properties of the import pipeline.
     * 
     */
    public ImportPipelineSourcePropertiesResponse getSource() {
        return this.source;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The properties that describe the trigger of the import pipeline.
     * 
     */
    public Optional<PipelineTriggerPropertiesResponse> getTrigger() {
        return Optional.ofNullable(this.trigger);
    }
    /**
     * The type of the resource.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImportPipelineResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable IdentityPropertiesResponse identity;
        private @Nullable String location;
        private String name;
        private @Nullable List<String> options;
        private String provisioningState;
        private ImportPipelineSourcePropertiesResponse source;
        private SystemDataResponse systemData;
        private @Nullable PipelineTriggerPropertiesResponse trigger;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImportPipelineResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.provisioningState = defaults.provisioningState;
    	      this.source = defaults.source;
    	      this.systemData = defaults.systemData;
    	      this.trigger = defaults.trigger;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable IdentityPropertiesResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOptions(@Nullable List<String> options) {
            this.options = options;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSource(ImportPipelineSourcePropertiesResponse source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTrigger(@Nullable PipelineTriggerPropertiesResponse trigger) {
            this.trigger = trigger;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetImportPipelineResult build() {
            return new GetImportPipelineResult(id, identity, location, name, options, provisioningState, source, systemData, trigger, type);
        }
    }
}
