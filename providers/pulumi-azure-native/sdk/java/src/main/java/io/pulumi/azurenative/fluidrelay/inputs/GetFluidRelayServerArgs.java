// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.fluidrelay.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFluidRelayServerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFluidRelayServerArgs Empty = new GetFluidRelayServerArgs();

    /**
     * The resource name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The resource group containing the resource.
     * 
     */
    @Import(name="resourceGroup", required=true)
      private final String resourceGroup;

    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public GetFluidRelayServerArgs(
        String name,
        String resourceGroup) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroup = Objects.requireNonNull(resourceGroup, "expected parameter 'resourceGroup' to be non-null");
    }

    private GetFluidRelayServerArgs() {
        this.name = null;
        this.resourceGroup = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFluidRelayServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String resourceGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFluidRelayServerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.resourceGroup = defaults.resourceGroup;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }
        public GetFluidRelayServerArgs build() {
            return new GetFluidRelayServerArgs(name, resourceGroup);
        }
    }
}
