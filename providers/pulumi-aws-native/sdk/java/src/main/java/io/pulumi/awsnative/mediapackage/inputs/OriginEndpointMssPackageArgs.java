// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointMssEncryptionArgs;
import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointStreamSelectionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Microsoft Smooth Streaming (MSS) packaging configuration.
 * 
 */
public final class OriginEndpointMssPackageArgs extends io.pulumi.resources.ResourceArgs {

    public static final OriginEndpointMssPackageArgs Empty = new OriginEndpointMssPackageArgs();

    @Import(name="encryption")
      private final @Nullable Output<OriginEndpointMssEncryptionArgs> encryption;

    public Output<OriginEndpointMssEncryptionArgs> getEncryption() {
        return this.encryption == null ? Output.empty() : this.encryption;
    }

    /**
     * The time window (in seconds) contained in each manifest.
     * 
     */
    @Import(name="manifestWindowSeconds")
      private final @Nullable Output<Integer> manifestWindowSeconds;

    public Output<Integer> getManifestWindowSeconds() {
        return this.manifestWindowSeconds == null ? Output.empty() : this.manifestWindowSeconds;
    }

    /**
     * The duration (in seconds) of each segment.
     * 
     */
    @Import(name="segmentDurationSeconds")
      private final @Nullable Output<Integer> segmentDurationSeconds;

    public Output<Integer> getSegmentDurationSeconds() {
        return this.segmentDurationSeconds == null ? Output.empty() : this.segmentDurationSeconds;
    }

    @Import(name="streamSelection")
      private final @Nullable Output<OriginEndpointStreamSelectionArgs> streamSelection;

    public Output<OriginEndpointStreamSelectionArgs> getStreamSelection() {
        return this.streamSelection == null ? Output.empty() : this.streamSelection;
    }

    public OriginEndpointMssPackageArgs(
        @Nullable Output<OriginEndpointMssEncryptionArgs> encryption,
        @Nullable Output<Integer> manifestWindowSeconds,
        @Nullable Output<Integer> segmentDurationSeconds,
        @Nullable Output<OriginEndpointStreamSelectionArgs> streamSelection) {
        this.encryption = encryption;
        this.manifestWindowSeconds = manifestWindowSeconds;
        this.segmentDurationSeconds = segmentDurationSeconds;
        this.streamSelection = streamSelection;
    }

    private OriginEndpointMssPackageArgs() {
        this.encryption = Output.empty();
        this.manifestWindowSeconds = Output.empty();
        this.segmentDurationSeconds = Output.empty();
        this.streamSelection = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointMssPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<OriginEndpointMssEncryptionArgs> encryption;
        private @Nullable Output<Integer> manifestWindowSeconds;
        private @Nullable Output<Integer> segmentDurationSeconds;
        private @Nullable Output<OriginEndpointStreamSelectionArgs> streamSelection;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointMssPackageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryption = defaults.encryption;
    	      this.manifestWindowSeconds = defaults.manifestWindowSeconds;
    	      this.segmentDurationSeconds = defaults.segmentDurationSeconds;
    	      this.streamSelection = defaults.streamSelection;
        }

        public Builder encryption(@Nullable Output<OriginEndpointMssEncryptionArgs> encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder encryption(@Nullable OriginEndpointMssEncryptionArgs encryption) {
            this.encryption = Output.ofNullable(encryption);
            return this;
        }

        public Builder manifestWindowSeconds(@Nullable Output<Integer> manifestWindowSeconds) {
            this.manifestWindowSeconds = manifestWindowSeconds;
            return this;
        }

        public Builder manifestWindowSeconds(@Nullable Integer manifestWindowSeconds) {
            this.manifestWindowSeconds = Output.ofNullable(manifestWindowSeconds);
            return this;
        }

        public Builder segmentDurationSeconds(@Nullable Output<Integer> segmentDurationSeconds) {
            this.segmentDurationSeconds = segmentDurationSeconds;
            return this;
        }

        public Builder segmentDurationSeconds(@Nullable Integer segmentDurationSeconds) {
            this.segmentDurationSeconds = Output.ofNullable(segmentDurationSeconds);
            return this;
        }

        public Builder streamSelection(@Nullable Output<OriginEndpointStreamSelectionArgs> streamSelection) {
            this.streamSelection = streamSelection;
            return this;
        }

        public Builder streamSelection(@Nullable OriginEndpointStreamSelectionArgs streamSelection) {
            this.streamSelection = Output.ofNullable(streamSelection);
            return this;
        }
        public OriginEndpointMssPackageArgs build() {
            return new OriginEndpointMssPackageArgs(encryption, manifestWindowSeconds, segmentDurationSeconds, streamSelection);
        }
    }
}
