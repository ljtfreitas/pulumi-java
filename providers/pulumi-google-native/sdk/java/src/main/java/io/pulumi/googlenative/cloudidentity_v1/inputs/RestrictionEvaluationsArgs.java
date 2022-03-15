// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.cloudidentity_v1.inputs.MembershipRoleRestrictionEvaluationArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Evaluations of restrictions applied to parent group on this membership.
 * 
 */
public final class RestrictionEvaluationsArgs extends io.pulumi.resources.ResourceArgs {

    public static final RestrictionEvaluationsArgs Empty = new RestrictionEvaluationsArgs();

    /**
     * Evaluation of the member restriction applied to this membership. Empty if the user lacks permission to view the restriction evaluation.
     * 
     */
    @Import(name="memberRestrictionEvaluation")
      private final @Nullable Output<MembershipRoleRestrictionEvaluationArgs> memberRestrictionEvaluation;

    public Output<MembershipRoleRestrictionEvaluationArgs> getMemberRestrictionEvaluation() {
        return this.memberRestrictionEvaluation == null ? Output.empty() : this.memberRestrictionEvaluation;
    }

    public RestrictionEvaluationsArgs(@Nullable Output<MembershipRoleRestrictionEvaluationArgs> memberRestrictionEvaluation) {
        this.memberRestrictionEvaluation = memberRestrictionEvaluation;
    }

    private RestrictionEvaluationsArgs() {
        this.memberRestrictionEvaluation = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestrictionEvaluationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MembershipRoleRestrictionEvaluationArgs> memberRestrictionEvaluation;

        public Builder() {
    	      // Empty
        }

        public Builder(RestrictionEvaluationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.memberRestrictionEvaluation = defaults.memberRestrictionEvaluation;
        }

        public Builder memberRestrictionEvaluation(@Nullable Output<MembershipRoleRestrictionEvaluationArgs> memberRestrictionEvaluation) {
            this.memberRestrictionEvaluation = memberRestrictionEvaluation;
            return this;
        }

        public Builder memberRestrictionEvaluation(@Nullable MembershipRoleRestrictionEvaluationArgs memberRestrictionEvaluation) {
            this.memberRestrictionEvaluation = Output.ofNullable(memberRestrictionEvaluation);
            return this;
        }
        public RestrictionEvaluationsArgs build() {
            return new RestrictionEvaluationsArgs(memberRestrictionEvaluation);
        }
    }
}
