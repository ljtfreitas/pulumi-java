// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefaultArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefaultArgs Empty = new BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefaultArgs();

    /**
     * The AWS KMS master key ID used for the SSE-KMS encryption. This can only be used when you set the value of `sse_algorithm` as `aws:kms`. The default `aws/s3` AWS KMS master key is used if this element is absent while the `sse_algorithm` is `aws:kms`.
     * 
     */
    @Import(name="kmsMasterKeyId")
      private final @Nullable Output<String> kmsMasterKeyId;

    public Output<String> getKmsMasterKeyId() {
        return this.kmsMasterKeyId == null ? Output.empty() : this.kmsMasterKeyId;
    }

    /**
     * The server-side encryption algorithm to use. Valid values are `AES256` and `aws:kms`
     * 
     */
    @Import(name="sseAlgorithm", required=true)
      private final Output<String> sseAlgorithm;

    public Output<String> getSseAlgorithm() {
        return this.sseAlgorithm;
    }

    public BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefaultArgs(
        @Nullable Output<String> kmsMasterKeyId,
        Output<String> sseAlgorithm) {
        this.kmsMasterKeyId = kmsMasterKeyId;
        this.sseAlgorithm = Objects.requireNonNull(sseAlgorithm, "expected parameter 'sseAlgorithm' to be non-null");
    }

    private BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefaultArgs() {
        this.kmsMasterKeyId = Output.empty();
        this.sseAlgorithm = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefaultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kmsMasterKeyId;
        private Output<String> sseAlgorithm;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefaultArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsMasterKeyId = defaults.kmsMasterKeyId;
    	      this.sseAlgorithm = defaults.sseAlgorithm;
        }

        public Builder kmsMasterKeyId(@Nullable Output<String> kmsMasterKeyId) {
            this.kmsMasterKeyId = kmsMasterKeyId;
            return this;
        }

        public Builder kmsMasterKeyId(@Nullable String kmsMasterKeyId) {
            this.kmsMasterKeyId = Output.ofNullable(kmsMasterKeyId);
            return this;
        }

        public Builder sseAlgorithm(Output<String> sseAlgorithm) {
            this.sseAlgorithm = Objects.requireNonNull(sseAlgorithm);
            return this;
        }

        public Builder sseAlgorithm(String sseAlgorithm) {
            this.sseAlgorithm = Output.of(Objects.requireNonNull(sseAlgorithm));
            return this;
        }
        public BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefaultArgs build() {
            return new BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefaultArgs(kmsMasterKeyId, sseAlgorithm);
        }
    }
}
