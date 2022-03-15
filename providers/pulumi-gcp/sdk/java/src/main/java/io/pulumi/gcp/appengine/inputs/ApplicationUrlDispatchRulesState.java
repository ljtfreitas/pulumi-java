// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.appengine.inputs.ApplicationUrlDispatchRulesDispatchRuleGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationUrlDispatchRulesState extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationUrlDispatchRulesState Empty = new ApplicationUrlDispatchRulesState();

    /**
     * Rules to match an HTTP request and dispatch that request to a service.
     * Structure is documented below.
     * 
     */
    @Import(name="dispatchRules")
      private final @Nullable Output<List<ApplicationUrlDispatchRulesDispatchRuleGetArgs>> dispatchRules;

    public Output<List<ApplicationUrlDispatchRulesDispatchRuleGetArgs>> getDispatchRules() {
        return this.dispatchRules == null ? Output.empty() : this.dispatchRules;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    public ApplicationUrlDispatchRulesState(
        @Nullable Output<List<ApplicationUrlDispatchRulesDispatchRuleGetArgs>> dispatchRules,
        @Nullable Output<String> project) {
        this.dispatchRules = dispatchRules;
        this.project = project;
    }

    private ApplicationUrlDispatchRulesState() {
        this.dispatchRules = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationUrlDispatchRulesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ApplicationUrlDispatchRulesDispatchRuleGetArgs>> dispatchRules;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationUrlDispatchRulesState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dispatchRules = defaults.dispatchRules;
    	      this.project = defaults.project;
        }

        public Builder dispatchRules(@Nullable Output<List<ApplicationUrlDispatchRulesDispatchRuleGetArgs>> dispatchRules) {
            this.dispatchRules = dispatchRules;
            return this;
        }

        public Builder dispatchRules(@Nullable List<ApplicationUrlDispatchRulesDispatchRuleGetArgs> dispatchRules) {
            this.dispatchRules = Output.ofNullable(dispatchRules);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public ApplicationUrlDispatchRulesState build() {
            return new ApplicationUrlDispatchRulesState(dispatchRules, project);
        }
    }
}
