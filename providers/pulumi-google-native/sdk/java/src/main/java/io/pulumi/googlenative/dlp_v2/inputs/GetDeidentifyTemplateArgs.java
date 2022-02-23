// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDeidentifyTemplateArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDeidentifyTemplateArgs Empty = new GetDeidentifyTemplateArgs();

    @InputImport(name="deidentifyTemplateId", required=true)
      private final String deidentifyTemplateId;

    public String getDeidentifyTemplateId() {
        return this.deidentifyTemplateId;
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

    public GetDeidentifyTemplateArgs(
        String deidentifyTemplateId,
        String location,
        @Nullable String project) {
        this.deidentifyTemplateId = Objects.requireNonNull(deidentifyTemplateId, "expected parameter 'deidentifyTemplateId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetDeidentifyTemplateArgs() {
        this.deidentifyTemplateId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeidentifyTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deidentifyTemplateId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeidentifyTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deidentifyTemplateId = defaults.deidentifyTemplateId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder setDeidentifyTemplateId(String deidentifyTemplateId) {
            this.deidentifyTemplateId = Objects.requireNonNull(deidentifyTemplateId);
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
        public GetDeidentifyTemplateArgs build() {
            return new GetDeidentifyTemplateArgs(deidentifyTemplateId, location, project);
        }
    }
}
