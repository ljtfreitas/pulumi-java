// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetJobAgentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetJobAgentArgs Empty = new GetJobAgentArgs();

    /**
     * The name of the job agent to be retrieved.
     * 
     */
    @Import(name="jobAgentName", required=true)
      private final String jobAgentName;

    public String getJobAgentName() {
        return this.jobAgentName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
      private final String serverName;

    public String getServerName() {
        return this.serverName;
    }

    public GetJobAgentArgs(
        String jobAgentName,
        String resourceGroupName,
        String serverName) {
        this.jobAgentName = Objects.requireNonNull(jobAgentName, "expected parameter 'jobAgentName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
    }

    private GetJobAgentArgs() {
        this.jobAgentName = null;
        this.resourceGroupName = null;
        this.serverName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobAgentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String jobAgentName;
        private String resourceGroupName;
        private String serverName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobAgentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobAgentName = defaults.jobAgentName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
        }

        public Builder jobAgentName(String jobAgentName) {
            this.jobAgentName = Objects.requireNonNull(jobAgentName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder serverName(String serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }
        public GetJobAgentArgs build() {
            return new GetJobAgentArgs(jobAgentName, resourceGroupName, serverName);
        }
    }
}
