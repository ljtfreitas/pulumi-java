// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.outputs;

import io.pulumi.aws.signer.outputs.GetSigningProfileRevocationRecord;
import io.pulumi.aws.signer.outputs.GetSigningProfileSignatureValidityPeriod;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
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

    @CustomType.Constructor
    private GetSigningProfileResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("platformDisplayName") String platformDisplayName,
        @CustomType.Parameter("platformId") String platformId,
        @CustomType.Parameter("revocationRecords") List<GetSigningProfileRevocationRecord> revocationRecords,
        @CustomType.Parameter("signatureValidityPeriods") List<GetSigningProfileSignatureValidityPeriod> signatureValidityPeriods,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("version") String version,
        @CustomType.Parameter("versionArn") String versionArn) {
        this.arn = arn;
        this.id = id;
        this.name = name;
        this.platformDisplayName = platformDisplayName;
        this.platformId = platformId;
        this.revocationRecords = revocationRecords;
        this.signatureValidityPeriods = signatureValidityPeriods;
        this.status = status;
        this.tags = tags;
        this.version = version;
        this.versionArn = versionArn;
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

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder platformDisplayName(String platformDisplayName) {
            this.platformDisplayName = Objects.requireNonNull(platformDisplayName);
            return this;
        }

        public Builder platformId(String platformId) {
            this.platformId = Objects.requireNonNull(platformId);
            return this;
        }

        public Builder revocationRecords(List<GetSigningProfileRevocationRecord> revocationRecords) {
            this.revocationRecords = Objects.requireNonNull(revocationRecords);
            return this;
        }

        public Builder signatureValidityPeriods(List<GetSigningProfileSignatureValidityPeriod> signatureValidityPeriods) {
            this.signatureValidityPeriods = Objects.requireNonNull(signatureValidityPeriods);
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public Builder versionArn(String versionArn) {
            this.versionArn = Objects.requireNonNull(versionArn);
            return this;
        }
        public GetSigningProfileResult build() {
            return new GetSigningProfileResult(arn, id, name, platformDisplayName, platformId, revocationRecords, signatureValidityPeriods, status, tags, version, versionArn);
        }
    }
}
