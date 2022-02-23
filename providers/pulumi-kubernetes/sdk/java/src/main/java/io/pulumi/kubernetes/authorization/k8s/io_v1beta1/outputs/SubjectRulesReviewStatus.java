// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authorization.k8s.io_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.authorization.k8s.io_v1beta1.outputs.NonResourceRule;
import io.pulumi.kubernetes.authorization.k8s.io_v1beta1.outputs.ResourceRule;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SubjectRulesReviewStatus {
    /**
     * EvaluationError can appear in combination with Rules. It indicates an error occurred during rule evaluation, such as an authorizer that doesn't support rule evaluation, and that ResourceRules and/or NonResourceRules may be incomplete.
     * 
     */
    private final @Nullable String evaluationError;
    /**
     * Incomplete is true when the rules returned by this call are incomplete. This is most commonly encountered when an authorizer, such as an external authorizer, doesn't support rules evaluation.
     * 
     */
    private final Boolean incomplete;
    /**
     * NonResourceRules is the list of actions the subject is allowed to perform on non-resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * 
     */
    private final List<NonResourceRule> nonResourceRules;
    /**
     * ResourceRules is the list of actions the subject is allowed to perform on resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * 
     */
    private final List<ResourceRule> resourceRules;

    @OutputCustomType.Constructor({"evaluationError","incomplete","nonResourceRules","resourceRules"})
    private SubjectRulesReviewStatus(
        @Nullable String evaluationError,
        Boolean incomplete,
        List<NonResourceRule> nonResourceRules,
        List<ResourceRule> resourceRules) {
        this.evaluationError = evaluationError;
        this.incomplete = Objects.requireNonNull(incomplete);
        this.nonResourceRules = Objects.requireNonNull(nonResourceRules);
        this.resourceRules = Objects.requireNonNull(resourceRules);
    }

    /**
     * EvaluationError can appear in combination with Rules. It indicates an error occurred during rule evaluation, such as an authorizer that doesn't support rule evaluation, and that ResourceRules and/or NonResourceRules may be incomplete.
     * 
     */
    public Optional<String> getEvaluationError() {
        return Optional.ofNullable(this.evaluationError);
    }
    /**
     * Incomplete is true when the rules returned by this call are incomplete. This is most commonly encountered when an authorizer, such as an external authorizer, doesn't support rules evaluation.
     * 
     */
    public Boolean getIncomplete() {
        return this.incomplete;
    }
    /**
     * NonResourceRules is the list of actions the subject is allowed to perform on non-resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * 
     */
    public List<NonResourceRule> getNonResourceRules() {
        return this.nonResourceRules;
    }
    /**
     * ResourceRules is the list of actions the subject is allowed to perform on resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * 
     */
    public List<ResourceRule> getResourceRules() {
        return this.resourceRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectRulesReviewStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String evaluationError;
        private Boolean incomplete;
        private List<NonResourceRule> nonResourceRules;
        private List<ResourceRule> resourceRules;

        public Builder() {
    	      // Empty
        }

        public Builder(SubjectRulesReviewStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.evaluationError = defaults.evaluationError;
    	      this.incomplete = defaults.incomplete;
    	      this.nonResourceRules = defaults.nonResourceRules;
    	      this.resourceRules = defaults.resourceRules;
        }

        public Builder setEvaluationError(@Nullable String evaluationError) {
            this.evaluationError = evaluationError;
            return this;
        }

        public Builder setIncomplete(Boolean incomplete) {
            this.incomplete = Objects.requireNonNull(incomplete);
            return this;
        }

        public Builder setNonResourceRules(List<NonResourceRule> nonResourceRules) {
            this.nonResourceRules = Objects.requireNonNull(nonResourceRules);
            return this;
        }

        public Builder setResourceRules(List<ResourceRule> resourceRules) {
            this.resourceRules = Objects.requireNonNull(resourceRules);
            return this;
        }
        public SubjectRulesReviewStatus build() {
            return new SubjectRulesReviewStatus(evaluationError, incomplete, nonResourceRules, resourceRules);
        }
    }
}
