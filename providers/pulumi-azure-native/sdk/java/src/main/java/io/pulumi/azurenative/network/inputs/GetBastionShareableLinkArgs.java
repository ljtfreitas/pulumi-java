// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.BastionShareableLink;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBastionShareableLinkArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBastionShareableLinkArgs Empty = new GetBastionShareableLinkArgs();

    /**
     * The name of the Bastion Host.
     * 
     */
    @Import(name="bastionHostName", required=true)
      private final String bastionHostName;

    public String getBastionHostName() {
        return this.bastionHostName;
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

    /**
     * List of VM references.
     * 
     */
    @Import(name="vms")
      private final @Nullable List<BastionShareableLink> vms;

    public List<BastionShareableLink> getVms() {
        return this.vms == null ? List.of() : this.vms;
    }

    public GetBastionShareableLinkArgs(
        String bastionHostName,
        String resourceGroupName,
        @Nullable List<BastionShareableLink> vms) {
        this.bastionHostName = Objects.requireNonNull(bastionHostName, "expected parameter 'bastionHostName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.vms = vms;
    }

    private GetBastionShareableLinkArgs() {
        this.bastionHostName = null;
        this.resourceGroupName = null;
        this.vms = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBastionShareableLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bastionHostName;
        private String resourceGroupName;
        private @Nullable List<BastionShareableLink> vms;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBastionShareableLinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bastionHostName = defaults.bastionHostName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.vms = defaults.vms;
        }

        public Builder bastionHostName(String bastionHostName) {
            this.bastionHostName = Objects.requireNonNull(bastionHostName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder vms(@Nullable List<BastionShareableLink> vms) {
            this.vms = vms;
            return this;
        }
        public GetBastionShareableLinkArgs build() {
            return new GetBastionShareableLinkArgs(bastionHostName, resourceGroupName, vms);
        }
    }
}
