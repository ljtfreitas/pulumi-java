// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class ResponseHeadersPolicyReferrerPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicyReferrerPolicyArgs Empty = new ResponseHeadersPolicyReferrerPolicyArgs();

    @InputImport(name="override", required=true)
        private final Input<Boolean> override;

    public Input<Boolean> getOverride() {
        return this.override;
    }

    @InputImport(name="referrerPolicy", required=true)
        private final Input<String> referrerPolicy;

    public Input<String> getReferrerPolicy() {
        return this.referrerPolicy;
    }

    public ResponseHeadersPolicyReferrerPolicyArgs(
        Input<Boolean> override,
        Input<String> referrerPolicy) {
        this.override = Objects.requireNonNull(override, "expected parameter 'override' to be non-null");
        this.referrerPolicy = Objects.requireNonNull(referrerPolicy, "expected parameter 'referrerPolicy' to be non-null");
    }

    private ResponseHeadersPolicyReferrerPolicyArgs() {
        this.override = Input.empty();
        this.referrerPolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyReferrerPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> override;
        private Input<String> referrerPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyReferrerPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.override = defaults.override;
    	      this.referrerPolicy = defaults.referrerPolicy;
        }

        public Builder setOverride(Input<Boolean> override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }

        public Builder setOverride(Boolean override) {
            this.override = Input.of(Objects.requireNonNull(override));
            return this;
        }

        public Builder setReferrerPolicy(Input<String> referrerPolicy) {
            this.referrerPolicy = Objects.requireNonNull(referrerPolicy);
            return this;
        }

        public Builder setReferrerPolicy(String referrerPolicy) {
            this.referrerPolicy = Input.of(Objects.requireNonNull(referrerPolicy));
            return this;
        }
        public ResponseHeadersPolicyReferrerPolicyArgs build() {
            return new ResponseHeadersPolicyReferrerPolicyArgs(override, referrerPolicy);
        }
    }
}
