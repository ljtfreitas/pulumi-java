// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LaunchMetricDefinitionObject {
    /**
     * The JSON path to reference the entity id in the event.
     * 
     */
    private final String entityIdKey;
    /**
     * Event patterns have the same structure as the events they match. Rules use event patterns to select events. An event pattern either matches an event or it doesn't.
     * 
     */
    private final String eventPattern;
    private final String metricName;
    private final @Nullable String unitLabel;
    /**
     * The JSON path to reference the numerical metric value in the event.
     * 
     */
    private final String valueKey;

    @CustomType.Constructor
    private LaunchMetricDefinitionObject(
        @CustomType.Parameter("entityIdKey") String entityIdKey,
        @CustomType.Parameter("eventPattern") String eventPattern,
        @CustomType.Parameter("metricName") String metricName,
        @CustomType.Parameter("unitLabel") @Nullable String unitLabel,
        @CustomType.Parameter("valueKey") String valueKey) {
        this.entityIdKey = entityIdKey;
        this.eventPattern = eventPattern;
        this.metricName = metricName;
        this.unitLabel = unitLabel;
        this.valueKey = valueKey;
    }

    /**
     * The JSON path to reference the entity id in the event.
     * 
    */
    public String getEntityIdKey() {
        return this.entityIdKey;
    }
    /**
     * Event patterns have the same structure as the events they match. Rules use event patterns to select events. An event pattern either matches an event or it doesn't.
     * 
    */
    public String getEventPattern() {
        return this.eventPattern;
    }
    public String getMetricName() {
        return this.metricName;
    }
    public Optional<String> getUnitLabel() {
        return Optional.ofNullable(this.unitLabel);
    }
    /**
     * The JSON path to reference the numerical metric value in the event.
     * 
    */
    public String getValueKey() {
        return this.valueKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchMetricDefinitionObject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String entityIdKey;
        private String eventPattern;
        private String metricName;
        private @Nullable String unitLabel;
        private String valueKey;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchMetricDefinitionObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityIdKey = defaults.entityIdKey;
    	      this.eventPattern = defaults.eventPattern;
    	      this.metricName = defaults.metricName;
    	      this.unitLabel = defaults.unitLabel;
    	      this.valueKey = defaults.valueKey;
        }

        public Builder entityIdKey(String entityIdKey) {
            this.entityIdKey = Objects.requireNonNull(entityIdKey);
            return this;
        }

        public Builder eventPattern(String eventPattern) {
            this.eventPattern = Objects.requireNonNull(eventPattern);
            return this;
        }

        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder unitLabel(@Nullable String unitLabel) {
            this.unitLabel = unitLabel;
            return this;
        }

        public Builder valueKey(String valueKey) {
            this.valueKey = Objects.requireNonNull(valueKey);
            return this;
        }
        public LaunchMetricDefinitionObject build() {
            return new LaunchMetricDefinitionObject(entityIdKey, eventPattern, metricName, unitLabel, valueKey);
        }
    }
}
