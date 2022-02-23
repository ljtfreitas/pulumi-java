// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyGetArgs;
import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsGetArgs;
import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigFrameOptionsGetArgs;
import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyGetArgs;
import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityGetArgs;
import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigXssProtectionGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResponseHeadersPolicySecurityHeadersConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicySecurityHeadersConfigGetArgs Empty = new ResponseHeadersPolicySecurityHeadersConfigGetArgs();

    /**
     * The policy directives and their values that CloudFront includes as values for the `Content-Security-Policy` HTTP response header.
     * 
     */
    @InputImport(name="contentSecurityPolicy")
    private final @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyGetArgs> contentSecurityPolicy;

    public Input<ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyGetArgs> getContentSecurityPolicy() {
        return this.contentSecurityPolicy == null ? Input.empty() : this.contentSecurityPolicy;
    }

    /**
     * Determines whether CloudFront includes the `X-Content-Type-Options` HTTP response header with its value set to `nosniff`. See Content Type Options for more information.
     * 
     */
    @InputImport(name="contentTypeOptions")
    private final @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsGetArgs> contentTypeOptions;

    public Input<ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsGetArgs> getContentTypeOptions() {
        return this.contentTypeOptions == null ? Input.empty() : this.contentTypeOptions;
    }

    /**
     * Determines whether CloudFront includes the `X-Frame-Options` HTTP response header and the header’s value. See Frame Options for more information.
     * 
     */
    @InputImport(name="frameOptions")
    private final @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigFrameOptionsGetArgs> frameOptions;

    public Input<ResponseHeadersPolicySecurityHeadersConfigFrameOptionsGetArgs> getFrameOptions() {
        return this.frameOptions == null ? Input.empty() : this.frameOptions;
    }

    /**
     * The value of the `Referrer-Policy` HTTP response header. Valid Values: `no-referrer` | `no-referrer-when-downgrade` | `origin` | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
     * 
     */
    @InputImport(name="referrerPolicy")
    private final @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyGetArgs> referrerPolicy;

    public Input<ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyGetArgs> getReferrerPolicy() {
        return this.referrerPolicy == null ? Input.empty() : this.referrerPolicy;
    }

    /**
     * Determines whether CloudFront includes the `Strict-Transport-Security` HTTP response header and the header’s value. See Strict Transport Security for more information.
     * 
     */
    @InputImport(name="strictTransportSecurity")
    private final @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityGetArgs> strictTransportSecurity;

    public Input<ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityGetArgs> getStrictTransportSecurity() {
        return this.strictTransportSecurity == null ? Input.empty() : this.strictTransportSecurity;
    }

    /**
     * Determine whether CloudFront includes the `X-XSS-Protection` HTTP response header and the header’s value. See XSS Protection for more information.
     * 
     */
    @InputImport(name="xssProtection")
    private final @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigXssProtectionGetArgs> xssProtection;

    public Input<ResponseHeadersPolicySecurityHeadersConfigXssProtectionGetArgs> getXssProtection() {
        return this.xssProtection == null ? Input.empty() : this.xssProtection;
    }

    public ResponseHeadersPolicySecurityHeadersConfigGetArgs(
        @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyGetArgs> contentSecurityPolicy,
        @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsGetArgs> contentTypeOptions,
        @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigFrameOptionsGetArgs> frameOptions,
        @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyGetArgs> referrerPolicy,
        @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityGetArgs> strictTransportSecurity,
        @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigXssProtectionGetArgs> xssProtection) {
        this.contentSecurityPolicy = contentSecurityPolicy;
        this.contentTypeOptions = contentTypeOptions;
        this.frameOptions = frameOptions;
        this.referrerPolicy = referrerPolicy;
        this.strictTransportSecurity = strictTransportSecurity;
        this.xssProtection = xssProtection;
    }

    private ResponseHeadersPolicySecurityHeadersConfigGetArgs() {
        this.contentSecurityPolicy = Input.empty();
        this.contentTypeOptions = Input.empty();
        this.frameOptions = Input.empty();
        this.referrerPolicy = Input.empty();
        this.strictTransportSecurity = Input.empty();
        this.xssProtection = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicySecurityHeadersConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyGetArgs> contentSecurityPolicy;
        private @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsGetArgs> contentTypeOptions;
        private @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigFrameOptionsGetArgs> frameOptions;
        private @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyGetArgs> referrerPolicy;
        private @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityGetArgs> strictTransportSecurity;
        private @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigXssProtectionGetArgs> xssProtection;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicySecurityHeadersConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentSecurityPolicy = defaults.contentSecurityPolicy;
    	      this.contentTypeOptions = defaults.contentTypeOptions;
    	      this.frameOptions = defaults.frameOptions;
    	      this.referrerPolicy = defaults.referrerPolicy;
    	      this.strictTransportSecurity = defaults.strictTransportSecurity;
    	      this.xssProtection = defaults.xssProtection;
        }

        public Builder setContentSecurityPolicy(@Nullable Input<ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyGetArgs> contentSecurityPolicy) {
            this.contentSecurityPolicy = contentSecurityPolicy;
            return this;
        }

        public Builder setContentSecurityPolicy(@Nullable ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyGetArgs contentSecurityPolicy) {
            this.contentSecurityPolicy = Input.ofNullable(contentSecurityPolicy);
            return this;
        }

        public Builder setContentTypeOptions(@Nullable Input<ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsGetArgs> contentTypeOptions) {
            this.contentTypeOptions = contentTypeOptions;
            return this;
        }

        public Builder setContentTypeOptions(@Nullable ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsGetArgs contentTypeOptions) {
            this.contentTypeOptions = Input.ofNullable(contentTypeOptions);
            return this;
        }

        public Builder setFrameOptions(@Nullable Input<ResponseHeadersPolicySecurityHeadersConfigFrameOptionsGetArgs> frameOptions) {
            this.frameOptions = frameOptions;
            return this;
        }

        public Builder setFrameOptions(@Nullable ResponseHeadersPolicySecurityHeadersConfigFrameOptionsGetArgs frameOptions) {
            this.frameOptions = Input.ofNullable(frameOptions);
            return this;
        }

        public Builder setReferrerPolicy(@Nullable Input<ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyGetArgs> referrerPolicy) {
            this.referrerPolicy = referrerPolicy;
            return this;
        }

        public Builder setReferrerPolicy(@Nullable ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyGetArgs referrerPolicy) {
            this.referrerPolicy = Input.ofNullable(referrerPolicy);
            return this;
        }

        public Builder setStrictTransportSecurity(@Nullable Input<ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityGetArgs> strictTransportSecurity) {
            this.strictTransportSecurity = strictTransportSecurity;
            return this;
        }

        public Builder setStrictTransportSecurity(@Nullable ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityGetArgs strictTransportSecurity) {
            this.strictTransportSecurity = Input.ofNullable(strictTransportSecurity);
            return this;
        }

        public Builder setXssProtection(@Nullable Input<ResponseHeadersPolicySecurityHeadersConfigXssProtectionGetArgs> xssProtection) {
            this.xssProtection = xssProtection;
            return this;
        }

        public Builder setXssProtection(@Nullable ResponseHeadersPolicySecurityHeadersConfigXssProtectionGetArgs xssProtection) {
            this.xssProtection = Input.ofNullable(xssProtection);
            return this;
        }
        public ResponseHeadersPolicySecurityHeadersConfigGetArgs build() {
            return new ResponseHeadersPolicySecurityHeadersConfigGetArgs(contentSecurityPolicy, contentTypeOptions, frameOptions, referrerPolicy, strictTransportSecurity, xssProtection);
        }
    }
}