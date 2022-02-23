// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetRoleAssignmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRoleAssignmentArgs Empty = new GetRoleAssignmentArgs();

    /**
     * The name of the role assignment.
     * 
     */
    @InputImport(name="assignmentName", required=true)
        private final String assignmentName;

    public String getAssignmentName() {
        return this.assignmentName;
    }

    /**
     * The name of the hub.
     * 
     */
    @InputImport(name="hubName", required=true)
        private final String hubName;

    public String getHubName() {
        return this.hubName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetRoleAssignmentArgs(
        String assignmentName,
        String hubName,
        String resourceGroupName) {
        this.assignmentName = Objects.requireNonNull(assignmentName, "expected parameter 'assignmentName' to be non-null");
        this.hubName = Objects.requireNonNull(hubName, "expected parameter 'hubName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetRoleAssignmentArgs() {
        this.assignmentName = null;
        this.hubName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assignmentName;
        private String hubName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRoleAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignmentName = defaults.assignmentName;
    	      this.hubName = defaults.hubName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAssignmentName(String assignmentName) {
            this.assignmentName = Objects.requireNonNull(assignmentName);
            return this;
        }

        public Builder setHubName(String hubName) {
            this.hubName = Objects.requireNonNull(hubName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetRoleAssignmentArgs build() {
            return new GetRoleAssignmentArgs(assignmentName, hubName, resourceGroupName);
        }
    }
}
