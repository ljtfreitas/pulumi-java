// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionGetArgs Empty = new SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionGetArgs();

    /**
     * Encryption mode to use for CloudWatch data. Valid values: `DISABLED`, `SSE-KMS`. Default value: `DISABLED`.
     * 
     */
    @InputImport(name="cloudwatchEncryptionMode")
    private final @Nullable Input<String> cloudwatchEncryptionMode;

    public Input<String> getCloudwatchEncryptionMode() {
        return this.cloudwatchEncryptionMode == null ? Input.empty() : this.cloudwatchEncryptionMode;
    }

    /**
     * Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
     * 
     */
    @InputImport(name="kmsKeyArn")
    private final @Nullable Input<String> kmsKeyArn;

    public Input<String> getKmsKeyArn() {
        return this.kmsKeyArn == null ? Input.empty() : this.kmsKeyArn;
    }

    public SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionGetArgs(
        @Nullable Input<String> cloudwatchEncryptionMode,
        @Nullable Input<String> kmsKeyArn) {
        this.cloudwatchEncryptionMode = cloudwatchEncryptionMode;
        this.kmsKeyArn = kmsKeyArn;
    }

    private SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionGetArgs() {
        this.cloudwatchEncryptionMode = Input.empty();
        this.kmsKeyArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cloudwatchEncryptionMode;
        private @Nullable Input<String> kmsKeyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchEncryptionMode = defaults.cloudwatchEncryptionMode;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
        }

        public Builder setCloudwatchEncryptionMode(@Nullable Input<String> cloudwatchEncryptionMode) {
            this.cloudwatchEncryptionMode = cloudwatchEncryptionMode;
            return this;
        }

        public Builder setCloudwatchEncryptionMode(@Nullable String cloudwatchEncryptionMode) {
            this.cloudwatchEncryptionMode = Input.ofNullable(cloudwatchEncryptionMode);
            return this;
        }

        public Builder setKmsKeyArn(@Nullable Input<String> kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public Builder setKmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = Input.ofNullable(kmsKeyArn);
            return this;
        }
        public SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionGetArgs build() {
            return new SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionGetArgs(cloudwatchEncryptionMode, kmsKeyArn);
        }
    }
}
