// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DiagnosticSettingMetricRetentionPolicy {
    /**
     * @return The number of days for which this Retention Policy should apply.
     * 
     */
    private final @Nullable Integer days;
    /**
     * @return Is this Retention Policy enabled?
     * 
     */
    private final Boolean enabled;

    @CustomType.Constructor
    private DiagnosticSettingMetricRetentionPolicy(
        @CustomType.Parameter("days") @Nullable Integer days,
        @CustomType.Parameter("enabled") Boolean enabled) {
        this.days = days;
        this.enabled = enabled;
    }

    /**
     * @return The number of days for which this Retention Policy should apply.
     * 
     */
    public Optional<Integer> days() {
        return Optional.ofNullable(this.days);
    }
    /**
     * @return Is this Retention Policy enabled?
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticSettingMetricRetentionPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer days;
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(DiagnosticSettingMetricRetentionPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.enabled = defaults.enabled;
        }

        public Builder days(@Nullable Integer days) {
            this.days = days;
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }        public DiagnosticSettingMetricRetentionPolicy build() {
            return new DiagnosticSettingMetricRetentionPolicy(days, enabled);
        }
    }
}
