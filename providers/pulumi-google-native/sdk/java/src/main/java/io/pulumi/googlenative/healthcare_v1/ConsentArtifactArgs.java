// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.healthcare_v1.inputs.ImageArgs;
import io.pulumi.googlenative.healthcare_v1.inputs.SignatureArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConsentArtifactArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConsentArtifactArgs Empty = new ConsentArtifactArgs();

    /**
     * Optional. Screenshots, PDFs, or other binary information documenting the user's consent.
     * 
     */
    @Import(name="consentContentScreenshots")
      private final @Nullable Output<List<ImageArgs>> consentContentScreenshots;

    public Output<List<ImageArgs>> getConsentContentScreenshots() {
        return this.consentContentScreenshots == null ? Output.empty() : this.consentContentScreenshots;
    }

    /**
     * Optional. An string indicating the version of the consent information shown to the user.
     * 
     */
    @Import(name="consentContentVersion")
      private final @Nullable Output<String> consentContentVersion;

    public Output<String> getConsentContentVersion() {
        return this.consentContentVersion == null ? Output.empty() : this.consentContentVersion;
    }

    @Import(name="consentStoreId", required=true)
      private final Output<String> consentStoreId;

    public Output<String> getConsentStoreId() {
        return this.consentStoreId;
    }

    @Import(name="datasetId", required=true)
      private final Output<String> datasetId;

    public Output<String> getDatasetId() {
        return this.datasetId;
    }

    /**
     * Optional. A signature from a guardian.
     * 
     */
    @Import(name="guardianSignature")
      private final @Nullable Output<SignatureArgs> guardianSignature;

    public Output<SignatureArgs> getGuardianSignature() {
        return this.guardianSignature == null ? Output.empty() : this.guardianSignature;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Optional. Metadata associated with the Consent artifact. For example, the consent locale or user agent version.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<Map<String,String>> metadata;

    public Output<Map<String,String>> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    /**
     * Resource name of the Consent artifact, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`. Cannot be changed after creation.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * User's UUID provided by the client.
     * 
     */
    @Import(name="userId", required=true)
      private final Output<String> userId;

    public Output<String> getUserId() {
        return this.userId;
    }

    /**
     * Optional. User's signature.
     * 
     */
    @Import(name="userSignature")
      private final @Nullable Output<SignatureArgs> userSignature;

    public Output<SignatureArgs> getUserSignature() {
        return this.userSignature == null ? Output.empty() : this.userSignature;
    }

    /**
     * Optional. A signature from a witness.
     * 
     */
    @Import(name="witnessSignature")
      private final @Nullable Output<SignatureArgs> witnessSignature;

    public Output<SignatureArgs> getWitnessSignature() {
        return this.witnessSignature == null ? Output.empty() : this.witnessSignature;
    }

    public ConsentArtifactArgs(
        @Nullable Output<List<ImageArgs>> consentContentScreenshots,
        @Nullable Output<String> consentContentVersion,
        Output<String> consentStoreId,
        Output<String> datasetId,
        @Nullable Output<SignatureArgs> guardianSignature,
        @Nullable Output<String> location,
        @Nullable Output<Map<String,String>> metadata,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        Output<String> userId,
        @Nullable Output<SignatureArgs> userSignature,
        @Nullable Output<SignatureArgs> witnessSignature) {
        this.consentContentScreenshots = consentContentScreenshots;
        this.consentContentVersion = consentContentVersion;
        this.consentStoreId = Objects.requireNonNull(consentStoreId, "expected parameter 'consentStoreId' to be non-null");
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.guardianSignature = guardianSignature;
        this.location = location;
        this.metadata = metadata;
        this.name = name;
        this.project = project;
        this.userId = Objects.requireNonNull(userId, "expected parameter 'userId' to be non-null");
        this.userSignature = userSignature;
        this.witnessSignature = witnessSignature;
    }

    private ConsentArtifactArgs() {
        this.consentContentScreenshots = Output.empty();
        this.consentContentVersion = Output.empty();
        this.consentStoreId = Output.empty();
        this.datasetId = Output.empty();
        this.guardianSignature = Output.empty();
        this.location = Output.empty();
        this.metadata = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.userId = Output.empty();
        this.userSignature = Output.empty();
        this.witnessSignature = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsentArtifactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ImageArgs>> consentContentScreenshots;
        private @Nullable Output<String> consentContentVersion;
        private Output<String> consentStoreId;
        private Output<String> datasetId;
        private @Nullable Output<SignatureArgs> guardianSignature;
        private @Nullable Output<String> location;
        private @Nullable Output<Map<String,String>> metadata;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private Output<String> userId;
        private @Nullable Output<SignatureArgs> userSignature;
        private @Nullable Output<SignatureArgs> witnessSignature;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsentArtifactArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consentContentScreenshots = defaults.consentContentScreenshots;
    	      this.consentContentVersion = defaults.consentContentVersion;
    	      this.consentStoreId = defaults.consentStoreId;
    	      this.datasetId = defaults.datasetId;
    	      this.guardianSignature = defaults.guardianSignature;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.userId = defaults.userId;
    	      this.userSignature = defaults.userSignature;
    	      this.witnessSignature = defaults.witnessSignature;
        }

        public Builder consentContentScreenshots(@Nullable Output<List<ImageArgs>> consentContentScreenshots) {
            this.consentContentScreenshots = consentContentScreenshots;
            return this;
        }

        public Builder consentContentScreenshots(@Nullable List<ImageArgs> consentContentScreenshots) {
            this.consentContentScreenshots = Output.ofNullable(consentContentScreenshots);
            return this;
        }

        public Builder consentContentVersion(@Nullable Output<String> consentContentVersion) {
            this.consentContentVersion = consentContentVersion;
            return this;
        }

        public Builder consentContentVersion(@Nullable String consentContentVersion) {
            this.consentContentVersion = Output.ofNullable(consentContentVersion);
            return this;
        }

        public Builder consentStoreId(Output<String> consentStoreId) {
            this.consentStoreId = Objects.requireNonNull(consentStoreId);
            return this;
        }

        public Builder consentStoreId(String consentStoreId) {
            this.consentStoreId = Output.of(Objects.requireNonNull(consentStoreId));
            return this;
        }

        public Builder datasetId(Output<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder datasetId(String datasetId) {
            this.datasetId = Output.of(Objects.requireNonNull(datasetId));
            return this;
        }

        public Builder guardianSignature(@Nullable Output<SignatureArgs> guardianSignature) {
            this.guardianSignature = guardianSignature;
            return this;
        }

        public Builder guardianSignature(@Nullable SignatureArgs guardianSignature) {
            this.guardianSignature = Output.ofNullable(guardianSignature);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = Output.ofNullable(metadata);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder userId(Output<String> userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }

        public Builder userId(String userId) {
            this.userId = Output.of(Objects.requireNonNull(userId));
            return this;
        }

        public Builder userSignature(@Nullable Output<SignatureArgs> userSignature) {
            this.userSignature = userSignature;
            return this;
        }

        public Builder userSignature(@Nullable SignatureArgs userSignature) {
            this.userSignature = Output.ofNullable(userSignature);
            return this;
        }

        public Builder witnessSignature(@Nullable Output<SignatureArgs> witnessSignature) {
            this.witnessSignature = witnessSignature;
            return this;
        }

        public Builder witnessSignature(@Nullable SignatureArgs witnessSignature) {
            this.witnessSignature = Output.ofNullable(witnessSignature);
            return this;
        }
        public ConsentArtifactArgs build() {
            return new ConsentArtifactArgs(consentContentScreenshots, consentContentVersion, consentStoreId, datasetId, guardianSignature, location, metadata, name, project, userId, userSignature, witnessSignature);
        }
    }
}
