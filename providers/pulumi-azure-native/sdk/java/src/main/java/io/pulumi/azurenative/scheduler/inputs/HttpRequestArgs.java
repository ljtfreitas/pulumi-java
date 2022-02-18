// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.azurenative.scheduler.inputs.BasicAuthenticationArgs;
import io.pulumi.azurenative.scheduler.inputs.ClientCertAuthenticationArgs;
import io.pulumi.azurenative.scheduler.inputs.OAuthAuthenticationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HttpRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpRequestArgs Empty = new HttpRequestArgs();

    /**
     * Gets or sets the authentication method of the request.
     * 
     */
    @InputImport(name="authentication")
    private final @Nullable Input<Object> authentication;

    public Input<Object> getAuthentication() {
        return this.authentication == null ? Input.empty() : this.authentication;
    }

    /**
     * Gets or sets the request body.
     * 
     */
    @InputImport(name="body")
    private final @Nullable Input<String> body;

    public Input<String> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * Gets or sets the headers.
     * 
     */
    @InputImport(name="headers")
    private final @Nullable Input<Map<String,String>> headers;

    public Input<Map<String,String>> getHeaders() {
        return this.headers == null ? Input.empty() : this.headers;
    }

    /**
     * Gets or sets the method of the request.
     * 
     */
    @InputImport(name="method")
    private final @Nullable Input<String> method;

    public Input<String> getMethod() {
        return this.method == null ? Input.empty() : this.method;
    }

    /**
     * Gets or sets the URI of the request.
     * 
     */
    @InputImport(name="uri")
    private final @Nullable Input<String> uri;

    public Input<String> getUri() {
        return this.uri == null ? Input.empty() : this.uri;
    }

    public HttpRequestArgs(
        @Nullable Input<Object> authentication,
        @Nullable Input<String> body,
        @Nullable Input<Map<String,String>> headers,
        @Nullable Input<String> method,
        @Nullable Input<String> uri) {
        this.authentication = authentication;
        this.body = body;
        this.headers = headers;
        this.method = method;
        this.uri = uri;
    }

    private HttpRequestArgs() {
        this.authentication = Input.empty();
        this.body = Input.empty();
        this.headers = Input.empty();
        this.method = Input.empty();
        this.uri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> authentication;
        private @Nullable Input<String> body;
        private @Nullable Input<Map<String,String>> headers;
        private @Nullable Input<String> method;
        private @Nullable Input<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.body = defaults.body;
    	      this.headers = defaults.headers;
    	      this.method = defaults.method;
    	      this.uri = defaults.uri;
        }

        public Builder setAuthentication(@Nullable Input<Object> authentication) {
            this.authentication = authentication;
            return this;
        }

        public Builder setAuthentication(@Nullable Object authentication) {
            this.authentication = Input.ofNullable(authentication);
            return this;
        }

        public Builder setBody(@Nullable Input<String> body) {
            this.body = body;
            return this;
        }

        public Builder setBody(@Nullable String body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder setHeaders(@Nullable Input<Map<String,String>> headers) {
            this.headers = headers;
            return this;
        }

        public Builder setHeaders(@Nullable Map<String,String> headers) {
            this.headers = Input.ofNullable(headers);
            return this;
        }

        public Builder setMethod(@Nullable Input<String> method) {
            this.method = method;
            return this;
        }

        public Builder setMethod(@Nullable String method) {
            this.method = Input.ofNullable(method);
            return this;
        }

        public Builder setUri(@Nullable Input<String> uri) {
            this.uri = uri;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = Input.ofNullable(uri);
            return this;
        }

        public HttpRequestArgs build() {
            return new HttpRequestArgs(authentication, body, headers, method, uri);
        }
    }
}
