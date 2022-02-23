// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.forecast.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EncryptionConfigProperties extends io.pulumi.resources.InvokeArgs {

    public static final EncryptionConfigProperties Empty = new EncryptionConfigProperties();

    @InputImport(name="kmsKeyArn")
        private final @Nullable String kmsKeyArn;

    public Optional<String> getKmsKeyArn() {
        return this.kmsKeyArn == null ? Optional.empty() : Optional.ofNullable(this.kmsKeyArn);
    }

    @InputImport(name="roleArn")
        private final @Nullable String roleArn;

    public Optional<String> getRoleArn() {
        return this.roleArn == null ? Optional.empty() : Optional.ofNullable(this.roleArn);
    }

    public EncryptionConfigProperties(
        @Nullable String kmsKeyArn,
        @Nullable String roleArn) {
        this.kmsKeyArn = kmsKeyArn;
        this.roleArn = roleArn;
    }

    private EncryptionConfigProperties() {
        this.kmsKeyArn = null;
        this.roleArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionConfigProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsKeyArn;
        private @Nullable String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionConfigProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setKmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public EncryptionConfigProperties build() {
            return new EncryptionConfigProperties(kmsKeyArn, roleArn);
        }
    }
}
