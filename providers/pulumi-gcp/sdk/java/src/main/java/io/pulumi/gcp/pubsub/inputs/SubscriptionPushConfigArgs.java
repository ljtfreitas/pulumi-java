// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.pubsub.inputs.SubscriptionPushConfigOidcTokenArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubscriptionPushConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubscriptionPushConfigArgs Empty = new SubscriptionPushConfigArgs();

    /**
     * Endpoint configuration attributes.
     * Every endpoint has a set of API supported attributes that can
     * be used to control different aspects of the message delivery.
     * The currently supported attribute is x-goog-version, which you
     * can use to change the format of the pushed message. This
     * attribute indicates the version of the data expected by
     * the endpoint. This controls the shape of the pushed message
     * (i.e., its fields and metadata). The endpoint version is
     * based on the version of the Pub/Sub API.
     * If not present during the subscriptions.create call,
     * it will default to the version of the API used to make
     * such call. If not present during a subscriptions.modifyPushConfig
     * call, its value will not be changed. subscriptions.get
     * calls will always return a valid version, even if the
     * subscription was created without this attribute.
     * The possible values for this attribute are:
     * - v1beta1: uses the push format defined in the v1beta1 Pub/Sub API.
     * - v1 or v1beta2: uses the push format defined in the v1 Pub/Sub API.
     * 
     */
    @Import(name="attributes")
      private final @Nullable Output<Map<String,String>> attributes;

    public Output<Map<String,String>> attributes() {
        return this.attributes == null ? Codegen.empty() : this.attributes;
    }

    /**
     * If specified, Pub/Sub will generate and attach an OIDC JWT token as
     * an Authorization header in the HTTP request for every pushed message.
     * Structure is documented below.
     * 
     */
    @Import(name="oidcToken")
      private final @Nullable Output<SubscriptionPushConfigOidcTokenArgs> oidcToken;

    public Output<SubscriptionPushConfigOidcTokenArgs> oidcToken() {
        return this.oidcToken == null ? Codegen.empty() : this.oidcToken;
    }

    /**
     * A URL locating the endpoint to which messages should be pushed.
     * For example, a Webhook endpoint might use
     * "https://example.com/push".
     * 
     */
    @Import(name="pushEndpoint", required=true)
      private final Output<String> pushEndpoint;

    public Output<String> pushEndpoint() {
        return this.pushEndpoint;
    }

    public SubscriptionPushConfigArgs(
        @Nullable Output<Map<String,String>> attributes,
        @Nullable Output<SubscriptionPushConfigOidcTokenArgs> oidcToken,
        Output<String> pushEndpoint) {
        this.attributes = attributes;
        this.oidcToken = oidcToken;
        this.pushEndpoint = Objects.requireNonNull(pushEndpoint, "expected parameter 'pushEndpoint' to be non-null");
    }

    private SubscriptionPushConfigArgs() {
        this.attributes = Codegen.empty();
        this.oidcToken = Codegen.empty();
        this.pushEndpoint = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionPushConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> attributes;
        private @Nullable Output<SubscriptionPushConfigOidcTokenArgs> oidcToken;
        private Output<String> pushEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionPushConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.oidcToken = defaults.oidcToken;
    	      this.pushEndpoint = defaults.pushEndpoint;
        }

        public Builder attributes(@Nullable Output<Map<String,String>> attributes) {
            this.attributes = attributes;
            return this;
        }
        public Builder attributes(@Nullable Map<String,String> attributes) {
            this.attributes = Codegen.ofNullable(attributes);
            return this;
        }
        public Builder oidcToken(@Nullable Output<SubscriptionPushConfigOidcTokenArgs> oidcToken) {
            this.oidcToken = oidcToken;
            return this;
        }
        public Builder oidcToken(@Nullable SubscriptionPushConfigOidcTokenArgs oidcToken) {
            this.oidcToken = Codegen.ofNullable(oidcToken);
            return this;
        }
        public Builder pushEndpoint(Output<String> pushEndpoint) {
            this.pushEndpoint = Objects.requireNonNull(pushEndpoint);
            return this;
        }
        public Builder pushEndpoint(String pushEndpoint) {
            this.pushEndpoint = Output.of(Objects.requireNonNull(pushEndpoint));
            return this;
        }        public SubscriptionPushConfigArgs build() {
            return new SubscriptionPushConfigArgs(attributes, oidcToken, pushEndpoint);
        }
    }
}
