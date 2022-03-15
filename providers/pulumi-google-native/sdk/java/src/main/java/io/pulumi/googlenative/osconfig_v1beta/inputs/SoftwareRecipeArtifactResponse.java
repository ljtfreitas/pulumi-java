// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.osconfig_v1beta.inputs.SoftwareRecipeArtifactGcsResponse;
import io.pulumi.googlenative.osconfig_v1beta.inputs.SoftwareRecipeArtifactRemoteResponse;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Specifies a resource to be used in the recipe.
 * 
 */
public final class SoftwareRecipeArtifactResponse extends io.pulumi.resources.InvokeArgs {

    public static final SoftwareRecipeArtifactResponse Empty = new SoftwareRecipeArtifactResponse();

    /**
     * Defaults to false. When false, recipes are subject to validations based on the artifact type: Remote: A checksum must be specified, and only protocols with transport-layer security are permitted. GCS: An object generation number must be specified.
     * 
     */
    @Import(name="allowInsecure", required=true)
      private final Boolean allowInsecure;

    public Boolean getAllowInsecure() {
        return this.allowInsecure;
    }

    /**
     * A Google Cloud Storage artifact.
     * 
     */
    @Import(name="gcs", required=true)
      private final SoftwareRecipeArtifactGcsResponse gcs;

    public SoftwareRecipeArtifactGcsResponse getGcs() {
        return this.gcs;
    }

    /**
     * A generic remote artifact.
     * 
     */
    @Import(name="remote", required=true)
      private final SoftwareRecipeArtifactRemoteResponse remote;

    public SoftwareRecipeArtifactRemoteResponse getRemote() {
        return this.remote;
    }

    public SoftwareRecipeArtifactResponse(
        Boolean allowInsecure,
        SoftwareRecipeArtifactGcsResponse gcs,
        SoftwareRecipeArtifactRemoteResponse remote) {
        this.allowInsecure = Objects.requireNonNull(allowInsecure, "expected parameter 'allowInsecure' to be non-null");
        this.gcs = Objects.requireNonNull(gcs, "expected parameter 'gcs' to be non-null");
        this.remote = Objects.requireNonNull(remote, "expected parameter 'remote' to be non-null");
    }

    private SoftwareRecipeArtifactResponse() {
        this.allowInsecure = null;
        this.gcs = null;
        this.remote = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareRecipeArtifactResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowInsecure;
        private SoftwareRecipeArtifactGcsResponse gcs;
        private SoftwareRecipeArtifactRemoteResponse remote;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareRecipeArtifactResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowInsecure = defaults.allowInsecure;
    	      this.gcs = defaults.gcs;
    	      this.remote = defaults.remote;
        }

        public Builder allowInsecure(Boolean allowInsecure) {
            this.allowInsecure = Objects.requireNonNull(allowInsecure);
            return this;
        }

        public Builder gcs(SoftwareRecipeArtifactGcsResponse gcs) {
            this.gcs = Objects.requireNonNull(gcs);
            return this;
        }

        public Builder remote(SoftwareRecipeArtifactRemoteResponse remote) {
            this.remote = Objects.requireNonNull(remote);
            return this;
        }
        public SoftwareRecipeArtifactResponse build() {
            return new SoftwareRecipeArtifactResponse(allowInsecure, gcs, remote);
        }
    }
}
