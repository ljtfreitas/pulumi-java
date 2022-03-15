// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3;

import io.pulumi.aws.s3.inputs.AccessPointPublicAccessBlockConfigurationArgs;
import io.pulumi.aws.s3.inputs.AccessPointVpcConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessPointArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessPointArgs Empty = new AccessPointArgs();

    /**
     * AWS account ID for the owner of the bucket for which you want to create an access point. Defaults to automatically determined account ID of the AWS provider.
     * 
     */
    @Import(name="accountId")
      private final @Nullable Output<String> accountId;

    public Output<String> getAccountId() {
        return this.accountId == null ? Output.empty() : this.accountId;
    }

    /**
     * Name of an AWS Partition S3 Bucket or the Amazon Resource Name (ARN) of S3 on Outposts Bucket that you want to associate this access point with.
     * 
     */
    @Import(name="bucket", required=true)
      private final Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket;
    }

    /**
     * Name you want to assign to this access point.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Valid JSON document that specifies the policy that you want to apply to this access point. Removing `policy` from your configuration or setting `policy` to null or an empty string (i.e., `policy = ""`) _will not_ delete the policy since it could have been set by `aws.s3control.AccessPointPolicy`. To remove the `policy`, set it to `"{}"` (an empty JSON document).
     * 
     */
    @Import(name="policy")
      private final @Nullable Output<String> policy;

    public Output<String> getPolicy() {
        return this.policy == null ? Output.empty() : this.policy;
    }

    /**
     * Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. Detailed below.
     * 
     */
    @Import(name="publicAccessBlockConfiguration")
      private final @Nullable Output<AccessPointPublicAccessBlockConfigurationArgs> publicAccessBlockConfiguration;

    public Output<AccessPointPublicAccessBlockConfigurationArgs> getPublicAccessBlockConfiguration() {
        return this.publicAccessBlockConfiguration == null ? Output.empty() : this.publicAccessBlockConfiguration;
    }

    /**
     * Configuration block to restrict access to this access point to requests from the specified Virtual Private Cloud (VPC). Required for S3 on Outposts. Detailed below.
     * 
     */
    @Import(name="vpcConfiguration")
      private final @Nullable Output<AccessPointVpcConfigurationArgs> vpcConfiguration;

    public Output<AccessPointVpcConfigurationArgs> getVpcConfiguration() {
        return this.vpcConfiguration == null ? Output.empty() : this.vpcConfiguration;
    }

    public AccessPointArgs(
        @Nullable Output<String> accountId,
        Output<String> bucket,
        @Nullable Output<String> name,
        @Nullable Output<String> policy,
        @Nullable Output<AccessPointPublicAccessBlockConfigurationArgs> publicAccessBlockConfiguration,
        @Nullable Output<AccessPointVpcConfigurationArgs> vpcConfiguration) {
        this.accountId = accountId;
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.name = name;
        this.policy = policy;
        this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
        this.vpcConfiguration = vpcConfiguration;
    }

    private AccessPointArgs() {
        this.accountId = Output.empty();
        this.bucket = Output.empty();
        this.name = Output.empty();
        this.policy = Output.empty();
        this.publicAccessBlockConfiguration = Output.empty();
        this.vpcConfiguration = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountId;
        private Output<String> bucket;
        private @Nullable Output<String> name;
        private @Nullable Output<String> policy;
        private @Nullable Output<AccessPointPublicAccessBlockConfigurationArgs> publicAccessBlockConfiguration;
        private @Nullable Output<AccessPointVpcConfigurationArgs> vpcConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.bucket = defaults.bucket;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.publicAccessBlockConfiguration = defaults.publicAccessBlockConfiguration;
    	      this.vpcConfiguration = defaults.vpcConfiguration;
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder accountId(@Nullable String accountId) {
            this.accountId = Output.ofNullable(accountId);
            return this;
        }

        public Builder bucket(Output<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder bucket(String bucket) {
            this.bucket = Output.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder policy(@Nullable Output<String> policy) {
            this.policy = policy;
            return this;
        }

        public Builder policy(@Nullable String policy) {
            this.policy = Output.ofNullable(policy);
            return this;
        }

        public Builder publicAccessBlockConfiguration(@Nullable Output<AccessPointPublicAccessBlockConfigurationArgs> publicAccessBlockConfiguration) {
            this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
            return this;
        }

        public Builder publicAccessBlockConfiguration(@Nullable AccessPointPublicAccessBlockConfigurationArgs publicAccessBlockConfiguration) {
            this.publicAccessBlockConfiguration = Output.ofNullable(publicAccessBlockConfiguration);
            return this;
        }

        public Builder vpcConfiguration(@Nullable Output<AccessPointVpcConfigurationArgs> vpcConfiguration) {
            this.vpcConfiguration = vpcConfiguration;
            return this;
        }

        public Builder vpcConfiguration(@Nullable AccessPointVpcConfigurationArgs vpcConfiguration) {
            this.vpcConfiguration = Output.ofNullable(vpcConfiguration);
            return this;
        }
        public AccessPointArgs build() {
            return new AccessPointArgs(accountId, bucket, name, policy, publicAccessBlockConfiguration, vpcConfiguration);
        }
    }
}
