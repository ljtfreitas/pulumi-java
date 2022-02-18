// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridcompute;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateLinkScopedResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateLinkScopedResourceArgs Empty = new PrivateLinkScopedResourceArgs();

    /**
     * The resource id of the scoped Azure monitor resource.
     * 
     */
    @InputImport(name="linkedResourceId")
    private final @Nullable Input<String> linkedResourceId;

    public Input<String> getLinkedResourceId() {
        return this.linkedResourceId == null ? Input.empty() : this.linkedResourceId;
    }

    /**
     * The name of the scoped resource object.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Azure Arc PrivateLinkScope resource.
     * 
     */
    @InputImport(name="scopeName", required=true)
    private final Input<String> scopeName;

    public Input<String> getScopeName() {
        return this.scopeName;
    }

    public PrivateLinkScopedResourceArgs(
        @Nullable Input<String> linkedResourceId,
        @Nullable Input<String> name,
        Input<String> resourceGroupName,
        Input<String> scopeName) {
        this.linkedResourceId = linkedResourceId;
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scopeName = Objects.requireNonNull(scopeName, "expected parameter 'scopeName' to be non-null");
    }

    private PrivateLinkScopedResourceArgs() {
        this.linkedResourceId = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.scopeName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkScopedResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> linkedResourceId;
        private @Nullable Input<String> name;
        private Input<String> resourceGroupName;
        private Input<String> scopeName;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkScopedResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkedResourceId = defaults.linkedResourceId;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scopeName = defaults.scopeName;
        }

        public Builder setLinkedResourceId(@Nullable Input<String> linkedResourceId) {
            this.linkedResourceId = linkedResourceId;
            return this;
        }

        public Builder setLinkedResourceId(@Nullable String linkedResourceId) {
            this.linkedResourceId = Input.ofNullable(linkedResourceId);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
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

        public Builder setScopeName(Input<String> scopeName) {
            this.scopeName = Objects.requireNonNull(scopeName);
            return this;
        }

        public Builder setScopeName(String scopeName) {
            this.scopeName = Input.of(Objects.requireNonNull(scopeName));
            return this;
        }

        public PrivateLinkScopedResourceArgs build() {
            return new PrivateLinkScopedResourceArgs(linkedResourceId, name, resourceGroupName, scopeName);
        }
    }
}
