// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.azurenative.machinelearning.enums.AssetType;
import io.pulumi.azurenative.machinelearning.inputs.BlobLocationArgs;
import io.pulumi.azurenative.machinelearning.inputs.InputPortArgs;
import io.pulumi.azurenative.machinelearning.inputs.ModuleAssetParameterArgs;
import io.pulumi.azurenative.machinelearning.inputs.OutputPortArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information about an asset associated with the web service.
 * 
 */
public final class AssetItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssetItemArgs Empty = new AssetItemArgs();

    /**
     * Asset's Id.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * Information about the asset's input ports.
     * 
     */
    @Import(name="inputPorts")
      private final @Nullable Output<Map<String,InputPortArgs>> inputPorts;

    public Output<Map<String,InputPortArgs>> getInputPorts() {
        return this.inputPorts == null ? Output.empty() : this.inputPorts;
    }

    /**
     * Access information for the asset.
     * 
     */
    @Import(name="locationInfo", required=true)
      private final Output<BlobLocationArgs> locationInfo;

    public Output<BlobLocationArgs> getLocationInfo() {
        return this.locationInfo;
    }

    /**
     * If the asset is a custom module, this holds the module's metadata.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<Map<String,String>> metadata;

    public Output<Map<String,String>> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    /**
     * Asset's friendly name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Information about the asset's output ports.
     * 
     */
    @Import(name="outputPorts")
      private final @Nullable Output<Map<String,OutputPortArgs>> outputPorts;

    public Output<Map<String,OutputPortArgs>> getOutputPorts() {
        return this.outputPorts == null ? Output.empty() : this.outputPorts;
    }

    /**
     * If the asset is a custom module, this holds the module's parameters.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<List<ModuleAssetParameterArgs>> parameters;

    public Output<List<ModuleAssetParameterArgs>> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    /**
     * Asset's type.
     * 
     */
    @Import(name="type", required=true)
      private final Output<Either<String,AssetType>> type;

    public Output<Either<String,AssetType>> getType() {
        return this.type;
    }

    public AssetItemArgs(
        @Nullable Output<String> id,
        @Nullable Output<Map<String,InputPortArgs>> inputPorts,
        Output<BlobLocationArgs> locationInfo,
        @Nullable Output<Map<String,String>> metadata,
        Output<String> name,
        @Nullable Output<Map<String,OutputPortArgs>> outputPorts,
        @Nullable Output<List<ModuleAssetParameterArgs>> parameters,
        Output<Either<String,AssetType>> type) {
        this.id = id;
        this.inputPorts = inputPorts;
        this.locationInfo = Objects.requireNonNull(locationInfo, "expected parameter 'locationInfo' to be non-null");
        this.metadata = metadata;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.outputPorts = outputPorts;
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AssetItemArgs() {
        this.id = Output.empty();
        this.inputPorts = Output.empty();
        this.locationInfo = Output.empty();
        this.metadata = Output.empty();
        this.name = Output.empty();
        this.outputPorts = Output.empty();
        this.parameters = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<Map<String,InputPortArgs>> inputPorts;
        private Output<BlobLocationArgs> locationInfo;
        private @Nullable Output<Map<String,String>> metadata;
        private Output<String> name;
        private @Nullable Output<Map<String,OutputPortArgs>> outputPorts;
        private @Nullable Output<List<ModuleAssetParameterArgs>> parameters;
        private Output<Either<String,AssetType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetItemArgs defaults) {
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

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }

        public Builder inputPorts(@Nullable Output<Map<String,InputPortArgs>> inputPorts) {
            this.inputPorts = inputPorts;
            return this;
        }

        public Builder inputPorts(@Nullable Map<String,InputPortArgs> inputPorts) {
            this.inputPorts = Output.ofNullable(inputPorts);
            return this;
        }

        public Builder locationInfo(Output<BlobLocationArgs> locationInfo) {
            this.locationInfo = Objects.requireNonNull(locationInfo);
            return this;
        }

        public Builder locationInfo(BlobLocationArgs locationInfo) {
            this.locationInfo = Output.of(Objects.requireNonNull(locationInfo));
            return this;
        }

        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = Output.ofNullable(metadata);
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder outputPorts(@Nullable Output<Map<String,OutputPortArgs>> outputPorts) {
            this.outputPorts = outputPorts;
            return this;
        }

        public Builder outputPorts(@Nullable Map<String,OutputPortArgs> outputPorts) {
            this.outputPorts = Output.ofNullable(outputPorts);
            return this;
        }

        public Builder parameters(@Nullable Output<List<ModuleAssetParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder parameters(@Nullable List<ModuleAssetParameterArgs> parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }

        public Builder type(Output<Either<String,AssetType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(Either<String,AssetType> type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public AssetItemArgs build() {
            return new AssetItemArgs(id, inputPorts, locationInfo, metadata, name, outputPorts, parameters, type);
        }
    }
}
