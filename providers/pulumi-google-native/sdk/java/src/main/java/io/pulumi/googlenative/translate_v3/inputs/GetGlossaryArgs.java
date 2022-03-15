// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.translate_v3.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGlossaryArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGlossaryArgs Empty = new GetGlossaryArgs();

    @Import(name="glossaryId", required=true)
      private final String glossaryId;

    public String getGlossaryId() {
        return this.glossaryId;
    }

    @Import(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetGlossaryArgs(
        String glossaryId,
        String location,
        @Nullable String project) {
        this.glossaryId = Objects.requireNonNull(glossaryId, "expected parameter 'glossaryId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetGlossaryArgs() {
        this.glossaryId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlossaryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String glossaryId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlossaryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.glossaryId = defaults.glossaryId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder glossaryId(String glossaryId) {
            this.glossaryId = Objects.requireNonNull(glossaryId);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetGlossaryArgs build() {
            return new GetGlossaryArgs(glossaryId, location, project);
        }
    }
}
