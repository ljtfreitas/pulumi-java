// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.run_v1.inputs.ConfigMapEnvSourceResponse;
import io.pulumi.googlenative.run_v1.inputs.SecretEnvSourceResponse;
import java.lang.String;
import java.util.Objects;


public final class EnvFromSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final EnvFromSourceResponse Empty = new EnvFromSourceResponse();

    @InputImport(name="configMapRef", required=true)
    private final ConfigMapEnvSourceResponse configMapRef;

    public ConfigMapEnvSourceResponse getConfigMapRef() {
        return this.configMapRef;
    }

    @InputImport(name="prefix", required=true)
    private final String prefix;

    public String getPrefix() {
        return this.prefix;
    }

    @InputImport(name="secretRef", required=true)
    private final SecretEnvSourceResponse secretRef;

    public SecretEnvSourceResponse getSecretRef() {
        return this.secretRef;
    }

    public EnvFromSourceResponse(
        ConfigMapEnvSourceResponse configMapRef,
        String prefix,
        SecretEnvSourceResponse secretRef) {
        this.configMapRef = Objects.requireNonNull(configMapRef, "expected parameter 'configMapRef' to be non-null");
        this.prefix = Objects.requireNonNull(prefix, "expected parameter 'prefix' to be non-null");
        this.secretRef = Objects.requireNonNull(secretRef, "expected parameter 'secretRef' to be non-null");
    }

    private EnvFromSourceResponse() {
        this.configMapRef = null;
        this.prefix = null;
        this.secretRef = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvFromSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigMapEnvSourceResponse configMapRef;
        private String prefix;
        private SecretEnvSourceResponse secretRef;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvFromSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMapRef = defaults.configMapRef;
    	      this.prefix = defaults.prefix;
    	      this.secretRef = defaults.secretRef;
        }

        public Builder setConfigMapRef(ConfigMapEnvSourceResponse configMapRef) {
            this.configMapRef = Objects.requireNonNull(configMapRef);
            return this;
        }

        public Builder setPrefix(String prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }

        public Builder setSecretRef(SecretEnvSourceResponse secretRef) {
            this.secretRef = Objects.requireNonNull(secretRef);
            return this;
        }

        public EnvFromSourceResponse build() {
            return new EnvFromSourceResponse(configMapRef, prefix, secretRef);
        }
    }
}