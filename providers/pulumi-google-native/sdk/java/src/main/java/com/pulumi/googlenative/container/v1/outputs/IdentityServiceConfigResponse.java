// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class IdentityServiceConfigResponse {
    /**
     * @return Whether to enable the Identity Service component
     * 
     */
    private final Boolean enabled;

    @CustomType.Constructor
    private IdentityServiceConfigResponse(@CustomType.Parameter("enabled") Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * @return Whether to enable the Identity Service component
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityServiceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityServiceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }        public IdentityServiceConfigResponse build() {
            return new IdentityServiceConfigResponse(enabled);
        }
    }
}
