// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.azurenative.avs.enums.InternetEnum;
import io.pulumi.azurenative.avs.inputs.IdentitySourceArgs;
import io.pulumi.azurenative.avs.inputs.ManagementClusterArgs;
import io.pulumi.azurenative.avs.inputs.SkuArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateCloudArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateCloudArgs Empty = new PrivateCloudArgs();

    /**
     * vCenter Single Sign On Identity Sources
     * 
     */
    @InputImport(name="identitySources")
    private final @Nullable Input<List<IdentitySourceArgs>> identitySources;

    public Input<List<IdentitySourceArgs>> getIdentitySources() {
        return this.identitySources == null ? Input.empty() : this.identitySources;
    }

    /**
     * Connectivity to internet is enabled or disabled
     * 
     */
    @InputImport(name="internet")
    private final @Nullable Input<Either<String,InternetEnum>> internet;

    public Input<Either<String,InternetEnum>> getInternet() {
        return this.internet == null ? Input.empty() : this.internet;
    }

    /**
     * Resource location
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The default cluster used for management
     * 
     */
    @InputImport(name="managementCluster", required=true)
    private final Input<ManagementClusterArgs> managementCluster;

    public Input<ManagementClusterArgs> getManagementCluster() {
        return this.managementCluster;
    }

    /**
     * The block of addresses should be unique across VNet in your subscription as well as on-premise. Make sure the CIDR format is conformed to (A.B.C.D/X) where A,B,C,D are between 0 and 255, and X is between 0 and 22
     * 
     */
    @InputImport(name="networkBlock", required=true)
    private final Input<String> networkBlock;

    public Input<String> getNetworkBlock() {
        return this.networkBlock;
    }

    /**
     * Optionally, set the NSX-T Manager password when the private cloud is created
     * 
     */
    @InputImport(name="nsxtPassword")
    private final @Nullable Input<String> nsxtPassword;

    public Input<String> getNsxtPassword() {
        return this.nsxtPassword == null ? Input.empty() : this.nsxtPassword;
    }

    /**
     * Name of the private cloud
     * 
     */
    @InputImport(name="privateCloudName")
    private final @Nullable Input<String> privateCloudName;

    public Input<String> getPrivateCloudName() {
        return this.privateCloudName == null ? Input.empty() : this.privateCloudName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The private cloud SKU
     * 
     */
    @InputImport(name="sku", required=true)
    private final Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku;
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Optionally, set the vCenter admin password when the private cloud is created
     * 
     */
    @InputImport(name="vcenterPassword")
    private final @Nullable Input<String> vcenterPassword;

    public Input<String> getVcenterPassword() {
        return this.vcenterPassword == null ? Input.empty() : this.vcenterPassword;
    }

    public PrivateCloudArgs(
        @Nullable Input<List<IdentitySourceArgs>> identitySources,
        @Nullable Input<Either<String,InternetEnum>> internet,
        @Nullable Input<String> location,
        Input<ManagementClusterArgs> managementCluster,
        Input<String> networkBlock,
        @Nullable Input<String> nsxtPassword,
        @Nullable Input<String> privateCloudName,
        Input<String> resourceGroupName,
        Input<SkuArgs> sku,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> vcenterPassword) {
        this.identitySources = identitySources;
        this.internet = internet == null ? Input.ofLeft("Disabled") : internet;
        this.location = location;
        this.managementCluster = Objects.requireNonNull(managementCluster, "expected parameter 'managementCluster' to be non-null");
        this.networkBlock = Objects.requireNonNull(networkBlock, "expected parameter 'networkBlock' to be non-null");
        this.nsxtPassword = nsxtPassword;
        this.privateCloudName = privateCloudName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.tags = tags;
        this.vcenterPassword = vcenterPassword;
    }

    private PrivateCloudArgs() {
        this.identitySources = Input.empty();
        this.internet = Input.empty();
        this.location = Input.empty();
        this.managementCluster = Input.empty();
        this.networkBlock = Input.empty();
        this.nsxtPassword = Input.empty();
        this.privateCloudName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
        this.vcenterPassword = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateCloudArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<IdentitySourceArgs>> identitySources;
        private @Nullable Input<Either<String,InternetEnum>> internet;
        private @Nullable Input<String> location;
        private Input<ManagementClusterArgs> managementCluster;
        private Input<String> networkBlock;
        private @Nullable Input<String> nsxtPassword;
        private @Nullable Input<String> privateCloudName;
        private Input<String> resourceGroupName;
        private Input<SkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> vcenterPassword;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateCloudArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identitySources = defaults.identitySources;
    	      this.internet = defaults.internet;
    	      this.location = defaults.location;
    	      this.managementCluster = defaults.managementCluster;
    	      this.networkBlock = defaults.networkBlock;
    	      this.nsxtPassword = defaults.nsxtPassword;
    	      this.privateCloudName = defaults.privateCloudName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.vcenterPassword = defaults.vcenterPassword;
        }

        public Builder setIdentitySources(@Nullable Input<List<IdentitySourceArgs>> identitySources) {
            this.identitySources = identitySources;
            return this;
        }

        public Builder setIdentitySources(@Nullable List<IdentitySourceArgs> identitySources) {
            this.identitySources = Input.ofNullable(identitySources);
            return this;
        }

        public Builder setInternet(@Nullable Input<Either<String,InternetEnum>> internet) {
            this.internet = internet;
            return this;
        }

        public Builder setInternet(@Nullable Either<String,InternetEnum> internet) {
            this.internet = Input.ofNullable(internet);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setManagementCluster(Input<ManagementClusterArgs> managementCluster) {
            this.managementCluster = Objects.requireNonNull(managementCluster);
            return this;
        }

        public Builder setManagementCluster(ManagementClusterArgs managementCluster) {
            this.managementCluster = Input.of(Objects.requireNonNull(managementCluster));
            return this;
        }

        public Builder setNetworkBlock(Input<String> networkBlock) {
            this.networkBlock = Objects.requireNonNull(networkBlock);
            return this;
        }

        public Builder setNetworkBlock(String networkBlock) {
            this.networkBlock = Input.of(Objects.requireNonNull(networkBlock));
            return this;
        }

        public Builder setNsxtPassword(@Nullable Input<String> nsxtPassword) {
            this.nsxtPassword = nsxtPassword;
            return this;
        }

        public Builder setNsxtPassword(@Nullable String nsxtPassword) {
            this.nsxtPassword = Input.ofNullable(nsxtPassword);
            return this;
        }

        public Builder setPrivateCloudName(@Nullable Input<String> privateCloudName) {
            this.privateCloudName = privateCloudName;
            return this;
        }

        public Builder setPrivateCloudName(@Nullable String privateCloudName) {
            this.privateCloudName = Input.ofNullable(privateCloudName);
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

        public Builder setSku(Input<SkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setSku(SkuArgs sku) {
            this.sku = Input.of(Objects.requireNonNull(sku));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVcenterPassword(@Nullable Input<String> vcenterPassword) {
            this.vcenterPassword = vcenterPassword;
            return this;
        }

        public Builder setVcenterPassword(@Nullable String vcenterPassword) {
            this.vcenterPassword = Input.ofNullable(vcenterPassword);
            return this;
        }

        public PrivateCloudArgs build() {
            return new PrivateCloudArgs(identitySources, internet, location, managementCluster, networkBlock, nsxtPassword, privateCloudName, resourceGroupName, sku, tags, vcenterPassword);
        }
    }
}
