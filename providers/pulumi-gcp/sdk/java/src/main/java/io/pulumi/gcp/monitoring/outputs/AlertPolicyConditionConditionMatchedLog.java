// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class AlertPolicyConditionConditionMatchedLog {
    /**
     * A logs-based filter.
     * 
     */
    private final String filter;
    /**
     * A map from a label key to an extractor expression, which is used to
     * extract the value for this label key. Each entry in this map is
     * a specification for how data should be extracted from log entries that
     * match filter. Each combination of extracted values is treated as
     * a separate rule for the purposes of triggering notifications.
     * Label keys and corresponding values can be used in notifications
     * generated by this condition.
     * 
     */
    private final @Nullable Map<String,String> labelExtractors;

    @OutputCustomType.Constructor({"filter","labelExtractors"})
    private AlertPolicyConditionConditionMatchedLog(
        String filter,
        @Nullable Map<String,String> labelExtractors) {
        this.filter = Objects.requireNonNull(filter);
        this.labelExtractors = labelExtractors;
    }

    /**
     * A logs-based filter.
     * 
     */
    public String getFilter() {
        return this.filter;
    }
    /**
     * A map from a label key to an extractor expression, which is used to
     * extract the value for this label key. Each entry in this map is
     * a specification for how data should be extracted from log entries that
     * match filter. Each combination of extracted values is treated as
     * a separate rule for the purposes of triggering notifications.
     * Label keys and corresponding values can be used in notifications
     * generated by this condition.
     * 
     */
    public Map<String,String> getLabelExtractors() {
        return this.labelExtractors == null ? Map.of() : this.labelExtractors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyConditionConditionMatchedLog defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String filter;
        private @Nullable Map<String,String> labelExtractors;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertPolicyConditionConditionMatchedLog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.labelExtractors = defaults.labelExtractors;
        }

        public Builder setFilter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setLabelExtractors(@Nullable Map<String,String> labelExtractors) {
            this.labelExtractors = labelExtractors;
            return this;
        }
        public AlertPolicyConditionConditionMatchedLog build() {
            return new AlertPolicyConditionConditionMatchedLog(filter, labelExtractors);
        }
    }
}
