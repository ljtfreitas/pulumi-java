// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.azurenative.containerinstance.inputs.HttpHeadersResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The container Http Get settings, for liveness or readiness probe
 * 
 */
public final class ContainerHttpGetResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContainerHttpGetResponse Empty = new ContainerHttpGetResponse();

    /**
     * The HTTP headers.
     * 
     */
    @Import(name="httpHeaders")
      private final @Nullable HttpHeadersResponse httpHeaders;

    public Optional<HttpHeadersResponse> getHttpHeaders() {
        return this.httpHeaders == null ? Optional.empty() : Optional.ofNullable(this.httpHeaders);
    }

    /**
     * The path to probe.
     * 
     */
    @Import(name="path")
      private final @Nullable String path;

    public Optional<String> getPath() {
        return this.path == null ? Optional.empty() : Optional.ofNullable(this.path);
    }

    /**
     * The port number to probe.
     * 
     */
    @Import(name="port", required=true)
      private final Integer port;

    public Integer getPort() {
        return this.port;
    }

    /**
     * The scheme.
     * 
     */
    @Import(name="scheme")
      private final @Nullable String scheme;

    public Optional<String> getScheme() {
        return this.scheme == null ? Optional.empty() : Optional.ofNullable(this.scheme);
    }

    public ContainerHttpGetResponse(
        @Nullable HttpHeadersResponse httpHeaders,
        @Nullable String path,
        Integer port,
        @Nullable String scheme) {
        this.httpHeaders = httpHeaders;
        this.path = path;
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.scheme = scheme;
    }

    private ContainerHttpGetResponse() {
        this.httpHeaders = null;
        this.path = null;
        this.port = null;
        this.scheme = null;
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

        public Builder httpHeaders(@Nullable HttpHeadersResponse httpHeaders) {
            this.httpHeaders = httpHeaders;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder scheme(@Nullable String scheme) {
            this.scheme = scheme;
            return this;
        }
        public ContainerHttpGetResponse build() {
            return new ContainerHttpGetResponse(httpHeaders, path, port, scheme);
        }
    }
}
