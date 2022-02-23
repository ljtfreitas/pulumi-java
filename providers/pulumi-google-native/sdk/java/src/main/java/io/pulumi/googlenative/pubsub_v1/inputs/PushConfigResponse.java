// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.pubsub_v1.inputs.OidcTokenResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Configuration for a push delivery endpoint.
 * 
 */
public final class PushConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final PushConfigResponse Empty = new PushConfigResponse();

    /**
     * Endpoint configuration attributes that can be used to control different aspects of the message delivery. The only currently supported attribute is `x-goog-version`, which you can use to change the format of the pushed message. This attribute indicates the version of the data expected by the endpoint. This controls the shape of the pushed message (i.e., its fields and metadata). If not present during the `CreateSubscription` call, it will default to the version of the Pub/Sub API used to make such call. If not present in a `ModifyPushConfig` call, its value will not be changed. `GetSubscription` calls will always return a valid version, even if the subscription was created without this attribute. The only supported values for the `x-goog-version` attribute are: * `v1beta1`: uses the push format defined in the v1beta1 Pub/Sub API. * `v1` or `v1beta2`: uses the push format defined in the v1 Pub/Sub API. For example: attributes { "x-goog-version": "v1" }
     * 
     */
    @InputImport(name="attributes", required=true)
      private final Map<String,String> attributes;

    public Map<String,String> getAttributes() {
        return this.attributes;
    }

    /**
     * If specified, Pub/Sub will generate and attach an OIDC JWT token as an `Authorization` header in the HTTP request for every pushed message.
     * 
     */
    @InputImport(name="oidcToken", required=true)
      private final OidcTokenResponse oidcToken;

    public OidcTokenResponse getOidcToken() {
        return this.oidcToken;
    }

    /**
     * A URL locating the endpoint to which messages should be pushed. For example, a Webhook endpoint might use `https://example.com/push`.
     * 
     */
    @InputImport(name="pushEndpoint", required=true)
      private final String pushEndpoint;

    public String getPushEndpoint() {
        return this.pushEndpoint;
    }

    public PushConfigResponse(
        Map<String,String> attributes,
        OidcTokenResponse oidcToken,
        String pushEndpoint) {
        this.attributes = Objects.requireNonNull(attributes, "expected parameter 'attributes' to be non-null");
        this.oidcToken = Objects.requireNonNull(oidcToken, "expected parameter 'oidcToken' to be non-null");
        this.pushEndpoint = Objects.requireNonNull(pushEndpoint, "expected parameter 'pushEndpoint' to be non-null");
    }

    private PushConfigResponse() {
        this.attributes = Map.of();
        this.oidcToken = null;
        this.pushEndpoint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PushConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> attributes;
        private OidcTokenResponse oidcToken;
        private String pushEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(PushConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.oidcToken = defaults.oidcToken;
    	      this.pushEndpoint = defaults.pushEndpoint;
        }

        public Builder setAttributes(Map<String,String> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }

        public Builder setOidcToken(OidcTokenResponse oidcToken) {
            this.oidcToken = Objects.requireNonNull(oidcToken);
            return this;
        }

        public Builder setPushEndpoint(String pushEndpoint) {
            this.pushEndpoint = Objects.requireNonNull(pushEndpoint);
            return this;
        }
        public PushConfigResponse build() {
            return new PushConfigResponse(attributes, oidcToken, pushEndpoint);
        }
    }
}
