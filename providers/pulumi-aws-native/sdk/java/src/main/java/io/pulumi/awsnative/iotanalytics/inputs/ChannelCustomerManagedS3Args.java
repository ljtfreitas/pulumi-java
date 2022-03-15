// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ChannelCustomerManagedS3Args extends io.pulumi.resources.ResourceArgs {

    public static final ChannelCustomerManagedS3Args Empty = new ChannelCustomerManagedS3Args();

    @Import(name="bucket", required=true)
      private final Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket;
    }

    @Import(name="keyPrefix")
      private final @Nullable Output<String> keyPrefix;

    public Output<String> getKeyPrefix() {
        return this.keyPrefix == null ? Output.empty() : this.keyPrefix;
    }

    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    public ChannelCustomerManagedS3Args(
        Output<String> bucket,
        @Nullable Output<String> keyPrefix,
        Output<String> roleArn) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.keyPrefix = keyPrefix;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private ChannelCustomerManagedS3Args() {
        this.bucket = Output.empty();
        this.keyPrefix = Output.empty();
        this.roleArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelCustomerManagedS3Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucket;
        private @Nullable Output<String> keyPrefix;
        private Output<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelCustomerManagedS3Args defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.keyPrefix = defaults.keyPrefix;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder bucket(Output<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder bucket(String bucket) {
            this.bucket = Output.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder keyPrefix(@Nullable Output<String> keyPrefix) {
            this.keyPrefix = keyPrefix;
            return this;
        }

        public Builder keyPrefix(@Nullable String keyPrefix) {
            this.keyPrefix = Output.ofNullable(keyPrefix);
            return this;
        }

        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public ChannelCustomerManagedS3Args build() {
            return new ChannelCustomerManagedS3Args(bucket, keyPrefix, roleArn);
        }
    }
}
