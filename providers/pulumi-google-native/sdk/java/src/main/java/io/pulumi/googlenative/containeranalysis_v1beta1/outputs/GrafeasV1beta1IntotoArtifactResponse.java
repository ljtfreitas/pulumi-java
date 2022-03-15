// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.ArtifactHashesResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GrafeasV1beta1IntotoArtifactResponse {
    private final ArtifactHashesResponse hashes;
    private final String resourceUri;

    @CustomType.Constructor
    private GrafeasV1beta1IntotoArtifactResponse(
        @CustomType.Parameter("hashes") ArtifactHashesResponse hashes,
        @CustomType.Parameter("resourceUri") String resourceUri) {
        this.hashes = hashes;
        this.resourceUri = resourceUri;
    }

    public ArtifactHashesResponse getHashes() {
        return this.hashes;
    }
    public String getResourceUri() {
        return this.resourceUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrafeasV1beta1IntotoArtifactResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ArtifactHashesResponse hashes;
        private String resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GrafeasV1beta1IntotoArtifactResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hashes = defaults.hashes;
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder hashes(ArtifactHashesResponse hashes) {
            this.hashes = Objects.requireNonNull(hashes);
            return this;
        }

        public Builder resourceUri(String resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }
        public GrafeasV1beta1IntotoArtifactResponse build() {
            return new GrafeasV1beta1IntotoArtifactResponse(hashes, resourceUri);
        }
    }
}
