// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWebAppDomainOwnershipIdentifierSlotArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWebAppDomainOwnershipIdentifierSlotArgs Empty = new GetWebAppDomainOwnershipIdentifierSlotArgs();

    /**
     * Name of domain ownership identifier.
     * 
     */
    @Import(name="domainOwnershipIdentifierName", required=true)
      private final String domainOwnershipIdentifierName;

    public String getDomainOwnershipIdentifierName() {
        return this.domainOwnershipIdentifierName;
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
     * Name of the deployment slot. If a slot is not specified, the API will delete the binding for the production slot.
     * 
     */
    @Import(name="slot", required=true)
      private final String slot;

    public String getSlot() {
        return this.slot;
    }

    public GetWebAppDomainOwnershipIdentifierSlotArgs(
        String domainOwnershipIdentifierName,
        String name,
        String resourceGroupName,
        String slot) {
        this.domainOwnershipIdentifierName = Objects.requireNonNull(domainOwnershipIdentifierName, "expected parameter 'domainOwnershipIdentifierName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.slot = Objects.requireNonNull(slot, "expected parameter 'slot' to be non-null");
    }

    private GetWebAppDomainOwnershipIdentifierSlotArgs() {
        this.domainOwnershipIdentifierName = null;
        this.name = null;
        this.resourceGroupName = null;
        this.slot = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppDomainOwnershipIdentifierSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainOwnershipIdentifierName;
        private String name;
        private String resourceGroupName;
        private String slot;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppDomainOwnershipIdentifierSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainOwnershipIdentifierName = defaults.domainOwnershipIdentifierName;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.slot = defaults.slot;
        }

        public Builder domainOwnershipIdentifierName(String domainOwnershipIdentifierName) {
            this.domainOwnershipIdentifierName = Objects.requireNonNull(domainOwnershipIdentifierName);
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
        public GetWebAppDomainOwnershipIdentifierSlotArgs build() {
            return new GetWebAppDomainOwnershipIdentifierSlotArgs(domainOwnershipIdentifierName, name, resourceGroupName, slot);
        }
    }
}
