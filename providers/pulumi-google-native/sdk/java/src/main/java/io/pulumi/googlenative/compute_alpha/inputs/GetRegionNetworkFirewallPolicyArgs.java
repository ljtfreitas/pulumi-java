// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionNetworkFirewallPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegionNetworkFirewallPolicyArgs Empty = new GetRegionNetworkFirewallPolicyArgs();

    @InputImport(name="firewallPolicy", required=true)
      private final String firewallPolicy;

    public String getFirewallPolicy() {
        return this.firewallPolicy;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="region", required=true)
      private final String region;

    public String getRegion() {
        return this.region;
    }

    public GetRegionNetworkFirewallPolicyArgs(
        String firewallPolicy,
        @Nullable String project,
        String region) {
        this.firewallPolicy = Objects.requireNonNull(firewallPolicy, "expected parameter 'firewallPolicy' to be non-null");
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
    }

    private GetRegionNetworkFirewallPolicyArgs() {
        this.firewallPolicy = null;
        this.project = null;
        this.region = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionNetworkFirewallPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String firewallPolicy;
        private @Nullable String project;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionNetworkFirewallPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firewallPolicy = defaults.firewallPolicy;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder setFirewallPolicy(String firewallPolicy) {
            this.firewallPolicy = Objects.requireNonNull(firewallPolicy);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public GetRegionNetworkFirewallPolicyArgs build() {
            return new GetRegionNetworkFirewallPolicyArgs(firewallPolicy, project, region);
        }
    }
}
