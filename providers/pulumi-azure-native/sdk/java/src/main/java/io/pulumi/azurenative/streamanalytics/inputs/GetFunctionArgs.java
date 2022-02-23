// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetFunctionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFunctionArgs Empty = new GetFunctionArgs();

    /**
     * The name of the function.
     * 
     */
    @InputImport(name="functionName", required=true)
        private final String functionName;

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * The name of the streaming job.
     * 
     */
    @InputImport(name="jobName", required=true)
        private final String jobName;

    public String getJobName() {
        return this.jobName;
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

    public GetFunctionArgs(
        String functionName,
        String jobName,
        String resourceGroupName) {
        this.functionName = Objects.requireNonNull(functionName, "expected parameter 'functionName' to be non-null");
        this.jobName = Objects.requireNonNull(jobName, "expected parameter 'jobName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetFunctionArgs() {
        this.functionName = null;
        this.jobName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String functionName;
        private String jobName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionName = defaults.functionName;
    	      this.jobName = defaults.jobName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setFunctionName(String functionName) {
            this.functionName = Objects.requireNonNull(functionName);
            return this;
        }

        public Builder setJobName(String jobName) {
            this.jobName = Objects.requireNonNull(jobName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetFunctionArgs build() {
            return new GetFunctionArgs(functionName, jobName, resourceGroupName);
        }
    }
}
