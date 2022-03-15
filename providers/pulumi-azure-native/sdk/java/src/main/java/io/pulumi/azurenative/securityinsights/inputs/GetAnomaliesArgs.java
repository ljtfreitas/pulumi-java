// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAnomaliesArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAnomaliesArgs Empty = new GetAnomaliesArgs();

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @Import(name="operationalInsightsResourceProvider", required=true)
      private final String operationalInsightsResourceProvider;

    public String getOperationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The setting name. Supports - Anomalies, EyesOn, EntityAnalytics, Ueba
     * 
     */
    @Import(name="settingsName", required=true)
      private final String settingsName;

    public String getSettingsName() {
        return this.settingsName;
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

    public GetAnomaliesArgs(
        String operationalInsightsResourceProvider,
        String resourceGroupName,
        String settingsName,
        String workspaceName) {
        this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.settingsName = Objects.requireNonNull(settingsName, "expected parameter 'settingsName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetAnomaliesArgs() {
        this.operationalInsightsResourceProvider = null;
        this.resourceGroupName = null;
        this.settingsName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAnomaliesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String operationalInsightsResourceProvider;
        private String resourceGroupName;
        private String settingsName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAnomaliesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operationalInsightsResourceProvider = defaults.operationalInsightsResourceProvider;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.settingsName = defaults.settingsName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder operationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder settingsName(String settingsName) {
            this.settingsName = Objects.requireNonNull(settingsName);
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public GetAnomaliesArgs build() {
            return new GetAnomaliesArgs(operationalInsightsResourceProvider, resourceGroupName, settingsName, workspaceName);
        }
    }
}
