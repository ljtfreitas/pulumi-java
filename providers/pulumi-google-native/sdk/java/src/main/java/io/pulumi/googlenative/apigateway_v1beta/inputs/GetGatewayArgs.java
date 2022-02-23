// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGatewayArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGatewayArgs Empty = new GetGatewayArgs();

    @InputImport(name="gatewayId", required=true)
      private final String gatewayId;

    public String getGatewayId() {
        return this.gatewayId;
    }

    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetGatewayArgs(
        String gatewayId,
        String location,
        @Nullable String project) {
        this.gatewayId = Objects.requireNonNull(gatewayId, "expected parameter 'gatewayId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetGatewayArgs() {
        this.gatewayId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gatewayId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayId = defaults.gatewayId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder setGatewayId(String gatewayId) {
            this.gatewayId = Objects.requireNonNull(gatewayId);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetGatewayArgs build() {
            return new GetGatewayArgs(gatewayId, location, project);
        }
    }
}
