// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDeploymentLogFileUrlArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDeploymentLogFileUrlArgs Empty = new GetDeploymentLogFileUrlArgs();

    /**
     * The name of the App resource.
     * 
     */
    @InputImport(name="appName", required=true)
    private final String appName;

    public String getAppName() {
        return this.appName;
    }

    /**
     * The name of the Deployment resource.
     * 
     */
    @InputImport(name="deploymentName", required=true)
    private final String deploymentName;

    public String getDeploymentName() {
        return this.deploymentName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Service resource.
     * 
     */
    @InputImport(name="serviceName", required=true)
    private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    public GetDeploymentLogFileUrlArgs(
        String appName,
        String deploymentName,
        String resourceGroupName,
        String serviceName) {
        this.appName = Objects.requireNonNull(appName, "expected parameter 'appName' to be non-null");
        this.deploymentName = Objects.requireNonNull(deploymentName, "expected parameter 'deploymentName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetDeploymentLogFileUrlArgs() {
        this.appName = null;
        this.deploymentName = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentLogFileUrlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appName;
        private String deploymentName;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeploymentLogFileUrlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appName = defaults.appName;
    	      this.deploymentName = defaults.deploymentName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setAppName(String appName) {
            this.appName = Objects.requireNonNull(appName);
            return this;
        }

        public Builder setDeploymentName(String deploymentName) {
            this.deploymentName = Objects.requireNonNull(deploymentName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public GetDeploymentLogFileUrlArgs build() {
            return new GetDeploymentLogFileUrlArgs(appName, deploymentName, resourceGroupName, serviceName);
        }
    }
}
