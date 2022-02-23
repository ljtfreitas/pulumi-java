// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestackhci.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetExtensionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetExtensionArgs Empty = new GetExtensionArgs();

    /**
     * The name of the proxy resource holding details of HCI ArcSetting information.
     * 
     */
    @InputImport(name="arcSettingName", required=true)
        private final String arcSettingName;

    public String getArcSettingName() {
        return this.arcSettingName;
    }

    /**
     * The name of the cluster.
     * 
     */
    @InputImport(name="clusterName", required=true)
        private final String clusterName;

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * The name of the machine extension.
     * 
     */
    @InputImport(name="extensionName", required=true)
        private final String extensionName;

    public String getExtensionName() {
        return this.extensionName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetExtensionArgs(
        String arcSettingName,
        String clusterName,
        String extensionName,
        String resourceGroupName) {
        this.arcSettingName = Objects.requireNonNull(arcSettingName, "expected parameter 'arcSettingName' to be non-null");
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.extensionName = Objects.requireNonNull(extensionName, "expected parameter 'extensionName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetExtensionArgs() {
        this.arcSettingName = null;
        this.clusterName = null;
        this.extensionName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arcSettingName;
        private String clusterName;
        private String extensionName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExtensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arcSettingName = defaults.arcSettingName;
    	      this.clusterName = defaults.clusterName;
    	      this.extensionName = defaults.extensionName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setArcSettingName(String arcSettingName) {
            this.arcSettingName = Objects.requireNonNull(arcSettingName);
            return this;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setExtensionName(String extensionName) {
            this.extensionName = Objects.requireNonNull(extensionName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetExtensionArgs build() {
            return new GetExtensionArgs(arcSettingName, clusterName, extensionName, resourceGroupName);
        }
    }
}
