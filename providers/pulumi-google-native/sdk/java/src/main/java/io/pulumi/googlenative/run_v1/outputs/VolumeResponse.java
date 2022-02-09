// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.run_v1.outputs.ConfigMapVolumeSourceResponse;
import io.pulumi.googlenative.run_v1.outputs.SecretVolumeSourceResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VolumeResponse {
    private final ConfigMapVolumeSourceResponse configMap;
    private final String name;
    private final SecretVolumeSourceResponse secret;

    @OutputCustomType.Constructor({"configMap","name","secret"})
    private VolumeResponse(
        ConfigMapVolumeSourceResponse configMap,
        String name,
        SecretVolumeSourceResponse secret) {
        this.configMap = Objects.requireNonNull(configMap);
        this.name = Objects.requireNonNull(name);
        this.secret = Objects.requireNonNull(secret);
    }

    public ConfigMapVolumeSourceResponse getConfigMap() {
        return this.configMap;
    }
    public String getName() {
        return this.name;
    }
    public SecretVolumeSourceResponse getSecret() {
        return this.secret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigMapVolumeSourceResponse configMap;
        private String name;
        private SecretVolumeSourceResponse secret;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMap = defaults.configMap;
    	      this.name = defaults.name;
    	      this.secret = defaults.secret;
        }

        public Builder setConfigMap(ConfigMapVolumeSourceResponse configMap) {
            this.configMap = Objects.requireNonNull(configMap);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSecret(SecretVolumeSourceResponse secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }

        public VolumeResponse build() {
            return new VolumeResponse(configMap, name, secret);
        }
    }
}