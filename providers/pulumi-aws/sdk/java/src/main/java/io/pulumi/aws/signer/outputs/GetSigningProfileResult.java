// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.outputs;

import io.pulumi.aws.signer.outputs.GetSigningProfileRevocationRecord;
import io.pulumi.aws.signer.outputs.GetSigningProfileSignatureValidityPeriod;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetSigningProfileResult {
    /**
     * The Amazon Resource Name (ARN) for the signing profile.
     * 
     */
    private final String arn;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    /**
     * A human-readable name for the signing platform associated with the signing profile.
     * 
     */
    private final String platformDisplayName;
    /**
     * The ID of the platform that is used by the target signing profile.
     * 
     */
    private final String platformId;
    /**
     * Revocation information for a signing profile.
     * 
     */
    private final List<GetSigningProfileRevocationRecord> revocationRecords;
    /**
     * The validity period for a signing job.
     * 
     */
    private final List<GetSigningProfileSignatureValidityPeriod> signatureValidityPeriods;
    /**
     * The status of the target signing profile.
     * 
     */
    private final String status;
    /**
     * A list of tags associated with the signing profile.
     * 
     */
    private final Map<String,String> tags;
    /**
     * The current version of the signing profile.
     * 
     */
    private final String version;
    /**
     * The signing profile ARN, including the profile version.
     * 
     */
    private final String versionArn;

    @OutputCustomType.Constructor({"arn","id","name","platformDisplayName","platformId","revocationRecords","signatureValidityPeriods","status","tags","version","versionArn"})
    private GetSigningProfileResult(
        String arn,
        String id,
        String name,
        String platformDisplayName,
        String platformId,
        List<GetSigningProfileRevocationRecord> revocationRecords,
        List<GetSigningProfileSignatureValidityPeriod> signatureValidityPeriods,
        String status,
        Map<String,String> tags,
        String version,
        String versionArn) {
        this.arn = Objects.requireNonNull(arn);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.platformDisplayName = Objects.requireNonNull(platformDisplayName);
        this.platformId = Objects.requireNonNull(platformId);
        this.revocationRecords = Objects.requireNonNull(revocationRecords);
        this.signatureValidityPeriods = Objects.requireNonNull(signatureValidityPeriods);
        this.status = Objects.requireNonNull(status);
        this.tags = Objects.requireNonNull(tags);
        this.version = Objects.requireNonNull(version);
        this.versionArn = Objects.requireNonNull(versionArn);
    }

    /**
     * The Amazon Resource Name (ARN) for the signing profile.
     * 
     */
    public String getArn() {
        return this.arn;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    /**
     * A human-readable name for the signing platform associated with the signing profile.
     * 
     */
    public String getPlatformDisplayName() {
        return this.platformDisplayName;
    }
    /**
     * The ID of the platform that is used by the target signing profile.
     * 
     */
    public String getPlatformId() {
        return this.platformId;
    }
    /**
     * Revocation information for a signing profile.
     * 
     */
    public List<GetSigningProfileRevocationRecord> getRevocationRecords() {
        return this.revocationRecords;
    }
    /**
     * The validity period for a signing job.
     * 
     */
    public List<GetSigningProfileSignatureValidityPeriod> getSignatureValidityPeriods() {
        return this.signatureValidityPeriods;
    }
    /**
     * The status of the target signing profile.
     * 
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * A list of tags associated with the signing profile.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * The current version of the signing profile.
     * 
     */
    public String getVersion() {
        return this.version;
    }
    /**
     * The signing profile ARN, including the profile version.
     * 
     */
    public String getVersionArn() {
        return this.versionArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSigningProfileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String id;
        private String name;
        private String platformDisplayName;
        private String platformId;
        private List<GetSigningProfileRevocationRecord> revocationRecords;
        private List<GetSigningProfileSignatureValidityPeriod> signatureValidityPeriods;
        private String status;
        private Map<String,String> tags;
        private String version;
        private String versionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSigningProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.platformDisplayName = defaults.platformDisplayName;
    	      this.platformId = defaults.platformId;
    	      this.revocationRecords = defaults.revocationRecords;
    	      this.signatureValidityPeriods = defaults.signatureValidityPeriods;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.version = defaults.version;
    	      this.versionArn = defaults.versionArn;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPlatformDisplayName(String platformDisplayName) {
            this.platformDisplayName = Objects.requireNonNull(platformDisplayName);
            return this;
        }

        public Builder setPlatformId(String platformId) {
            this.platformId = Objects.requireNonNull(platformId);
            return this;
        }

        public Builder setRevocationRecords(List<GetSigningProfileRevocationRecord> revocationRecords) {
            this.revocationRecords = Objects.requireNonNull(revocationRecords);
            return this;
        }

        public Builder setSignatureValidityPeriods(List<GetSigningProfileSignatureValidityPeriod> signatureValidityPeriods) {
            this.signatureValidityPeriods = Objects.requireNonNull(signatureValidityPeriods);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public Builder setVersionArn(String versionArn) {
            this.versionArn = Objects.requireNonNull(versionArn);
            return this;
        }
        public GetSigningProfileResult build() {
            return new GetSigningProfileResult(arn, id, name, platformDisplayName, platformId, revocationRecords, signatureValidityPeriods, status, tags, version, versionArn);
        }
    }
}
