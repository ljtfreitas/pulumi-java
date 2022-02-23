// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Pairs a set of secret environment variables mapped to encrypted values with the Cloud KMS key to use to decrypt the value.
 * 
 */
public final class InlineSecretArgs extends io.pulumi.resources.ResourceArgs {

    public static final InlineSecretArgs Empty = new InlineSecretArgs();

    /**
     * Map of environment variable name to its encrypted value. Secret environment variables must be unique across all of a build's secrets, and must be used by at least one build step. Values can be at most 64 KB in size. There can be at most 100 secret values across all of a build's secrets.
     * 
     */
    @InputImport(name="envMap")
      private final @Nullable Input<Map<String,String>> envMap;

    public Input<Map<String,String>> getEnvMap() {
        return this.envMap == null ? Input.empty() : this.envMap;
    }

    /**
     * Resource name of Cloud KMS crypto key to decrypt the encrypted value. In format: projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*
     * 
     */
    @InputImport(name="kmsKeyName")
      private final @Nullable Input<String> kmsKeyName;

    public Input<String> getKmsKeyName() {
        return this.kmsKeyName == null ? Input.empty() : this.kmsKeyName;
    }

    public InlineSecretArgs(
        @Nullable Input<Map<String,String>> envMap,
        @Nullable Input<String> kmsKeyName) {
        this.envMap = envMap;
        this.kmsKeyName = kmsKeyName;
    }

    private InlineSecretArgs() {
        this.envMap = Input.empty();
        this.kmsKeyName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InlineSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> envMap;
        private @Nullable Input<String> kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(InlineSecretArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.envMap = defaults.envMap;
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder setEnvMap(@Nullable Input<Map<String,String>> envMap) {
            this.envMap = envMap;
            return this;
        }

        public Builder setEnvMap(@Nullable Map<String,String> envMap) {
            this.envMap = Input.ofNullable(envMap);
            return this;
        }

        public Builder setKmsKeyName(@Nullable Input<String> kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }

        public Builder setKmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = Input.ofNullable(kmsKeyName);
            return this;
        }
        public InlineSecretArgs build() {
            return new InlineSecretArgs(envMap, kmsKeyName);
        }
    }
}
