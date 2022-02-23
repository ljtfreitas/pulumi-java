// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppDomainOwnershipIdentifierSlotArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppDomainOwnershipIdentifierSlotArgs Empty = new WebAppDomainOwnershipIdentifierSlotArgs();

    /**
     * Name of domain ownership identifier.
     * 
     */
    @InputImport(name="domainOwnershipIdentifierName")
        private final @Nullable Input<String> domainOwnershipIdentifierName;

    public Input<String> getDomainOwnershipIdentifierName() {
        return this.domainOwnershipIdentifierName == null ? Input.empty() : this.domainOwnershipIdentifierName;
    }

    /**
     * Kind of resource.
     * 
     */
    @InputImport(name="kind")
        private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Name of the app.
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the deployment slot. If a slot is not specified, the API will delete the binding for the production slot.
     * 
     */
    @InputImport(name="slot", required=true)
        private final Input<String> slot;

    public Input<String> getSlot() {
        return this.slot;
    }

    /**
     * String representation of the identity.
     * 
     */
    @InputImport(name="value")
        private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public WebAppDomainOwnershipIdentifierSlotArgs(
        @Nullable Input<String> domainOwnershipIdentifierName,
        @Nullable Input<String> kind,
        Input<String> name,
        Input<String> resourceGroupName,
        Input<String> slot,
        @Nullable Input<String> value) {
        this.domainOwnershipIdentifierName = domainOwnershipIdentifierName;
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.slot = Objects.requireNonNull(slot, "expected parameter 'slot' to be non-null");
        this.value = value;
    }

    private WebAppDomainOwnershipIdentifierSlotArgs() {
        this.domainOwnershipIdentifierName = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.slot = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppDomainOwnershipIdentifierSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> domainOwnershipIdentifierName;
        private @Nullable Input<String> kind;
        private Input<String> name;
        private Input<String> resourceGroupName;
        private Input<String> slot;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppDomainOwnershipIdentifierSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainOwnershipIdentifierName = defaults.domainOwnershipIdentifierName;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.slot = defaults.slot;
    	      this.value = defaults.value;
        }

        public Builder setDomainOwnershipIdentifierName(@Nullable Input<String> domainOwnershipIdentifierName) {
            this.domainOwnershipIdentifierName = domainOwnershipIdentifierName;
            return this;
        }

        public Builder setDomainOwnershipIdentifierName(@Nullable String domainOwnershipIdentifierName) {
            this.domainOwnershipIdentifierName = Input.ofNullable(domainOwnershipIdentifierName);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSlot(Input<String> slot) {
            this.slot = Objects.requireNonNull(slot);
            return this;
        }

        public Builder setSlot(String slot) {
            this.slot = Input.of(Objects.requireNonNull(slot));
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public WebAppDomainOwnershipIdentifierSlotArgs build() {
            return new WebAppDomainOwnershipIdentifierSlotArgs(domainOwnershipIdentifierName, kind, name, resourceGroupName, slot, value);
        }
    }
}
