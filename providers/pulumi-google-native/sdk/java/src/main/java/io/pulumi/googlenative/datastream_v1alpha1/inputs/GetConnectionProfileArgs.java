// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConnectionProfileArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConnectionProfileArgs Empty = new GetConnectionProfileArgs();

    @InputImport(name="connectionProfileId", required=true)
      private final String connectionProfileId;

    public String getConnectionProfileId() {
        return this.connectionProfileId;
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

    public GetConnectionProfileArgs(
        String connectionProfileId,
        String location,
        @Nullable String project) {
        this.connectionProfileId = Objects.requireNonNull(connectionProfileId, "expected parameter 'connectionProfileId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetConnectionProfileArgs() {
        this.connectionProfileId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectionProfileId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectionProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionProfileId = defaults.connectionProfileId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder setConnectionProfileId(String connectionProfileId) {
            this.connectionProfileId = Objects.requireNonNull(connectionProfileId);
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
        public GetConnectionProfileArgs build() {
            return new GetConnectionProfileArgs(connectionProfileId, location, project);
        }
    }
}
