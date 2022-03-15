// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworkProfileArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNetworkProfileArgs Empty = new GetNetworkProfileArgs();

    /**
     * Expands referenced resources.
     * 
     */
    @Import(name="expand")
      private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    /**
     * The name of the public IP prefix.
     * 
     */
    @Import(name="networkProfileName", required=true)
      private final String networkProfileName;

    public String getNetworkProfileName() {
        return this.networkProfileName;
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

    public GetNetworkProfileArgs(
        @Nullable String expand,
        String networkProfileName,
        String resourceGroupName) {
        this.expand = expand;
        this.networkProfileName = Objects.requireNonNull(networkProfileName, "expected parameter 'networkProfileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetNetworkProfileArgs() {
        this.expand = null;
        this.networkProfileName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String networkProfileName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.networkProfileName = defaults.networkProfileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder expand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }

        public Builder networkProfileName(String networkProfileName) {
            this.networkProfileName = Objects.requireNonNull(networkProfileName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetNetworkProfileArgs build() {
            return new GetNetworkProfileArgs(expand, networkProfileName, resourceGroupName);
        }
    }
}
