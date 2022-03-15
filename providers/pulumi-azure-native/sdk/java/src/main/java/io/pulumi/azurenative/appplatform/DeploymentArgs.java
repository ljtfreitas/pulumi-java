// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.appplatform.inputs.DeploymentResourcePropertiesArgs;
import io.pulumi.azurenative.appplatform.inputs.SkuArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentArgs Empty = new DeploymentArgs();

    /**
     * The name of the App resource.
     * 
     */
    @Import(name="appName", required=true)
      private final Output<String> appName;

    public Output<String> getAppName() {
        return this.appName;
    }

    /**
     * The name of the Deployment resource.
     * 
     */
    @Import(name="deploymentName")
      private final @Nullable Output<String> deploymentName;

    public Output<String> getDeploymentName() {
        return this.deploymentName == null ? Output.empty() : this.deploymentName;
    }

    /**
     * Properties of the Deployment resource
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<DeploymentResourcePropertiesArgs> properties;

    public Output<DeploymentResourcePropertiesArgs> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Service resource.
     * 
     */
    @Import(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> getServiceName() {
        return this.serviceName;
    }

    /**
     * Sku of the Deployment resource
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<SkuArgs> sku;

    public Output<SkuArgs> getSku() {
        return this.sku == null ? Output.empty() : this.sku;
    }

    public DeploymentArgs(
        Output<String> appName,
        @Nullable Output<String> deploymentName,
        @Nullable Output<DeploymentResourcePropertiesArgs> properties,
        Output<String> resourceGroupName,
        Output<String> serviceName,
        @Nullable Output<SkuArgs> sku) {
        this.appName = Objects.requireNonNull(appName, "expected parameter 'appName' to be non-null");
        this.deploymentName = deploymentName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.sku = sku;
    }

    private DeploymentArgs() {
        this.appName = Output.empty();
        this.deploymentName = Output.empty();
        this.properties = Output.empty();
        this.resourceGroupName = Output.empty();
        this.serviceName = Output.empty();
        this.sku = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> appName;
        private @Nullable Output<String> deploymentName;
        private @Nullable Output<DeploymentResourcePropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private Output<String> serviceName;
        private @Nullable Output<SkuArgs> sku;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appName = defaults.appName;
    	      this.deploymentName = defaults.deploymentName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.sku = defaults.sku;
        }

        public Builder appName(Output<String> appName) {
            this.appName = Objects.requireNonNull(appName);
            return this;
        }

        public Builder appName(String appName) {
            this.appName = Output.of(Objects.requireNonNull(appName));
            return this;
        }

        public Builder deploymentName(@Nullable Output<String> deploymentName) {
            this.deploymentName = deploymentName;
            return this;
        }

        public Builder deploymentName(@Nullable String deploymentName) {
            this.deploymentName = Output.ofNullable(deploymentName);
            return this;
        }

        public Builder properties(@Nullable Output<DeploymentResourcePropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable DeploymentResourcePropertiesArgs properties) {
            this.properties = Output.ofNullable(properties);
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

        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }

        public Builder sku(@Nullable Output<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder sku(@Nullable SkuArgs sku) {
            this.sku = Output.ofNullable(sku);
            return this;
        }
        public DeploymentArgs build() {
            return new DeploymentArgs(appName, deploymentName, properties, resourceGroupName, serviceName, sku);
        }
    }
}
