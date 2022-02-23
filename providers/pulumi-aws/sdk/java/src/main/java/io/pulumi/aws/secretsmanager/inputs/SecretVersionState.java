// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.secretsmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecretVersionState extends io.pulumi.resources.ResourceArgs {

    public static final SecretVersionState Empty = new SecretVersionState();

    /**
     * The ARN of the secret.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secret_string is not set. Needs to be encoded to base64.
     * 
     */
    @InputImport(name="secretBinary")
    private final @Nullable Input<String> secretBinary;

    public Input<String> getSecretBinary() {
        return this.secretBinary == null ? Input.empty() : this.secretBinary;
    }

    /**
     * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
     * 
     */
    @InputImport(name="secretId")
    private final @Nullable Input<String> secretId;

    public Input<String> getSecretId() {
        return this.secretId == null ? Input.empty() : this.secretId;
    }

    /**
     * Specifies text data that you want to encrypt and store in this version of the secret. This is required if secret_binary is not set.
     * 
     */
    @InputImport(name="secretString")
    private final @Nullable Input<String> secretString;

    public Input<String> getSecretString() {
        return this.secretString == null ? Input.empty() : this.secretString;
    }

    /**
     * The unique identifier of the version of the secret.
     * 
     */
    @InputImport(name="versionId")
    private final @Nullable Input<String> versionId;

    public Input<String> getVersionId() {
        return this.versionId == null ? Input.empty() : this.versionId;
    }

    /**
     * Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
     * 
     */
    @InputImport(name="versionStages")
    private final @Nullable Input<List<String>> versionStages;

    public Input<List<String>> getVersionStages() {
        return this.versionStages == null ? Input.empty() : this.versionStages;
    }

    public SecretVersionState(
        @Nullable Input<String> arn,
        @Nullable Input<String> secretBinary,
        @Nullable Input<String> secretId,
        @Nullable Input<String> secretString,
        @Nullable Input<String> versionId,
        @Nullable Input<List<String>> versionStages) {
        this.arn = arn;
        this.secretBinary = secretBinary;
        this.secretId = secretId;
        this.secretString = secretString;
        this.versionId = versionId;
        this.versionStages = versionStages;
    }

    private SecretVersionState() {
        this.arn = Input.empty();
        this.secretBinary = Input.empty();
        this.secretId = Input.empty();
        this.secretString = Input.empty();
        this.versionId = Input.empty();
        this.versionStages = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretVersionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> secretBinary;
        private @Nullable Input<String> secretId;
        private @Nullable Input<String> secretString;
        private @Nullable Input<String> versionId;
        private @Nullable Input<List<String>> versionStages;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretVersionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.secretBinary = defaults.secretBinary;
    	      this.secretId = defaults.secretId;
    	      this.secretString = defaults.secretString;
    	      this.versionId = defaults.versionId;
    	      this.versionStages = defaults.versionStages;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setSecretBinary(@Nullable Input<String> secretBinary) {
            this.secretBinary = secretBinary;
            return this;
        }

        public Builder setSecretBinary(@Nullable String secretBinary) {
            this.secretBinary = Input.ofNullable(secretBinary);
            return this;
        }

        public Builder setSecretId(@Nullable Input<String> secretId) {
            this.secretId = secretId;
            return this;
        }

        public Builder setSecretId(@Nullable String secretId) {
            this.secretId = Input.ofNullable(secretId);
            return this;
        }

        public Builder setSecretString(@Nullable Input<String> secretString) {
            this.secretString = secretString;
            return this;
        }

        public Builder setSecretString(@Nullable String secretString) {
            this.secretString = Input.ofNullable(secretString);
            return this;
        }

        public Builder setVersionId(@Nullable Input<String> versionId) {
            this.versionId = versionId;
            return this;
        }

        public Builder setVersionId(@Nullable String versionId) {
            this.versionId = Input.ofNullable(versionId);
            return this;
        }

        public Builder setVersionStages(@Nullable Input<List<String>> versionStages) {
            this.versionStages = versionStages;
            return this;
        }

        public Builder setVersionStages(@Nullable List<String> versionStages) {
            this.versionStages = Input.ofNullable(versionStages);
            return this;
        }
        public SecretVersionState build() {
            return new SecretVersionState(arn, secretBinary, secretId, secretString, versionId, versionStages);
        }
    }
}