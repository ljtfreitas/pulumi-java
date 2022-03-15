// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.TrackSelectionResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Class to specify properties of content key
 * 
 */
public final class StreamingPolicyContentKeyResponse extends io.pulumi.resources.InvokeArgs {

    public static final StreamingPolicyContentKeyResponse Empty = new StreamingPolicyContentKeyResponse();

    /**
     * Label can be used to specify Content Key when creating a Streaming Locator
     * 
     */
    @Import(name="label")
      private final @Nullable String label;

    public Optional<String> getLabel() {
        return this.label == null ? Optional.empty() : Optional.ofNullable(this.label);
    }

    /**
     * Policy used by Content Key
     * 
     */
    @Import(name="policyName")
      private final @Nullable String policyName;

    public Optional<String> getPolicyName() {
        return this.policyName == null ? Optional.empty() : Optional.ofNullable(this.policyName);
    }

    /**
     * Tracks which use this content key
     * 
     */
    @Import(name="tracks")
      private final @Nullable List<TrackSelectionResponse> tracks;

    public List<TrackSelectionResponse> getTracks() {
        return this.tracks == null ? List.of() : this.tracks;
    }

    public StreamingPolicyContentKeyResponse(
        @Nullable String label,
        @Nullable String policyName,
        @Nullable List<TrackSelectionResponse> tracks) {
        this.label = label;
        this.policyName = policyName;
        this.tracks = tracks;
    }

    private StreamingPolicyContentKeyResponse() {
        this.label = null;
        this.policyName = null;
        this.tracks = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingPolicyContentKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String label;
        private @Nullable String policyName;
        private @Nullable List<TrackSelectionResponse> tracks;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingPolicyContentKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.label = defaults.label;
    	      this.policyName = defaults.policyName;
    	      this.tracks = defaults.tracks;
        }

        public Builder label(@Nullable String label) {
            this.label = label;
            return this;
        }

        public Builder policyName(@Nullable String policyName) {
            this.policyName = policyName;
            return this;
        }

        public Builder tracks(@Nullable List<TrackSelectionResponse> tracks) {
            this.tracks = tracks;
            return this;
        }
        public StreamingPolicyContentKeyResponse build() {
            return new StreamingPolicyContentKeyResponse(label, policyName, tracks);
        }
    }
}
