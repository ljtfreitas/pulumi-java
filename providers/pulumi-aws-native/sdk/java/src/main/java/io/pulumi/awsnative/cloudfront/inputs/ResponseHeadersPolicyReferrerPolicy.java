// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class ResponseHeadersPolicyReferrerPolicy extends io.pulumi.resources.InvokeArgs {

    public static final ResponseHeadersPolicyReferrerPolicy Empty = new ResponseHeadersPolicyReferrerPolicy();

    @Import(name="override", required=true)
      private final Boolean override;

    public Boolean getOverride() {
        return this.override;
    }

    @Import(name="referrerPolicy", required=true)
      private final String referrerPolicy;

    public String getReferrerPolicy() {
        return this.referrerPolicy;
    }

    public ResponseHeadersPolicyReferrerPolicy(
        Boolean override,
        String referrerPolicy) {
        this.override = Objects.requireNonNull(override, "expected parameter 'override' to be non-null");
        this.referrerPolicy = Objects.requireNonNull(referrerPolicy, "expected parameter 'referrerPolicy' to be non-null");
    }

    private ResponseHeadersPolicyReferrerPolicy() {
        this.override = null;
        this.referrerPolicy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyReferrerPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean override;
        private String referrerPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyReferrerPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.override = defaults.override;
    	      this.referrerPolicy = defaults.referrerPolicy;
        }

        public Builder override(Boolean override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }

        public Builder referrerPolicy(String referrerPolicy) {
            this.referrerPolicy = Objects.requireNonNull(referrerPolicy);
            return this;
        }
        public ResponseHeadersPolicyReferrerPolicy build() {
            return new ResponseHeadersPolicyReferrerPolicy(override, referrerPolicy);
        }
    }
}
