// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAnnotationSpecSetArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAnnotationSpecSetArgs Empty = new GetAnnotationSpecSetArgs();

    @InputImport(name="annotationSpecSetId", required=true)
      private final String annotationSpecSetId;

    public String getAnnotationSpecSetId() {
        return this.annotationSpecSetId;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetAnnotationSpecSetArgs(
        String annotationSpecSetId,
        @Nullable String project) {
        this.annotationSpecSetId = Objects.requireNonNull(annotationSpecSetId, "expected parameter 'annotationSpecSetId' to be non-null");
        this.project = project;
    }

    private GetAnnotationSpecSetArgs() {
        this.annotationSpecSetId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAnnotationSpecSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String annotationSpecSetId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAnnotationSpecSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotationSpecSetId = defaults.annotationSpecSetId;
    	      this.project = defaults.project;
        }

        public Builder setAnnotationSpecSetId(String annotationSpecSetId) {
            this.annotationSpecSetId = Objects.requireNonNull(annotationSpecSetId);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetAnnotationSpecSetArgs build() {
            return new GetAnnotationSpecSetArgs(annotationSpecSetId, project);
        }
    }
}
