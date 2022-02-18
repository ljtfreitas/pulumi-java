// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the basic properties for encoding the input video.
 * 
 */
public final class VideoResponse extends io.pulumi.resources.InvokeArgs {

    public static final VideoResponse Empty = new VideoResponse();

    /**
     * The distance between two key frames. The value should be non-zero in the range [0.5, 20] seconds, specified in ISO 8601 format. The default is 2 seconds(PT2S). Note that this setting is ignored if VideoSyncMode.Passthrough is set, where the KeyFrameInterval value will follow the input source setting.
     * 
     */
    @InputImport(name="keyFrameInterval")
    private final @Nullable String keyFrameInterval;

    public Optional<String> getKeyFrameInterval() {
        return this.keyFrameInterval == null ? Optional.empty() : Optional.ofNullable(this.keyFrameInterval);
    }

    /**
     * An optional label for the codec. The label can be used to control muxing behavior.
     * 
     */
    @InputImport(name="label")
    private final @Nullable String label;

    public Optional<String> getLabel() {
        return this.label == null ? Optional.empty() : Optional.ofNullable(this.label);
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.Video'.
     * 
     */
    @InputImport(name="odataType", required=true)
    private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    /**
     * The resizing mode - how the input video will be resized to fit the desired output resolution(s). Default is AutoSize
     * 
     */
    @InputImport(name="stretchMode")
    private final @Nullable String stretchMode;

    public Optional<String> getStretchMode() {
        return this.stretchMode == null ? Optional.empty() : Optional.ofNullable(this.stretchMode);
    }

    /**
     * The Video Sync Mode
     * 
     */
    @InputImport(name="syncMode")
    private final @Nullable String syncMode;

    public Optional<String> getSyncMode() {
        return this.syncMode == null ? Optional.empty() : Optional.ofNullable(this.syncMode);
    }

    public VideoResponse(
        @Nullable String keyFrameInterval,
        @Nullable String label,
        String odataType,
        @Nullable String stretchMode,
        @Nullable String syncMode) {
        this.keyFrameInterval = keyFrameInterval;
        this.label = label;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.stretchMode = stretchMode;
        this.syncMode = syncMode;
    }

    private VideoResponse() {
        this.keyFrameInterval = null;
        this.label = null;
        this.odataType = null;
        this.stretchMode = null;
        this.syncMode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyFrameInterval;
        private @Nullable String label;
        private String odataType;
        private @Nullable String stretchMode;
        private @Nullable String syncMode;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyFrameInterval = defaults.keyFrameInterval;
    	      this.label = defaults.label;
    	      this.odataType = defaults.odataType;
    	      this.stretchMode = defaults.stretchMode;
    	      this.syncMode = defaults.syncMode;
        }

        public Builder setKeyFrameInterval(@Nullable String keyFrameInterval) {
            this.keyFrameInterval = keyFrameInterval;
            return this;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = label;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setStretchMode(@Nullable String stretchMode) {
            this.stretchMode = stretchMode;
            return this;
        }

        public Builder setSyncMode(@Nullable String syncMode) {
            this.syncMode = syncMode;
            return this;
        }

        public VideoResponse build() {
            return new VideoResponse(keyFrameInterval, label, odataType, stretchMode, syncMode);
        }
    }
}
