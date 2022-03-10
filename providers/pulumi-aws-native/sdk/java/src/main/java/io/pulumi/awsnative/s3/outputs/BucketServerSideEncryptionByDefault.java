// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.enums.BucketServerSideEncryptionByDefaultSSEAlgorithm;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketServerSideEncryptionByDefault {
    /**
     * "KMSMasterKeyID" can only be used when you set the value of SSEAlgorithm as aws:kms.
     * 
     */
    private final @Nullable String kMSMasterKeyID;
    private final BucketServerSideEncryptionByDefaultSSEAlgorithm sSEAlgorithm;

    @OutputCustomType.Constructor
    private BucketServerSideEncryptionByDefault(
        @OutputCustomType.Parameter("kMSMasterKeyID") @Nullable String kMSMasterKeyID,
        @OutputCustomType.Parameter("sSEAlgorithm") BucketServerSideEncryptionByDefaultSSEAlgorithm sSEAlgorithm) {
        this.kMSMasterKeyID = kMSMasterKeyID;
        this.sSEAlgorithm = sSEAlgorithm;
    }

    /**
     * "KMSMasterKeyID" can only be used when you set the value of SSEAlgorithm as aws:kms.
     * 
    */
    public Optional<String> getKMSMasterKeyID() {
        return Optional.ofNullable(this.kMSMasterKeyID);
    }
    public BucketServerSideEncryptionByDefaultSSEAlgorithm getSSEAlgorithm() {
        return this.sSEAlgorithm;
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

        public Builder setKMSMasterKeyID(@Nullable String kMSMasterKeyID) {
            this.kMSMasterKeyID = kMSMasterKeyID;
            return this;
        }

        public Builder setSSEAlgorithm(BucketServerSideEncryptionByDefaultSSEAlgorithm sSEAlgorithm) {
            this.sSEAlgorithm = Objects.requireNonNull(sSEAlgorithm);
            return this;
        }
        public BucketServerSideEncryptionByDefault build() {
            return new BucketServerSideEncryptionByDefault(kMSMasterKeyID, sSEAlgorithm);
        }
    }
}
