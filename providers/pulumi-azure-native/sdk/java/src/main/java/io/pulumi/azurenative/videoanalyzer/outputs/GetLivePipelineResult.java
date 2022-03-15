// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.azurenative.videoanalyzer.outputs.ParameterDefinitionResponse;
import io.pulumi.azurenative.videoanalyzer.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLivePipelineResult {
    /**
     * Maximum bitrate capacity in Kbps reserved for the live pipeline. The allowed range is from 500 to 3000 Kbps in increments of 100 Kbps. If the RTSP camera exceeds this capacity, then the service will disconnect temporarily from the camera. It will retry to re-establish connection (with exponential backoff), checking to see if the camera bitrate is now below the reserved capacity. Doing so will ensure that one 'noisy neighbor' does not affect other live pipelines in your account.
     * 
     */
    private final Integer bitrateKbps;
    /**
     * An optional description for the pipeline.
     * 
     */
    private final @Nullable String description;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * List of the instance level parameter values for the user-defined topology parameters. A pipeline can only define or override parameters values for parameters which have been declared in the referenced topology. Topology parameters without a default value must be defined. Topology parameters with a default value can be optionally be overridden.
     * 
     */
    private final @Nullable List<ParameterDefinitionResponse> parameters;
    /**
     * Current state of the pipeline (read-only).
     * 
     */
    private final String state;
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The reference to an existing pipeline topology defined for real-time content processing. When activated, this live pipeline will process content according to the pipeline topology definition.
     * 
     */
    private final String topologyName;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetLivePipelineResult(
        @CustomType.Parameter("bitrateKbps") Integer bitrateKbps,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") @Nullable List<ParameterDefinitionResponse> parameters,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("topologyName") String topologyName,
        @CustomType.Parameter("type") String type) {
        this.bitrateKbps = bitrateKbps;
        this.description = description;
        this.id = id;
        this.name = name;
        this.parameters = parameters;
        this.state = state;
        this.systemData = systemData;
        this.topologyName = topologyName;
        this.type = type;
    }

    /**
     * Maximum bitrate capacity in Kbps reserved for the live pipeline. The allowed range is from 500 to 3000 Kbps in increments of 100 Kbps. If the RTSP camera exceeds this capacity, then the service will disconnect temporarily from the camera. It will retry to re-establish connection (with exponential backoff), checking to see if the camera bitrate is now below the reserved capacity. Doing so will ensure that one 'noisy neighbor' does not affect other live pipelines in your account.
     * 
    */
    public Integer getBitrateKbps() {
        return this.bitrateKbps;
    }
    /**
     * An optional description for the pipeline.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * List of the instance level parameter values for the user-defined topology parameters. A pipeline can only define or override parameters values for parameters which have been declared in the referenced topology. Topology parameters without a default value must be defined. Topology parameters with a default value can be optionally be overridden.
     * 
    */
    public List<ParameterDefinitionResponse> getParameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }
    /**
     * Current state of the pipeline (read-only).
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The reference to an existing pipeline topology defined for real-time content processing. When activated, this live pipeline will process content according to the pipeline topology definition.
     * 
    */
    public String getTopologyName() {
        return this.topologyName;
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

    public static Builder builder(GetLivePipelineResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer bitrateKbps;
        private @Nullable String description;
        private String id;
        private String name;
        private @Nullable List<ParameterDefinitionResponse> parameters;
        private String state;
        private SystemDataResponse systemData;
        private String topologyName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLivePipelineResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitrateKbps = defaults.bitrateKbps;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.state = defaults.state;
    	      this.systemData = defaults.systemData;
    	      this.topologyName = defaults.topologyName;
    	      this.type = defaults.type;
        }

        public Builder bitrateKbps(Integer bitrateKbps) {
            this.bitrateKbps = Objects.requireNonNull(bitrateKbps);
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder parameters(@Nullable List<ParameterDefinitionResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder topologyName(String topologyName) {
            this.topologyName = Objects.requireNonNull(topologyName);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetLivePipelineResult build() {
            return new GetLivePipelineResult(bitrateKbps, description, id, name, parameters, state, systemData, topologyName, type);
        }
    }
}
