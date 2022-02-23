// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationInsightsComponentDataVolumeCapResponse {
    /**
     * Daily data volume cap in GB.
     * 
     */
    private final @Nullable Double cap;
    /**
     * Maximum daily data volume cap that the user can set for this component.
     * 
     */
    private final Double maxHistoryCap;
    /**
     * Daily data volume cap UTC reset hour.
     * 
     */
    private final Integer resetTime;
    /**
     * Do not send a notification email when the daily data volume cap is met.
     * 
     */
    private final @Nullable Boolean stopSendNotificationWhenHitCap;
    /**
     * Reserved, not used for now.
     * 
     */
    private final @Nullable Boolean stopSendNotificationWhenHitThreshold;
    /**
     * Reserved, not used for now.
     * 
     */
    private final @Nullable Integer warningThreshold;

    @OutputCustomType.Constructor({"cap","maxHistoryCap","resetTime","stopSendNotificationWhenHitCap","stopSendNotificationWhenHitThreshold","warningThreshold"})
    private ApplicationInsightsComponentDataVolumeCapResponse(
        @Nullable Double cap,
        Double maxHistoryCap,
        Integer resetTime,
        @Nullable Boolean stopSendNotificationWhenHitCap,
        @Nullable Boolean stopSendNotificationWhenHitThreshold,
        @Nullable Integer warningThreshold) {
        this.cap = cap;
        this.maxHistoryCap = Objects.requireNonNull(maxHistoryCap);
        this.resetTime = Objects.requireNonNull(resetTime);
        this.stopSendNotificationWhenHitCap = stopSendNotificationWhenHitCap;
        this.stopSendNotificationWhenHitThreshold = stopSendNotificationWhenHitThreshold;
        this.warningThreshold = warningThreshold;
    }

    /**
     * Daily data volume cap in GB.
     * 
     */
    public Optional<Double> getCap() {
        return Optional.ofNullable(this.cap);
    }
    /**
     * Maximum daily data volume cap that the user can set for this component.
     * 
     */
    public Double getMaxHistoryCap() {
        return this.maxHistoryCap;
    }
    /**
     * Daily data volume cap UTC reset hour.
     * 
     */
    public Integer getResetTime() {
        return this.resetTime;
    }
    /**
     * Do not send a notification email when the daily data volume cap is met.
     * 
     */
    public Optional<Boolean> getStopSendNotificationWhenHitCap() {
        return Optional.ofNullable(this.stopSendNotificationWhenHitCap);
    }
    /**
     * Reserved, not used for now.
     * 
     */
    public Optional<Boolean> getStopSendNotificationWhenHitThreshold() {
        return Optional.ofNullable(this.stopSendNotificationWhenHitThreshold);
    }
    /**
     * Reserved, not used for now.
     * 
     */
    public Optional<Integer> getWarningThreshold() {
        return Optional.ofNullable(this.warningThreshold);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationInsightsComponentDataVolumeCapResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double cap;
        private Double maxHistoryCap;
        private Integer resetTime;
        private @Nullable Boolean stopSendNotificationWhenHitCap;
        private @Nullable Boolean stopSendNotificationWhenHitThreshold;
        private @Nullable Integer warningThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationInsightsComponentDataVolumeCapResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cap = defaults.cap;
    	      this.maxHistoryCap = defaults.maxHistoryCap;
    	      this.resetTime = defaults.resetTime;
    	      this.stopSendNotificationWhenHitCap = defaults.stopSendNotificationWhenHitCap;
    	      this.stopSendNotificationWhenHitThreshold = defaults.stopSendNotificationWhenHitThreshold;
    	      this.warningThreshold = defaults.warningThreshold;
        }

        public Builder setCap(@Nullable Double cap) {
            this.cap = cap;
            return this;
        }

        public Builder setMaxHistoryCap(Double maxHistoryCap) {
            this.maxHistoryCap = Objects.requireNonNull(maxHistoryCap);
            return this;
        }

        public Builder setResetTime(Integer resetTime) {
            this.resetTime = Objects.requireNonNull(resetTime);
            return this;
        }

        public Builder setStopSendNotificationWhenHitCap(@Nullable Boolean stopSendNotificationWhenHitCap) {
            this.stopSendNotificationWhenHitCap = stopSendNotificationWhenHitCap;
            return this;
        }

        public Builder setStopSendNotificationWhenHitThreshold(@Nullable Boolean stopSendNotificationWhenHitThreshold) {
            this.stopSendNotificationWhenHitThreshold = stopSendNotificationWhenHitThreshold;
            return this;
        }

        public Builder setWarningThreshold(@Nullable Integer warningThreshold) {
            this.warningThreshold = warningThreshold;
            return this;
        }
        public ApplicationInsightsComponentDataVolumeCapResponse build() {
            return new ApplicationInsightsComponentDataVolumeCapResponse(cap, maxHistoryCap, resetTime, stopSendNotificationWhenHitCap, stopSendNotificationWhenHitThreshold, warningThreshold);
        }
    }
}
