// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestackhci.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetArcSettingArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetArcSettingArgs Empty = new GetArcSettingArgs();

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
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetArcSettingArgs(
        String arcSettingName,
        String clusterName,
        String resourceGroupName) {
        this.arcSettingName = Objects.requireNonNull(arcSettingName, "expected parameter 'arcSettingName' to be non-null");
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetArcSettingArgs() {
        this.arcSettingName = null;
        this.clusterName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetArcSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arcSettingName;
        private String clusterName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetArcSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arcSettingName = defaults.arcSettingName;
    	      this.clusterName = defaults.clusterName;
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

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetArcSettingArgs build() {
            return new GetArcSettingArgs(arcSettingName, clusterName, resourceGroupName);
        }
    }
}
