// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebaserules_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRulesetArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRulesetArgs Empty = new GetRulesetArgs();

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="rulesetId", required=true)
      private final String rulesetId;

    public String getRulesetId() {
        return this.rulesetId;
    }

    public GetRulesetArgs(
        @Nullable String project,
        String rulesetId) {
        this.project = project;
        this.rulesetId = Objects.requireNonNull(rulesetId, "expected parameter 'rulesetId' to be non-null");
    }

    private GetRulesetArgs() {
        this.project = null;
        this.rulesetId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String rulesetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRulesetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.rulesetId = defaults.rulesetId;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setRulesetId(String rulesetId) {
            this.rulesetId = Objects.requireNonNull(rulesetId);
            return this;
        }
        public GetRulesetArgs build() {
            return new GetRulesetArgs(project, rulesetId);
        }
    }
}
