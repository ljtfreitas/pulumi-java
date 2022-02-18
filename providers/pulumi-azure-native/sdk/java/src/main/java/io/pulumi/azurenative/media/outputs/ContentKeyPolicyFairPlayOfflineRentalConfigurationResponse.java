// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.util.Objects;

@OutputCustomType
public final class ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse {
    /**
     * Playback duration
     * 
     */
    private final Double playbackDurationSeconds;
    /**
     * Storage duration
     * 
     */
    private final Double storageDurationSeconds;

    @OutputCustomType.Constructor({"playbackDurationSeconds","storageDurationSeconds"})
    private ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse(
        Double playbackDurationSeconds,
        Double storageDurationSeconds) {
        this.playbackDurationSeconds = Objects.requireNonNull(playbackDurationSeconds);
        this.storageDurationSeconds = Objects.requireNonNull(storageDurationSeconds);
    }

    /**
     * Playback duration
     * 
     */
    public Double getPlaybackDurationSeconds() {
        return this.playbackDurationSeconds;
    }
    /**
     * Storage duration
     * 
     */
    public Double getStorageDurationSeconds() {
        return this.storageDurationSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double playbackDurationSeconds;
        private Double storageDurationSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.playbackDurationSeconds = defaults.playbackDurationSeconds;
    	      this.storageDurationSeconds = defaults.storageDurationSeconds;
        }

        public Builder setPlaybackDurationSeconds(Double playbackDurationSeconds) {
            this.playbackDurationSeconds = Objects.requireNonNull(playbackDurationSeconds);
            return this;
        }

        public Builder setStorageDurationSeconds(Double storageDurationSeconds) {
            this.storageDurationSeconds = Objects.requireNonNull(storageDurationSeconds);
            return this;
        }

        public ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse build() {
            return new ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse(playbackDurationSeconds, storageDurationSeconds);
        }
    }
}
