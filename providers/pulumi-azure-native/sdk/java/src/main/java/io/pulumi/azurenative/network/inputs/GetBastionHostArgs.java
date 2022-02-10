// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetBastionHostArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBastionHostArgs Empty = new GetBastionHostArgs();

    @InputImport(name="bastionHostName", required=true)
    private final String bastionHostName;

    public String getBastionHostName() {
        return this.bastionHostName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetBastionHostArgs(
        String bastionHostName,
        String resourceGroupName) {
        this.bastionHostName = Objects.requireNonNull(bastionHostName, "expected parameter 'bastionHostName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetBastionHostArgs() {
        this.bastionHostName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBastionHostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bastionHostName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBastionHostArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bastionHostName = defaults.bastionHostName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setBastionHostName(String bastionHostName) {
            this.bastionHostName = Objects.requireNonNull(bastionHostName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetBastionHostArgs build() {
            return new GetBastionHostArgs(bastionHostName, resourceGroupName);
        }
    }
}