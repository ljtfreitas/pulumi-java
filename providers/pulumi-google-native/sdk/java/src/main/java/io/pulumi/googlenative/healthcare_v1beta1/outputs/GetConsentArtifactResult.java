// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.ImageResponse;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.SignatureResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetConsentArtifactResult {
    /**
     * Optional. Screenshots, PDFs, or other binary information documenting the user's consent.
     * 
     */
    private final List<ImageResponse> consentContentScreenshots;
    /**
     * Optional. An string indicating the version of the consent information shown to the user.
     * 
     */
    private final String consentContentVersion;
    /**
     * Optional. A signature from a guardian.
     * 
     */
    private final SignatureResponse guardianSignature;
    /**
     * Optional. Metadata associated with the Consent artifact. For example, the consent locale or user agent version.
     * 
     */
    private final Map<String,String> metadata;
    /**
     * Resource name of the Consent artifact, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`. Cannot be changed after creation.
     * 
     */
    private final String name;
    /**
     * User's UUID provided by the client.
     * 
     */
    private final String userId;
    /**
     * Optional. User's signature.
     * 
     */
    private final SignatureResponse userSignature;
    /**
     * Optional. A signature from a witness.
     * 
     */
    private final SignatureResponse witnessSignature;

    @OutputCustomType.Constructor({"consentContentScreenshots","consentContentVersion","guardianSignature","metadata","name","userId","userSignature","witnessSignature"})
    private GetConsentArtifactResult(
        List<ImageResponse> consentContentScreenshots,
        String consentContentVersion,
        SignatureResponse guardianSignature,
        Map<String,String> metadata,
        String name,
        String userId,
        SignatureResponse userSignature,
        SignatureResponse witnessSignature) {
        this.consentContentScreenshots = Objects.requireNonNull(consentContentScreenshots);
        this.consentContentVersion = Objects.requireNonNull(consentContentVersion);
        this.guardianSignature = Objects.requireNonNull(guardianSignature);
        this.metadata = Objects.requireNonNull(metadata);
        this.name = Objects.requireNonNull(name);
        this.userId = Objects.requireNonNull(userId);
        this.userSignature = Objects.requireNonNull(userSignature);
        this.witnessSignature = Objects.requireNonNull(witnessSignature);
    }

    /**
     * Optional. Screenshots, PDFs, or other binary information documenting the user's consent.
     * 
     */
    public List<ImageResponse> getConsentContentScreenshots() {
        return this.consentContentScreenshots;
    }
    /**
     * Optional. An string indicating the version of the consent information shown to the user.
     * 
     */
    public String getConsentContentVersion() {
        return this.consentContentVersion;
    }
    /**
     * Optional. A signature from a guardian.
     * 
     */
    public SignatureResponse getGuardianSignature() {
        return this.guardianSignature;
    }
    /**
     * Optional. Metadata associated with the Consent artifact. For example, the consent locale or user agent version.
     * 
     */
    public Map<String,String> getMetadata() {
        return this.metadata;
    }
    /**
     * Resource name of the Consent artifact, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`. Cannot be changed after creation.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * User's UUID provided by the client.
     * 
     */
    public String getUserId() {
        return this.userId;
    }
    /**
     * Optional. User's signature.
     * 
     */
    public SignatureResponse getUserSignature() {
        return this.userSignature;
    }
    /**
     * Optional. A signature from a witness.
     * 
     */
    public SignatureResponse getWitnessSignature() {
        return this.witnessSignature;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConsentArtifactResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ImageResponse> consentContentScreenshots;
        private String consentContentVersion;
        private SignatureResponse guardianSignature;
        private Map<String,String> metadata;
        private String name;
        private String userId;
        private SignatureResponse userSignature;
        private SignatureResponse witnessSignature;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConsentArtifactResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consentContentScreenshots = defaults.consentContentScreenshots;
    	      this.consentContentVersion = defaults.consentContentVersion;
    	      this.guardianSignature = defaults.guardianSignature;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.userId = defaults.userId;
    	      this.userSignature = defaults.userSignature;
    	      this.witnessSignature = defaults.witnessSignature;
        }

        public Builder setConsentContentScreenshots(List<ImageResponse> consentContentScreenshots) {
            this.consentContentScreenshots = Objects.requireNonNull(consentContentScreenshots);
            return this;
        }

        public Builder setConsentContentVersion(String consentContentVersion) {
            this.consentContentVersion = Objects.requireNonNull(consentContentVersion);
            return this;
        }

        public Builder setGuardianSignature(SignatureResponse guardianSignature) {
            this.guardianSignature = Objects.requireNonNull(guardianSignature);
            return this;
        }

        public Builder setMetadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setUserId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }

        public Builder setUserSignature(SignatureResponse userSignature) {
            this.userSignature = Objects.requireNonNull(userSignature);
            return this;
        }

        public Builder setWitnessSignature(SignatureResponse witnessSignature) {
            this.witnessSignature = Objects.requireNonNull(witnessSignature);
            return this;
        }
        public GetConsentArtifactResult build() {
            return new GetConsentArtifactResult(consentContentScreenshots, consentContentVersion, guardianSignature, metadata, name, userId, userSignature, witnessSignature);
        }
    }
}
