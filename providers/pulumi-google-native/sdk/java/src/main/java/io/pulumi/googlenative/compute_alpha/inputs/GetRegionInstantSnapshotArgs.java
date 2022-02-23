// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionInstantSnapshotArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegionInstantSnapshotArgs Empty = new GetRegionInstantSnapshotArgs();

    @InputImport(name="instantSnapshot", required=true)
      private final String instantSnapshot;

    public String getInstantSnapshot() {
        return this.instantSnapshot;
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

    public GetRegionInstantSnapshotArgs(
        String instantSnapshot,
        @Nullable String project,
        String region) {
        this.instantSnapshot = Objects.requireNonNull(instantSnapshot, "expected parameter 'instantSnapshot' to be non-null");
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
    }

    private GetRegionInstantSnapshotArgs() {
        this.instantSnapshot = null;
        this.project = null;
        this.region = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionInstantSnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instantSnapshot;
        private @Nullable String project;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionInstantSnapshotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instantSnapshot = defaults.instantSnapshot;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder setInstantSnapshot(String instantSnapshot) {
            this.instantSnapshot = Objects.requireNonNull(instantSnapshot);
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
        public GetRegionInstantSnapshotArgs build() {
            return new GetRegionInstantSnapshotArgs(instantSnapshot, project, region);
        }
    }
}
