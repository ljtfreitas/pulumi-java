// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse;
import java.util.Objects;


/**
 * Configuration options for Cloud Armor Adaptive Protection (CAAP).
 * 
 */
public final class SecurityPolicyAdaptiveProtectionConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecurityPolicyAdaptiveProtectionConfigResponse Empty = new SecurityPolicyAdaptiveProtectionConfigResponse();

    /**
     * If set to true, enables Cloud Armor Machine Learning.
     * 
     */
    @InputImport(name="layer7DdosDefenseConfig", required=true)
      private final SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse layer7DdosDefenseConfig;

    public SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse getLayer7DdosDefenseConfig() {
        return this.layer7DdosDefenseConfig;
    }

    public SecurityPolicyAdaptiveProtectionConfigResponse(SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse layer7DdosDefenseConfig) {
        this.layer7DdosDefenseConfig = Objects.requireNonNull(layer7DdosDefenseConfig, "expected parameter 'layer7DdosDefenseConfig' to be non-null");
    }

    private SecurityPolicyAdaptiveProtectionConfigResponse() {
        this.layer7DdosDefenseConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyAdaptiveProtectionConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse layer7DdosDefenseConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyAdaptiveProtectionConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.layer7DdosDefenseConfig = defaults.layer7DdosDefenseConfig;
        }

        public Builder setLayer7DdosDefenseConfig(SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse layer7DdosDefenseConfig) {
            this.layer7DdosDefenseConfig = Objects.requireNonNull(layer7DdosDefenseConfig);
            return this;
        }
        public SecurityPolicyAdaptiveProtectionConfigResponse build() {
            return new SecurityPolicyAdaptiveProtectionConfigResponse(layer7DdosDefenseConfig);
        }
    }
}
