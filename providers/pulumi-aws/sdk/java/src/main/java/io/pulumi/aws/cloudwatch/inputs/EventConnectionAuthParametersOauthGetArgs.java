// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthClientParametersGetArgs;
import io.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventConnectionAuthParametersOauthGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventConnectionAuthParametersOauthGetArgs Empty = new EventConnectionAuthParametersOauthGetArgs();

    /**
     * The URL to the authorization endpoint.
     * 
     */
    @Import(name="authorizationEndpoint", required=true)
      private final Output<String> authorizationEndpoint;

    public Output<String> getAuthorizationEndpoint() {
        return this.authorizationEndpoint;
    }

    /**
     * Contains the client parameters for OAuth authorization. Contains the following two parameters.
     * 
     */
    @Import(name="clientParameters")
      private final @Nullable Output<EventConnectionAuthParametersOauthClientParametersGetArgs> clientParameters;

    public Output<EventConnectionAuthParametersOauthClientParametersGetArgs> getClientParameters() {
        return this.clientParameters == null ? Output.empty() : this.clientParameters;
    }

    /**
     * A password for the authorization. Created and stored in AWS Secrets Manager.
     * 
     */
    @Import(name="httpMethod", required=true)
      private final Output<String> httpMethod;

    public Output<String> getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * OAuth Http Parameters are additional credentials used to sign the request to the authorization endpoint to exchange the OAuth Client information for an access token. Secret values are stored and managed by AWS Secrets Manager. A maximum of 1 are allowed. Documented below.
     * 
     */
    @Import(name="oauthHttpParameters", required=true)
      private final Output<EventConnectionAuthParametersOauthOauthHttpParametersGetArgs> oauthHttpParameters;

    public Output<EventConnectionAuthParametersOauthOauthHttpParametersGetArgs> getOauthHttpParameters() {
        return this.oauthHttpParameters;
    }

    public EventConnectionAuthParametersOauthGetArgs(
        Output<String> authorizationEndpoint,
        @Nullable Output<EventConnectionAuthParametersOauthClientParametersGetArgs> clientParameters,
        Output<String> httpMethod,
        Output<EventConnectionAuthParametersOauthOauthHttpParametersGetArgs> oauthHttpParameters) {
        this.authorizationEndpoint = Objects.requireNonNull(authorizationEndpoint, "expected parameter 'authorizationEndpoint' to be non-null");
        this.clientParameters = clientParameters;
        this.httpMethod = Objects.requireNonNull(httpMethod, "expected parameter 'httpMethod' to be non-null");
        this.oauthHttpParameters = Objects.requireNonNull(oauthHttpParameters, "expected parameter 'oauthHttpParameters' to be non-null");
    }

    private EventConnectionAuthParametersOauthGetArgs() {
        this.authorizationEndpoint = Output.empty();
        this.clientParameters = Output.empty();
        this.httpMethod = Output.empty();
        this.oauthHttpParameters = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventConnectionAuthParametersOauthGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> authorizationEndpoint;
        private @Nullable Output<EventConnectionAuthParametersOauthClientParametersGetArgs> clientParameters;
        private Output<String> httpMethod;
        private Output<EventConnectionAuthParametersOauthOauthHttpParametersGetArgs> oauthHttpParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(EventConnectionAuthParametersOauthGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationEndpoint = defaults.authorizationEndpoint;
    	      this.clientParameters = defaults.clientParameters;
    	      this.httpMethod = defaults.httpMethod;
    	      this.oauthHttpParameters = defaults.oauthHttpParameters;
        }

        public Builder authorizationEndpoint(Output<String> authorizationEndpoint) {
            this.authorizationEndpoint = Objects.requireNonNull(authorizationEndpoint);
            return this;
        }

        public Builder authorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = Output.of(Objects.requireNonNull(authorizationEndpoint));
            return this;
        }

        public Builder clientParameters(@Nullable Output<EventConnectionAuthParametersOauthClientParametersGetArgs> clientParameters) {
            this.clientParameters = clientParameters;
            return this;
        }

        public Builder clientParameters(@Nullable EventConnectionAuthParametersOauthClientParametersGetArgs clientParameters) {
            this.clientParameters = Output.ofNullable(clientParameters);
            return this;
        }

        public Builder httpMethod(Output<String> httpMethod) {
            this.httpMethod = Objects.requireNonNull(httpMethod);
            return this;
        }

        public Builder httpMethod(String httpMethod) {
            this.httpMethod = Output.of(Objects.requireNonNull(httpMethod));
            return this;
        }

        public Builder oauthHttpParameters(Output<EventConnectionAuthParametersOauthOauthHttpParametersGetArgs> oauthHttpParameters) {
            this.oauthHttpParameters = Objects.requireNonNull(oauthHttpParameters);
            return this;
        }

        public Builder oauthHttpParameters(EventConnectionAuthParametersOauthOauthHttpParametersGetArgs oauthHttpParameters) {
            this.oauthHttpParameters = Output.of(Objects.requireNonNull(oauthHttpParameters));
            return this;
        }
        public EventConnectionAuthParametersOauthGetArgs build() {
            return new EventConnectionAuthParametersOauthGetArgs(authorizationEndpoint, clientParameters, httpMethod, oauthHttpParameters);
        }
    }
}
