// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.TrackSelectionResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StreamingLocatorContentKeyResponse {
    /**
     * ID of Content Key
     * 
     */
    private final String id;
    /**
     * Label of Content Key as specified in the Streaming Policy
     * 
     */
    private final @Nullable String labelReferenceInStreamingPolicy;
    /**
     * ContentKeyPolicy used by Content Key
     * 
     */
    private final String policyName;
    /**
     * Tracks which use this Content Key
     * 
     */
    private final List<TrackSelectionResponse> tracks;
    /**
     * Encryption type of Content Key
     * 
     */
    private final String type;
    /**
     * Value of Content Key
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private StreamingLocatorContentKeyResponse(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("labelReferenceInStreamingPolicy") @Nullable String labelReferenceInStreamingPolicy,
        @CustomType.Parameter("policyName") String policyName,
        @CustomType.Parameter("tracks") List<TrackSelectionResponse> tracks,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") @Nullable String value) {
        this.id = id;
        this.labelReferenceInStreamingPolicy = labelReferenceInStreamingPolicy;
        this.policyName = policyName;
        this.tracks = tracks;
        this.type = type;
        this.value = value;
    }

    /**
     * ID of Content Key
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Label of Content Key as specified in the Streaming Policy
     * 
    */
    public Optional<String> getLabelReferenceInStreamingPolicy() {
        return Optional.ofNullable(this.labelReferenceInStreamingPolicy);
    }
    /**
     * ContentKeyPolicy used by Content Key
     * 
    */
    public String getPolicyName() {
        return this.policyName;
    }
    /**
     * Tracks which use this Content Key
     * 
    */
    public List<TrackSelectionResponse> getTracks() {
        return this.tracks;
    }
    /**
     * Encryption type of Content Key
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Value of Content Key
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingLocatorContentKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String labelReferenceInStreamingPolicy;
        private String policyName;
        private List<TrackSelectionResponse> tracks;
        private String type;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingLocatorContentKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.labelReferenceInStreamingPolicy = defaults.labelReferenceInStreamingPolicy;
    	      this.policyName = defaults.policyName;
    	      this.tracks = defaults.tracks;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder labelReferenceInStreamingPolicy(@Nullable String labelReferenceInStreamingPolicy) {
            this.labelReferenceInStreamingPolicy = labelReferenceInStreamingPolicy;
            return this;
        }

        public Builder policyName(String policyName) {
            this.policyName = Objects.requireNonNull(policyName);
            return this;
        }

        public Builder tracks(List<TrackSelectionResponse> tracks) {
            this.tracks = Objects.requireNonNull(tracks);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public StreamingLocatorContentKeyResponse build() {
            return new StreamingLocatorContentKeyResponse(id, labelReferenceInStreamingPolicy, policyName, tracks, type, value);
        }
    }
}
