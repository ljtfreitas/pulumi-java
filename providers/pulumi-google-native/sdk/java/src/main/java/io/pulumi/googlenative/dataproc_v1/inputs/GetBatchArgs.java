// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBatchArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBatchArgs Empty = new GetBatchArgs();

    @InputImport(name="batchId", required=true)
      private final String batchId;

    public String getBatchId() {
        return this.batchId;
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

    public GetBatchArgs(
        String batchId,
        String location,
        @Nullable String project) {
        this.batchId = Objects.requireNonNull(batchId, "expected parameter 'batchId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetBatchArgs() {
        this.batchId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String batchId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchId = defaults.batchId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder setBatchId(String batchId) {
            this.batchId = Objects.requireNonNull(batchId);
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
        public GetBatchArgs build() {
            return new GetBatchArgs(batchId, location, project);
        }
    }
}
