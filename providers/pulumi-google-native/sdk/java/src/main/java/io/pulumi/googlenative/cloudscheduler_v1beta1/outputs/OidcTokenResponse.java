// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudscheduler_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class OidcTokenResponse {
    /**
     * Audience to be used when generating OIDC token. If not specified, the URI specified in target will be used.
     * 
     */
    private final String audience;
    /**
     * [Service account email](https://cloud.google.com/iam/docs/service-accounts) to be used for generating OIDC token. The service account must be within the same project as the job. The caller must have iam.serviceAccounts.actAs permission for the service account.
     * 
     */
    private final String serviceAccountEmail;

    @OutputCustomType.Constructor({"audience","serviceAccountEmail"})
    private OidcTokenResponse(
        String audience,
        String serviceAccountEmail) {
        this.audience = Objects.requireNonNull(audience);
        this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail);
    }

    /**
     * Audience to be used when generating OIDC token. If not specified, the URI specified in target will be used.
     * 
     */
    public String getAudience() {
        return this.audience;
    }
    /**
     * [Service account email](https://cloud.google.com/iam/docs/service-accounts) to be used for generating OIDC token. The service account must be within the same project as the job. The caller must have iam.serviceAccounts.actAs permission for the service account.
     * 
     */
    public String getServiceAccountEmail() {
        return this.serviceAccountEmail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OidcTokenResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String audience;
        private String serviceAccountEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(OidcTokenResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
        }

        public Builder setAudience(String audience) {
            this.audience = Objects.requireNonNull(audience);
            return this;
        }

        public Builder setServiceAccountEmail(String serviceAccountEmail) {
            this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail);
            return this;
        }
        public OidcTokenResponse build() {
            return new OidcTokenResponse(audience, serviceAccountEmail);
        }
    }
}
