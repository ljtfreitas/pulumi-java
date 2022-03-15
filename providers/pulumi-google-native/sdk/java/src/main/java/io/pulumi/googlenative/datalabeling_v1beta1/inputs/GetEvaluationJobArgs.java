// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEvaluationJobArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEvaluationJobArgs Empty = new GetEvaluationJobArgs();

    @Import(name="evaluationJobId", required=true)
      private final String evaluationJobId;

    public String getEvaluationJobId() {
        return this.evaluationJobId;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetEvaluationJobArgs(
        String evaluationJobId,
        @Nullable String project) {
        this.evaluationJobId = Objects.requireNonNull(evaluationJobId, "expected parameter 'evaluationJobId' to be non-null");
        this.project = project;
    }

    private GetEvaluationJobArgs() {
        this.evaluationJobId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEvaluationJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String evaluationJobId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEvaluationJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.evaluationJobId = defaults.evaluationJobId;
    	      this.project = defaults.project;
        }

        public Builder evaluationJobId(String evaluationJobId) {
            this.evaluationJobId = Objects.requireNonNull(evaluationJobId);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetEvaluationJobArgs build() {
            return new GetEvaluationJobArgs(evaluationJobId, project);
        }
    }
}
