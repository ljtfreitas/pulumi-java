// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.documentai_v1beta3.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProcessorArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetProcessorArgs Empty = new GetProcessorArgs();

    @Import(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @Import(name="processorId", required=true)
      private final String processorId;

    public String getProcessorId() {
        return this.processorId;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetProcessorArgs(
        String location,
        String processorId,
        @Nullable String project) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.processorId = Objects.requireNonNull(processorId, "expected parameter 'processorId' to be non-null");
        this.project = project;
    }

    private GetProcessorArgs() {
        this.location = null;
        this.processorId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProcessorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private String processorId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProcessorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.processorId = defaults.processorId;
    	      this.project = defaults.project;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder processorId(String processorId) {
            this.processorId = Objects.requireNonNull(processorId);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetProcessorArgs build() {
            return new GetProcessorArgs(location, processorId, project);
        }
    }
}
