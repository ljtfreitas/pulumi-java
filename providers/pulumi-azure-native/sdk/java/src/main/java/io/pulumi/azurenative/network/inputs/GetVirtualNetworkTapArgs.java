// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualNetworkTapArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVirtualNetworkTapArgs Empty = new GetVirtualNetworkTapArgs();

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="tapName", required=true)
    private final String tapName;

    public String getTapName() {
        return this.tapName;
    }

    public GetVirtualNetworkTapArgs(
        String resourceGroupName,
        String tapName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tapName = Objects.requireNonNull(tapName, "expected parameter 'tapName' to be non-null");
    }

    private GetVirtualNetworkTapArgs() {
        this.resourceGroupName = null;
        this.tapName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNetworkTapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String tapName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualNetworkTapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tapName = defaults.tapName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setTapName(String tapName) {
            this.tapName = Objects.requireNonNull(tapName);
            return this;
        }

        public GetVirtualNetworkTapArgs build() {
            return new GetVirtualNetworkTapArgs(resourceGroupName, tapName);
        }
    }
}