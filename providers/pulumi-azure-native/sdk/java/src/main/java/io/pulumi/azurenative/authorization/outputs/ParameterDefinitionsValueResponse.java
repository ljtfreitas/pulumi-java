// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.outputs;

import io.pulumi.azurenative.authorization.outputs.ParameterDefinitionsValueResponseMetadata;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ParameterDefinitionsValueResponse {
    /**
     * The allowed values for the parameter.
     * 
     */
    private final @Nullable List<Object> allowedValues;
    /**
     * The default value for the parameter if no value is provided.
     * 
     */
    private final @Nullable Object defaultValue;
    /**
     * General metadata for the parameter.
     * 
     */
    private final @Nullable ParameterDefinitionsValueResponseMetadata metadata;
    /**
     * The data type of the parameter.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private ParameterDefinitionsValueResponse(
        @CustomType.Parameter("allowedValues") @Nullable List<Object> allowedValues,
        @CustomType.Parameter("defaultValue") @Nullable Object defaultValue,
        @CustomType.Parameter("metadata") @Nullable ParameterDefinitionsValueResponseMetadata metadata,
        @CustomType.Parameter("type") @Nullable String type) {
        this.allowedValues = allowedValues;
        this.defaultValue = defaultValue;
        this.metadata = metadata;
        this.type = type;
    }

    /**
     * The allowed values for the parameter.
     * 
    */
    public List<Object> getAllowedValues() {
        return this.allowedValues == null ? List.of() : this.allowedValues;
    }
    /**
     * The default value for the parameter if no value is provided.
     * 
    */
    public Optional<Object> getDefaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }
    /**
     * General metadata for the parameter.
     * 
    */
    public Optional<ParameterDefinitionsValueResponseMetadata> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * The data type of the parameter.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterDefinitionsValueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> allowedValues;
        private @Nullable Object defaultValue;
        private @Nullable ParameterDefinitionsValueResponseMetadata metadata;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterDefinitionsValueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedValues = defaults.allowedValues;
    	      this.defaultValue = defaults.defaultValue;
    	      this.metadata = defaults.metadata;
    	      this.type = defaults.type;
        }

        public Builder allowedValues(@Nullable List<Object> allowedValues) {
            this.allowedValues = allowedValues;
            return this;
        }

        public Builder defaultValue(@Nullable Object defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder metadata(@Nullable ParameterDefinitionsValueResponseMetadata metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public ParameterDefinitionsValueResponse build() {
            return new ParameterDefinitionsValueResponse(allowedValues, defaultValue, metadata, type);
        }
    }
}
