// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetScriptExecutionLogsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetScriptExecutionLogsArgs Empty = new GetScriptExecutionLogsArgs();

    /**
     * Name of the private cloud
     * 
     */
    @InputImport(name="privateCloudName", required=true)
    private final String privateCloudName;

    public String getPrivateCloudName() {
        return this.privateCloudName;
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

    /**
     * Name of the user-invoked script execution resource
     * 
     */
    @InputImport(name="scriptExecutionName", required=true)
    private final String scriptExecutionName;

    public String getScriptExecutionName() {
        return this.scriptExecutionName;
    }

    public GetScriptExecutionLogsArgs(
        String privateCloudName,
        String resourceGroupName,
        String scriptExecutionName) {
        this.privateCloudName = Objects.requireNonNull(privateCloudName, "expected parameter 'privateCloudName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scriptExecutionName = Objects.requireNonNull(scriptExecutionName, "expected parameter 'scriptExecutionName' to be non-null");
    }

    private GetScriptExecutionLogsArgs() {
        this.privateCloudName = null;
        this.resourceGroupName = null;
        this.scriptExecutionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScriptExecutionLogsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String privateCloudName;
        private String resourceGroupName;
        private String scriptExecutionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScriptExecutionLogsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateCloudName = defaults.privateCloudName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scriptExecutionName = defaults.scriptExecutionName;
        }

        public Builder setPrivateCloudName(String privateCloudName) {
            this.privateCloudName = Objects.requireNonNull(privateCloudName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setScriptExecutionName(String scriptExecutionName) {
            this.scriptExecutionName = Objects.requireNonNull(scriptExecutionName);
            return this;
        }

        public GetScriptExecutionLogsArgs build() {
            return new GetScriptExecutionLogsArgs(privateCloudName, resourceGroupName, scriptExecutionName);
        }
    }
}
