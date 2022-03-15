// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The evaluated state of this restriction.
 * 
 */
public final class MembershipRoleRestrictionEvaluationResponse extends io.pulumi.resources.InvokeArgs {

    public static final MembershipRoleRestrictionEvaluationResponse Empty = new MembershipRoleRestrictionEvaluationResponse();

    /**
     * The current state of the restriction
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    public MembershipRoleRestrictionEvaluationResponse(String state) {
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
    }

    private MembershipRoleRestrictionEvaluationResponse() {
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipRoleRestrictionEvaluationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipRoleRestrictionEvaluationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.state = defaults.state;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public MembershipRoleRestrictionEvaluationResponse build() {
            return new MembershipRoleRestrictionEvaluationResponse(state);
        }
    }
}
