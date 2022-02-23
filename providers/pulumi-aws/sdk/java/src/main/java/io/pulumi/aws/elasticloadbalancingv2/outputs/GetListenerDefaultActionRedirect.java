// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancingv2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetListenerDefaultActionRedirect {
    private final String host;
    private final String path;
    /**
     * Port of the listener. Required if `arn` is not set.
     * 
     */
    private final String port;
    private final String protocol;
    private final String query;
    private final String statusCode;

    @OutputCustomType.Constructor({"host","path","port","protocol","query","statusCode"})
    private GetListenerDefaultActionRedirect(
        String host,
        String path,
        String port,
        String protocol,
        String query,
        String statusCode) {
        this.host = Objects.requireNonNull(host);
        this.path = Objects.requireNonNull(path);
        this.port = Objects.requireNonNull(port);
        this.protocol = Objects.requireNonNull(protocol);
        this.query = Objects.requireNonNull(query);
        this.statusCode = Objects.requireNonNull(statusCode);
    }

    public String getHost() {
        return this.host;
    }
    public String getPath() {
        return this.path;
    }
    /**
     * Port of the listener. Required if `arn` is not set.
     * 
     */
    public String getPort() {
        return this.port;
    }
    public String getProtocol() {
        return this.protocol;
    }
    public String getQuery() {
        return this.query;
    }
    public String getStatusCode() {
        return this.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenerDefaultActionRedirect defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String host;
        private String path;
        private String port;
        private String protocol;
        private String query;
        private String statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListenerDefaultActionRedirect defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.query = defaults.query;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder setHost(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setPort(String port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setQuery(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }

        public Builder setStatusCode(String statusCode) {
            this.statusCode = Objects.requireNonNull(statusCode);
            return this;
        }
        public GetListenerDefaultActionRedirect build() {
            return new GetListenerDefaultActionRedirect(host, path, port, protocol, query, statusCode);
        }
    }
}
