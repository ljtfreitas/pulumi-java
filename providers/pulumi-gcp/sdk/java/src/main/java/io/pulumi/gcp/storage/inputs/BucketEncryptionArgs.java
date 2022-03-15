// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class BucketEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketEncryptionArgs Empty = new BucketEncryptionArgs();

    @Import(name="defaultKmsKeyName", required=true)
      private final Output<String> defaultKmsKeyName;

    public Output<String> getDefaultKmsKeyName() {
        return this.defaultKmsKeyName;
    }

    public BucketEncryptionArgs(Output<String> defaultKmsKeyName) {
        this.defaultKmsKeyName = Objects.requireNonNull(defaultKmsKeyName, "expected parameter 'defaultKmsKeyName' to be non-null");
    }

    private BucketEncryptionArgs() {
        this.defaultKmsKeyName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> defaultKmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultKmsKeyName = defaults.defaultKmsKeyName;
        }

        public Builder defaultKmsKeyName(Output<String> defaultKmsKeyName) {
            this.defaultKmsKeyName = Objects.requireNonNull(defaultKmsKeyName);
            return this;
        }

        public Builder defaultKmsKeyName(String defaultKmsKeyName) {
            this.defaultKmsKeyName = Output.of(Objects.requireNonNull(defaultKmsKeyName));
            return this;
        }
        public BucketEncryptionArgs build() {
            return new BucketEncryptionArgs(defaultKmsKeyName);
        }
    }
}
