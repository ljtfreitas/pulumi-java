// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionMonitorSuccessThresholdResponse {
    /**
     * The maximum percentage of failed checks permitted for a test to evaluate as successful.
     * 
     */
    private final @Nullable Integer checksFailedPercent;
    /**
     * The maximum round-trip time in milliseconds permitted for a test to evaluate as successful.
     * 
     */
    private final @Nullable Double roundTripTimeMs;

    @CustomType.Constructor
    private ConnectionMonitorSuccessThresholdResponse(
        @CustomType.Parameter("checksFailedPercent") @Nullable Integer checksFailedPercent,
        @CustomType.Parameter("roundTripTimeMs") @Nullable Double roundTripTimeMs) {
        this.checksFailedPercent = checksFailedPercent;
        this.roundTripTimeMs = roundTripTimeMs;
    }

    /**
     * The maximum percentage of failed checks permitted for a test to evaluate as successful.
     * 
    */
    public Optional<Integer> getChecksFailedPercent() {
        return Optional.ofNullable(this.checksFailedPercent);
    }
    /**
     * The maximum round-trip time in milliseconds permitted for a test to evaluate as successful.
     * 
    */
    public Optional<Double> getRoundTripTimeMs() {
        return Optional.ofNullable(this.roundTripTimeMs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorSuccessThresholdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer checksFailedPercent;
        private @Nullable Double roundTripTimeMs;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorSuccessThresholdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checksFailedPercent = defaults.checksFailedPercent;
    	      this.roundTripTimeMs = defaults.roundTripTimeMs;
        }

        public Builder checksFailedPercent(@Nullable Integer checksFailedPercent) {
            this.checksFailedPercent = checksFailedPercent;
            return this;
        }

        public Builder roundTripTimeMs(@Nullable Double roundTripTimeMs) {
            this.roundTripTimeMs = roundTripTimeMs;
            return this;
        }
        public ConnectionMonitorSuccessThresholdResponse build() {
            return new ConnectionMonitorSuccessThresholdResponse(checksFailedPercent, roundTripTimeMs);
        }
    }
}
