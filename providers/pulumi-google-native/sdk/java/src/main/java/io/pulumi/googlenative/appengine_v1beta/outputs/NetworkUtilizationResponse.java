// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class NetworkUtilizationResponse {
    /**
     * Target bytes received per second.
     * 
     */
    private final Integer targetReceivedBytesPerSecond;
    /**
     * Target packets received per second.
     * 
     */
    private final Integer targetReceivedPacketsPerSecond;
    /**
     * Target bytes sent per second.
     * 
     */
    private final Integer targetSentBytesPerSecond;
    /**
     * Target packets sent per second.
     * 
     */
    private final Integer targetSentPacketsPerSecond;

    @CustomType.Constructor
    private NetworkUtilizationResponse(
        @CustomType.Parameter("targetReceivedBytesPerSecond") Integer targetReceivedBytesPerSecond,
        @CustomType.Parameter("targetReceivedPacketsPerSecond") Integer targetReceivedPacketsPerSecond,
        @CustomType.Parameter("targetSentBytesPerSecond") Integer targetSentBytesPerSecond,
        @CustomType.Parameter("targetSentPacketsPerSecond") Integer targetSentPacketsPerSecond) {
        this.targetReceivedBytesPerSecond = targetReceivedBytesPerSecond;
        this.targetReceivedPacketsPerSecond = targetReceivedPacketsPerSecond;
        this.targetSentBytesPerSecond = targetSentBytesPerSecond;
        this.targetSentPacketsPerSecond = targetSentPacketsPerSecond;
    }

    /**
     * Target bytes received per second.
     * 
    */
    public Integer getTargetReceivedBytesPerSecond() {
        return this.targetReceivedBytesPerSecond;
    }
    /**
     * Target packets received per second.
     * 
    */
    public Integer getTargetReceivedPacketsPerSecond() {
        return this.targetReceivedPacketsPerSecond;
    }
    /**
     * Target bytes sent per second.
     * 
    */
    public Integer getTargetSentBytesPerSecond() {
        return this.targetSentBytesPerSecond;
    }
    /**
     * Target packets sent per second.
     * 
    */
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

        public Builder targetReceivedBytesPerSecond(Integer targetReceivedBytesPerSecond) {
            this.targetReceivedBytesPerSecond = Objects.requireNonNull(targetReceivedBytesPerSecond);
            return this;
        }

        public Builder targetReceivedPacketsPerSecond(Integer targetReceivedPacketsPerSecond) {
            this.targetReceivedPacketsPerSecond = Objects.requireNonNull(targetReceivedPacketsPerSecond);
            return this;
        }

        public Builder targetSentBytesPerSecond(Integer targetSentBytesPerSecond) {
            this.targetSentBytesPerSecond = Objects.requireNonNull(targetSentBytesPerSecond);
            return this;
        }

        public Builder targetSentPacketsPerSecond(Integer targetSentPacketsPerSecond) {
            this.targetSentPacketsPerSecond = Objects.requireNonNull(targetSentPacketsPerSecond);
            return this;
        }
        public NetworkUtilizationResponse build() {
            return new NetworkUtilizationResponse(targetReceivedBytesPerSecond, targetReceivedPacketsPerSecond, targetSentBytesPerSecond, targetSentPacketsPerSecond);
        }
    }
}
