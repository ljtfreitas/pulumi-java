// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.transcoder_v1.inputs.AudioStreamArgs;
import io.pulumi.googlenative.transcoder_v1.inputs.TextStreamArgs;
import io.pulumi.googlenative.transcoder_v1.inputs.VideoStreamArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Encoding of an input file such as an audio, video, or text track. Elementary streams must be packaged before mapping and sharing between different output formats.
 * 
 */
public final class ElementaryStreamArgs extends io.pulumi.resources.ResourceArgs {

    public static final ElementaryStreamArgs Empty = new ElementaryStreamArgs();

    /**
     * Encoding of an audio stream.
     * 
     */
    @InputImport(name="audioStream")
      private final @Nullable Input<AudioStreamArgs> audioStream;

    public Input<AudioStreamArgs> getAudioStream() {
        return this.audioStream == null ? Input.empty() : this.audioStream;
    }

    /**
     * A unique key for this elementary stream.
     * 
     */
    @InputImport(name="key")
      private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    /**
     * Encoding of a text stream. For example, closed captions or subtitles.
     * 
     */
    @InputImport(name="textStream")
      private final @Nullable Input<TextStreamArgs> textStream;

    public Input<TextStreamArgs> getTextStream() {
        return this.textStream == null ? Input.empty() : this.textStream;
    }

    /**
     * Encoding of a video stream.
     * 
     */
    @InputImport(name="videoStream")
      private final @Nullable Input<VideoStreamArgs> videoStream;

    public Input<VideoStreamArgs> getVideoStream() {
        return this.videoStream == null ? Input.empty() : this.videoStream;
    }

    public ElementaryStreamArgs(
        @Nullable Input<AudioStreamArgs> audioStream,
        @Nullable Input<String> key,
        @Nullable Input<TextStreamArgs> textStream,
        @Nullable Input<VideoStreamArgs> videoStream) {
        this.audioStream = audioStream;
        this.key = key;
        this.textStream = textStream;
        this.videoStream = videoStream;
    }

    private ElementaryStreamArgs() {
        this.audioStream = Input.empty();
        this.key = Input.empty();
        this.textStream = Input.empty();
        this.videoStream = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElementaryStreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AudioStreamArgs> audioStream;
        private @Nullable Input<String> key;
        private @Nullable Input<TextStreamArgs> textStream;
        private @Nullable Input<VideoStreamArgs> videoStream;

        public Builder() {
    	      // Empty
        }

        public Builder(ElementaryStreamArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioStream = defaults.audioStream;
    	      this.key = defaults.key;
    	      this.textStream = defaults.textStream;
    	      this.videoStream = defaults.videoStream;
        }

        public Builder setAudioStream(@Nullable Input<AudioStreamArgs> audioStream) {
            this.audioStream = audioStream;
            return this;
        }

        public Builder setAudioStream(@Nullable AudioStreamArgs audioStream) {
            this.audioStream = Input.ofNullable(audioStream);
            return this;
        }

        public Builder setKey(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public Builder setTextStream(@Nullable Input<TextStreamArgs> textStream) {
            this.textStream = textStream;
            return this;
        }

        public Builder setTextStream(@Nullable TextStreamArgs textStream) {
            this.textStream = Input.ofNullable(textStream);
            return this;
        }

        public Builder setVideoStream(@Nullable Input<VideoStreamArgs> videoStream) {
            this.videoStream = videoStream;
            return this;
        }

        public Builder setVideoStream(@Nullable VideoStreamArgs videoStream) {
            this.videoStream = Input.ofNullable(videoStream);
            return this;
        }
        public ElementaryStreamArgs build() {
            return new ElementaryStreamArgs(audioStream, key, textStream, videoStream);
        }
    }
}
