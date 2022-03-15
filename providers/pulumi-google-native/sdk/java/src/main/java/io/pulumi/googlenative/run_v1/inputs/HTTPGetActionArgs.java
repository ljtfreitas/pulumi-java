// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.run_v1.inputs.HTTPHeaderArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Not supported by Cloud Run HTTPGetAction describes an action based on HTTP Get requests.
 * 
 */
public final class HTTPGetActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final HTTPGetActionArgs Empty = new HTTPGetActionArgs();

    /**
     * (Optional) Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders instead.
     * 
     */
    @Import(name="host")
      private final @Nullable Output<String> host;

    public Output<String> getHost() {
        return this.host == null ? Output.empty() : this.host;
    }

    /**
     * (Optional) Custom headers to set in the request. HTTP allows repeated headers.
     * 
     */
    @Import(name="httpHeaders")
      private final @Nullable Output<List<HTTPHeaderArgs>> httpHeaders;

    public Output<List<HTTPHeaderArgs>> getHttpHeaders() {
        return this.httpHeaders == null ? Output.empty() : this.httpHeaders;
    }

    /**
     * (Optional) Path to access on the HTTP server.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Output.empty() : this.path;
    }

    /**
     * (Optional) Scheme to use for connecting to the host. Defaults to HTTP.
     * 
     */
    @Import(name="scheme")
      private final @Nullable Output<String> scheme;

    public Output<String> getScheme() {
        return this.scheme == null ? Output.empty() : this.scheme;
    }

    public HTTPGetActionArgs(
        @Nullable Output<String> host,
        @Nullable Output<List<HTTPHeaderArgs>> httpHeaders,
        @Nullable Output<String> path,
        @Nullable Output<String> scheme) {
        this.host = host;
        this.httpHeaders = httpHeaders;
        this.path = path;
        this.scheme = scheme;
    }

    private HTTPGetActionArgs() {
        this.host = Output.empty();
        this.httpHeaders = Output.empty();
        this.path = Output.empty();
        this.scheme = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HTTPGetActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> host;
        private @Nullable Output<List<HTTPHeaderArgs>> httpHeaders;
        private @Nullable Output<String> path;
        private @Nullable Output<String> scheme;

        public Builder() {
    	      // Empty
        }

        public Builder(HTTPGetActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.httpHeaders = defaults.httpHeaders;
    	      this.path = defaults.path;
    	      this.scheme = defaults.scheme;
        }

        public Builder host(@Nullable Output<String> host) {
            this.host = host;
            return this;
        }

        public Builder host(@Nullable String host) {
            this.host = Output.ofNullable(host);
            return this;
        }

        public Builder httpHeaders(@Nullable Output<List<HTTPHeaderArgs>> httpHeaders) {
            this.httpHeaders = httpHeaders;
            return this;
        }

        public Builder httpHeaders(@Nullable List<HTTPHeaderArgs> httpHeaders) {
            this.httpHeaders = Output.ofNullable(httpHeaders);
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

        public Builder scheme(@Nullable Output<String> scheme) {
            this.scheme = scheme;
            return this;
        }

        public Builder scheme(@Nullable String scheme) {
            this.scheme = Output.ofNullable(scheme);
            return this;
        }
        public HTTPGetActionArgs build() {
            return new HTTPGetActionArgs(host, httpHeaders, path, scheme);
        }
    }
}
