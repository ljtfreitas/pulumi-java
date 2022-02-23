// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.athena.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseEncryptionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseEncryptionConfigurationArgs Empty = new DatabaseEncryptionConfigurationArgs();

    /**
     * The type of key; one of `SSE_S3`, `SSE_KMS`, `CSE_KMS`
     * 
     */
    @InputImport(name="encryptionOption", required=true)
    private final Input<String> encryptionOption;

    public Input<String> getEncryptionOption() {
        return this.encryptionOption;
    }

    /**
     * The KMS key ARN or ID; required for key types `SSE_KMS` and `CSE_KMS`.
     * 
     */
    @InputImport(name="kmsKey")
    private final @Nullable Input<String> kmsKey;

    public Input<String> getKmsKey() {
        return this.kmsKey == null ? Input.empty() : this.kmsKey;
    }

    public DatabaseEncryptionConfigurationArgs(
        Input<String> encryptionOption,
        @Nullable Input<String> kmsKey) {
        this.encryptionOption = Objects.requireNonNull(encryptionOption, "expected parameter 'encryptionOption' to be non-null");
        this.kmsKey = kmsKey;
    }

    private DatabaseEncryptionConfigurationArgs() {
        this.encryptionOption = Input.empty();
        this.kmsKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseEncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> encryptionOption;
        private @Nullable Input<String> kmsKey;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseEncryptionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionOption = defaults.encryptionOption;
    	      this.kmsKey = defaults.kmsKey;
        }

        public Builder setEncryptionOption(Input<String> encryptionOption) {
            this.encryptionOption = Objects.requireNonNull(encryptionOption);
            return this;
        }

        public Builder setEncryptionOption(String encryptionOption) {
            this.encryptionOption = Input.of(Objects.requireNonNull(encryptionOption));
            return this;
        }

        public Builder setKmsKey(@Nullable Input<String> kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }

        public Builder setKmsKey(@Nullable String kmsKey) {
            this.kmsKey = Input.ofNullable(kmsKey);
            return this;
        }
        public DatabaseEncryptionConfigurationArgs build() {
            return new DatabaseEncryptionConfigurationArgs(encryptionOption, kmsKey);
        }
    }
}
