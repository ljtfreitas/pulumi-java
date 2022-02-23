// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Pairs a secret environment variable with a SecretVersion in Secret Manager.
 * 
 */
public final class SecretManagerSecretResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecretManagerSecretResponse Empty = new SecretManagerSecretResponse();

    /**
     * Environment variable name to associate with the secret. Secret environment variables must be unique across all of a build's secrets, and must be used by at least one build step.
     * 
     */
    @InputImport(name="env", required=true)
      private final String env;

    public String getEnv() {
        return this.env;
    }

    /**
     * Resource name of the SecretVersion. In format: projects/*{@literal /}secrets/*{@literal /}versions/*
     * 
     */
    @InputImport(name="versionName", required=true)
      private final String versionName;

    public String getVersionName() {
        return this.versionName;
    }

    public SecretManagerSecretResponse(
        String env,
        String versionName) {
        this.env = Objects.requireNonNull(env, "expected parameter 'env' to be non-null");
        this.versionName = Objects.requireNonNull(versionName, "expected parameter 'versionName' to be non-null");
    }

    private SecretManagerSecretResponse() {
        this.env = null;
        this.versionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretManagerSecretResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String env;
        private String versionName;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretManagerSecretResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.env = defaults.env;
    	      this.versionName = defaults.versionName;
        }

        public Builder setEnv(String env) {
            this.env = Objects.requireNonNull(env);
            return this;
        }

        public Builder setVersionName(String versionName) {
            this.versionName = Objects.requireNonNull(versionName);
            return this;
        }
        public SecretManagerSecretResponse build() {
            return new SecretManagerSecretResponse(env, versionName);
        }
    }
}
