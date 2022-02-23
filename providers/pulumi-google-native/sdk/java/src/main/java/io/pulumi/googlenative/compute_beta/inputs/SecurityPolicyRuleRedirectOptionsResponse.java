// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class SecurityPolicyRuleRedirectOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecurityPolicyRuleRedirectOptionsResponse Empty = new SecurityPolicyRuleRedirectOptionsResponse();

    /**
     * Target for the redirect action. This is required if the type is EXTERNAL_302 and cannot be specified for GOOGLE_RECAPTCHA.
     * 
     */
    @InputImport(name="target", required=true)
      private final String target;

    public String getTarget() {
        return this.target;
    }

    /**
     * Type of the redirect action.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public SecurityPolicyRuleRedirectOptionsResponse(
        String target,
        String type) {
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SecurityPolicyRuleRedirectOptionsResponse() {
        this.target = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleRedirectOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String target;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleRedirectOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.target = defaults.target;
    	      this.type = defaults.type;
        }

        public Builder setTarget(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SecurityPolicyRuleRedirectOptionsResponse build() {
            return new SecurityPolicyRuleRedirectOptionsResponse(target, type);
        }
    }
}
