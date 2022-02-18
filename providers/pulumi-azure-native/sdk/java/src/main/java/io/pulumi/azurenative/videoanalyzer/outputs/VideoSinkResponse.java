// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.azurenative.videoanalyzer.outputs.NodeInputResponse;
import io.pulumi.azurenative.videoanalyzer.outputs.VideoCreationPropertiesResponse;
import io.pulumi.azurenative.videoanalyzer.outputs.VideoPublishingOptionsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VideoSinkResponse {
    /**
     * An array of upstream node references within the topology to be used as inputs for this node.
     * 
     */
    private final List<NodeInputResponse> inputs;
    /**
     * Node name. Must be unique within the topology.
     * 
     */
    private final String name;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.VideoSink'.
     * 
     */
    private final String type;
    /**
     * Optional video properties to be used in case a new video resource needs to be created on the service.
     * 
     */
    private final @Nullable VideoCreationPropertiesResponse videoCreationProperties;
    /**
     * Name of a new or existing video resource used to capture and publish content. Note: if downstream of RTSP source, and if disableArchive is set to true, then no content is archived.
     * 
     */
    private final String videoName;
    /**
     * Options to change how the video sink publishes content via the video resource. This property is only allowed for topologies where "kind" is set to "live".
     * 
     */
    private final @Nullable VideoPublishingOptionsResponse videoPublishingOptions;

    @OutputCustomType.Constructor({"inputs","name","type","videoCreationProperties","videoName","videoPublishingOptions"})
    private VideoSinkResponse(
        List<NodeInputResponse> inputs,
        String name,
        String type,
        @Nullable VideoCreationPropertiesResponse videoCreationProperties,
        String videoName,
        @Nullable VideoPublishingOptionsResponse videoPublishingOptions) {
        this.inputs = Objects.requireNonNull(inputs);
        this.name = Objects.requireNonNull(name);
        this.type = Objects.requireNonNull(type);
        this.videoCreationProperties = videoCreationProperties;
        this.videoName = Objects.requireNonNull(videoName);
        this.videoPublishingOptions = videoPublishingOptions;
    }

    /**
     * An array of upstream node references within the topology to be used as inputs for this node.
     * 
     */
    public List<NodeInputResponse> getInputs() {
        return this.inputs;
    }
    /**
     * Node name. Must be unique within the topology.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.VideoSink'.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Optional video properties to be used in case a new video resource needs to be created on the service.
     * 
     */
    public Optional<VideoCreationPropertiesResponse> getVideoCreationProperties() {
        return Optional.ofNullable(this.videoCreationProperties);
    }
    /**
     * Name of a new or existing video resource used to capture and publish content. Note: if downstream of RTSP source, and if disableArchive is set to true, then no content is archived.
     * 
     */
    public String getVideoName() {
        return this.videoName;
    }
    /**
     * Options to change how the video sink publishes content via the video resource. This property is only allowed for topologies where "kind" is set to "live".
     * 
     */
    public Optional<VideoPublishingOptionsResponse> getVideoPublishingOptions() {
        return Optional.ofNullable(this.videoPublishingOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoSinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<NodeInputResponse> inputs;
        private String name;
        private String type;
        private @Nullable VideoCreationPropertiesResponse videoCreationProperties;
        private String videoName;
        private @Nullable VideoPublishingOptionsResponse videoPublishingOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoSinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputs = defaults.inputs;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.videoCreationProperties = defaults.videoCreationProperties;
    	      this.videoName = defaults.videoName;
    	      this.videoPublishingOptions = defaults.videoPublishingOptions;
        }

        public Builder setInputs(List<NodeInputResponse> inputs) {
            this.inputs = Objects.requireNonNull(inputs);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVideoCreationProperties(@Nullable VideoCreationPropertiesResponse videoCreationProperties) {
            this.videoCreationProperties = videoCreationProperties;
            return this;
        }

        public Builder setVideoName(String videoName) {
            this.videoName = Objects.requireNonNull(videoName);
            return this;
        }

        public Builder setVideoPublishingOptions(@Nullable VideoPublishingOptionsResponse videoPublishingOptions) {
            this.videoPublishingOptions = videoPublishingOptions;
            return this;
        }

        public VideoSinkResponse build() {
            return new VideoSinkResponse(inputs, name, type, videoCreationProperties, videoName, videoPublishingOptions);
        }
    }
}
