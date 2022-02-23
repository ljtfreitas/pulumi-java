// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently.outputs;

import io.pulumi.awsnative.evidently.enums.ExperimentMetricGoalObjectDesiredChange;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ExperimentMetricGoalObject {
    private final ExperimentMetricGoalObjectDesiredChange desiredChange;
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

    @OutputCustomType.Constructor({"desiredChange","entityIdKey","eventPattern","metricName","unitLabel","valueKey"})
    private ExperimentMetricGoalObject(
        ExperimentMetricGoalObjectDesiredChange desiredChange,
        String entityIdKey,
        String eventPattern,
        String metricName,
        @Nullable String unitLabel,
        String valueKey) {
        this.desiredChange = Objects.requireNonNull(desiredChange);
        this.entityIdKey = Objects.requireNonNull(entityIdKey);
        this.eventPattern = Objects.requireNonNull(eventPattern);
        this.metricName = Objects.requireNonNull(metricName);
        this.unitLabel = unitLabel;
        this.valueKey = Objects.requireNonNull(valueKey);
    }

    public ExperimentMetricGoalObjectDesiredChange getDesiredChange() {
        return this.desiredChange;
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

    public static Builder builder(ExperimentMetricGoalObject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExperimentMetricGoalObjectDesiredChange desiredChange;
        private String entityIdKey;
        private String eventPattern;
        private String metricName;
        private @Nullable String unitLabel;
        private String valueKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ExperimentMetricGoalObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.desiredChange = defaults.desiredChange;
    	      this.entityIdKey = defaults.entityIdKey;
    	      this.eventPattern = defaults.eventPattern;
    	      this.metricName = defaults.metricName;
    	      this.unitLabel = defaults.unitLabel;
    	      this.valueKey = defaults.valueKey;
        }

        public Builder setDesiredChange(ExperimentMetricGoalObjectDesiredChange desiredChange) {
            this.desiredChange = Objects.requireNonNull(desiredChange);
            return this;
        }

        public Builder setEntityIdKey(String entityIdKey) {
            this.entityIdKey = Objects.requireNonNull(entityIdKey);
            return this;
        }

        public Builder setEventPattern(String eventPattern) {
            this.eventPattern = Objects.requireNonNull(eventPattern);
            return this;
        }

        public Builder setMetricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder setUnitLabel(@Nullable String unitLabel) {
            this.unitLabel = unitLabel;
            return this;
        }

        public Builder setValueKey(String valueKey) {
            this.valueKey = Objects.requireNonNull(valueKey);
            return this;
        }
        public ExperimentMetricGoalObject build() {
            return new ExperimentMetricGoalObject(desiredChange, entityIdKey, eventPattern, metricName, unitLabel, valueKey);
        }
    }
}
