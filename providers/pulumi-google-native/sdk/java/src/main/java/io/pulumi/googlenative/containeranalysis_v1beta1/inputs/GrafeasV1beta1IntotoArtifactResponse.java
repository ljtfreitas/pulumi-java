// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.ArtifactHashesResponse;
import java.lang.String;
import java.util.Objects;


public final class GrafeasV1beta1IntotoArtifactResponse extends io.pulumi.resources.InvokeArgs {

    public static final GrafeasV1beta1IntotoArtifactResponse Empty = new GrafeasV1beta1IntotoArtifactResponse();

    @Import(name="hashes", required=true)
      private final ArtifactHashesResponse hashes;

    public ArtifactHashesResponse getHashes() {
        return this.hashes;
    }

    @Import(name="resourceUri", required=true)
      private final String resourceUri;

    public String getResourceUri() {
        return this.resourceUri;
    }

    public GrafeasV1beta1IntotoArtifactResponse(
        ArtifactHashesResponse hashes,
        String resourceUri) {
        this.hashes = Objects.requireNonNull(hashes, "expected parameter 'hashes' to be non-null");
        this.resourceUri = Objects.requireNonNull(resourceUri, "expected parameter 'resourceUri' to be non-null");
    }

    private GrafeasV1beta1IntotoArtifactResponse() {
        this.hashes = null;
        this.resourceUri = null;
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
