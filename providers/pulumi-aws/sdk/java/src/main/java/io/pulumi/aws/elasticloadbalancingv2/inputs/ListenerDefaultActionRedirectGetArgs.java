// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancingv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerDefaultActionRedirectGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerDefaultActionRedirectGetArgs Empty = new ListenerDefaultActionRedirectGetArgs();

    /**
     * Hostname. This component is not percent-encoded. The hostname can contain `#{host}`. Defaults to `#{host}`.
     * 
     */
    @InputImport(name="host")
    private final @Nullable Input<String> host;

    public Input<String> getHost() {
        return this.host == null ? Input.empty() : this.host;
    }

    /**
     * Absolute path, starting with the leading "/". This component is not percent-encoded. The path can contain #{host}, #{path}, and #{port}. Defaults to `/#{path}`.
     * 
     */
    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * Port. Specify a value from `1` to `65535` or `#{port}`. Defaults to `#{port}`.
     * 
     */
    @InputImport(name="port")
    private final @Nullable Input<String> port;

    public Input<String> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * Protocol. Valid values are `HTTP`, `HTTPS`, or `#{protocol}`. Defaults to `#{protocol}`.
     * 
     */
    @InputImport(name="protocol")
    private final @Nullable Input<String> protocol;

    public Input<String> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    /**
     * Query parameters, URL-encoded when necessary, but not percent-encoded. Do not include the leading "?". Defaults to `#{query}`.
     * 
     */
    @InputImport(name="query")
    private final @Nullable Input<String> query;

    public Input<String> getQuery() {
        return this.query == null ? Input.empty() : this.query;
    }

    /**
     * HTTP redirect code. The redirect is either permanent (`HTTP_301`) or temporary (`HTTP_302`).
     * 
     */
    @InputImport(name="statusCode", required=true)
    private final Input<String> statusCode;

    public Input<String> getStatusCode() {
        return this.statusCode;
    }

    public ListenerDefaultActionRedirectGetArgs(
        @Nullable Input<String> host,
        @Nullable Input<String> path,
        @Nullable Input<String> port,
        @Nullable Input<String> protocol,
        @Nullable Input<String> query,
        Input<String> statusCode) {
        this.host = host;
        this.path = path;
        this.port = port;
        this.protocol = protocol;
        this.query = query;
        this.statusCode = Objects.requireNonNull(statusCode, "expected parameter 'statusCode' to be non-null");
    }

    private ListenerDefaultActionRedirectGetArgs() {
        this.host = Input.empty();
        this.path = Input.empty();
        this.port = Input.empty();
        this.protocol = Input.empty();
        this.query = Input.empty();
        this.statusCode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerDefaultActionRedirectGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> host;
        private @Nullable Input<String> path;
        private @Nullable Input<String> port;
        private @Nullable Input<String> protocol;
        private @Nullable Input<String> query;
        private Input<String> statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerDefaultActionRedirectGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.query = defaults.query;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder setHost(@Nullable Input<String> host) {
            this.host = host;
            return this;
        }

        public Builder setHost(@Nullable String host) {
            this.host = Input.ofNullable(host);
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setPort(@Nullable Input<String> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable String port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setProtocol(@Nullable Input<String> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }

        public Builder setQuery(@Nullable Input<String> query) {
            this.query = query;
            return this;
        }

        public Builder setQuery(@Nullable String query) {
            this.query = Input.ofNullable(query);
            return this;
        }

        public Builder setStatusCode(Input<String> statusCode) {
            this.statusCode = Objects.requireNonNull(statusCode);
            return this;
        }

        public Builder setStatusCode(String statusCode) {
            this.statusCode = Input.of(Objects.requireNonNull(statusCode));
            return this;
        }
        public ListenerDefaultActionRedirectGetArgs build() {
            return new ListenerDefaultActionRedirectGetArgs(host, path, port, protocol, query, statusCode);
        }
    }
}
