// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GkeBackupAgentConfigResponse {
    /**
     * Whether the Backup for GKE agent is enabled for this cluster.
     * 
     */
    private final Boolean enabled;

    @CustomType.Constructor
    private GkeBackupAgentConfigResponse(@CustomType.Parameter("enabled") Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Whether the Backup for GKE agent is enabled for this cluster.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GkeBackupAgentConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GkeBackupAgentConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public GkeBackupAgentConfigResponse build() {
            return new GkeBackupAgentConfigResponse(enabled);
        }
    }
}
