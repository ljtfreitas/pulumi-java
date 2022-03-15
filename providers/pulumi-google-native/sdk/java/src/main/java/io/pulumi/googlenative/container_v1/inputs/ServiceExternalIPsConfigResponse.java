// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Config to block services with externalIPs field.
 * 
 */
public final class ServiceExternalIPsConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceExternalIPsConfigResponse Empty = new ServiceExternalIPsConfigResponse();

    /**
     * Whether Services with ExternalIPs field are allowed or not.
     * 
     */
    @Import(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    public ServiceExternalIPsConfigResponse(Boolean enabled) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private ServiceExternalIPsConfigResponse() {
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceExternalIPsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceExternalIPsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public ServiceExternalIPsConfigResponse build() {
            return new ServiceExternalIPsConfigResponse(enabled);
        }
    }
}
