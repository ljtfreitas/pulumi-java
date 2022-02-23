// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityConfigurationEncryptionConfigurationS3EncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityConfigurationEncryptionConfigurationS3EncryptionArgs Empty = new SecurityConfigurationEncryptionConfigurationS3EncryptionArgs();

    /**
     * Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
     * 
     */
    @InputImport(name="kmsKeyArn")
    private final @Nullable Input<String> kmsKeyArn;

    public Input<String> getKmsKeyArn() {
        return this.kmsKeyArn == null ? Input.empty() : this.kmsKeyArn;
    }

    /**
     * Encryption mode to use for S3 data. Valid values: `DISABLED`, `SSE-KMS`, `SSE-S3`. Default value: `DISABLED`.
     * 
     */
    @InputImport(name="s3EncryptionMode")
    private final @Nullable Input<String> s3EncryptionMode;

    public Input<String> getS3EncryptionMode() {
        return this.s3EncryptionMode == null ? Input.empty() : this.s3EncryptionMode;
    }

    public SecurityConfigurationEncryptionConfigurationS3EncryptionArgs(
        @Nullable Input<String> kmsKeyArn,
        @Nullable Input<String> s3EncryptionMode) {
        this.kmsKeyArn = kmsKeyArn;
        this.s3EncryptionMode = s3EncryptionMode;
    }

    private SecurityConfigurationEncryptionConfigurationS3EncryptionArgs() {
        this.kmsKeyArn = Input.empty();
        this.s3EncryptionMode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityConfigurationEncryptionConfigurationS3EncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kmsKeyArn;
        private @Nullable Input<String> s3EncryptionMode;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityConfigurationEncryptionConfigurationS3EncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.s3EncryptionMode = defaults.s3EncryptionMode;
        }

        public Builder setKmsKeyArn(@Nullable Input<String> kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public Builder setKmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = Input.ofNullable(kmsKeyArn);
            return this;
        }

        public Builder setS3EncryptionMode(@Nullable Input<String> s3EncryptionMode) {
            this.s3EncryptionMode = s3EncryptionMode;
            return this;
        }

        public Builder setS3EncryptionMode(@Nullable String s3EncryptionMode) {
            this.s3EncryptionMode = Input.ofNullable(s3EncryptionMode);
            return this;
        }
        public SecurityConfigurationEncryptionConfigurationS3EncryptionArgs build() {
            return new SecurityConfigurationEncryptionConfigurationS3EncryptionArgs(kmsKeyArn, s3EncryptionMode);
        }
    }
}
