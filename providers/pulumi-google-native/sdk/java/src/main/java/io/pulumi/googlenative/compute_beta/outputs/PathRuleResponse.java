// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.compute_beta.outputs.HttpRedirectActionResponse;
import io.pulumi.googlenative.compute_beta.outputs.HttpRouteActionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class PathRuleResponse {
    /**
     * The list of path patterns to match. Each must start with / and the only place a * is allowed is at the end following a /. The string fed to the path matcher does not include any text after the first ? or #, and those chars are not allowed here.
     * 
     */
    private final List<String> paths;
    /**
     * In response to a matching path, the load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If routeAction specifies any weightedBackendServices, service must not be set. Conversely if service is set, routeAction cannot contain any weightedBackendServices. Only one of routeAction or urlRedirect must be set. URL maps for external HTTP(S) load balancers support only the urlRewrite action within a path rule's routeAction.
     * 
     */
    private final HttpRouteActionResponse routeAction;
    /**
     * The full or partial URL of the backend service resource to which traffic is directed if this rule is matched. If routeAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if service is specified, routeAction cannot contain any weightedBackendServices. Conversely, if routeAction specifies any weightedBackendServices, service must not be specified. Only one of urlRedirect, service or routeAction.weightedBackendService must be set.
     * 
     */
    private final String service;
    /**
     * When a path pattern is matched, the request is redirected to a URL specified by urlRedirect. If urlRedirect is specified, service or routeAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    private final HttpRedirectActionResponse urlRedirect;

    @CustomType.Constructor
    private PathRuleResponse(
        @CustomType.Parameter("paths") List<String> paths,
        @CustomType.Parameter("routeAction") HttpRouteActionResponse routeAction,
        @CustomType.Parameter("service") String service,
        @CustomType.Parameter("urlRedirect") HttpRedirectActionResponse urlRedirect) {
        this.paths = paths;
        this.routeAction = routeAction;
        this.service = service;
        this.urlRedirect = urlRedirect;
    }

    /**
     * The list of path patterns to match. Each must start with / and the only place a * is allowed is at the end following a /. The string fed to the path matcher does not include any text after the first ? or #, and those chars are not allowed here.
     * 
    */
    public List<String> getPaths() {
        return this.paths;
    }
    /**
     * In response to a matching path, the load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If routeAction specifies any weightedBackendServices, service must not be set. Conversely if service is set, routeAction cannot contain any weightedBackendServices. Only one of routeAction or urlRedirect must be set. URL maps for external HTTP(S) load balancers support only the urlRewrite action within a path rule's routeAction.
     * 
    */
    public HttpRouteActionResponse getRouteAction() {
        return this.routeAction;
    }
    /**
     * The full or partial URL of the backend service resource to which traffic is directed if this rule is matched. If routeAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if service is specified, routeAction cannot contain any weightedBackendServices. Conversely, if routeAction specifies any weightedBackendServices, service must not be specified. Only one of urlRedirect, service or routeAction.weightedBackendService must be set.
     * 
    */
    public String getService() {
        return this.service;
    }
    /**
     * When a path pattern is matched, the request is redirected to a URL specified by urlRedirect. If urlRedirect is specified, service or routeAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
     * 
    */
    public HttpRedirectActionResponse getUrlRedirect() {
        return this.urlRedirect;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PathRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> paths;
        private HttpRouteActionResponse routeAction;
        private String service;
        private HttpRedirectActionResponse urlRedirect;

        public Builder() {
    	      // Empty
        }

        public Builder(PathRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.paths = defaults.paths;
    	      this.routeAction = defaults.routeAction;
    	      this.service = defaults.service;
    	      this.urlRedirect = defaults.urlRedirect;
        }

        public Builder paths(List<String> paths) {
            this.paths = Objects.requireNonNull(paths);
            return this;
        }

        public Builder routeAction(HttpRouteActionResponse routeAction) {
            this.routeAction = Objects.requireNonNull(routeAction);
            return this;
        }

        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public Builder urlRedirect(HttpRedirectActionResponse urlRedirect) {
            this.urlRedirect = Objects.requireNonNull(urlRedirect);
            return this;
        }
        public PathRuleResponse build() {
            return new PathRuleResponse(paths, routeAction, service, urlRedirect);
        }
    }
}
