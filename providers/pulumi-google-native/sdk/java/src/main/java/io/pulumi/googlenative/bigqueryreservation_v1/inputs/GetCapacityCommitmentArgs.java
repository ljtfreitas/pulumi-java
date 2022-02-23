// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigqueryreservation_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCapacityCommitmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCapacityCommitmentArgs Empty = new GetCapacityCommitmentArgs();

    @InputImport(name="capacityCommitmentId", required=true)
      private final String capacityCommitmentId;

    public String getCapacityCommitmentId() {
        return this.capacityCommitmentId;
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

    public GetCapacityCommitmentArgs(
        String capacityCommitmentId,
        String location,
        @Nullable String project) {
        this.capacityCommitmentId = Objects.requireNonNull(capacityCommitmentId, "expected parameter 'capacityCommitmentId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetCapacityCommitmentArgs() {
        this.capacityCommitmentId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCapacityCommitmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String capacityCommitmentId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCapacityCommitmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityCommitmentId = defaults.capacityCommitmentId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder setCapacityCommitmentId(String capacityCommitmentId) {
            this.capacityCommitmentId = Objects.requireNonNull(capacityCommitmentId);
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
        public GetCapacityCommitmentArgs build() {
            return new GetCapacityCommitmentArgs(capacityCommitmentId, location, project);
        }
    }
}
