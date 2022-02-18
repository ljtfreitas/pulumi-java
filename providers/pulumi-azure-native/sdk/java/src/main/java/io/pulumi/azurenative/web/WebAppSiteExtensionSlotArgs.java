// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppSiteExtensionSlotArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppSiteExtensionSlotArgs Empty = new WebAppSiteExtensionSlotArgs();

    /**
     * Site name.
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
     * Site extension name.
     * 
     */
    @InputImport(name="siteExtensionId")
    private final @Nullable Input<String> siteExtensionId;

    public Input<String> getSiteExtensionId() {
        return this.siteExtensionId == null ? Input.empty() : this.siteExtensionId;
    }

    /**
     * Name of the deployment slot. If a slot is not specified, the API uses the production slot.
     * 
     */
    @InputImport(name="slot", required=true)
    private final Input<String> slot;

    public Input<String> getSlot() {
        return this.slot;
    }

    public WebAppSiteExtensionSlotArgs(
        Input<String> name,
        Input<String> resourceGroupName,
        @Nullable Input<String> siteExtensionId,
        Input<String> slot) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.siteExtensionId = siteExtensionId;
        this.slot = Objects.requireNonNull(slot, "expected parameter 'slot' to be non-null");
    }

    private WebAppSiteExtensionSlotArgs() {
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.siteExtensionId = Input.empty();
        this.slot = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppSiteExtensionSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> siteExtensionId;
        private Input<String> slot;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppSiteExtensionSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.siteExtensionId = defaults.siteExtensionId;
    	      this.slot = defaults.slot;
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

        public Builder setSiteExtensionId(@Nullable Input<String> siteExtensionId) {
            this.siteExtensionId = siteExtensionId;
            return this;
        }

        public Builder setSiteExtensionId(@Nullable String siteExtensionId) {
            this.siteExtensionId = Input.ofNullable(siteExtensionId);
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

        public WebAppSiteExtensionSlotArgs build() {
            return new WebAppSiteExtensionSlotArgs(name, resourceGroupName, siteExtensionId, slot);
        }
    }
}
