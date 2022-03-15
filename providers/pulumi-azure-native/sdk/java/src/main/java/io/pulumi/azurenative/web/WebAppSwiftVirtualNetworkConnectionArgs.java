// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppSwiftVirtualNetworkConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppSwiftVirtualNetworkConnectionArgs Empty = new WebAppSwiftVirtualNetworkConnectionArgs();

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * Name of the app.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Virtual Network subnet's resource ID. This is the subnet that this Web App will join. This subnet must have a delegation to Microsoft.Web/serverFarms defined first.
     * 
     */
    @Import(name="subnetResourceId")
      private final @Nullable Output<String> subnetResourceId;

    public Output<String> getSubnetResourceId() {
        return this.subnetResourceId == null ? Output.empty() : this.subnetResourceId;
    }

    /**
     * A flag that specifies if the scale unit this Web App is on supports Swift integration.
     * 
     */
    @Import(name="swiftSupported")
      private final @Nullable Output<Boolean> swiftSupported;

    public Output<Boolean> getSwiftSupported() {
        return this.swiftSupported == null ? Output.empty() : this.swiftSupported;
    }

    public WebAppSwiftVirtualNetworkConnectionArgs(
        @Nullable Output<String> kind,
        Output<String> name,
        Output<String> resourceGroupName,
        @Nullable Output<String> subnetResourceId,
        @Nullable Output<Boolean> swiftSupported) {
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.subnetResourceId = subnetResourceId;
        this.swiftSupported = swiftSupported;
    }

    private WebAppSwiftVirtualNetworkConnectionArgs() {
        this.kind = Output.empty();
        this.name = Output.empty();
        this.resourceGroupName = Output.empty();
        this.subnetResourceId = Output.empty();
        this.swiftSupported = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppSwiftVirtualNetworkConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kind;
        private Output<String> name;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> subnetResourceId;
        private @Nullable Output<Boolean> swiftSupported;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppSwiftVirtualNetworkConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.subnetResourceId = defaults.subnetResourceId;
    	      this.swiftSupported = defaults.swiftSupported;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder subnetResourceId(@Nullable Output<String> subnetResourceId) {
            this.subnetResourceId = subnetResourceId;
            return this;
        }

        public Builder subnetResourceId(@Nullable String subnetResourceId) {
            this.subnetResourceId = Output.ofNullable(subnetResourceId);
            return this;
        }

        public Builder swiftSupported(@Nullable Output<Boolean> swiftSupported) {
            this.swiftSupported = swiftSupported;
            return this;
        }

        public Builder swiftSupported(@Nullable Boolean swiftSupported) {
            this.swiftSupported = Output.ofNullable(swiftSupported);
            return this;
        }
        public WebAppSwiftVirtualNetworkConnectionArgs build() {
            return new WebAppSwiftVirtualNetworkConnectionArgs(kind, name, resourceGroupName, subnetResourceId, swiftSupported);
        }
    }
}
