// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRemediationAtResourceGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRemediationAtResourceGroupArgs Empty = new GetRemediationAtResourceGroupArgs();

    /**
     * The name of the remediation.
     * 
     */
    @Import(name="remediationName", required=true)
      private final String remediationName;

    public String getRemediationName() {
        return this.remediationName;
    }

    /**
     * Resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetRemediationAtResourceGroupArgs(
        String remediationName,
        String resourceGroupName) {
        this.remediationName = Objects.requireNonNull(remediationName, "expected parameter 'remediationName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetRemediationAtResourceGroupArgs() {
        this.remediationName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRemediationAtResourceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String remediationName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRemediationAtResourceGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.remediationName = defaults.remediationName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder remediationName(String remediationName) {
            this.remediationName = Objects.requireNonNull(remediationName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetRemediationAtResourceGroupArgs build() {
            return new GetRemediationAtResourceGroupArgs(remediationName, resourceGroupName);
        }
    }
}
