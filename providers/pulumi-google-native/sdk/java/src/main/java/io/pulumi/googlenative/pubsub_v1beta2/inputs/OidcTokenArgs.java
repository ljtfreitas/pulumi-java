// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains information needed for generating an [OpenID Connect token](https://developers.google.com/identity/protocols/OpenIDConnect).
 * 
 */
public final class OidcTokenArgs extends io.pulumi.resources.ResourceArgs {

    public static final OidcTokenArgs Empty = new OidcTokenArgs();

    /**
     * Audience to be used when generating OIDC token. The audience claim identifies the recipients that the JWT is intended for. The audience value is a single case-sensitive string. Having multiple values (array) for the audience field is not supported. More info about the OIDC JWT token audience here: https://tools.ietf.org/html/rfc7519#section-4.1.3 Note: if not specified, the Push endpoint URL will be used.
     * 
     */
    @Import(name="audience")
      private final @Nullable Output<String> audience;

    public Output<String> getAudience() {
        return this.audience == null ? Output.empty() : this.audience;
    }

    /**
     * [Service account email](https://cloud.google.com/iam/docs/service-accounts) to be used for generating the OIDC token. The caller (for CreateSubscription, UpdateSubscription, and ModifyPushConfig RPCs) must have the iam.serviceAccounts.actAs permission for the service account.
     * 
     */
    @Import(name="serviceAccountEmail")
      private final @Nullable Output<String> serviceAccountEmail;

    public Output<String> getServiceAccountEmail() {
        return this.serviceAccountEmail == null ? Output.empty() : this.serviceAccountEmail;
    }

    public OidcTokenArgs(
        @Nullable Output<String> audience,
        @Nullable Output<String> serviceAccountEmail) {
        this.audience = audience;
        this.serviceAccountEmail = serviceAccountEmail;
    }

    private OidcTokenArgs() {
        this.audience = Output.empty();
        this.serviceAccountEmail = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OidcTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> audience;
        private @Nullable Output<String> serviceAccountEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(OidcTokenArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
        }

        public Builder audience(@Nullable Output<String> audience) {
            this.audience = audience;
            return this;
        }

        public Builder audience(@Nullable String audience) {
            this.audience = Output.ofNullable(audience);
            return this;
        }

        public Builder serviceAccountEmail(@Nullable Output<String> serviceAccountEmail) {
            this.serviceAccountEmail = serviceAccountEmail;
            return this;
        }

        public Builder serviceAccountEmail(@Nullable String serviceAccountEmail) {
            this.serviceAccountEmail = Output.ofNullable(serviceAccountEmail);
            return this;
        }
        public OidcTokenArgs build() {
            return new OidcTokenArgs(audience, serviceAccountEmail);
        }
    }
}
