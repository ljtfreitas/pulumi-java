// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.inputs;

import io.pulumi.azurenative.logz.inputs.MetricRulesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Definition of the properties for a TagRules resource.
 * 
 */
public final class MetricsTagRulesPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricsTagRulesPropertiesArgs Empty = new MetricsTagRulesPropertiesArgs();

    @InputImport(name="metricRules")
        private final @Nullable Input<List<MetricRulesArgs>> metricRules;

    public Input<List<MetricRulesArgs>> getMetricRules() {
        return this.metricRules == null ? Input.empty() : this.metricRules;
    }

    /**
     * Flag specifying if metrics from Azure resources should be sent for the Monitor resource.
     * 
     */
    @InputImport(name="sendMetrics")
        private final @Nullable Input<Boolean> sendMetrics;

    public Input<Boolean> getSendMetrics() {
        return this.sendMetrics == null ? Input.empty() : this.sendMetrics;
    }

    public MetricsTagRulesPropertiesArgs(
        @Nullable Input<List<MetricRulesArgs>> metricRules,
        @Nullable Input<Boolean> sendMetrics) {
        this.metricRules = metricRules;
        this.sendMetrics = sendMetrics;
    }

    private MetricsTagRulesPropertiesArgs() {
        this.metricRules = Input.empty();
        this.sendMetrics = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricsTagRulesPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<MetricRulesArgs>> metricRules;
        private @Nullable Input<Boolean> sendMetrics;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricsTagRulesPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricRules = defaults.metricRules;
    	      this.sendMetrics = defaults.sendMetrics;
        }

        public Builder setMetricRules(@Nullable Input<List<MetricRulesArgs>> metricRules) {
            this.metricRules = metricRules;
            return this;
        }

        public Builder setMetricRules(@Nullable List<MetricRulesArgs> metricRules) {
            this.metricRules = Input.ofNullable(metricRules);
            return this;
        }

        public Builder setSendMetrics(@Nullable Input<Boolean> sendMetrics) {
            this.sendMetrics = sendMetrics;
            return this;
        }

        public Builder setSendMetrics(@Nullable Boolean sendMetrics) {
            this.sendMetrics = Input.ofNullable(sendMetrics);
            return this;
        }
        public MetricsTagRulesPropertiesArgs build() {
            return new MetricsTagRulesPropertiesArgs(metricRules, sendMetrics);
        }
    }
}
