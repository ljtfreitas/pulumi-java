// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Pairs a set of secret environment variables containing encrypted values with the Cloud KMS key to use to decrypt the value. Note: Use `kmsKeyName` with `available_secrets` instead of using `kmsKeyName` with `secret`. For instructions see: https://cloud.google.com/cloud-build/docs/securing-builds/use-encrypted-credentials.
 * 
 */
public final class SecretArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretArgs Empty = new SecretArgs();

    /**
     * Cloud KMS key name to use to decrypt these envs.
     * 
     */
    @Import(name="kmsKeyName")
    private @Nullable Output<String> kmsKeyName;

    /**
     * @return Cloud KMS key name to use to decrypt these envs.
     * 
     */
    public Optional<Output<String>> kmsKeyName() {
        return Optional.ofNullable(this.kmsKeyName);
    }

    /**
     * Map of environment variable name to its encrypted value. Secret environment variables must be unique across all of a build&#39;s secrets, and must be used by at least one build step. Values can be at most 64 KB in size. There can be at most 100 secret values across all of a build&#39;s secrets.
     * 
     */
    @Import(name="secretEnv")
    private @Nullable Output<Map<String,String>> secretEnv;

    /**
     * @return Map of environment variable name to its encrypted value. Secret environment variables must be unique across all of a build&#39;s secrets, and must be used by at least one build step. Values can be at most 64 KB in size. There can be at most 100 secret values across all of a build&#39;s secrets.
     * 
     */
    public Optional<Output<Map<String,String>>> secretEnv() {
        return Optional.ofNullable(this.secretEnv);
    }

    private SecretArgs() {}

    private SecretArgs(SecretArgs $) {
        this.kmsKeyName = $.kmsKeyName;
        this.secretEnv = $.secretEnv;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretArgs $;

        public Builder() {
            $ = new SecretArgs();
        }

        public Builder(SecretArgs defaults) {
            $ = new SecretArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kmsKeyName Cloud KMS key name to use to decrypt these envs.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            $.kmsKeyName = kmsKeyName;
            return this;
        }

        /**
         * @param kmsKeyName Cloud KMS key name to use to decrypt these envs.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(String kmsKeyName) {
            return kmsKeyName(Output.of(kmsKeyName));
        }

        /**
         * @param secretEnv Map of environment variable name to its encrypted value. Secret environment variables must be unique across all of a build&#39;s secrets, and must be used by at least one build step. Values can be at most 64 KB in size. There can be at most 100 secret values across all of a build&#39;s secrets.
         * 
         * @return builder
         * 
         */
        public Builder secretEnv(@Nullable Output<Map<String,String>> secretEnv) {
            $.secretEnv = secretEnv;
            return this;
        }

        /**
         * @param secretEnv Map of environment variable name to its encrypted value. Secret environment variables must be unique across all of a build&#39;s secrets, and must be used by at least one build step. Values can be at most 64 KB in size. There can be at most 100 secret values across all of a build&#39;s secrets.
         * 
         * @return builder
         * 
         */
        public Builder secretEnv(Map<String,String> secretEnv) {
            return secretEnv(Output.of(secretEnv));
        }

        public SecretArgs build() {
            return $;
        }
    }

}
