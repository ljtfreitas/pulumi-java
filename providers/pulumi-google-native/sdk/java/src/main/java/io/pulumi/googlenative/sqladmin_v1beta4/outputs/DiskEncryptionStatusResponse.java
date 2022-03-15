// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DiskEncryptionStatusResponse {
    /**
     * This is always `sql#diskEncryptionStatus`.
     * 
     */
    private final String kind;
    /**
     * KMS key version used to encrypt the Cloud SQL instance resource
     * 
     */
    private final String kmsKeyVersionName;

    @CustomType.Constructor
    private DiskEncryptionStatusResponse(
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("kmsKeyVersionName") String kmsKeyVersionName) {
        this.kind = kind;
        this.kmsKeyVersionName = kmsKeyVersionName;
    }

    /**
     * This is always `sql#diskEncryptionStatus`.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * KMS key version used to encrypt the Cloud SQL instance resource
     * 
    */
    public String getKmsKeyVersionName() {
        return this.kmsKeyVersionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskEncryptionStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private String kmsKeyVersionName;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskEncryptionStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.kmsKeyVersionName = defaults.kmsKeyVersionName;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder kmsKeyVersionName(String kmsKeyVersionName) {
            this.kmsKeyVersionName = Objects.requireNonNull(kmsKeyVersionName);
            return this;
        }
        public DiskEncryptionStatusResponse build() {
            return new DiskEncryptionStatusResponse(kind, kmsKeyVersionName);
        }
    }
}
