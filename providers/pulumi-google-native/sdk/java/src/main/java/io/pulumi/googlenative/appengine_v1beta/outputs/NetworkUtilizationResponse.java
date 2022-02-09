// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class NetworkUtilizationResponse {
    private final Integer targetReceivedBytesPerSecond;
    private final Integer targetReceivedPacketsPerSecond;
    private final Integer targetSentBytesPerSecond;
    private final Integer targetSentPacketsPerSecond;

    @OutputCustomType.Constructor({"targetReceivedBytesPerSecond","targetReceivedPacketsPerSecond","targetSentBytesPerSecond","targetSentPacketsPerSecond"})
    private NetworkUtilizationResponse(
        Integer targetReceivedBytesPerSecond,
        Integer targetReceivedPacketsPerSecond,
        Integer targetSentBytesPerSecond,
        Integer targetSentPacketsPerSecond) {
        this.targetReceivedBytesPerSecond = Objects.requireNonNull(targetReceivedBytesPerSecond);
        this.targetReceivedPacketsPerSecond = Objects.requireNonNull(targetReceivedPacketsPerSecond);
        this.targetSentBytesPerSecond = Objects.requireNonNull(targetSentBytesPerSecond);
        this.targetSentPacketsPerSecond = Objects.requireNonNull(targetSentPacketsPerSecond);
    }

    public Integer getTargetReceivedBytesPerSecond() {
        return this.targetReceivedBytesPerSecond;
    }
    public Integer getTargetReceivedPacketsPerSecond() {
        return this.targetReceivedPacketsPerSecond;
    }
    public Integer getTargetSentBytesPerSecond() {
        return this.targetSentBytesPerSecond;
    }
    public Integer getTargetSentPacketsPerSecond() {
        return this.targetSentPacketsPerSecond;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkUtilizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer targetReceivedBytesPerSecond;
        private Integer targetReceivedPacketsPerSecond;
        private Integer targetSentBytesPerSecond;
        private Integer targetSentPacketsPerSecond;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkUtilizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetReceivedBytesPerSecond = defaults.targetReceivedBytesPerSecond;
    	      this.targetReceivedPacketsPerSecond = defaults.targetReceivedPacketsPerSecond;
    	      this.targetSentBytesPerSecond = defaults.targetSentBytesPerSecond;
    	      this.targetSentPacketsPerSecond = defaults.targetSentPacketsPerSecond;
        }

        public Builder setTargetReceivedBytesPerSecond(Integer targetReceivedBytesPerSecond) {
            this.targetReceivedBytesPerSecond = Objects.requireNonNull(targetReceivedBytesPerSecond);
            return this;
        }

        public Builder setTargetReceivedPacketsPerSecond(Integer targetReceivedPacketsPerSecond) {
            this.targetReceivedPacketsPerSecond = Objects.requireNonNull(targetReceivedPacketsPerSecond);
            return this;
        }

        public Builder setTargetSentBytesPerSecond(Integer targetSentBytesPerSecond) {
            this.targetSentBytesPerSecond = Objects.requireNonNull(targetSentBytesPerSecond);
            return this;
        }

        public Builder setTargetSentPacketsPerSecond(Integer targetSentPacketsPerSecond) {
            this.targetSentPacketsPerSecond = Objects.requireNonNull(targetSentPacketsPerSecond);
            return this;
        }

        public NetworkUtilizationResponse build() {
            return new NetworkUtilizationResponse(targetReceivedBytesPerSecond, targetReceivedPacketsPerSecond, targetSentBytesPerSecond, targetSentPacketsPerSecond);
        }
    }
}