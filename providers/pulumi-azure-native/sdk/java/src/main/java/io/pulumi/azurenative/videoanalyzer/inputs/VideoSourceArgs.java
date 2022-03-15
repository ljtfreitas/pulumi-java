// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.azurenative.videoanalyzer.inputs.VideoSequenceAbsoluteTimeMarkersArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Video source allows for content from a Video Analyzer video resource to be ingested into a pipeline. Currently supported only with batch pipelines.
 * 
 */
public final class VideoSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final VideoSourceArgs Empty = new VideoSourceArgs();

    /**
     * Node name. Must be unique within the topology.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Describes a sequence of datetime ranges. The video source only picks up recorded media within these ranges.
     * 
     */
    @Import(name="timeSequences", required=true)
      private final Output<VideoSequenceAbsoluteTimeMarkersArgs> timeSequences;

    public Output<VideoSequenceAbsoluteTimeMarkersArgs> getTimeSequences() {
        return this.timeSequences;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.VideoSource'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * Name of the Video Analyzer video resource to be used as the source.
     * 
     */
    @Import(name="videoName", required=true)
      private final Output<String> videoName;

    public Output<String> getVideoName() {
        return this.videoName;
    }

    public VideoSourceArgs(
        Output<String> name,
        Output<VideoSequenceAbsoluteTimeMarkersArgs> timeSequences,
        Output<String> type,
        Output<String> videoName) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.timeSequences = Objects.requireNonNull(timeSequences, "expected parameter 'timeSequences' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.videoName = Objects.requireNonNull(videoName, "expected parameter 'videoName' to be non-null");
    }

    private VideoSourceArgs() {
        this.name = Output.empty();
        this.timeSequences = Output.empty();
        this.type = Output.empty();
        this.videoName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<VideoSequenceAbsoluteTimeMarkersArgs> timeSequences;
        private Output<String> type;
        private Output<String> videoName;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.timeSequences = defaults.timeSequences;
    	      this.type = defaults.type;
    	      this.videoName = defaults.videoName;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder timeSequences(Output<VideoSequenceAbsoluteTimeMarkersArgs> timeSequences) {
            this.timeSequences = Objects.requireNonNull(timeSequences);
            return this;
        }

        public Builder timeSequences(VideoSequenceAbsoluteTimeMarkersArgs timeSequences) {
            this.timeSequences = Output.of(Objects.requireNonNull(timeSequences));
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder videoName(Output<String> videoName) {
            this.videoName = Objects.requireNonNull(videoName);
            return this;
        }

        public Builder videoName(String videoName) {
            this.videoName = Output.of(Objects.requireNonNull(videoName));
            return this;
        }
        public VideoSourceArgs build() {
            return new VideoSourceArgs(name, timeSequences, type, videoName);
        }
    }
}
