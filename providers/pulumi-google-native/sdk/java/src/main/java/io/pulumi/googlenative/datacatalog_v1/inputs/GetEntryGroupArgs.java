// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEntryGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEntryGroupArgs Empty = new GetEntryGroupArgs();

    @InputImport(name="entryGroupId", required=true)
      private final String entryGroupId;

    public String getEntryGroupId() {
        return this.entryGroupId;
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

    @InputImport(name="readMask")
      private final @Nullable String readMask;

    public Optional<String> getReadMask() {
        return this.readMask == null ? Optional.empty() : Optional.ofNullable(this.readMask);
    }

    public GetEntryGroupArgs(
        String entryGroupId,
        String location,
        @Nullable String project,
        @Nullable String readMask) {
        this.entryGroupId = Objects.requireNonNull(entryGroupId, "expected parameter 'entryGroupId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.readMask = readMask;
    }

    private GetEntryGroupArgs() {
        this.entryGroupId = null;
        this.location = null;
        this.project = null;
        this.readMask = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEntryGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String entryGroupId;
        private String location;
        private @Nullable String project;
        private @Nullable String readMask;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEntryGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entryGroupId = defaults.entryGroupId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.readMask = defaults.readMask;
        }

        public Builder setEntryGroupId(String entryGroupId) {
            this.entryGroupId = Objects.requireNonNull(entryGroupId);
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

        public Builder setReadMask(@Nullable String readMask) {
            this.readMask = readMask;
            return this;
        }
        public GetEntryGroupArgs build() {
            return new GetEntryGroupArgs(entryGroupId, location, project, readMask);
        }
    }
}
