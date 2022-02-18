// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.azurenative.machinelearning.inputs.BlobLocationResponse;
import io.pulumi.azurenative.machinelearning.inputs.InputPortResponse;
import io.pulumi.azurenative.machinelearning.inputs.ModuleAssetParameterResponse;
import io.pulumi.azurenative.machinelearning.inputs.OutputPortResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about an asset associated with the web service.
 * 
 */
public final class AssetItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final AssetItemResponse Empty = new AssetItemResponse();

    /**
     * Asset's Id.
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Information about the asset's input ports.
     * 
     */
    @InputImport(name="inputPorts")
    private final @Nullable Map<String,InputPortResponse> inputPorts;

    public Map<String,InputPortResponse> getInputPorts() {
        return this.inputPorts == null ? Map.of() : this.inputPorts;
    }

    /**
     * Access information for the asset.
     * 
     */
    @InputImport(name="locationInfo", required=true)
    private final BlobLocationResponse locationInfo;

    public BlobLocationResponse getLocationInfo() {
        return this.locationInfo;
    }

    /**
     * If the asset is a custom module, this holds the module's metadata.
     * 
     */
    @InputImport(name="metadata")
    private final @Nullable Map<String,String> metadata;

    public Map<String,String> getMetadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }

    /**
     * Asset's friendly name.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Information about the asset's output ports.
     * 
     */
    @InputImport(name="outputPorts")
    private final @Nullable Map<String,OutputPortResponse> outputPorts;

    public Map<String,OutputPortResponse> getOutputPorts() {
        return this.outputPorts == null ? Map.of() : this.outputPorts;
    }

    /**
     * If the asset is a custom module, this holds the module's parameters.
     * 
     */
    @InputImport(name="parameters")
    private final @Nullable List<ModuleAssetParameterResponse> parameters;

    public List<ModuleAssetParameterResponse> getParameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }

    /**
     * Asset's type.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public AssetItemResponse(
        @Nullable String id,
        @Nullable Map<String,InputPortResponse> inputPorts,
        BlobLocationResponse locationInfo,
        @Nullable Map<String,String> metadata,
        String name,
        @Nullable Map<String,OutputPortResponse> outputPorts,
        @Nullable List<ModuleAssetParameterResponse> parameters,
        String type) {
        this.id = id;
        this.inputPorts = inputPorts;
        this.locationInfo = Objects.requireNonNull(locationInfo, "expected parameter 'locationInfo' to be non-null");
        this.metadata = metadata;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.outputPorts = outputPorts;
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AssetItemResponse() {
        this.id = null;
        this.inputPorts = Map.of();
        this.locationInfo = null;
        this.metadata = Map.of();
        this.name = null;
        this.outputPorts = Map.of();
        this.parameters = List.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable Map<String,InputPortResponse> inputPorts;
        private BlobLocationResponse locationInfo;
        private @Nullable Map<String,String> metadata;
        private String name;
        private @Nullable Map<String,OutputPortResponse> outputPorts;
        private @Nullable List<ModuleAssetParameterResponse> parameters;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.inputPorts = defaults.inputPorts;
    	      this.locationInfo = defaults.locationInfo;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.outputPorts = defaults.outputPorts;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setInputPorts(@Nullable Map<String,InputPortResponse> inputPorts) {
            this.inputPorts = inputPorts;
            return this;
        }

        public Builder setLocationInfo(BlobLocationResponse locationInfo) {
            this.locationInfo = Objects.requireNonNull(locationInfo);
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOutputPorts(@Nullable Map<String,OutputPortResponse> outputPorts) {
            this.outputPorts = outputPorts;
            return this;
        }

        public Builder setParameters(@Nullable List<ModuleAssetParameterResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public AssetItemResponse build() {
            return new AssetItemResponse(id, inputPorts, locationInfo, metadata, name, outputPorts, parameters, type);
        }
    }
}
