// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListenerRedirectConfig {
    private final @Nullable String host;
    private final @Nullable String path;
    private final @Nullable String port;
    private final @Nullable String protocol;
    private final @Nullable String query;
    private final String statusCode;

    @OutputCustomType.Constructor
    private ListenerRedirectConfig(
        @OutputCustomType.Parameter("host") @Nullable String host,
        @OutputCustomType.Parameter("path") @Nullable String path,
        @OutputCustomType.Parameter("port") @Nullable String port,
        @OutputCustomType.Parameter("protocol") @Nullable String protocol,
        @OutputCustomType.Parameter("query") @Nullable String query,
        @OutputCustomType.Parameter("statusCode") String statusCode) {
        this.host = host;
        this.path = path;
        this.port = port;
        this.protocol = protocol;
        this.query = query;
        this.statusCode = statusCode;
    }

    public Optional<String> getHost() {
        return Optional.ofNullable(this.host);
    }
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    public Optional<String> getPort() {
        return Optional.ofNullable(this.port);
    }
    public Optional<String> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }
    public Optional<String> getQuery() {
        return Optional.ofNullable(this.query);
    }
    public String getStatusCode() {
        return this.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRedirectConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String host;
        private @Nullable String path;
        private @Nullable String port;
        private @Nullable String protocol;
        private @Nullable String query;
        private String statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRedirectConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.query = defaults.query;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder setHost(@Nullable String host) {
            this.host = host;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setPort(@Nullable String port) {
            this.port = port;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setQuery(@Nullable String query) {
            this.query = query;
            return this;
        }

        public Builder setStatusCode(String statusCode) {
            this.statusCode = Objects.requireNonNull(statusCode);
            return this;
        }
        public ListenerRedirectConfig build() {
            return new ListenerRedirectConfig(host, path, port, protocol, query, statusCode);
        }
    }
}
