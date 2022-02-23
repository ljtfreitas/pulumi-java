// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;


public final class ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs Empty = new ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs();

    /**
     * Playback duration
     * 
     */
    @InputImport(name="playbackDurationSeconds", required=true)
        private final Input<Double> playbackDurationSeconds;

    public Input<Double> getPlaybackDurationSeconds() {
        return this.playbackDurationSeconds;
    }

    /**
     * Storage duration
     * 
     */
    @InputImport(name="storageDurationSeconds", required=true)
        private final Input<Double> storageDurationSeconds;

    public Input<Double> getStorageDurationSeconds() {
        return this.storageDurationSeconds;
    }

    public ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs(
        Input<Double> playbackDurationSeconds,
        Input<Double> storageDurationSeconds) {
        this.playbackDurationSeconds = Objects.requireNonNull(playbackDurationSeconds, "expected parameter 'playbackDurationSeconds' to be non-null");
        this.storageDurationSeconds = Objects.requireNonNull(storageDurationSeconds, "expected parameter 'storageDurationSeconds' to be non-null");
    }

    private ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs() {
        this.playbackDurationSeconds = Input.empty();
        this.storageDurationSeconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Double> playbackDurationSeconds;
        private Input<Double> storageDurationSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.playbackDurationSeconds = defaults.playbackDurationSeconds;
    	      this.storageDurationSeconds = defaults.storageDurationSeconds;
        }

        public Builder setPlaybackDurationSeconds(Input<Double> playbackDurationSeconds) {
            this.playbackDurationSeconds = Objects.requireNonNull(playbackDurationSeconds);
            return this;
        }

        public Builder setPlaybackDurationSeconds(Double playbackDurationSeconds) {
            this.playbackDurationSeconds = Input.of(Objects.requireNonNull(playbackDurationSeconds));
            return this;
        }

        public Builder setStorageDurationSeconds(Input<Double> storageDurationSeconds) {
            this.storageDurationSeconds = Objects.requireNonNull(storageDurationSeconds);
            return this;
        }

        public Builder setStorageDurationSeconds(Double storageDurationSeconds) {
            this.storageDurationSeconds = Input.of(Objects.requireNonNull(storageDurationSeconds));
            return this;
        }
        public ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs build() {
            return new ContentKeyPolicyFairPlayOfflineRentalConfigurationArgs(playbackDurationSeconds, storageDurationSeconds);
        }
    }
}
