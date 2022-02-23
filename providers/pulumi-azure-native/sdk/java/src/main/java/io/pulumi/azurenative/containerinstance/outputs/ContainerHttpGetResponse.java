// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.outputs;

import io.pulumi.azurenative.containerinstance.outputs.HttpHeadersResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContainerHttpGetResponse {
    /**
     * The HTTP headers.
     * 
     */
    private final @Nullable HttpHeadersResponse httpHeaders;
    /**
     * The path to probe.
     * 
     */
    private final @Nullable String path;
    /**
     * The port number to probe.
     * 
     */
    private final Integer port;
    /**
     * The scheme.
     * 
     */
    private final @Nullable String scheme;

    @OutputCustomType.Constructor({"httpHeaders","path","port","scheme"})
    private ContainerHttpGetResponse(
        @Nullable HttpHeadersResponse httpHeaders,
        @Nullable String path,
        Integer port,
        @Nullable String scheme) {
        this.httpHeaders = httpHeaders;
        this.path = path;
        this.port = Objects.requireNonNull(port);
        this.scheme = scheme;
    }

    /**
     * The HTTP headers.
     * 
     */
    public Optional<HttpHeadersResponse> getHttpHeaders() {
        return Optional.ofNullable(this.httpHeaders);
    }
    /**
     * The path to probe.
     * 
     */
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    /**
     * The port number to probe.
     * 
     */
    public Integer getPort() {
        return this.port;
    }
    /**
     * The scheme.
     * 
     */
    public Optional<String> getScheme() {
        return Optional.ofNullable(this.scheme);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerHttpGetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable HttpHeadersResponse httpHeaders;
        private @Nullable String path;
        private Integer port;
        private @Nullable String scheme;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerHttpGetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpHeaders = defaults.httpHeaders;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.scheme = defaults.scheme;
        }

        public Builder setHttpHeaders(@Nullable HttpHeadersResponse httpHeaders) {
            this.httpHeaders = httpHeaders;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setScheme(@Nullable String scheme) {
            this.scheme = scheme;
            return this;
        }
        public ContainerHttpGetResponse build() {
            return new ContainerHttpGetResponse(httpHeaders, path, port, scheme);
        }
    }
}
