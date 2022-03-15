// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.networking.k8s.io_v1beta1.inputs.IngressBackendArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * HTTPIngressPath associates a path regex with a backend. Incoming urls matching the path are forwarded to the backend.
 * 
 */
public final class HTTPIngressPathArgs extends io.pulumi.resources.ResourceArgs {

    public static final HTTPIngressPathArgs Empty = new HTTPIngressPathArgs();

    /**
     * Backend defines the referenced service endpoint to which the traffic will be forwarded to.
     * 
     */
    @Import(name="backend", required=true)
      private final Output<IngressBackendArgs> backend;

    public Output<IngressBackendArgs> getBackend() {
        return this.backend;
    }

    /**
     * Path is an extended POSIX regex as defined by IEEE Std 1003.1, (i.e this follows the egrep/unix syntax, not the perl syntax) matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/'. If unspecified, the path defaults to a catch all sending traffic to the backend.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Output.empty() : this.path;
    }

    /**
     * PathType determines the interpretation of the Path matching. PathType can be one of the following values: * Exact: Matches the URL path exactly. * Prefix: Matches based on a URL path prefix split by '/'. Matching is
     *   done on a path element by element basis. A path element refers is the
     *   list of labels in the path split by the '/' separator. A request is a
     *   match for path p if every p is an element-wise prefix of p of the
     *   request path. Note that if the last element of the path is a substring
     *   of the last element in request path, it is not a match (e.g. /foo/bar
     *   matches /foo/bar/baz, but does not match /foo/barbaz).
     * * ImplementationSpecific: Interpretation of the Path matching is up to
     *   the IngressClass. Implementations can treat this as a separate PathType
     *   or treat it identically to Prefix or Exact path types.
     *   Implementations are required to support all path types. Defaults to ImplementationSpecific.
     * 
     */
    @Import(name="pathType")
      private final @Nullable Output<String> pathType;

    public Output<String> getPathType() {
        return this.pathType == null ? Output.empty() : this.pathType;
    }

    public HTTPIngressPathArgs(
        Output<IngressBackendArgs> backend,
        @Nullable Output<String> path,
        @Nullable Output<String> pathType) {
        this.backend = Objects.requireNonNull(backend, "expected parameter 'backend' to be non-null");
        this.path = path;
        this.pathType = pathType;
    }

    private HTTPIngressPathArgs() {
        this.backend = Output.empty();
        this.path = Output.empty();
        this.pathType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HTTPIngressPathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<IngressBackendArgs> backend;
        private @Nullable Output<String> path;
        private @Nullable Output<String> pathType;

        public Builder() {
    	      // Empty
        }

        public Builder(HTTPIngressPathArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backend = defaults.backend;
    	      this.path = defaults.path;
    	      this.pathType = defaults.pathType;
        }

        public Builder backend(Output<IngressBackendArgs> backend) {
            this.backend = Objects.requireNonNull(backend);
            return this;
        }

        public Builder backend(IngressBackendArgs backend) {
            this.backend = Output.of(Objects.requireNonNull(backend));
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

        public Builder pathType(@Nullable Output<String> pathType) {
            this.pathType = pathType;
            return this;
        }

        public Builder pathType(@Nullable String pathType) {
            this.pathType = Output.ofNullable(pathType);
            return this;
        }
        public HTTPIngressPathArgs build() {
            return new HTTPIngressPathArgs(backend, path, pathType);
        }
    }
}
