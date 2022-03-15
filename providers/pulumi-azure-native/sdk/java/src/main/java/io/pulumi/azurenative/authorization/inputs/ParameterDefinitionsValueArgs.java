// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.azurenative.authorization.enums.ParameterType;
import io.pulumi.azurenative.authorization.inputs.ParameterDefinitionsValueMetadataArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The definition of a parameter that can be provided to the policy.
 * 
 */
public final class ParameterDefinitionsValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final ParameterDefinitionsValueArgs Empty = new ParameterDefinitionsValueArgs();

    /**
     * The allowed values for the parameter.
     * 
     */
    @Import(name="allowedValues")
      private final @Nullable Output<List<Object>> allowedValues;

    public Output<List<Object>> getAllowedValues() {
        return this.allowedValues == null ? Output.empty() : this.allowedValues;
    }

    /**
     * The default value for the parameter if no value is provided.
     * 
     */
    @Import(name="defaultValue")
      private final @Nullable Output<Object> defaultValue;

    public Output<Object> getDefaultValue() {
        return this.defaultValue == null ? Output.empty() : this.defaultValue;
    }

    /**
     * General metadata for the parameter.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ParameterDefinitionsValueMetadataArgs> metadata;

    public Output<ParameterDefinitionsValueMetadataArgs> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    /**
     * The data type of the parameter.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<Either<String,ParameterType>> type;

    public Output<Either<String,ParameterType>> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public ParameterDefinitionsValueArgs(
        @Nullable Output<List<Object>> allowedValues,
        @Nullable Output<Object> defaultValue,
        @Nullable Output<ParameterDefinitionsValueMetadataArgs> metadata,
        @Nullable Output<Either<String,ParameterType>> type) {
        this.allowedValues = allowedValues;
        this.defaultValue = defaultValue;
        this.metadata = metadata;
        this.type = type;
    }

    private ParameterDefinitionsValueArgs() {
        this.allowedValues = Output.empty();
        this.defaultValue = Output.empty();
        this.metadata = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterDefinitionsValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> allowedValues;
        private @Nullable Output<Object> defaultValue;
        private @Nullable Output<ParameterDefinitionsValueMetadataArgs> metadata;
        private @Nullable Output<Either<String,ParameterType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterDefinitionsValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedValues = defaults.allowedValues;
    	      this.defaultValue = defaults.defaultValue;
    	      this.metadata = defaults.metadata;
    	      this.type = defaults.type;
        }

        public Builder allowedValues(@Nullable Output<List<Object>> allowedValues) {
            this.allowedValues = allowedValues;
            return this;
        }

        public Builder allowedValues(@Nullable List<Object> allowedValues) {
            this.allowedValues = Output.ofNullable(allowedValues);
            return this;
        }

        public Builder defaultValue(@Nullable Output<Object> defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder defaultValue(@Nullable Object defaultValue) {
            this.defaultValue = Output.ofNullable(defaultValue);
            return this;
        }

        public Builder metadata(@Nullable Output<ParameterDefinitionsValueMetadataArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(@Nullable ParameterDefinitionsValueMetadataArgs metadata) {
            this.metadata = Output.ofNullable(metadata);
            return this;
        }

        public Builder type(@Nullable Output<Either<String,ParameterType>> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable Either<String,ParameterType> type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public ParameterDefinitionsValueArgs build() {
            return new ParameterDefinitionsValueArgs(allowedValues, defaultValue, metadata, type);
        }
    }
}
