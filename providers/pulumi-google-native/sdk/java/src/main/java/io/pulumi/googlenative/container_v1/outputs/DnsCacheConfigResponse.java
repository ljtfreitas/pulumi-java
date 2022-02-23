// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class DnsCacheConfigResponse {
    /**
     * Whether NodeLocal DNSCache is enabled for this cluster.
     * 
     */
    private final Boolean enabled;

    @OutputCustomType.Constructor({"enabled"})
    private DnsCacheConfigResponse(Boolean enabled) {
        this.enabled = Objects.requireNonNull(enabled);
    }

    /**
     * Whether NodeLocal DNSCache is enabled for this cluster.
     * 
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DnsCacheConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(DnsCacheConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public DnsCacheConfigResponse build() {
            return new DnsCacheConfigResponse(enabled);
        }
    }
}
