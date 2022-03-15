// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureGroupOnlineStoreConfigSecurityConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureGroupOnlineStoreConfigSecurityConfigArgs Empty = new FeatureGroupOnlineStoreConfigSecurityConfigArgs();

    /**
     * The ID of the AWS Key Management Service (AWS KMS) key that SageMaker Feature Store uses to encrypt the Amazon S3 objects at rest using Amazon S3 server-side encryption.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Output.empty() : this.kmsKeyId;
    }

    public FeatureGroupOnlineStoreConfigSecurityConfigArgs(@Nullable Output<String> kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    private FeatureGroupOnlineStoreConfigSecurityConfigArgs() {
        this.kmsKeyId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureGroupOnlineStoreConfigSecurityConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kmsKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureGroupOnlineStoreConfigSecurityConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Output.ofNullable(kmsKeyId);
            return this;
        }
        public FeatureGroupOnlineStoreConfigSecurityConfigArgs build() {
            return new FeatureGroupOnlineStoreConfigSecurityConfigArgs(kmsKeyId);
        }
    }
}
