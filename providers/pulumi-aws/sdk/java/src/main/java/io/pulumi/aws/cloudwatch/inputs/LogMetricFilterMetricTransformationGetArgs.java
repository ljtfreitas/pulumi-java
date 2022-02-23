// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LogMetricFilterMetricTransformationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogMetricFilterMetricTransformationGetArgs Empty = new LogMetricFilterMetricTransformationGetArgs();

    /**
     * The value to emit when a filter pattern does not match a log event. Conflicts with `dimensions`.
     * 
     */
    @InputImport(name="defaultValue")
    private final @Nullable Input<String> defaultValue;

    public Input<String> getDefaultValue() {
        return this.defaultValue == null ? Input.empty() : this.defaultValue;
    }

    /**
     * Map of fields to use as dimensions for the metric. Up to 3 dimensions are allowed. Conflicts with `default_value`.
     * 
     */
    @InputImport(name="dimensions")
    private final @Nullable Input<Map<String,String>> dimensions;

    public Input<Map<String,String>> getDimensions() {
        return this.dimensions == null ? Input.empty() : this.dimensions;
    }

    /**
     * The name of the CloudWatch metric to which the monitored log information should be published (e.g., `ErrorCount`)
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The destination namespace of the CloudWatch metric.
     * 
     */
    @InputImport(name="namespace", required=true)
    private final Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace;
    }

    /**
     * The unit to assign to the metric. If you omit this, the unit is set as `None`.
     * 
     */
    @InputImport(name="unit")
    private final @Nullable Input<String> unit;

    public Input<String> getUnit() {
        return this.unit == null ? Input.empty() : this.unit;
    }

    /**
     * What to publish to the metric. For example, if you're counting the occurrences of a particular term like "Error", the value will be "1" for each occurrence. If you're counting the bytes transferred the published value will be the value in the log event.
     * 
     */
    @InputImport(name="value", required=true)
    private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public LogMetricFilterMetricTransformationGetArgs(
        @Nullable Input<String> defaultValue,
        @Nullable Input<Map<String,String>> dimensions,
        Input<String> name,
        Input<String> namespace,
        @Nullable Input<String> unit,
        Input<String> value) {
        this.defaultValue = defaultValue;
        this.dimensions = dimensions;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
        this.unit = unit;
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private LogMetricFilterMetricTransformationGetArgs() {
        this.defaultValue = Input.empty();
        this.dimensions = Input.empty();
        this.name = Input.empty();
        this.namespace = Input.empty();
        this.unit = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogMetricFilterMetricTransformationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> defaultValue;
        private @Nullable Input<Map<String,String>> dimensions;
        private Input<String> name;
        private Input<String> namespace;
        private @Nullable Input<String> unit;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(LogMetricFilterMetricTransformationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.dimensions = defaults.dimensions;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        public Builder setDefaultValue(@Nullable Input<String> defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder setDefaultValue(@Nullable String defaultValue) {
            this.defaultValue = Input.ofNullable(defaultValue);
            return this;
        }

        public Builder setDimensions(@Nullable Input<Map<String,String>> dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder setDimensions(@Nullable Map<String,String> dimensions) {
            this.dimensions = Input.ofNullable(dimensions);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setNamespace(Input<String> namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = Input.of(Objects.requireNonNull(namespace));
            return this;
        }

        public Builder setUnit(@Nullable Input<String> unit) {
            this.unit = unit;
            return this;
        }

        public Builder setUnit(@Nullable String unit) {
            this.unit = Input.ofNullable(unit);
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public LogMetricFilterMetricTransformationGetArgs build() {
            return new LogMetricFilterMetricTransformationGetArgs(defaultValue, dimensions, name, namespace, unit, value);
        }
    }
}
