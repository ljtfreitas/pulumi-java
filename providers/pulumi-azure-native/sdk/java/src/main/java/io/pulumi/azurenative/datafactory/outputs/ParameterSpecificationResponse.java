// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ParameterSpecificationResponse {
    /**
     * Default value of parameter.
     * 
     */
    private final @Nullable Object defaultValue;
    /**
     * Parameter type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"defaultValue","type"})
    private ParameterSpecificationResponse(
        @Nullable Object defaultValue,
        String type) {
        this.defaultValue = defaultValue;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Default value of parameter.
     * 
     */
    public Optional<Object> getDefaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }
    /**
     * Parameter type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterSpecificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object defaultValue;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterSpecificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.type = defaults.type;
        }

        public Builder setDefaultValue(@Nullable Object defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ParameterSpecificationResponse build() {
            return new ParameterSpecificationResponse(defaultValue, type);
        }
    }
}
