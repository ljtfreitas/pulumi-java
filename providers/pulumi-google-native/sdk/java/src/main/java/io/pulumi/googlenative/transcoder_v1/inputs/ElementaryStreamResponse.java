// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.transcoder_v1.inputs.AudioStreamResponse;
import io.pulumi.googlenative.transcoder_v1.inputs.TextStreamResponse;
import io.pulumi.googlenative.transcoder_v1.inputs.VideoStreamResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Encoding of an input file such as an audio, video, or text track. Elementary streams must be packaged before mapping and sharing between different output formats.
 * 
 */
public final class ElementaryStreamResponse extends io.pulumi.resources.InvokeArgs {

    public static final ElementaryStreamResponse Empty = new ElementaryStreamResponse();

    /**
     * Encoding of an audio stream.
     * 
     */
    @InputImport(name="audioStream", required=true)
      private final AudioStreamResponse audioStream;

    public AudioStreamResponse getAudioStream() {
        return this.audioStream;
    }

    /**
     * A unique key for this elementary stream.
     * 
     */
    @InputImport(name="key", required=true)
      private final String key;

    public String getKey() {
        return this.key;
    }

    /**
     * Encoding of a text stream. For example, closed captions or subtitles.
     * 
     */
    @InputImport(name="textStream", required=true)
      private final TextStreamResponse textStream;

    public TextStreamResponse getTextStream() {
        return this.textStream;
    }

    /**
     * Encoding of a video stream.
     * 
     */
    @InputImport(name="videoStream", required=true)
      private final VideoStreamResponse videoStream;

    public VideoStreamResponse getVideoStream() {
        return this.videoStream;
    }

    public ElementaryStreamResponse(
        AudioStreamResponse audioStream,
        String key,
        TextStreamResponse textStream,
        VideoStreamResponse videoStream) {
        this.audioStream = Objects.requireNonNull(audioStream, "expected parameter 'audioStream' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.textStream = Objects.requireNonNull(textStream, "expected parameter 'textStream' to be non-null");
        this.videoStream = Objects.requireNonNull(videoStream, "expected parameter 'videoStream' to be non-null");
    }

    private ElementaryStreamResponse() {
        this.audioStream = null;
        this.key = null;
        this.textStream = null;
        this.videoStream = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElementaryStreamResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AudioStreamResponse audioStream;
        private String key;
        private TextStreamResponse textStream;
        private VideoStreamResponse videoStream;

        public Builder() {
    	      // Empty
        }

        public Builder(ElementaryStreamResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioStream = defaults.audioStream;
    	      this.key = defaults.key;
    	      this.textStream = defaults.textStream;
    	      this.videoStream = defaults.videoStream;
        }

        public Builder setAudioStream(AudioStreamResponse audioStream) {
            this.audioStream = Objects.requireNonNull(audioStream);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setTextStream(TextStreamResponse textStream) {
            this.textStream = Objects.requireNonNull(textStream);
            return this;
        }

        public Builder setVideoStream(VideoStreamResponse videoStream) {
            this.videoStream = Objects.requireNonNull(videoStream);
            return this;
        }
        public ElementaryStreamResponse build() {
            return new ElementaryStreamResponse(audioStream, key, textStream, videoStream);
        }
    }
}
