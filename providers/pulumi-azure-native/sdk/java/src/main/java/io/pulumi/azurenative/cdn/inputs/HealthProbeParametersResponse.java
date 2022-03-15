// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The JSON object that contains the properties to send health probes to origin.
 * 
 */
public final class HealthProbeParametersResponse extends io.pulumi.resources.InvokeArgs {

    public static final HealthProbeParametersResponse Empty = new HealthProbeParametersResponse();

    /**
     * The number of seconds between health probes.Default is 240sec.
     * 
     */
    @Import(name="probeIntervalInSeconds")
      private final @Nullable Integer probeIntervalInSeconds;

    public Optional<Integer> getProbeIntervalInSeconds() {
        return this.probeIntervalInSeconds == null ? Optional.empty() : Optional.ofNullable(this.probeIntervalInSeconds);
    }

    /**
     * The path relative to the origin that is used to determine the health of the origin.
     * 
     */
    @Import(name="probePath")
      private final @Nullable String probePath;

    public Optional<String> getProbePath() {
        return this.probePath == null ? Optional.empty() : Optional.ofNullable(this.probePath);
    }

    /**
     * Protocol to use for health probe.
     * 
     */
    @Import(name="probeProtocol")
      private final @Nullable String probeProtocol;

    public Optional<String> getProbeProtocol() {
        return this.probeProtocol == null ? Optional.empty() : Optional.ofNullable(this.probeProtocol);
    }

    /**
     * The type of health probe request that is made.
     * 
     */
    @Import(name="probeRequestType")
      private final @Nullable String probeRequestType;

    public Optional<String> getProbeRequestType() {
        return this.probeRequestType == null ? Optional.empty() : Optional.ofNullable(this.probeRequestType);
    }

    public HealthProbeParametersResponse(
        @Nullable Integer probeIntervalInSeconds,
        @Nullable String probePath,
        @Nullable String probeProtocol,
        @Nullable String probeRequestType) {
        this.probeIntervalInSeconds = probeIntervalInSeconds;
        this.probePath = probePath;
        this.probeProtocol = probeProtocol;
        this.probeRequestType = probeRequestType;
    }

    private HealthProbeParametersResponse() {
        this.probeIntervalInSeconds = null;
        this.probePath = null;
        this.probeProtocol = null;
        this.probeRequestType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthProbeParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer probeIntervalInSeconds;
        private @Nullable String probePath;
        private @Nullable String probeProtocol;
        private @Nullable String probeRequestType;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthProbeParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.probeIntervalInSeconds = defaults.probeIntervalInSeconds;
    	      this.probePath = defaults.probePath;
    	      this.probeProtocol = defaults.probeProtocol;
    	      this.probeRequestType = defaults.probeRequestType;
        }

        public Builder probeIntervalInSeconds(@Nullable Integer probeIntervalInSeconds) {
            this.probeIntervalInSeconds = probeIntervalInSeconds;
            return this;
        }

        public Builder probePath(@Nullable String probePath) {
            this.probePath = probePath;
            return this;
        }

        public Builder probeProtocol(@Nullable String probeProtocol) {
            this.probeProtocol = probeProtocol;
            return this;
        }

        public Builder probeRequestType(@Nullable String probeRequestType) {
            this.probeRequestType = probeRequestType;
            return this;
        }
        public HealthProbeParametersResponse build() {
            return new HealthProbeParametersResponse(probeIntervalInSeconds, probePath, probeProtocol, probeRequestType);
        }
    }
}
