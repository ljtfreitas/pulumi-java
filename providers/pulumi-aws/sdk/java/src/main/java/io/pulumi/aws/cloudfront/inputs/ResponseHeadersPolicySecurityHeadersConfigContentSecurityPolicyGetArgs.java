// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyGetArgs Empty = new ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyGetArgs();

    /**
     * The policy directives and their values that CloudFront includes as values for the `Content-Security-Policy` HTTP response header.
     * 
     */
    @Import(name="contentSecurityPolicy", required=true)
      private final Output<String> contentSecurityPolicy;

    public Output<String> getContentSecurityPolicy() {
        return this.contentSecurityPolicy;
    }

    /**
     * A Boolean value that determines whether CloudFront overrides the `X-XSS-Protection` HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    @Import(name="override", required=true)
      private final Output<Boolean> override;

    public Output<Boolean> getOverride() {
        return this.override;
    }

    public ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyGetArgs(
        Output<String> contentSecurityPolicy,
        Output<Boolean> override) {
        this.contentSecurityPolicy = Objects.requireNonNull(contentSecurityPolicy, "expected parameter 'contentSecurityPolicy' to be non-null");
        this.override = Objects.requireNonNull(override, "expected parameter 'override' to be non-null");
    }

    private ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyGetArgs() {
        this.contentSecurityPolicy = Output.empty();
        this.override = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> contentSecurityPolicy;
        private Output<Boolean> override;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentSecurityPolicy = defaults.contentSecurityPolicy;
    	      this.override = defaults.override;
        }

        public Builder contentSecurityPolicy(Output<String> contentSecurityPolicy) {
            this.contentSecurityPolicy = Objects.requireNonNull(contentSecurityPolicy);
            return this;
        }

        public Builder contentSecurityPolicy(String contentSecurityPolicy) {
            this.contentSecurityPolicy = Output.of(Objects.requireNonNull(contentSecurityPolicy));
            return this;
        }

        public Builder override(Output<Boolean> override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }

        public Builder override(Boolean override) {
            this.override = Output.of(Objects.requireNonNull(override));
            return this;
        }
        public ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyGetArgs build() {
            return new ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyGetArgs(contentSecurityPolicy, override);
        }
    }
}
