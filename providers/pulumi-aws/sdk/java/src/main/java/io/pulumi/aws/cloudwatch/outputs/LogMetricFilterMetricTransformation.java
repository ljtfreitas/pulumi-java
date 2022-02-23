// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LogMetricFilterMetricTransformation {
    /**
     * The value to emit when a filter pattern does not match a log event. Conflicts with `dimensions`.
     * 
     */
    private final @Nullable String defaultValue;
    /**
     * Map of fields to use as dimensions for the metric. Up to 3 dimensions are allowed. Conflicts with `default_value`.
     * 
     */
    private final @Nullable Map<String,String> dimensions;
    /**
     * The name of the CloudWatch metric to which the monitored log information should be published (e.g., `ErrorCount`)
     * 
     */
    private final String name;
    /**
     * The destination namespace of the CloudWatch metric.
     * 
     */
    private final String namespace;
    /**
     * The unit to assign to the metric. If you omit this, the unit is set as `None`.
     * 
     */
    private final @Nullable String unit;
    /**
     * What to publish to the metric. For example, if you're counting the occurrences of a particular term like "Error", the value will be "1" for each occurrence. If you're counting the bytes transferred the published value will be the value in the log event.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"defaultValue","dimensions","name","namespace","unit","value"})
    private LogMetricFilterMetricTransformation(
        @Nullable String defaultValue,
        @Nullable Map<String,String> dimensions,
        String name,
        String namespace,
        @Nullable String unit,
        String value) {
        this.defaultValue = defaultValue;
        this.dimensions = dimensions;
        this.name = Objects.requireNonNull(name);
        this.namespace = Objects.requireNonNull(namespace);
        this.unit = unit;
        this.value = Objects.requireNonNull(value);
    }

    /**
     * The value to emit when a filter pattern does not match a log event. Conflicts with `dimensions`.
     * 
     */
    public Optional<String> getDefaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }
    /**
     * Map of fields to use as dimensions for the metric. Up to 3 dimensions are allowed. Conflicts with `default_value`.
     * 
     */
    public Map<String,String> getDimensions() {
        return this.dimensions == null ? Map.of() : this.dimensions;
    }
    /**
     * The name of the CloudWatch metric to which the monitored log information should be published (e.g., `ErrorCount`)
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The destination namespace of the CloudWatch metric.
     * 
     */
    public String getNamespace() {
        return this.namespace;
    }
    /**
     * The unit to assign to the metric. If you omit this, the unit is set as `None`.
     * 
     */
    public Optional<String> getUnit() {
        return Optional.ofNullable(this.unit);
    }
    /**
     * What to publish to the metric. For example, if you're counting the occurrences of a particular term like "Error", the value will be "1" for each occurrence. If you're counting the bytes transferred the published value will be the value in the log event.
     * 
     */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogMetricFilterMetricTransformation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String defaultValue;
        private @Nullable Map<String,String> dimensions;
        private String name;
        private String namespace;
        private @Nullable String unit;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(LogMetricFilterMetricTransformation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.dimensions = defaults.dimensions;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        public Builder setDefaultValue(@Nullable String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder setDimensions(@Nullable Map<String,String> dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public Builder setUnit(@Nullable String unit) {
            this.unit = unit;
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public LogMetricFilterMetricTransformation build() {
            return new LogMetricFilterMetricTransformation(defaultValue, dimensions, name, namespace, unit, value);
        }
    }
}
