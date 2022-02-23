// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MetricDescriptorLabelGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricDescriptorLabelGetArgs Empty = new MetricDescriptorLabelGetArgs();

    /**
     * A human-readable description for the label.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The key for this label. The key must not exceed 100 characters. The first character of the key must be an upper- or lower-case letter, the remaining characters must be letters, digits or underscores, and the key must match the regular expression [a-zA-Z][a-zA-Z0-9_]*
     * 
     */
    @InputImport(name="key", required=true)
        private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    /**
     * The type of data that can be assigned to the label.
     * Default value is `STRING`.
     * Possible values are `STRING`, `BOOL`, and `INT64`.
     * 
     */
    @InputImport(name="valueType")
        private final @Nullable Input<String> valueType;

    public Input<String> getValueType() {
        return this.valueType == null ? Input.empty() : this.valueType;
    }

    public MetricDescriptorLabelGetArgs(
        @Nullable Input<String> description,
        Input<String> key,
        @Nullable Input<String> valueType) {
        this.description = description;
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.valueType = valueType;
    }

    private MetricDescriptorLabelGetArgs() {
        this.description = Input.empty();
        this.key = Input.empty();
        this.valueType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricDescriptorLabelGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> key;
        private @Nullable Input<String> valueType;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricDescriptorLabelGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.key = defaults.key;
    	      this.valueType = defaults.valueType;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setKey(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder setValueType(@Nullable Input<String> valueType) {
            this.valueType = valueType;
            return this;
        }

        public Builder setValueType(@Nullable String valueType) {
            this.valueType = Input.ofNullable(valueType);
            return this;
        }
        public MetricDescriptorLabelGetArgs build() {
            return new MetricDescriptorLabelGetArgs(description, key, valueType);
        }
    }
}
