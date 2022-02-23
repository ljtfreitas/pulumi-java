// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetActionGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetActionGroupArgs Empty = new GetActionGroupArgs();

    /**
     * The name of the action group.
     * 
     */
    @InputImport(name="actionGroupName", required=true)
        private final String actionGroupName;

    public String getActionGroupName() {
        return this.actionGroupName;
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

    public GetActionGroupArgs(
        String actionGroupName,
        String resourceGroupName) {
        this.actionGroupName = Objects.requireNonNull(actionGroupName, "expected parameter 'actionGroupName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetActionGroupArgs() {
        this.actionGroupName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetActionGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionGroupName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetActionGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionGroupName = defaults.actionGroupName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setActionGroupName(String actionGroupName) {
            this.actionGroupName = Objects.requireNonNull(actionGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetActionGroupArgs build() {
            return new GetActionGroupArgs(actionGroupName, resourceGroupName);
        }
    }
}
