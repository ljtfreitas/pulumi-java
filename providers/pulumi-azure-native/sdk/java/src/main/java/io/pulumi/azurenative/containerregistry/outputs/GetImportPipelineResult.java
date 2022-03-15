// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.IdentityPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.ImportPipelineSourcePropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.PipelineTriggerPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
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

    @CustomType.Constructor
    private GetImportPipelineResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable IdentityPropertiesResponse identity,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("options") @Nullable List<String> options,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("source") ImportPipelineSourcePropertiesResponse source,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("trigger") @Nullable PipelineTriggerPropertiesResponse trigger,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.identity = identity;
        this.location = location;
        this.name = name;
        this.options = options;
        this.provisioningState = provisioningState;
        this.source = source;
        this.systemData = systemData;
        this.trigger = trigger;
        this.type = type;
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

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder identity(@Nullable IdentityPropertiesResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder options(@Nullable List<String> options) {
            this.options = options;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder source(ImportPipelineSourcePropertiesResponse source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder trigger(@Nullable PipelineTriggerPropertiesResponse trigger) {
            this.trigger = trigger;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetImportPipelineResult build() {
            return new GetImportPipelineResult(id, identity, location, name, options, provisioningState, source, systemData, trigger, type);
        }
    }
}
