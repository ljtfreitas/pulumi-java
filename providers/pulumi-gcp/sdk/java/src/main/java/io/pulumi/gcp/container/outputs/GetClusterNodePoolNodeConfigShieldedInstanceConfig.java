// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class GetClusterNodePoolNodeConfigShieldedInstanceConfig {
    private final Boolean enableIntegrityMonitoring;
    private final Boolean enableSecureBoot;

    @OutputCustomType.Constructor({"enableIntegrityMonitoring","enableSecureBoot"})
    private GetClusterNodePoolNodeConfigShieldedInstanceConfig(
        Boolean enableIntegrityMonitoring,
        Boolean enableSecureBoot) {
        this.enableIntegrityMonitoring = Objects.requireNonNull(enableIntegrityMonitoring);
        this.enableSecureBoot = Objects.requireNonNull(enableSecureBoot);
    }

    public Boolean getEnableIntegrityMonitoring() {
        return this.enableIntegrityMonitoring;
    }
    public Boolean getEnableSecureBoot() {
        return this.enableSecureBoot;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodePoolNodeConfigShieldedInstanceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableIntegrityMonitoring;
        private Boolean enableSecureBoot;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodePoolNodeConfigShieldedInstanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableIntegrityMonitoring = defaults.enableIntegrityMonitoring;
    	      this.enableSecureBoot = defaults.enableSecureBoot;
        }

        public Builder setEnableIntegrityMonitoring(Boolean enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = Objects.requireNonNull(enableIntegrityMonitoring);
            return this;
        }

        public Builder setEnableSecureBoot(Boolean enableSecureBoot) {
            this.enableSecureBoot = Objects.requireNonNull(enableSecureBoot);
            return this;
        }
        public GetClusterNodePoolNodeConfigShieldedInstanceConfig build() {
            return new GetClusterNodePoolNodeConfigShieldedInstanceConfig(enableIntegrityMonitoring, enableSecureBoot);
        }
    }
}
