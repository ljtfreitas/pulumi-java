// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTargetVpnGatewayArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTargetVpnGatewayArgs Empty = new GetTargetVpnGatewayArgs();

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

    @InputImport(name="targetVpnGateway", required=true)
      private final String targetVpnGateway;

    public String getTargetVpnGateway() {
        return this.targetVpnGateway;
    }

    public GetTargetVpnGatewayArgs(
        @Nullable String project,
        String region,
        String targetVpnGateway) {
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.targetVpnGateway = Objects.requireNonNull(targetVpnGateway, "expected parameter 'targetVpnGateway' to be non-null");
    }

    private GetTargetVpnGatewayArgs() {
        this.project = null;
        this.region = null;
        this.targetVpnGateway = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTargetVpnGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String region;
        private String targetVpnGateway;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTargetVpnGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.targetVpnGateway = defaults.targetVpnGateway;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setTargetVpnGateway(String targetVpnGateway) {
            this.targetVpnGateway = Objects.requireNonNull(targetVpnGateway);
            return this;
        }
        public GetTargetVpnGatewayArgs build() {
            return new GetTargetVpnGatewayArgs(project, region, targetVpnGateway);
        }
    }
}
