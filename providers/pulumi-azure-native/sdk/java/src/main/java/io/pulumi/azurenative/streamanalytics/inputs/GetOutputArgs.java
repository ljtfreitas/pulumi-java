// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetOutputArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetOutputArgs Empty = new GetOutputArgs();

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
     * The name of the output.
     * 
     */
    @InputImport(name="outputName", required=true)
        private final String outputName;

    public String getOutputName() {
        return this.outputName;
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

    public GetOutputArgs(
        String jobName,
        String outputName,
        String resourceGroupName) {
        this.jobName = Objects.requireNonNull(jobName, "expected parameter 'jobName' to be non-null");
        this.outputName = Objects.requireNonNull(outputName, "expected parameter 'outputName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetOutputArgs() {
        this.jobName = null;
        this.outputName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String jobName;
        private String outputName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOutputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobName = defaults.jobName;
    	      this.outputName = defaults.outputName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setJobName(String jobName) {
            this.jobName = Objects.requireNonNull(jobName);
            return this;
        }

        public Builder setOutputName(String outputName) {
            this.outputName = Objects.requireNonNull(outputName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetOutputArgs build() {
            return new GetOutputArgs(jobName, outputName, resourceGroupName);
        }
    }
}
