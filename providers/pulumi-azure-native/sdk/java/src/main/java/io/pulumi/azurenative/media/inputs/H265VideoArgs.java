// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.enums.H265Complexity;
import io.pulumi.azurenative.media.enums.StretchMode;
import io.pulumi.azurenative.media.enums.VideoSyncMode;
import io.pulumi.azurenative.media.inputs.H265LayerArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes all the properties for encoding a video with the H.265 codec.
 * 
 */
public final class H265VideoArgs extends io.pulumi.resources.ResourceArgs {

    public static final H265VideoArgs Empty = new H265VideoArgs();

    /**
     * Tells the encoder how to choose its encoding settings.  Quality will provide for a higher compression ratio but at a higher cost and longer compute time.  Speed will produce a relatively larger file but is faster and more economical. The default value is Balanced.
     * 
     */
    @InputImport(name="complexity")
        private final @Nullable Input<Either<String,H265Complexity>> complexity;

    public Input<Either<String,H265Complexity>> getComplexity() {
        return this.complexity == null ? Input.empty() : this.complexity;
    }

    /**
     * The distance between two key frames. The value should be non-zero in the range [0.5, 20] seconds, specified in ISO 8601 format. The default is 2 seconds(PT2S). Note that this setting is ignored if VideoSyncMode.Passthrough is set, where the KeyFrameInterval value will follow the input source setting.
     * 
     */
    @InputImport(name="keyFrameInterval")
        private final @Nullable Input<String> keyFrameInterval;

    public Input<String> getKeyFrameInterval() {
        return this.keyFrameInterval == null ? Input.empty() : this.keyFrameInterval;
    }

    /**
     * An optional label for the codec. The label can be used to control muxing behavior.
     * 
     */
    @InputImport(name="label")
        private final @Nullable Input<String> label;

    public Input<String> getLabel() {
        return this.label == null ? Input.empty() : this.label;
    }

    /**
     * The collection of output H.265 layers to be produced by the encoder.
     * 
     */
    @InputImport(name="layers")
        private final @Nullable Input<List<H265LayerArgs>> layers;

    public Input<List<H265LayerArgs>> getLayers() {
        return this.layers == null ? Input.empty() : this.layers;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.H265Video'.
     * 
     */
    @InputImport(name="odataType", required=true)
        private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    /**
     * Specifies whether or not the encoder should insert key frames at scene changes. If not specified, the default is false. This flag should be set to true only when the encoder is being configured to produce a single output video.
     * 
     */
    @InputImport(name="sceneChangeDetection")
        private final @Nullable Input<Boolean> sceneChangeDetection;

    public Input<Boolean> getSceneChangeDetection() {
        return this.sceneChangeDetection == null ? Input.empty() : this.sceneChangeDetection;
    }

    /**
     * The resizing mode - how the input video will be resized to fit the desired output resolution(s). Default is AutoSize
     * 
     */
    @InputImport(name="stretchMode")
        private final @Nullable Input<Either<String,StretchMode>> stretchMode;

    public Input<Either<String,StretchMode>> getStretchMode() {
        return this.stretchMode == null ? Input.empty() : this.stretchMode;
    }

    /**
     * The Video Sync Mode
     * 
     */
    @InputImport(name="syncMode")
        private final @Nullable Input<Either<String,VideoSyncMode>> syncMode;

    public Input<Either<String,VideoSyncMode>> getSyncMode() {
        return this.syncMode == null ? Input.empty() : this.syncMode;
    }

    public H265VideoArgs(
        @Nullable Input<Either<String,H265Complexity>> complexity,
        @Nullable Input<String> keyFrameInterval,
        @Nullable Input<String> label,
        @Nullable Input<List<H265LayerArgs>> layers,
        Input<String> odataType,
        @Nullable Input<Boolean> sceneChangeDetection,
        @Nullable Input<Either<String,StretchMode>> stretchMode,
        @Nullable Input<Either<String,VideoSyncMode>> syncMode) {
        this.complexity = complexity;
        this.keyFrameInterval = keyFrameInterval;
        this.label = label;
        this.layers = layers;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.sceneChangeDetection = sceneChangeDetection;
        this.stretchMode = stretchMode;
        this.syncMode = syncMode;
    }

    private H265VideoArgs() {
        this.complexity = Input.empty();
        this.keyFrameInterval = Input.empty();
        this.label = Input.empty();
        this.layers = Input.empty();
        this.odataType = Input.empty();
        this.sceneChangeDetection = Input.empty();
        this.stretchMode = Input.empty();
        this.syncMode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(H265VideoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,H265Complexity>> complexity;
        private @Nullable Input<String> keyFrameInterval;
        private @Nullable Input<String> label;
        private @Nullable Input<List<H265LayerArgs>> layers;
        private Input<String> odataType;
        private @Nullable Input<Boolean> sceneChangeDetection;
        private @Nullable Input<Either<String,StretchMode>> stretchMode;
        private @Nullable Input<Either<String,VideoSyncMode>> syncMode;

        public Builder() {
    	      // Empty
        }

        public Builder(H265VideoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complexity = defaults.complexity;
    	      this.keyFrameInterval = defaults.keyFrameInterval;
    	      this.label = defaults.label;
    	      this.layers = defaults.layers;
    	      this.odataType = defaults.odataType;
    	      this.sceneChangeDetection = defaults.sceneChangeDetection;
    	      this.stretchMode = defaults.stretchMode;
    	      this.syncMode = defaults.syncMode;
        }

        public Builder setComplexity(@Nullable Input<Either<String,H265Complexity>> complexity) {
            this.complexity = complexity;
            return this;
        }

        public Builder setComplexity(@Nullable Either<String,H265Complexity> complexity) {
            this.complexity = Input.ofNullable(complexity);
            return this;
        }

        public Builder setKeyFrameInterval(@Nullable Input<String> keyFrameInterval) {
            this.keyFrameInterval = keyFrameInterval;
            return this;
        }

        public Builder setKeyFrameInterval(@Nullable String keyFrameInterval) {
            this.keyFrameInterval = Input.ofNullable(keyFrameInterval);
            return this;
        }

        public Builder setLabel(@Nullable Input<String> label) {
            this.label = label;
            return this;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = Input.ofNullable(label);
            return this;
        }

        public Builder setLayers(@Nullable Input<List<H265LayerArgs>> layers) {
            this.layers = layers;
            return this;
        }

        public Builder setLayers(@Nullable List<H265LayerArgs> layers) {
            this.layers = Input.ofNullable(layers);
            return this;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }

        public Builder setSceneChangeDetection(@Nullable Input<Boolean> sceneChangeDetection) {
            this.sceneChangeDetection = sceneChangeDetection;
            return this;
        }

        public Builder setSceneChangeDetection(@Nullable Boolean sceneChangeDetection) {
            this.sceneChangeDetection = Input.ofNullable(sceneChangeDetection);
            return this;
        }

        public Builder setStretchMode(@Nullable Input<Either<String,StretchMode>> stretchMode) {
            this.stretchMode = stretchMode;
            return this;
        }

        public Builder setStretchMode(@Nullable Either<String,StretchMode> stretchMode) {
            this.stretchMode = Input.ofNullable(stretchMode);
            return this;
        }

        public Builder setSyncMode(@Nullable Input<Either<String,VideoSyncMode>> syncMode) {
            this.syncMode = syncMode;
            return this;
        }

        public Builder setSyncMode(@Nullable Either<String,VideoSyncMode> syncMode) {
            this.syncMode = Input.ofNullable(syncMode);
            return this;
        }
        public H265VideoArgs build() {
            return new H265VideoArgs(complexity, keyFrameInterval, label, layers, odataType, sceneChangeDetection, stretchMode, syncMode);
        }
    }
}
