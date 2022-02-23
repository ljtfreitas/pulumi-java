// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetBucketEncryption extends io.pulumi.resources.InvokeArgs {

    public static final GetBucketEncryption Empty = new GetBucketEncryption();

    @InputImport(name="defaultKmsKeyName", required=true)
        private final String defaultKmsKeyName;

    public String getDefaultKmsKeyName() {
        return this.defaultKmsKeyName;
    }

    public GetBucketEncryption(String defaultKmsKeyName) {
        this.defaultKmsKeyName = Objects.requireNonNull(defaultKmsKeyName, "expected parameter 'defaultKmsKeyName' to be non-null");
    }

    private GetBucketEncryption() {
        this.defaultKmsKeyName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultKmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultKmsKeyName = defaults.defaultKmsKeyName;
        }

        public Builder setDefaultKmsKeyName(String defaultKmsKeyName) {
            this.defaultKmsKeyName = Objects.requireNonNull(defaultKmsKeyName);
            return this;
        }
        public GetBucketEncryption build() {
            return new GetBucketEncryption(defaultKmsKeyName);
        }
    }
}
