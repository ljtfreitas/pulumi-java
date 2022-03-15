// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.BucketServerSideEncryptionByDefaultSSEAlgorithm;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the default server-side encryption to apply to new objects in the bucket. If a PUT Object request doesn't specify any server-side encryption, this default encryption will be applied.
 * 
 */
public final class BucketServerSideEncryptionByDefault extends io.pulumi.resources.InvokeArgs {

    public static final BucketServerSideEncryptionByDefault Empty = new BucketServerSideEncryptionByDefault();

    /**
     * "KMSMasterKeyID" can only be used when you set the value of SSEAlgorithm as aws:kms.
     * 
     */
    @Import(name="kMSMasterKeyID")
      private final @Nullable String kMSMasterKeyID;

    public Optional<String> getKMSMasterKeyID() {
        return this.kMSMasterKeyID == null ? Optional.empty() : Optional.ofNullable(this.kMSMasterKeyID);
    }

    @Import(name="sSEAlgorithm", required=true)
      private final BucketServerSideEncryptionByDefaultSSEAlgorithm sSEAlgorithm;

    public BucketServerSideEncryptionByDefaultSSEAlgorithm getSSEAlgorithm() {
        return this.sSEAlgorithm;
    }

    public BucketServerSideEncryptionByDefault(
        @Nullable String kMSMasterKeyID,
        BucketServerSideEncryptionByDefaultSSEAlgorithm sSEAlgorithm) {
        this.kMSMasterKeyID = kMSMasterKeyID;
        this.sSEAlgorithm = Objects.requireNonNull(sSEAlgorithm, "expected parameter 'sSEAlgorithm' to be non-null");
    }

    private BucketServerSideEncryptionByDefault() {
        this.kMSMasterKeyID = null;
        this.sSEAlgorithm = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketServerSideEncryptionByDefault defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kMSMasterKeyID;
        private BucketServerSideEncryptionByDefaultSSEAlgorithm sSEAlgorithm;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketServerSideEncryptionByDefault defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kMSMasterKeyID = defaults.kMSMasterKeyID;
    	      this.sSEAlgorithm = defaults.sSEAlgorithm;
        }

        public Builder kMSMasterKeyID(@Nullable String kMSMasterKeyID) {
            this.kMSMasterKeyID = kMSMasterKeyID;
            return this;
        }

        public Builder sSEAlgorithm(BucketServerSideEncryptionByDefaultSSEAlgorithm sSEAlgorithm) {
            this.sSEAlgorithm = Objects.requireNonNull(sSEAlgorithm);
            return this;
        }
        public BucketServerSideEncryptionByDefault build() {
            return new BucketServerSideEncryptionByDefault(kMSMasterKeyID, sSEAlgorithm);
        }
    }
}
