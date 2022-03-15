// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.transcoder_v1.outputs.AdBreakResponse;
import io.pulumi.googlenative.transcoder_v1.outputs.EditAtomResponse;
import io.pulumi.googlenative.transcoder_v1.outputs.ElementaryStreamResponse;
import io.pulumi.googlenative.transcoder_v1.outputs.InputResponse;
import io.pulumi.googlenative.transcoder_v1.outputs.ManifestResponse;
import io.pulumi.googlenative.transcoder_v1.outputs.MuxStreamResponse;
import io.pulumi.googlenative.transcoder_v1.outputs.OutputResponse;
import io.pulumi.googlenative.transcoder_v1.outputs.OverlayResponse;
import io.pulumi.googlenative.transcoder_v1.outputs.PubsubDestinationResponse;
import io.pulumi.googlenative.transcoder_v1.outputs.SpriteSheetResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class JobConfigResponse {
    /**
     * List of ad breaks. Specifies where to insert ad break tags in the output manifests.
     * 
     */
    private final List<AdBreakResponse> adBreaks;
    /**
     * List of `Edit atom`s. Defines the ultimate timeline of the resulting file or manifest.
     * 
     */
    private final List<EditAtomResponse> editList;
    /**
     * List of elementary streams.
     * 
     */
    private final List<ElementaryStreamResponse> elementaryStreams;
    /**
     * List of input assets stored in Cloud Storage.
     * 
     */
    private final List<InputResponse> inputs;
    /**
     * List of output manifests.
     * 
     */
    private final List<ManifestResponse> manifests;
    /**
     * List of multiplexing settings for output streams.
     * 
     */
    private final List<MuxStreamResponse> muxStreams;
    /**
     * Output configuration.
     * 
     */
    private final OutputResponse output;
    /**
     * List of overlays on the output video, in descending Z-order.
     * 
     */
    private final List<OverlayResponse> overlays;
    /**
     * Destination on Pub/Sub.
     * 
     */
    private final PubsubDestinationResponse pubsubDestination;
    /**
     * List of output sprite sheets.
     * 
     */
    private final List<SpriteSheetResponse> spriteSheets;

    @CustomType.Constructor
    private JobConfigResponse(
        @CustomType.Parameter("adBreaks") List<AdBreakResponse> adBreaks,
        @CustomType.Parameter("editList") List<EditAtomResponse> editList,
        @CustomType.Parameter("elementaryStreams") List<ElementaryStreamResponse> elementaryStreams,
        @CustomType.Parameter("inputs") List<InputResponse> inputs,
        @CustomType.Parameter("manifests") List<ManifestResponse> manifests,
        @CustomType.Parameter("muxStreams") List<MuxStreamResponse> muxStreams,
        @CustomType.Parameter("output") OutputResponse output,
        @CustomType.Parameter("overlays") List<OverlayResponse> overlays,
        @CustomType.Parameter("pubsubDestination") PubsubDestinationResponse pubsubDestination,
        @CustomType.Parameter("spriteSheets") List<SpriteSheetResponse> spriteSheets) {
        this.adBreaks = adBreaks;
        this.editList = editList;
        this.elementaryStreams = elementaryStreams;
        this.inputs = inputs;
        this.manifests = manifests;
        this.muxStreams = muxStreams;
        this.output = output;
        this.overlays = overlays;
        this.pubsubDestination = pubsubDestination;
        this.spriteSheets = spriteSheets;
    }

    /**
     * List of ad breaks. Specifies where to insert ad break tags in the output manifests.
     * 
    */
    public List<AdBreakResponse> getAdBreaks() {
        return this.adBreaks;
    }
    /**
     * List of `Edit atom`s. Defines the ultimate timeline of the resulting file or manifest.
     * 
    */
    public List<EditAtomResponse> getEditList() {
        return this.editList;
    }
    /**
     * List of elementary streams.
     * 
    */
    public List<ElementaryStreamResponse> getElementaryStreams() {
        return this.elementaryStreams;
    }
    /**
     * List of input assets stored in Cloud Storage.
     * 
    */
    public List<InputResponse> getInputs() {
        return this.inputs;
    }
    /**
     * List of output manifests.
     * 
    */
    public List<ManifestResponse> getManifests() {
        return this.manifests;
    }
    /**
     * List of multiplexing settings for output streams.
     * 
    */
    public List<MuxStreamResponse> getMuxStreams() {
        return this.muxStreams;
    }
    /**
     * Output configuration.
     * 
    */
    public OutputResponse getOutput() {
        return this.output;
    }
    /**
     * List of overlays on the output video, in descending Z-order.
     * 
    */
    public List<OverlayResponse> getOverlays() {
        return this.overlays;
    }
    /**
     * Destination on Pub/Sub.
     * 
    */
    public PubsubDestinationResponse getPubsubDestination() {
        return this.pubsubDestination;
    }
    /**
     * List of output sprite sheets.
     * 
    */
    public List<SpriteSheetResponse> getSpriteSheets() {
        return this.spriteSheets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AdBreakResponse> adBreaks;
        private List<EditAtomResponse> editList;
        private List<ElementaryStreamResponse> elementaryStreams;
        private List<InputResponse> inputs;
        private List<ManifestResponse> manifests;
        private List<MuxStreamResponse> muxStreams;
        private OutputResponse output;
        private List<OverlayResponse> overlays;
        private PubsubDestinationResponse pubsubDestination;
        private List<SpriteSheetResponse> spriteSheets;

        public Builder() {
    	      // Empty
        }

        public Builder(JobConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adBreaks = defaults.adBreaks;
    	      this.editList = defaults.editList;
    	      this.elementaryStreams = defaults.elementaryStreams;
    	      this.inputs = defaults.inputs;
    	      this.manifests = defaults.manifests;
    	      this.muxStreams = defaults.muxStreams;
    	      this.output = defaults.output;
    	      this.overlays = defaults.overlays;
    	      this.pubsubDestination = defaults.pubsubDestination;
    	      this.spriteSheets = defaults.spriteSheets;
        }

        public Builder adBreaks(List<AdBreakResponse> adBreaks) {
            this.adBreaks = Objects.requireNonNull(adBreaks);
            return this;
        }

        public Builder editList(List<EditAtomResponse> editList) {
            this.editList = Objects.requireNonNull(editList);
            return this;
        }

        public Builder elementaryStreams(List<ElementaryStreamResponse> elementaryStreams) {
            this.elementaryStreams = Objects.requireNonNull(elementaryStreams);
            return this;
        }

        public Builder inputs(List<InputResponse> inputs) {
            this.inputs = Objects.requireNonNull(inputs);
            return this;
        }

        public Builder manifests(List<ManifestResponse> manifests) {
            this.manifests = Objects.requireNonNull(manifests);
            return this;
        }

        public Builder muxStreams(List<MuxStreamResponse> muxStreams) {
            this.muxStreams = Objects.requireNonNull(muxStreams);
            return this;
        }

        public Builder output(OutputResponse output) {
            this.output = Objects.requireNonNull(output);
            return this;
        }

        public Builder overlays(List<OverlayResponse> overlays) {
            this.overlays = Objects.requireNonNull(overlays);
            return this;
        }

        public Builder pubsubDestination(PubsubDestinationResponse pubsubDestination) {
            this.pubsubDestination = Objects.requireNonNull(pubsubDestination);
            return this;
        }

        public Builder spriteSheets(List<SpriteSheetResponse> spriteSheets) {
            this.spriteSheets = Objects.requireNonNull(spriteSheets);
            return this;
        }
        public JobConfigResponse build() {
            return new JobConfigResponse(adBreaks, editList, elementaryStreams, inputs, manifests, muxStreams, output, overlays, pubsubDestination, spriteSheets);
        }
    }
}
