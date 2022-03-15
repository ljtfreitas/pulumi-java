// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIpGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetIpGroupArgs Empty = new GetIpGroupArgs();

    /**
     * Expands resourceIds (of Firewalls/Network Security Groups etc.) back referenced by the IpGroups resource.
     * 
     */
    @Import(name="expand")
      private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    /**
     * The name of the ipGroups.
     * 
     */
    @Import(name="ipGroupsName", required=true)
      private final String ipGroupsName;

    public String getIpGroupsName() {
        return this.ipGroupsName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetIpGroupArgs(
        @Nullable String expand,
        String ipGroupsName,
        String resourceGroupName) {
        this.expand = expand;
        this.ipGroupsName = Objects.requireNonNull(ipGroupsName, "expected parameter 'ipGroupsName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetIpGroupArgs() {
        this.expand = null;
        this.ipGroupsName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String ipGroupsName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIpGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.ipGroupsName = defaults.ipGroupsName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder expand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }

        public Builder ipGroupsName(String ipGroupsName) {
            this.ipGroupsName = Objects.requireNonNull(ipGroupsName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetIpGroupArgs build() {
            return new GetIpGroupArgs(expand, ipGroupsName, resourceGroupName);
        }
    }
}
