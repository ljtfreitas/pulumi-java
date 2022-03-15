// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIncidentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetIncidentArgs Empty = new GetIncidentArgs();

    /**
     * Incident ID
     * 
     */
    @Import(name="incidentId", required=true)
      private final String incidentId;

    public String getIncidentId() {
        return this.incidentId;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetIncidentArgs(
        String incidentId,
        String resourceGroupName,
        String workspaceName) {
        this.incidentId = Objects.requireNonNull(incidentId, "expected parameter 'incidentId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetIncidentArgs() {
        this.incidentId = null;
        this.resourceGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIncidentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String incidentId;
        private String resourceGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIncidentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.incidentId = defaults.incidentId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder incidentId(String incidentId) {
            this.incidentId = Objects.requireNonNull(incidentId);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public GetIncidentArgs build() {
            return new GetIncidentArgs(incidentId, resourceGroupName, workspaceName);
        }
    }
}
