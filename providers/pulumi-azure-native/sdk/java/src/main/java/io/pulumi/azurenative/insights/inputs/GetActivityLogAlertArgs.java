// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetActivityLogAlertArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetActivityLogAlertArgs Empty = new GetActivityLogAlertArgs();

    /**
     * The name of the Activity Log Alert rule.
     * 
     */
    @InputImport(name="activityLogAlertName", required=true)
        private final String activityLogAlertName;

    public String getActivityLogAlertName() {
        return this.activityLogAlertName;
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

    public GetActivityLogAlertArgs(
        String activityLogAlertName,
        String resourceGroupName) {
        this.activityLogAlertName = Objects.requireNonNull(activityLogAlertName, "expected parameter 'activityLogAlertName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetActivityLogAlertArgs() {
        this.activityLogAlertName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetActivityLogAlertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String activityLogAlertName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetActivityLogAlertArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activityLogAlertName = defaults.activityLogAlertName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setActivityLogAlertName(String activityLogAlertName) {
            this.activityLogAlertName = Objects.requireNonNull(activityLogAlertName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetActivityLogAlertArgs build() {
            return new GetActivityLogAlertArgs(activityLogAlertName, resourceGroupName);
        }
    }
}
