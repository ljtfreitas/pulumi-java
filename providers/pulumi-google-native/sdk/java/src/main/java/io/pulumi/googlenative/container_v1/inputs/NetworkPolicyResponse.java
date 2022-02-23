// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration options for the NetworkPolicy feature. https://kubernetes.io/docs/concepts/services-networking/networkpolicies/
 * 
 */
public final class NetworkPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkPolicyResponse Empty = new NetworkPolicyResponse();

    /**
     * Whether network policy is enabled on the cluster.
     * 
     */
    @InputImport(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * The selected network policy provider.
     * 
     */
    @InputImport(name="provider", required=true)
      private final String provider;

    public String getProvider() {
        return this.provider;
    }

    public NetworkPolicyResponse(
        Boolean enabled,
        String provider) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.provider = Objects.requireNonNull(provider, "expected parameter 'provider' to be non-null");
    }

    private NetworkPolicyResponse() {
        this.enabled = null;
        this.provider = null;
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
