// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesRecipeArtifactGcs;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesRecipeArtifactRemote;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GuestPoliciesRecipeArtifact {
    /**
     * Defaults to false. When false, recipes are subject to validations based on the artifact type:
     * Remote: A checksum must be specified, and only protocols with transport-layer security are permitted.
     * GCS: An object generation number must be specified.
     * 
     */
    private final @Nullable Boolean allowInsecure;
    /**
     * A Google Cloud Storage artifact.
     * Structure is documented below.
     * 
     */
    private final @Nullable GuestPoliciesRecipeArtifactGcs gcs;
    /**
     * Id of the artifact, which the installation and update steps of this recipe can reference.
     * Artifacts in a recipe cannot have the same id.
     * 
     */
    private final String id;
    /**
     * A generic remote artifact.
     * Structure is documented below.
     * 
     */
    private final @Nullable GuestPoliciesRecipeArtifactRemote remote;

    @CustomType.Constructor
    private GuestPoliciesRecipeArtifact(
        @CustomType.Parameter("allowInsecure") @Nullable Boolean allowInsecure,
        @CustomType.Parameter("gcs") @Nullable GuestPoliciesRecipeArtifactGcs gcs,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("remote") @Nullable GuestPoliciesRecipeArtifactRemote remote) {
        this.allowInsecure = allowInsecure;
        this.gcs = gcs;
        this.id = id;
        this.remote = remote;
    }

    /**
     * Defaults to false. When false, recipes are subject to validations based on the artifact type:
     * Remote: A checksum must be specified, and only protocols with transport-layer security are permitted.
     * GCS: An object generation number must be specified.
     * 
    */
    public Optional<Boolean> getAllowInsecure() {
        return Optional.ofNullable(this.allowInsecure);
    }
    /**
     * A Google Cloud Storage artifact.
     * Structure is documented below.
     * 
    */
    public Optional<GuestPoliciesRecipeArtifactGcs> getGcs() {
        return Optional.ofNullable(this.gcs);
    }
    /**
     * Id of the artifact, which the installation and update steps of this recipe can reference.
     * Artifacts in a recipe cannot have the same id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * A generic remote artifact.
     * Structure is documented below.
     * 
    */
    public Optional<GuestPoliciesRecipeArtifactRemote> getRemote() {
        return Optional.ofNullable(this.remote);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeArtifact defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowInsecure;
        private @Nullable GuestPoliciesRecipeArtifactGcs gcs;
        private String id;
        private @Nullable GuestPoliciesRecipeArtifactRemote remote;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeArtifact defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowInsecure = defaults.allowInsecure;
    	      this.gcs = defaults.gcs;
    	      this.id = defaults.id;
    	      this.remote = defaults.remote;
        }

        public Builder allowInsecure(@Nullable Boolean allowInsecure) {
            this.allowInsecure = allowInsecure;
            return this;
        }

        public Builder gcs(@Nullable GuestPoliciesRecipeArtifactGcs gcs) {
            this.gcs = gcs;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder remote(@Nullable GuestPoliciesRecipeArtifactRemote remote) {
            this.remote = remote;
            return this;
        }
        public GuestPoliciesRecipeArtifact build() {
            return new GuestPoliciesRecipeArtifact(allowInsecure, gcs, id, remote);
        }
    }
}
