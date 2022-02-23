// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetBucketEncryption {
    private final String defaultKmsKeyName;

    @OutputCustomType.Constructor({"defaultKmsKeyName"})
    private GetBucketEncryption(String defaultKmsKeyName) {
        this.defaultKmsKeyName = Objects.requireNonNull(defaultKmsKeyName);
    }

    public String getDefaultKmsKeyName() {
        return this.defaultKmsKeyName;
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
