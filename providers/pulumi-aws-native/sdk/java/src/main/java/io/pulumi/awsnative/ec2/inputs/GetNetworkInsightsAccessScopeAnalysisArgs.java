// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkInsightsAccessScopeAnalysisArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNetworkInsightsAccessScopeAnalysisArgs Empty = new GetNetworkInsightsAccessScopeAnalysisArgs();

    @InputImport(name="networkInsightsAccessScopeAnalysisId", required=true)
        private final String networkInsightsAccessScopeAnalysisId;

    public String getNetworkInsightsAccessScopeAnalysisId() {
        return this.networkInsightsAccessScopeAnalysisId;
    }

    public GetNetworkInsightsAccessScopeAnalysisArgs(String networkInsightsAccessScopeAnalysisId) {
        this.networkInsightsAccessScopeAnalysisId = Objects.requireNonNull(networkInsightsAccessScopeAnalysisId, "expected parameter 'networkInsightsAccessScopeAnalysisId' to be non-null");
    }

    private GetNetworkInsightsAccessScopeAnalysisArgs() {
        this.networkInsightsAccessScopeAnalysisId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkInsightsAccessScopeAnalysisArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String networkInsightsAccessScopeAnalysisId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkInsightsAccessScopeAnalysisArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkInsightsAccessScopeAnalysisId = defaults.networkInsightsAccessScopeAnalysisId;
        }

        public Builder setNetworkInsightsAccessScopeAnalysisId(String networkInsightsAccessScopeAnalysisId) {
            this.networkInsightsAccessScopeAnalysisId = Objects.requireNonNull(networkInsightsAccessScopeAnalysisId);
            return this;
        }
        public GetNetworkInsightsAccessScopeAnalysisArgs build() {
            return new GetNetworkInsightsAccessScopeAnalysisArgs(networkInsightsAccessScopeAnalysisId);
        }
    }
}
