// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSentinelOnboardingStateArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSentinelOnboardingStateArgs Empty = new GetSentinelOnboardingStateArgs();

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @InputImport(name="operationalInsightsResourceProvider", required=true)
    private final String operationalInsightsResourceProvider;

    public String getOperationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
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

    /**
     * The Sentinel onboarding state name. Supports - default
     * 
     */
    @InputImport(name="sentinelOnboardingStateName", required=true)
    private final String sentinelOnboardingStateName;

    public String getSentinelOnboardingStateName() {
        return this.sentinelOnboardingStateName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
    private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetSentinelOnboardingStateArgs(
        String operationalInsightsResourceProvider,
        String resourceGroupName,
        String sentinelOnboardingStateName,
        String workspaceName) {
        this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sentinelOnboardingStateName = Objects.requireNonNull(sentinelOnboardingStateName, "expected parameter 'sentinelOnboardingStateName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetSentinelOnboardingStateArgs() {
        this.operationalInsightsResourceProvider = null;
        this.resourceGroupName = null;
        this.sentinelOnboardingStateName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSentinelOnboardingStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String operationalInsightsResourceProvider;
        private String resourceGroupName;
        private String sentinelOnboardingStateName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSentinelOnboardingStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operationalInsightsResourceProvider = defaults.operationalInsightsResourceProvider;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sentinelOnboardingStateName = defaults.sentinelOnboardingStateName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setOperationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSentinelOnboardingStateName(String sentinelOnboardingStateName) {
            this.sentinelOnboardingStateName = Objects.requireNonNull(sentinelOnboardingStateName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public GetSentinelOnboardingStateArgs build() {
            return new GetSentinelOnboardingStateArgs(operationalInsightsResourceProvider, resourceGroupName, sentinelOnboardingStateName, workspaceName);
        }
    }
}
