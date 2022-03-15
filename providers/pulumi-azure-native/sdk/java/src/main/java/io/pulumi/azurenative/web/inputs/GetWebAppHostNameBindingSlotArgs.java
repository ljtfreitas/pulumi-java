// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWebAppHostNameBindingSlotArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWebAppHostNameBindingSlotArgs Empty = new GetWebAppHostNameBindingSlotArgs();

    /**
     * Hostname in the hostname binding.
     * 
     */
    @Import(name="hostName", required=true)
      private final String hostName;

    public String getHostName() {
        return this.hostName;
    }

    /**
     * Name of the app.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the deployment slot. If a slot is not specified, the API the named binding for the production slot.
     * 
     */
    @Import(name="slot", required=true)
      private final String slot;

    public String getSlot() {
        return this.slot;
    }

    public GetWebAppHostNameBindingSlotArgs(
        String hostName,
        String name,
        String resourceGroupName,
        String slot) {
        this.hostName = Objects.requireNonNull(hostName, "expected parameter 'hostName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.slot = Objects.requireNonNull(slot, "expected parameter 'slot' to be non-null");
    }

    private GetWebAppHostNameBindingSlotArgs() {
        this.hostName = null;
        this.name = null;
        this.resourceGroupName = null;
        this.slot = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppHostNameBindingSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hostName;
        private String name;
        private String resourceGroupName;
        private String slot;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppHostNameBindingSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostName = defaults.hostName;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.slot = defaults.slot;
        }

        public Builder hostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder slot(String slot) {
            this.slot = Objects.requireNonNull(slot);
            return this;
        }
        public GetWebAppHostNameBindingSlotArgs build() {
            return new GetWebAppHostNameBindingSlotArgs(hostName, name, resourceGroupName, slot);
        }
    }
}
