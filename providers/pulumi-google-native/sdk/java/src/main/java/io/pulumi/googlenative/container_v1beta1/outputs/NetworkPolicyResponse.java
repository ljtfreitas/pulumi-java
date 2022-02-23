// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NetworkPolicyResponse {
    /**
     * Whether network policy is enabled on the cluster.
     * 
     */
    private final Boolean enabled;
    /**
     * The selected network policy provider.
     * 
     */
    private final String provider;

    @OutputCustomType.Constructor({"enabled","provider"})
    private NetworkPolicyResponse(
        Boolean enabled,
        String provider) {
        this.enabled = Objects.requireNonNull(enabled);
        this.provider = Objects.requireNonNull(provider);
    }

    /**
     * Whether network policy is enabled on the cluster.
     * 
     */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The selected network policy provider.
     * 
     */
    public String getProvider() {
        return this.provider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private String provider;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.provider = defaults.provider;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setProvider(String provider) {
            this.provider = Objects.requireNonNull(provider);
            return this;
        }
        public NetworkPolicyResponse build() {
            return new NetworkPolicyResponse(enabled, provider);
        }
    }
}
