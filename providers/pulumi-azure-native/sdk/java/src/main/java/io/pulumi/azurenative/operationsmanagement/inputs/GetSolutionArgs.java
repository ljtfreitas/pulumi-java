// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationsmanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSolutionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSolutionArgs Empty = new GetSolutionArgs();

    /**
     * The name of the resource group to get. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * User Solution Name.
     * 
     */
    @InputImport(name="solutionName", required=true)
    private final String solutionName;

    public String getSolutionName() {
        return this.solutionName;
    }

    public GetSolutionArgs(
        String resourceGroupName,
        String solutionName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.solutionName = Objects.requireNonNull(solutionName, "expected parameter 'solutionName' to be non-null");
    }

    private GetSolutionArgs() {
        this.resourceGroupName = null;
        this.solutionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSolutionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String solutionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSolutionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.solutionName = defaults.solutionName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSolutionName(String solutionName) {
            this.solutionName = Objects.requireNonNull(solutionName);
            return this;
        }

        public GetSolutionArgs build() {
            return new GetSolutionArgs(resourceGroupName, solutionName);
        }
    }
}
