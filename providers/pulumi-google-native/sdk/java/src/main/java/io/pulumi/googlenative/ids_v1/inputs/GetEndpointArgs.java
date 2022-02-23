// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ids_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEndpointArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEndpointArgs Empty = new GetEndpointArgs();

    @InputImport(name="endpointId", required=true)
      private final String endpointId;

    public String getEndpointId() {
        return this.endpointId;
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

    public GetEndpointArgs(
        String endpointId,
        String location,
        @Nullable String project) {
        this.endpointId = Objects.requireNonNull(endpointId, "expected parameter 'endpointId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetEndpointArgs() {
        this.endpointId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointId = defaults.endpointId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder setEndpointId(String endpointId) {
            this.endpointId = Objects.requireNonNull(endpointId);
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
        public GetEndpointArgs build() {
            return new GetEndpointArgs(endpointId, location, project);
        }
    }
}
