// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.composer.outputs.EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class EnvironmentConfigMasterAuthorizedNetworksConfig {
    private final @Nullable List<EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock> cidrBlocks;
    private final Boolean enabled;

    @CustomType.Constructor
    private EnvironmentConfigMasterAuthorizedNetworksConfig(
        @CustomType.Parameter("cidrBlocks") @Nullable List<EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock> cidrBlocks,
        @CustomType.Parameter("enabled") Boolean enabled) {
        this.cidrBlocks = cidrBlocks;
        this.enabled = enabled;
    }

    public List<EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock> cidrBlocks() {
        return this.cidrBlocks == null ? List.of() : this.cidrBlocks;
    }
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigMasterAuthorizedNetworksConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock> cidrBlocks;
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfigMasterAuthorizedNetworksConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlocks = defaults.cidrBlocks;
    	      this.enabled = defaults.enabled;
        }

        public Builder cidrBlocks(@Nullable List<EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock> cidrBlocks) {
            this.cidrBlocks = cidrBlocks;
            return this;
        }
        public Builder cidrBlocks(EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock... cidrBlocks) {
            return cidrBlocks(List.of(cidrBlocks));
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }        public EnvironmentConfigMasterAuthorizedNetworksConfig build() {
            return new EnvironmentConfigMasterAuthorizedNetworksConfig(cidrBlocks, enabled);
        }
    }
}
