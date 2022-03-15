// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Redirects a shopper to a specific page. * Rule Condition: - Must specify Condition. * Action Input: Request Query * Action Result: Redirects shopper to provided uri.
 * 
 */
public final class GoogleCloudRetailV2betaRuleRedirectActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2betaRuleRedirectActionResponse Empty = new GoogleCloudRetailV2betaRuleRedirectActionResponse();

    /**
     * URL must have length equal or less than 2000 characters.
     * 
     */
    @Import(name="redirectUri", required=true)
      private final String redirectUri;

    public String getRedirectUri() {
        return this.redirectUri;
    }

    public GoogleCloudRetailV2betaRuleRedirectActionResponse(String redirectUri) {
        this.redirectUri = Objects.requireNonNull(redirectUri, "expected parameter 'redirectUri' to be non-null");
    }

    private GoogleCloudRetailV2betaRuleRedirectActionResponse() {
        this.redirectUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaRuleRedirectActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String redirectUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaRuleRedirectActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.redirectUri = defaults.redirectUri;
        }

        public Builder redirectUri(String redirectUri) {
            this.redirectUri = Objects.requireNonNull(redirectUri);
            return this;
        }
        public GoogleCloudRetailV2betaRuleRedirectActionResponse build() {
            return new GoogleCloudRetailV2betaRuleRedirectActionResponse(redirectUri);
        }
    }
}
