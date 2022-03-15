// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionDiskArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegionDiskArgs Empty = new GetRegionDiskArgs();

    @Import(name="disk", required=true)
      private final String disk;

    public String getDisk() {
        return this.disk;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
      private final String region;

    public String getRegion() {
        return this.region;
    }

    public GetRegionDiskArgs(
        String disk,
        @Nullable String project,
        String region) {
        this.disk = Objects.requireNonNull(disk, "expected parameter 'disk' to be non-null");
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
    }

    private GetRegionDiskArgs() {
        this.disk = null;
        this.project = null;
        this.region = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String disk;
        private @Nullable String project;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disk = defaults.disk;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder disk(String disk) {
            this.disk = Objects.requireNonNull(disk);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public GetRegionDiskArgs build() {
            return new GetRegionDiskArgs(disk, project, region);
        }
    }
}
