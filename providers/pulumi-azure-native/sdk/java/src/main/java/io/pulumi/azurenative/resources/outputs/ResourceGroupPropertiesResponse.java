// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ResourceGroupPropertiesResponse {
    /**
     * The provisioning state.
     * 
     */
    private final String provisioningState;

    @OutputCustomType.Constructor({"provisioningState"})
    private ResourceGroupPropertiesResponse(String provisioningState) {
        this.provisioningState = Objects.requireNonNull(provisioningState);
    }

    /**
     * The provisioning state.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceGroupPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceGroupPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public ResourceGroupPropertiesResponse build() {
            return new ResourceGroupPropertiesResponse(provisioningState);
        }
    }
}
