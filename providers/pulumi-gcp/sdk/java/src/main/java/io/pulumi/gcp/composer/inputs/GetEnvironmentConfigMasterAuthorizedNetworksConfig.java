// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.composer.inputs.GetEnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;


public final class GetEnvironmentConfigMasterAuthorizedNetworksConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentConfigMasterAuthorizedNetworksConfig Empty = new GetEnvironmentConfigMasterAuthorizedNetworksConfig();

    @Import(name="cidrBlocks", required=true)
      private final List<GetEnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock> cidrBlocks;

    public List<GetEnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock> getCidrBlocks() {
        return this.cidrBlocks;
    }

    @Import(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetEnvironmentConfigMasterAuthorizedNetworksConfig(
        List<GetEnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock> cidrBlocks,
        Boolean enabled) {
        this.cidrBlocks = Objects.requireNonNull(cidrBlocks, "expected parameter 'cidrBlocks' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private GetEnvironmentConfigMasterAuthorizedNetworksConfig() {
        this.cidrBlocks = List.of();
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigMasterAuthorizedNetworksConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetEnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock> cidrBlocks;
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentConfigMasterAuthorizedNetworksConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlocks = defaults.cidrBlocks;
    	      this.enabled = defaults.enabled;
        }

        public Builder cidrBlocks(List<GetEnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock> cidrBlocks) {
            this.cidrBlocks = Objects.requireNonNull(cidrBlocks);
            return this;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public GetEnvironmentConfigMasterAuthorizedNetworksConfig build() {
            return new GetEnvironmentConfigMasterAuthorizedNetworksConfig(cidrBlocks, enabled);
        }
    }
}
