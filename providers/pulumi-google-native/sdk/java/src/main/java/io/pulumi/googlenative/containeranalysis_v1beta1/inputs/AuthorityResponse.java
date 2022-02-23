// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.HintResponse;
import java.util.Objects;


/**
 * Note kind that represents a logical attestation "role" or "authority". For example, an organization might have one `Authority` for "QA" and one for "build". This note is intended to act strictly as a grouping mechanism for the attached occurrences (Attestations). This grouping mechanism also provides a security boundary, since IAM ACLs gate the ability for a principle to attach an occurrence to a given note. It also provides a single point of lookup to find all attached attestation occurrences, even if they don't all live in the same project.
 * 
 */
public final class AuthorityResponse extends io.pulumi.resources.InvokeArgs {

    public static final AuthorityResponse Empty = new AuthorityResponse();

    /**
     * Hint hints at the purpose of the attestation authority.
     * 
     */
    @InputImport(name="hint", required=true)
      private final HintResponse hint;

    public HintResponse getHint() {
        return this.hint;
    }

    public AuthorityResponse(HintResponse hint) {
        this.hint = Objects.requireNonNull(hint, "expected parameter 'hint' to be non-null");
    }

    private AuthorityResponse() {
        this.hint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HintResponse hint;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hint = defaults.hint;
        }

        public Builder setHint(HintResponse hint) {
            this.hint = Objects.requireNonNull(hint);
            return this;
        }
        public AuthorityResponse build() {
            return new AuthorityResponse(hint);
        }
    }
}
