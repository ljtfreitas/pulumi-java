// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthClientParametersArgs;
import io.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventConnectionAuthParametersOauthArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventConnectionAuthParametersOauthArgs Empty = new EventConnectionAuthParametersOauthArgs();

    /**
     * The URL to the authorization endpoint.
     * 
     */
    @InputImport(name="authorizationEndpoint", required=true)
    private final Input<String> authorizationEndpoint;

    public Input<String> getAuthorizationEndpoint() {
        return this.authorizationEndpoint;
    }

    /**
     * Contains the client parameters for OAuth authorization. Contains the following two parameters.
     * 
     */
    @InputImport(name="clientParameters")
    private final @Nullable Input<EventConnectionAuthParametersOauthClientParametersArgs> clientParameters;

    public Input<EventConnectionAuthParametersOauthClientParametersArgs> getClientParameters() {
        return this.clientParameters == null ? Input.empty() : this.clientParameters;
    }

    /**
     * A password for the authorization. Created and stored in AWS Secrets Manager.
     * 
     */
    @InputImport(name="httpMethod", required=true)
    private final Input<String> httpMethod;

    public Input<String> getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * OAuth Http Parameters are additional credentials used to sign the request to the authorization endpoint to exchange the OAuth Client information for an access token. Secret values are stored and managed by AWS Secrets Manager. A maximum of 1 are allowed. Documented below.
     * 
     */
    @InputImport(name="oauthHttpParameters", required=true)
    private final Input<EventConnectionAuthParametersOauthOauthHttpParametersArgs> oauthHttpParameters;

    public Input<EventConnectionAuthParametersOauthOauthHttpParametersArgs> getOauthHttpParameters() {
        return this.oauthHttpParameters;
    }

    public EventConnectionAuthParametersOauthArgs(
        Input<String> authorizationEndpoint,
        @Nullable Input<EventConnectionAuthParametersOauthClientParametersArgs> clientParameters,
        Input<String> httpMethod,
        Input<EventConnectionAuthParametersOauthOauthHttpParametersArgs> oauthHttpParameters) {
        this.authorizationEndpoint = Objects.requireNonNull(authorizationEndpoint, "expected parameter 'authorizationEndpoint' to be non-null");
        this.clientParameters = clientParameters;
        this.httpMethod = Objects.requireNonNull(httpMethod, "expected parameter 'httpMethod' to be non-null");
        this.oauthHttpParameters = Objects.requireNonNull(oauthHttpParameters, "expected parameter 'oauthHttpParameters' to be non-null");
    }

    private EventConnectionAuthParametersOauthArgs() {
        this.authorizationEndpoint = Input.empty();
        this.clientParameters = Input.empty();
        this.httpMethod = Input.empty();
        this.oauthHttpParameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventConnectionAuthParametersOauthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> authorizationEndpoint;
        private @Nullable Input<EventConnectionAuthParametersOauthClientParametersArgs> clientParameters;
        private Input<String> httpMethod;
        private Input<EventConnectionAuthParametersOauthOauthHttpParametersArgs> oauthHttpParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(EventConnectionAuthParametersOauthArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationEndpoint = defaults.authorizationEndpoint;
    	      this.clientParameters = defaults.clientParameters;
    	      this.httpMethod = defaults.httpMethod;
    	      this.oauthHttpParameters = defaults.oauthHttpParameters;
        }

        public Builder setAuthorizationEndpoint(Input<String> authorizationEndpoint) {
            this.authorizationEndpoint = Objects.requireNonNull(authorizationEndpoint);
            return this;
        }

        public Builder setAuthorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = Input.of(Objects.requireNonNull(authorizationEndpoint));
            return this;
        }

        public Builder setClientParameters(@Nullable Input<EventConnectionAuthParametersOauthClientParametersArgs> clientParameters) {
            this.clientParameters = clientParameters;
            return this;
        }

        public Builder setClientParameters(@Nullable EventConnectionAuthParametersOauthClientParametersArgs clientParameters) {
            this.clientParameters = Input.ofNullable(clientParameters);
            return this;
        }

        public Builder setHttpMethod(Input<String> httpMethod) {
            this.httpMethod = Objects.requireNonNull(httpMethod);
            return this;
        }

        public Builder setHttpMethod(String httpMethod) {
            this.httpMethod = Input.of(Objects.requireNonNull(httpMethod));
            return this;
        }

        public Builder setOauthHttpParameters(Input<EventConnectionAuthParametersOauthOauthHttpParametersArgs> oauthHttpParameters) {
            this.oauthHttpParameters = Objects.requireNonNull(oauthHttpParameters);
            return this;
        }

        public Builder setOauthHttpParameters(EventConnectionAuthParametersOauthOauthHttpParametersArgs oauthHttpParameters) {
            this.oauthHttpParameters = Input.of(Objects.requireNonNull(oauthHttpParameters));
            return this;
        }
        public EventConnectionAuthParametersOauthArgs build() {
            return new EventConnectionAuthParametersOauthArgs(authorizationEndpoint, clientParameters, httpMethod, oauthHttpParameters);
        }
    }
}