// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudkms_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudkms_v1.inputs.ExternalProtectionLevelOptionsResponse;
import io.pulumi.googlenative.cloudkms_v1.inputs.KeyOperationAttestationResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * A CryptoKeyVersion represents an individual cryptographic key, and the associated key material. An ENABLED version can be used for cryptographic operations. For security reasons, the raw cryptographic key material represented by a CryptoKeyVersion can never be viewed or exported. It can only be used to encrypt, decrypt, or sign data when an authorized user or application invokes Cloud KMS.
 * 
 */
public final class CryptoKeyVersionResponse extends io.pulumi.resources.InvokeArgs {

    public static final CryptoKeyVersionResponse Empty = new CryptoKeyVersionResponse();

    /**
     * The CryptoKeyVersionAlgorithm that this CryptoKeyVersion supports.
     * 
     */
    @InputImport(name="algorithm", required=true)
      private final String algorithm;

    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * Statement that was generated and signed by the HSM at key creation time. Use this statement to verify attributes of the key as stored on the HSM, independently of Google. Only provided for key versions with protection_level HSM.
     * 
     */
    @InputImport(name="attestation", required=true)
      private final KeyOperationAttestationResponse attestation;

    public KeyOperationAttestationResponse getAttestation() {
        return this.attestation;
    }

    /**
     * The time at which this CryptoKeyVersion was created.
     * 
     */
    @InputImport(name="createTime", required=true)
      private final String createTime;

    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * The time this CryptoKeyVersion's key material was destroyed. Only present if state is DESTROYED.
     * 
     */
    @InputImport(name="destroyEventTime", required=true)
      private final String destroyEventTime;

    public String getDestroyEventTime() {
        return this.destroyEventTime;
    }

    /**
     * The time this CryptoKeyVersion's key material is scheduled for destruction. Only present if state is DESTROY_SCHEDULED.
     * 
     */
    @InputImport(name="destroyTime", required=true)
      private final String destroyTime;

    public String getDestroyTime() {
        return this.destroyTime;
    }

    /**
     * ExternalProtectionLevelOptions stores a group of additional fields for configuring a CryptoKeyVersion that are specific to the EXTERNAL protection level and EXTERNAL_VPC protection levels.
     * 
     */
    @InputImport(name="externalProtectionLevelOptions", required=true)
      private final ExternalProtectionLevelOptionsResponse externalProtectionLevelOptions;

    public ExternalProtectionLevelOptionsResponse getExternalProtectionLevelOptions() {
        return this.externalProtectionLevelOptions;
    }

    /**
     * The time this CryptoKeyVersion's key material was generated.
     * 
     */
    @InputImport(name="generateTime", required=true)
      private final String generateTime;

    public String getGenerateTime() {
        return this.generateTime;
    }

    /**
     * The root cause of the most recent import failure. Only present if state is IMPORT_FAILED.
     * 
     */
    @InputImport(name="importFailureReason", required=true)
      private final String importFailureReason;

    public String getImportFailureReason() {
        return this.importFailureReason;
    }

    /**
     * The name of the ImportJob used in the most recent import of this CryptoKeyVersion. Only present if the underlying key material was imported.
     * 
     */
    @InputImport(name="importJob", required=true)
      private final String importJob;

    public String getImportJob() {
        return this.importJob;
    }

    /**
     * The time at which this CryptoKeyVersion's key material was most recently imported.
     * 
     */
    @InputImport(name="importTime", required=true)
      private final String importTime;

    public String getImportTime() {
        return this.importTime;
    }

    /**
     * The resource name for this CryptoKeyVersion in the format `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*{@literal /}cryptoKeyVersions/*`.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The ProtectionLevel describing how crypto operations are performed with this CryptoKeyVersion.
     * 
     */
    @InputImport(name="protectionLevel", required=true)
      private final String protectionLevel;

    public String getProtectionLevel() {
        return this.protectionLevel;
    }

    /**
     * Whether or not this key version is eligible for reimport, by being specified as a target in ImportCryptoKeyVersionRequest.crypto_key_version.
     * 
     */
    @InputImport(name="reimportEligible", required=true)
      private final Boolean reimportEligible;

    public Boolean getReimportEligible() {
        return this.reimportEligible;
    }

    /**
     * The current state of the CryptoKeyVersion.
     * 
     */
    @InputImport(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    public CryptoKeyVersionResponse(
        String algorithm,
        KeyOperationAttestationResponse attestation,
        String createTime,
        String destroyEventTime,
        String destroyTime,
        ExternalProtectionLevelOptionsResponse externalProtectionLevelOptions,
        String generateTime,
        String importFailureReason,
        String importJob,
        String importTime,
        String name,
        String protectionLevel,
        Boolean reimportEligible,
        String state) {
        this.algorithm = Objects.requireNonNull(algorithm, "expected parameter 'algorithm' to be non-null");
        this.attestation = Objects.requireNonNull(attestation, "expected parameter 'attestation' to be non-null");
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.destroyEventTime = Objects.requireNonNull(destroyEventTime, "expected parameter 'destroyEventTime' to be non-null");
        this.destroyTime = Objects.requireNonNull(destroyTime, "expected parameter 'destroyTime' to be non-null");
        this.externalProtectionLevelOptions = Objects.requireNonNull(externalProtectionLevelOptions, "expected parameter 'externalProtectionLevelOptions' to be non-null");
        this.generateTime = Objects.requireNonNull(generateTime, "expected parameter 'generateTime' to be non-null");
        this.importFailureReason = Objects.requireNonNull(importFailureReason, "expected parameter 'importFailureReason' to be non-null");
        this.importJob = Objects.requireNonNull(importJob, "expected parameter 'importJob' to be non-null");
        this.importTime = Objects.requireNonNull(importTime, "expected parameter 'importTime' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.protectionLevel = Objects.requireNonNull(protectionLevel, "expected parameter 'protectionLevel' to be non-null");
        this.reimportEligible = Objects.requireNonNull(reimportEligible, "expected parameter 'reimportEligible' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
    }

    private CryptoKeyVersionResponse() {
        this.algorithm = null;
        this.attestation = null;
        this.createTime = null;
        this.destroyEventTime = null;
        this.destroyTime = null;
        this.externalProtectionLevelOptions = null;
        this.generateTime = null;
        this.importFailureReason = null;
        this.importJob = null;
        this.importTime = null;
        this.name = null;
        this.protectionLevel = null;
        this.reimportEligible = null;
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CryptoKeyVersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algorithm;
        private KeyOperationAttestationResponse attestation;
        private String createTime;
        private String destroyEventTime;
        private String destroyTime;
        private ExternalProtectionLevelOptionsResponse externalProtectionLevelOptions;
        private String generateTime;
        private String importFailureReason;
        private String importJob;
        private String importTime;
        private String name;
        private String protectionLevel;
        private Boolean reimportEligible;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(CryptoKeyVersionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.attestation = defaults.attestation;
    	      this.createTime = defaults.createTime;
    	      this.destroyEventTime = defaults.destroyEventTime;
    	      this.destroyTime = defaults.destroyTime;
    	      this.externalProtectionLevelOptions = defaults.externalProtectionLevelOptions;
    	      this.generateTime = defaults.generateTime;
    	      this.importFailureReason = defaults.importFailureReason;
    	      this.importJob = defaults.importJob;
    	      this.importTime = defaults.importTime;
    	      this.name = defaults.name;
    	      this.protectionLevel = defaults.protectionLevel;
    	      this.reimportEligible = defaults.reimportEligible;
    	      this.state = defaults.state;
        }

        public Builder setAlgorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }

        public Builder setAttestation(KeyOperationAttestationResponse attestation) {
            this.attestation = Objects.requireNonNull(attestation);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDestroyEventTime(String destroyEventTime) {
            this.destroyEventTime = Objects.requireNonNull(destroyEventTime);
            return this;
        }

        public Builder setDestroyTime(String destroyTime) {
            this.destroyTime = Objects.requireNonNull(destroyTime);
            return this;
        }

        public Builder setExternalProtectionLevelOptions(ExternalProtectionLevelOptionsResponse externalProtectionLevelOptions) {
            this.externalProtectionLevelOptions = Objects.requireNonNull(externalProtectionLevelOptions);
            return this;
        }

        public Builder setGenerateTime(String generateTime) {
            this.generateTime = Objects.requireNonNull(generateTime);
            return this;
        }

        public Builder setImportFailureReason(String importFailureReason) {
            this.importFailureReason = Objects.requireNonNull(importFailureReason);
            return this;
        }

        public Builder setImportJob(String importJob) {
            this.importJob = Objects.requireNonNull(importJob);
            return this;
        }

        public Builder setImportTime(String importTime) {
            this.importTime = Objects.requireNonNull(importTime);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProtectionLevel(String protectionLevel) {
            this.protectionLevel = Objects.requireNonNull(protectionLevel);
            return this;
        }

        public Builder setReimportEligible(Boolean reimportEligible) {
            this.reimportEligible = Objects.requireNonNull(reimportEligible);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public CryptoKeyVersionResponse build() {
            return new CryptoKeyVersionResponse(algorithm, attestation, createTime, destroyEventTime, destroyTime, externalProtectionLevelOptions, generateTime, importFailureReason, importJob, importTime, name, protectionLevel, reimportEligible, state);
        }
    }
}
