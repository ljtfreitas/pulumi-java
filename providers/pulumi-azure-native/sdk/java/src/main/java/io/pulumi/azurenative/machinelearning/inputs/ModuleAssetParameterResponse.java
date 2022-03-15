// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.azurenative.machinelearning.inputs.ModeValueInfoResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Parameter definition for a module asset.
 * 
 */
public final class ModuleAssetParameterResponse extends io.pulumi.resources.InvokeArgs {

    public static final ModuleAssetParameterResponse Empty = new ModuleAssetParameterResponse();

    /**
     * Definitions for nested interface parameters if this is a complex module parameter.
     * 
     */
    @Import(name="modeValuesInfo")
      private final @Nullable Map<String,ModeValueInfoResponse> modeValuesInfo;

    public Map<String,ModeValueInfoResponse> getModeValuesInfo() {
        return this.modeValuesInfo == null ? Map.of() : this.modeValuesInfo;
    }

    /**
     * Parameter name.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Parameter type.
     * 
     */
    @Import(name="parameterType")
      private final @Nullable String parameterType;

    public Optional<String> getParameterType() {
        return this.parameterType == null ? Optional.empty() : Optional.ofNullable(this.parameterType);
    }

    public ModuleAssetParameterResponse(
        @Nullable Map<String,ModeValueInfoResponse> modeValuesInfo,
        @Nullable String name,
        @Nullable String parameterType) {
        this.modeValuesInfo = modeValuesInfo;
        this.name = name;
        this.parameterType = parameterType;
    }

    private ModuleAssetParameterResponse() {
        this.modeValuesInfo = Map.of();
        this.name = null;
        this.parameterType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModuleAssetParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,ModeValueInfoResponse> modeValuesInfo;
        private @Nullable String name;
        private @Nullable String parameterType;

        public Builder() {
    	      // Empty
        }

        public Builder(ModuleAssetParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.modeValuesInfo = defaults.modeValuesInfo;
    	      this.name = defaults.name;
    	      this.parameterType = defaults.parameterType;
        }

        public Builder modeValuesInfo(@Nullable Map<String,ModeValueInfoResponse> modeValuesInfo) {
            this.modeValuesInfo = modeValuesInfo;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder parameterType(@Nullable String parameterType) {
            this.parameterType = parameterType;
            return this;
        }
        public ModuleAssetParameterResponse build() {
            return new ModuleAssetParameterResponse(modeValuesInfo, name, parameterType);
        }
    }
}
