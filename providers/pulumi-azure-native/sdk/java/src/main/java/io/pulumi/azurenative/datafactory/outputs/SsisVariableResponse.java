// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SsisVariableResponse {
    /**
     * Variable type.
     * 
     */
    private final @Nullable String dataType;
    /**
     * Variable description.
     * 
     */
    private final @Nullable String description;
    /**
     * Variable id.
     * 
     */
    private final @Nullable Double id;
    /**
     * Variable name.
     * 
     */
    private final @Nullable String name;
    /**
     * Whether variable is sensitive.
     * 
     */
    private final @Nullable Boolean sensitive;
    /**
     * Variable sensitive value.
     * 
     */
    private final @Nullable String sensitiveValue;
    /**
     * Variable value.
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor({"dataType","description","id","name","sensitive","sensitiveValue","value"})
    private SsisVariableResponse(
        @Nullable String dataType,
        @Nullable String description,
        @Nullable Double id,
        @Nullable String name,
        @Nullable Boolean sensitive,
        @Nullable String sensitiveValue,
        @Nullable String value) {
        this.dataType = dataType;
        this.description = description;
        this.id = id;
        this.name = name;
        this.sensitive = sensitive;
        this.sensitiveValue = sensitiveValue;
        this.value = value;
    }

    /**
     * Variable type.
     * 
     */
    public Optional<String> getDataType() {
        return Optional.ofNullable(this.dataType);
    }
    /**
     * Variable description.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Variable id.
     * 
     */
    public Optional<Double> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Variable name.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Whether variable is sensitive.
     * 
     */
    public Optional<Boolean> getSensitive() {
        return Optional.ofNullable(this.sensitive);
    }
    /**
     * Variable sensitive value.
     * 
     */
    public Optional<String> getSensitiveValue() {
        return Optional.ofNullable(this.sensitiveValue);
    }
    /**
     * Variable value.
     * 
     */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SsisVariableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dataType;
        private @Nullable String description;
        private @Nullable Double id;
        private @Nullable String name;
        private @Nullable Boolean sensitive;
        private @Nullable String sensitiveValue;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(SsisVariableResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataType = defaults.dataType;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.sensitive = defaults.sensitive;
    	      this.sensitiveValue = defaults.sensitiveValue;
    	      this.value = defaults.value;
        }

        public Builder setDataType(@Nullable String dataType) {
            this.dataType = dataType;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setId(@Nullable Double id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setSensitive(@Nullable Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }

        public Builder setSensitiveValue(@Nullable String sensitiveValue) {
            this.sensitiveValue = sensitiveValue;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }

        public SsisVariableResponse build() {
            return new SsisVariableResponse(dataType, description, id, name, sensitive, sensitiveValue, value);
        }
    }
}
