// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.HttpHeaderActionArgs;
import io.pulumi.googlenative.compute_alpha.inputs.HttpRedirectActionArgs;
import io.pulumi.googlenative.compute_alpha.inputs.HttpRouteActionArgs;
import io.pulumi.googlenative.compute_alpha.inputs.HttpRouteRuleArgs;
import io.pulumi.googlenative.compute_alpha.inputs.PathRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A matcher for the path portion of the URL. The BackendService from the longest-matched rule will serve the URL. If no rule was matched, the default service is used.
 * 
 */
public final class PathMatcherArgs extends io.pulumi.resources.ResourceArgs {

    public static final PathMatcherArgs Empty = new PathMatcherArgs();

    /**
     * defaultRouteAction takes effect when none of the pathRules or routeRules match. The load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices. Only one of defaultRouteAction or defaultUrlRedirect must be set. UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a path matcher's defaultRouteAction.
     * 
     */
    @InputImport(name="defaultRouteAction")
      private final @Nullable Input<HttpRouteActionArgs> defaultRouteAction;

    public Input<HttpRouteActionArgs> getDefaultRouteAction() {
        return this.defaultRouteAction == null ? Input.empty() : this.defaultRouteAction;
    }

    /**
     * The full or partial URL to the BackendService resource. This URL is used if none of the pathRules or routeRules defined by this PathMatcher are matched. For example, the following are all valid URLs to a BackendService resource: - https://www.googleapis.com/compute/v1/projects/project /global/backendServices/backendService - compute/v1/projects/project/global/backendServices/backendService - global/backendServices/backendService If defaultRouteAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if defaultService is specified, defaultRouteAction cannot contain any weightedBackendServices. Conversely, if defaultRouteAction specifies any weightedBackendServices, defaultService must not be specified. Only one of defaultService, defaultUrlRedirect , or defaultRouteAction.weightedBackendService must be set. Authorization requires one or more of the following Google IAM permissions on the specified resource default_service: - compute.backendBuckets.use - compute.backendServices.use
     * 
     */
    @InputImport(name="defaultService")
      private final @Nullable Input<String> defaultService;

    public Input<String> getDefaultService() {
        return this.defaultService == null ? Input.empty() : this.defaultService;
    }

    /**
     * When none of the specified pathRules or routeRules match, the request is redirected to a URL specified by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or defaultRouteAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    @InputImport(name="defaultUrlRedirect")
      private final @Nullable Input<HttpRedirectActionArgs> defaultUrlRedirect;

    public Input<HttpRedirectActionArgs> getDefaultUrlRedirect() {
        return this.defaultUrlRedirect == null ? Input.empty() : this.defaultUrlRedirect;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Specifies changes to request and response headers that need to take effect for the selected backend service. HeaderAction specified here are applied after the matching HttpRouteRule HeaderAction and before the HeaderAction in the UrlMap HeaderAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @InputImport(name="headerAction")
      private final @Nullable Input<HttpHeaderActionArgs> headerAction;

    public Input<HttpHeaderActionArgs> getHeaderAction() {
        return this.headerAction == null ? Input.empty() : this.headerAction;
    }

    /**
     * The name to which this PathMatcher is referred by the HostRule.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The list of path rules. Use this list instead of routeRules when routing based on simple path matching is all that's required. The order by which path rules are specified does not matter. Matches are always done on the longest-path-first basis. For example: a pathRule with a path /a/b/c/* will match before /a/b/* irrespective of the order in which those paths appear in this list. Within a given pathMatcher, only one of pathRules or routeRules must be set.
     * 
     */
    @InputImport(name="pathRules")
      private final @Nullable Input<List<PathRuleArgs>> pathRules;

    public Input<List<PathRuleArgs>> getPathRules() {
        return this.pathRules == null ? Input.empty() : this.pathRules;
    }

    /**
     * The list of HTTP route rules. Use this list instead of pathRules when advanced route matching and routing actions are desired. routeRules are evaluated in order of priority, from the lowest to highest number. Within a given pathMatcher, you can set only one of pathRules or routeRules.
     * 
     */
    @InputImport(name="routeRules")
      private final @Nullable Input<List<HttpRouteRuleArgs>> routeRules;

    public Input<List<HttpRouteRuleArgs>> getRouteRules() {
        return this.routeRules == null ? Input.empty() : this.routeRules;
    }

    public PathMatcherArgs(
        @Nullable Input<HttpRouteActionArgs> defaultRouteAction,
        @Nullable Input<String> defaultService,
        @Nullable Input<HttpRedirectActionArgs> defaultUrlRedirect,
        @Nullable Input<String> description,
        @Nullable Input<HttpHeaderActionArgs> headerAction,
        @Nullable Input<String> name,
        @Nullable Input<List<PathRuleArgs>> pathRules,
        @Nullable Input<List<HttpRouteRuleArgs>> routeRules) {
        this.defaultRouteAction = defaultRouteAction;
        this.defaultService = defaultService;
        this.defaultUrlRedirect = defaultUrlRedirect;
        this.description = description;
        this.headerAction = headerAction;
        this.name = name;
        this.pathRules = pathRules;
        this.routeRules = routeRules;
    }

    private PathMatcherArgs() {
        this.defaultRouteAction = Input.empty();
        this.defaultService = Input.empty();
        this.defaultUrlRedirect = Input.empty();
        this.description = Input.empty();
        this.headerAction = Input.empty();
        this.name = Input.empty();
        this.pathRules = Input.empty();
        this.routeRules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PathMatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<HttpRouteActionArgs> defaultRouteAction;
        private @Nullable Input<String> defaultService;
        private @Nullable Input<HttpRedirectActionArgs> defaultUrlRedirect;
        private @Nullable Input<String> description;
        private @Nullable Input<HttpHeaderActionArgs> headerAction;
        private @Nullable Input<String> name;
        private @Nullable Input<List<PathRuleArgs>> pathRules;
        private @Nullable Input<List<HttpRouteRuleArgs>> routeRules;

        public Builder() {
    	      // Empty
        }

        public Builder(PathMatcherArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultRouteAction = defaults.defaultRouteAction;
    	      this.defaultService = defaults.defaultService;
    	      this.defaultUrlRedirect = defaults.defaultUrlRedirect;
    	      this.description = defaults.description;
    	      this.headerAction = defaults.headerAction;
    	      this.name = defaults.name;
    	      this.pathRules = defaults.pathRules;
    	      this.routeRules = defaults.routeRules;
        }

        public Builder setDefaultRouteAction(@Nullable Input<HttpRouteActionArgs> defaultRouteAction) {
            this.defaultRouteAction = defaultRouteAction;
            return this;
        }

        public Builder setDefaultRouteAction(@Nullable HttpRouteActionArgs defaultRouteAction) {
            this.defaultRouteAction = Input.ofNullable(defaultRouteAction);
            return this;
        }

        public Builder setDefaultService(@Nullable Input<String> defaultService) {
            this.defaultService = defaultService;
            return this;
        }

        public Builder setDefaultService(@Nullable String defaultService) {
            this.defaultService = Input.ofNullable(defaultService);
            return this;
        }

        public Builder setDefaultUrlRedirect(@Nullable Input<HttpRedirectActionArgs> defaultUrlRedirect) {
            this.defaultUrlRedirect = defaultUrlRedirect;
            return this;
        }

        public Builder setDefaultUrlRedirect(@Nullable HttpRedirectActionArgs defaultUrlRedirect) {
            this.defaultUrlRedirect = Input.ofNullable(defaultUrlRedirect);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setHeaderAction(@Nullable Input<HttpHeaderActionArgs> headerAction) {
            this.headerAction = headerAction;
            return this;
        }

        public Builder setHeaderAction(@Nullable HttpHeaderActionArgs headerAction) {
            this.headerAction = Input.ofNullable(headerAction);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPathRules(@Nullable Input<List<PathRuleArgs>> pathRules) {
            this.pathRules = pathRules;
            return this;
        }

        public Builder setPathRules(@Nullable List<PathRuleArgs> pathRules) {
            this.pathRules = Input.ofNullable(pathRules);
            return this;
        }

        public Builder setRouteRules(@Nullable Input<List<HttpRouteRuleArgs>> routeRules) {
            this.routeRules = routeRules;
            return this;
        }

        public Builder setRouteRules(@Nullable List<HttpRouteRuleArgs> routeRules) {
            this.routeRules = Input.ofNullable(routeRules);
            return this;
        }
        public PathMatcherArgs build() {
            return new PathMatcherArgs(defaultRouteAction, defaultService, defaultUrlRedirect, description, headerAction, name, pathRules, routeRules);
        }
    }
}
