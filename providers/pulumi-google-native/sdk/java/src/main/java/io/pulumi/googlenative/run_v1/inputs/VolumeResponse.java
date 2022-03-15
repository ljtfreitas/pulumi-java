// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.run_v1.inputs.ConfigMapVolumeSourceResponse;
import io.pulumi.googlenative.run_v1.inputs.SecretVolumeSourceResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Volume represents a named volume in a container.
 * 
 */
public final class VolumeResponse extends io.pulumi.resources.InvokeArgs {

    public static final VolumeResponse Empty = new VolumeResponse();

    @Import(name="configMap", required=true)
      private final ConfigMapVolumeSourceResponse configMap;

    public ConfigMapVolumeSourceResponse getConfigMap() {
        return this.configMap;
    }

    /**
     * Volume's name. In Cloud Run Fully Managed, the name 'cloudsql' is reserved.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    @Import(name="secret", required=true)
      private final SecretVolumeSourceResponse secret;

    public SecretVolumeSourceResponse getSecret() {
        return this.secret;
    }

    public VolumeResponse(
        ConfigMapVolumeSourceResponse configMap,
        String name,
        SecretVolumeSourceResponse secret) {
        this.configMap = Objects.requireNonNull(configMap, "expected parameter 'configMap' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.secret = Objects.requireNonNull(secret, "expected parameter 'secret' to be non-null");
    }

    private VolumeResponse() {
        this.configMap = null;
        this.name = null;
        this.secret = null;
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

        public Builder configMap(ConfigMapVolumeSourceResponse configMap) {
            this.configMap = Objects.requireNonNull(configMap);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder secret(SecretVolumeSourceResponse secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }
        public VolumeResponse build() {
            return new VolumeResponse(configMap, name, secret);
        }
    }
}
