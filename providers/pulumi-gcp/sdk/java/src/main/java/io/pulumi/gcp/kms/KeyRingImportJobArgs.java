// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class KeyRingImportJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyRingImportJobArgs Empty = new KeyRingImportJobArgs();

    /**
     * It must be unique within a KeyRing and match the regular expression [a-zA-Z0-9_-]{1,63}
     * 
     */
    @Import(name="importJobId", required=true)
      private final Output<String> importJobId;

    public Output<String> getImportJobId() {
        return this.importJobId;
    }

    /**
     * The wrapping method to be used for incoming key material.
     * Possible values are `RSA_OAEP_3072_SHA1_AES_256` and `RSA_OAEP_4096_SHA1_AES_256`.
     * 
     */
    @Import(name="importMethod", required=true)
      private final Output<String> importMethod;

    public Output<String> getImportMethod() {
        return this.importMethod;
    }

    /**
     * The KeyRing that this import job belongs to.
     * Format: `'projects/{{project}}/locations/{{location}}/keyRings/{{keyRing}}'`.
     * 
     */
    @Import(name="keyRing", required=true)
      private final Output<String> keyRing;

    public Output<String> getKeyRing() {
        return this.keyRing;
    }

    /**
     * The protection level of the ImportJob. This must match the protectionLevel of the
     * versionTemplate on the CryptoKey you attempt to import into.
     * Possible values are `SOFTWARE`, `HSM`, and `EXTERNAL`.
     * 
     */
    @Import(name="protectionLevel", required=true)
      private final Output<String> protectionLevel;

    public Output<String> getProtectionLevel() {
        return this.protectionLevel;
    }

    public KeyRingImportJobArgs(
        Output<String> importJobId,
        Output<String> importMethod,
        Output<String> keyRing,
        Output<String> protectionLevel) {
        this.importJobId = Objects.requireNonNull(importJobId, "expected parameter 'importJobId' to be non-null");
        this.importMethod = Objects.requireNonNull(importMethod, "expected parameter 'importMethod' to be non-null");
        this.keyRing = Objects.requireNonNull(keyRing, "expected parameter 'keyRing' to be non-null");
        this.protectionLevel = Objects.requireNonNull(protectionLevel, "expected parameter 'protectionLevel' to be non-null");
    }

    private KeyRingImportJobArgs() {
        this.importJobId = Output.empty();
        this.importMethod = Output.empty();
        this.keyRing = Output.empty();
        this.protectionLevel = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyRingImportJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> importJobId;
        private Output<String> importMethod;
        private Output<String> keyRing;
        private Output<String> protectionLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyRingImportJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.importJobId = defaults.importJobId;
    	      this.importMethod = defaults.importMethod;
    	      this.keyRing = defaults.keyRing;
    	      this.protectionLevel = defaults.protectionLevel;
        }

        public Builder importJobId(Output<String> importJobId) {
            this.importJobId = Objects.requireNonNull(importJobId);
            return this;
        }

        public Builder importJobId(String importJobId) {
            this.importJobId = Output.of(Objects.requireNonNull(importJobId));
            return this;
        }

        public Builder importMethod(Output<String> importMethod) {
            this.importMethod = Objects.requireNonNull(importMethod);
            return this;
        }

        public Builder importMethod(String importMethod) {
            this.importMethod = Output.of(Objects.requireNonNull(importMethod));
            return this;
        }

        public Builder keyRing(Output<String> keyRing) {
            this.keyRing = Objects.requireNonNull(keyRing);
            return this;
        }

        public Builder keyRing(String keyRing) {
            this.keyRing = Output.of(Objects.requireNonNull(keyRing));
            return this;
        }

        public Builder protectionLevel(Output<String> protectionLevel) {
            this.protectionLevel = Objects.requireNonNull(protectionLevel);
            return this;
        }

        public Builder protectionLevel(String protectionLevel) {
            this.protectionLevel = Output.of(Objects.requireNonNull(protectionLevel));
            return this;
        }
        public KeyRingImportJobArgs build() {
            return new KeyRingImportJobArgs(importJobId, importMethod, keyRing, protectionLevel);
        }
    }
}
