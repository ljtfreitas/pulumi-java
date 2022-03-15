// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancingv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleActionRedirectArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleActionRedirectArgs Empty = new ListenerRuleActionRedirectArgs();

    /**
     * The hostname. This component is not percent-encoded. The hostname can contain `#{host}`. Defaults to `#{host}`.
     * 
     */
    @Import(name="host")
      private final @Nullable Output<String> host;

    public Output<String> getHost() {
        return this.host == null ? Output.empty() : this.host;
    }

    /**
     * The absolute path, starting with the leading "/". This component is not percent-encoded. The path can contain #{host}, #{path}, and #{port}. Defaults to `/#{path}`.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Output.empty() : this.path;
    }

    /**
     * The port. Specify a value from `1` to `65535` or `#{port}`. Defaults to `#{port}`.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<String> port;

    public Output<String> getPort() {
        return this.port == null ? Output.empty() : this.port;
    }

    /**
     * The protocol. Valid values are `HTTP`, `HTTPS`, or `#{protocol}`. Defaults to `#{protocol}`.
     * 
     */
    @Import(name="protocol")
      private final @Nullable Output<String> protocol;

    public Output<String> getProtocol() {
        return this.protocol == null ? Output.empty() : this.protocol;
    }

    /**
     * The query parameters, URL-encoded when necessary, but not percent-encoded. Do not include the leading "?". Defaults to `#{query}`.
     * 
     */
    @Import(name="query")
      private final @Nullable Output<String> query;

    public Output<String> getQuery() {
        return this.query == null ? Output.empty() : this.query;
    }

    /**
     * The HTTP redirect code. The redirect is either permanent (`HTTP_301`) or temporary (`HTTP_302`).
     * 
     */
    @Import(name="statusCode", required=true)
      private final Output<String> statusCode;

    public Output<String> getStatusCode() {
        return this.statusCode;
    }

    public ListenerRuleActionRedirectArgs(
        @Nullable Output<String> host,
        @Nullable Output<String> path,
        @Nullable Output<String> port,
        @Nullable Output<String> protocol,
        @Nullable Output<String> query,
        Output<String> statusCode) {
        this.host = host;
        this.path = path;
        this.port = port;
        this.protocol = protocol;
        this.query = query;
        this.statusCode = Objects.requireNonNull(statusCode, "expected parameter 'statusCode' to be non-null");
    }

    private ListenerRuleActionRedirectArgs() {
        this.host = Output.empty();
        this.path = Output.empty();
        this.port = Output.empty();
        this.protocol = Output.empty();
        this.query = Output.empty();
        this.statusCode = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleActionRedirectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> host;
        private @Nullable Output<String> path;
        private @Nullable Output<String> port;
        private @Nullable Output<String> protocol;
        private @Nullable Output<String> query;
        private Output<String> statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleActionRedirectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.query = defaults.query;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder host(@Nullable Output<String> host) {
            this.host = host;
            return this;
        }

        public Builder host(@Nullable String host) {
            this.host = Output.ofNullable(host);
            return this;
        }

        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = Output.ofNullable(path);
            return this;
        }

        public Builder port(@Nullable Output<String> port) {
            this.port = port;
            return this;
        }

        public Builder port(@Nullable String port) {
            this.port = Output.ofNullable(port);
            return this;
        }

        public Builder protocol(@Nullable Output<String> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder protocol(@Nullable String protocol) {
            this.protocol = Output.ofNullable(protocol);
            return this;
        }

        public Builder query(@Nullable Output<String> query) {
            this.query = query;
            return this;
        }

        public Builder query(@Nullable String query) {
            this.query = Output.ofNullable(query);
            return this;
        }

        public Builder statusCode(Output<String> statusCode) {
            this.statusCode = Objects.requireNonNull(statusCode);
            return this;
        }

        public Builder statusCode(String statusCode) {
            this.statusCode = Output.of(Objects.requireNonNull(statusCode));
            return this;
        }
        public ListenerRuleActionRedirectArgs build() {
            return new ListenerRuleActionRedirectArgs(host, path, port, protocol, query, statusCode);
        }
    }
}
