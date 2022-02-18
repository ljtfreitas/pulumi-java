// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetCommitmentPlanArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCommitmentPlanArgs Empty = new GetCommitmentPlanArgs();

    /**
     * The Azure ML commitment plan name.
     * 
     */
    @InputImport(name="commitmentPlanName", required=true)
    private final String commitmentPlanName;

    public String getCommitmentPlanName() {
        return this.commitmentPlanName;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetCommitmentPlanArgs(
        String commitmentPlanName,
        String resourceGroupName) {
        this.commitmentPlanName = Objects.requireNonNull(commitmentPlanName, "expected parameter 'commitmentPlanName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetCommitmentPlanArgs() {
        this.commitmentPlanName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCommitmentPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String commitmentPlanName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCommitmentPlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commitmentPlanName = defaults.commitmentPlanName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setCommitmentPlanName(String commitmentPlanName) {
            this.commitmentPlanName = Objects.requireNonNull(commitmentPlanName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetCommitmentPlanArgs build() {
            return new GetCommitmentPlanArgs(commitmentPlanName, resourceGroupName);
        }
    }
}
