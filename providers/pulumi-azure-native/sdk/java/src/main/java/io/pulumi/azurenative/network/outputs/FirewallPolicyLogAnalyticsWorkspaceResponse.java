// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirewallPolicyLogAnalyticsWorkspaceResponse {
    /**
     * Region to configure the Workspace.
     * 
     */
    private final @Nullable String region;
    /**
     * The workspace Id for Firewall Policy Insights.
     * 
     */
    private final @Nullable SubResourceResponse workspaceId;

    @OutputCustomType.Constructor({"region","workspaceId"})
    private FirewallPolicyLogAnalyticsWorkspaceResponse(
        @Nullable String region,
        @Nullable SubResourceResponse workspaceId) {
        this.region = region;
        this.workspaceId = workspaceId;
    }

    /**
     * Region to configure the Workspace.
     * 
     */
    public Optional<String> getRegion() {
        return Optional.ofNullable(this.region);
    }
    /**
     * The workspace Id for Firewall Policy Insights.
     * 
     */
    public Optional<SubResourceResponse> getWorkspaceId() {
        return Optional.ofNullable(this.workspaceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyLogAnalyticsWorkspaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String region;
        private @Nullable SubResourceResponse workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyLogAnalyticsWorkspaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.region = defaults.region;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = region;
            return this;
        }

        public Builder setWorkspaceId(@Nullable SubResourceResponse workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public FirewallPolicyLogAnalyticsWorkspaceResponse build() {
            return new FirewallPolicyLogAnalyticsWorkspaceResponse(region, workspaceId);
        }
    }
}
