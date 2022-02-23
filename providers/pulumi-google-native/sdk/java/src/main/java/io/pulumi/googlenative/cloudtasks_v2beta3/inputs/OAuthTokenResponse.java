// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Contains information needed for generating an [OAuth token](https://developers.google.com/identity/protocols/OAuth2). This type of authorization should generally only be used when calling Google APIs hosted on *.googleapis.com.
 * 
 */
public final class OAuthTokenResponse extends io.pulumi.resources.InvokeArgs {

    public static final OAuthTokenResponse Empty = new OAuthTokenResponse();

    /**
     * OAuth scope to be used for generating OAuth access token. If not specified, "https://www.googleapis.com/auth/cloud-platform" will be used.
     * 
     */
    @InputImport(name="scope", required=true)
      private final String scope;

    public String getScope() {
        return this.scope;
    }

    /**
     * [Service account email](https://cloud.google.com/iam/docs/service-accounts) to be used for generating OAuth token. The service account must be within the same project as the queue. The caller must have iam.serviceAccounts.actAs permission for the service account.
     * 
     */
    @InputImport(name="serviceAccountEmail", required=true)
      private final String serviceAccountEmail;

    public String getServiceAccountEmail() {
        return this.serviceAccountEmail;
    }

    public OAuthTokenResponse(
        String scope,
        String serviceAccountEmail) {
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail, "expected parameter 'serviceAccountEmail' to be non-null");
    }

    private OAuthTokenResponse() {
        this.scope = null;
        this.serviceAccountEmail = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OAuthTokenResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String scope;
        private String serviceAccountEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(OAuthTokenResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scope = defaults.scope;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setServiceAccountEmail(String serviceAccountEmail) {
            this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail);
            return this;
        }
        public OAuthTokenResponse build() {
            return new OAuthTokenResponse(scope, serviceAccountEmail);
        }
    }
}
