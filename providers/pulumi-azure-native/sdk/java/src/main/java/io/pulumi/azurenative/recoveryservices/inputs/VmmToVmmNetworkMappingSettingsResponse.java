// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * E2E Network Mapping fabric specific settings.
 * 
 */
public final class VmmToVmmNetworkMappingSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final VmmToVmmNetworkMappingSettingsResponse Empty = new VmmToVmmNetworkMappingSettingsResponse();

    /**
     * Gets the Instance type.
     * Expected value is 'VmmToVmm'.
     * 
     */
    @InputImport(name="instanceType", required=true)
        private final String instanceType;

    public String getInstanceType() {
        return this.instanceType;
    }

    public VmmToVmmNetworkMappingSettingsResponse(String instanceType) {
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
    }

    private VmmToVmmNetworkMappingSettingsResponse() {
        this.instanceType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmmToVmmNetworkMappingSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceType;

        public Builder() {
    	      // Empty
        }

        public Builder(VmmToVmmNetworkMappingSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public VmmToVmmNetworkMappingSettingsResponse build() {
            return new VmmToVmmNetworkMappingSettingsResponse(instanceType);
        }
    }
}
