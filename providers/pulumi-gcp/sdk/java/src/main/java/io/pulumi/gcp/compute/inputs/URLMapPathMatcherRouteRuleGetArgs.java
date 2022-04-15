// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleHeaderActionGetArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleMatchRuleGetArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionGetArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleUrlRedirectGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapPathMatcherRouteRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherRouteRuleGetArgs Empty = new URLMapPathMatcherRouteRuleGetArgs();

    /**
     * Specifies changes to request and response headers that need to take effect for
     * the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing
     * HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
     */
    @Import(name="headerAction")
      private final @Nullable Output<URLMapPathMatcherRouteRuleHeaderActionGetArgs> headerAction;

    public Output<URLMapPathMatcherRouteRuleHeaderActionGetArgs> headerAction() {
        return this.headerAction == null ? Codegen.empty() : this.headerAction;
    }

    /**
     * The rules for determining a match.
     * Structure is documented below.
     * 
     */
    @Import(name="matchRules")
      private final @Nullable Output<List<URLMapPathMatcherRouteRuleMatchRuleGetArgs>> matchRules;

    public Output<List<URLMapPathMatcherRouteRuleMatchRuleGetArgs>> matchRules() {
        return this.matchRules == null ? Codegen.empty() : this.matchRules;
    }

    /**
     * For routeRules within a given pathMatcher, priority determines the order
     * in which load balancer will interpret routeRules. RouteRules are evaluated
     * in order of priority, from the lowest to highest number. The priority of
     * a rule decreases as its number increases (1, 2, 3, N+1). The first rule
     * that matches the request is applied.
     * You cannot configure two or more routeRules with the same priority.
     * Priority for each rule must be set to a number between 0 and
     * 2147483647 inclusive.
     * Priority numbers can have gaps, which enable you to add or remove rules
     * in the future without affecting the rest of the rules. For example,
     * 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers to which
     * you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the
     * future without any impact on existing rules.
     * 
     */
    @Import(name="priority", required=true)
      private final Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority;
    }

    /**
     * In response to a matching matchRule, the load balancer performs advanced routing
     * actions like URL rewrites, header transformations, etc. prior to forwarding the
     * request to the selected backend. If  routeAction specifies any
     * weightedBackendServices, service must not be set. Conversely if service is set,
     * routeAction cannot contain any  weightedBackendServices. Only one of routeAction
     * or urlRedirect must be set.
     * Structure is documented below.
     * 
     */
    @Import(name="routeAction")
      private final @Nullable Output<URLMapPathMatcherRouteRuleRouteActionGetArgs> routeAction;

    public Output<URLMapPathMatcherRouteRuleRouteActionGetArgs> routeAction() {
        return this.routeAction == null ? Codegen.empty() : this.routeAction;
    }

    /**
     * The backend service or backend bucket link that should be matched by this test.
     * 
     */
    @Import(name="service")
      private final @Nullable Output<String> service;

    public Output<String> service() {
        return this.service == null ? Codegen.empty() : this.service;
    }

    /**
     * When this rule is matched, the request is redirected to a URL specified by
     * urlRedirect. If urlRedirect is specified, service or routeAction must not be
     * set.
     * Structure is documented below.
     * 
     */
    @Import(name="urlRedirect")
      private final @Nullable Output<URLMapPathMatcherRouteRuleUrlRedirectGetArgs> urlRedirect;

    public Output<URLMapPathMatcherRouteRuleUrlRedirectGetArgs> urlRedirect() {
        return this.urlRedirect == null ? Codegen.empty() : this.urlRedirect;
    }

    public URLMapPathMatcherRouteRuleGetArgs(
        @Nullable Output<URLMapPathMatcherRouteRuleHeaderActionGetArgs> headerAction,
        @Nullable Output<List<URLMapPathMatcherRouteRuleMatchRuleGetArgs>> matchRules,
        Output<Integer> priority,
        @Nullable Output<URLMapPathMatcherRouteRuleRouteActionGetArgs> routeAction,
        @Nullable Output<String> service,
        @Nullable Output<URLMapPathMatcherRouteRuleUrlRedirectGetArgs> urlRedirect) {
        this.headerAction = headerAction;
        this.matchRules = matchRules;
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.routeAction = routeAction;
        this.service = service;
        this.urlRedirect = urlRedirect;
    }

    private URLMapPathMatcherRouteRuleGetArgs() {
        this.headerAction = Codegen.empty();
        this.matchRules = Codegen.empty();
        this.priority = Codegen.empty();
        this.routeAction = Codegen.empty();
        this.service = Codegen.empty();
        this.urlRedirect = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherRouteRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<URLMapPathMatcherRouteRuleHeaderActionGetArgs> headerAction;
        private @Nullable Output<List<URLMapPathMatcherRouteRuleMatchRuleGetArgs>> matchRules;
        private Output<Integer> priority;
        private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionGetArgs> routeAction;
        private @Nullable Output<String> service;
        private @Nullable Output<URLMapPathMatcherRouteRuleUrlRedirectGetArgs> urlRedirect;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherRouteRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerAction = defaults.headerAction;
    	      this.matchRules = defaults.matchRules;
    	      this.priority = defaults.priority;
    	      this.routeAction = defaults.routeAction;
    	      this.service = defaults.service;
    	      this.urlRedirect = defaults.urlRedirect;
        }

        public Builder headerAction(@Nullable Output<URLMapPathMatcherRouteRuleHeaderActionGetArgs> headerAction) {
            this.headerAction = headerAction;
            return this;
        }
        public Builder headerAction(@Nullable URLMapPathMatcherRouteRuleHeaderActionGetArgs headerAction) {
            this.headerAction = Codegen.ofNullable(headerAction);
            return this;
        }
        public Builder matchRules(@Nullable Output<List<URLMapPathMatcherRouteRuleMatchRuleGetArgs>> matchRules) {
            this.matchRules = matchRules;
            return this;
        }
        public Builder matchRules(@Nullable List<URLMapPathMatcherRouteRuleMatchRuleGetArgs> matchRules) {
            this.matchRules = Codegen.ofNullable(matchRules);
            return this;
        }
        public Builder matchRules(URLMapPathMatcherRouteRuleMatchRuleGetArgs... matchRules) {
            return matchRules(List.of(matchRules));
        }
        public Builder priority(Output<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Output.of(Objects.requireNonNull(priority));
            return this;
        }
        public Builder routeAction(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionGetArgs> routeAction) {
            this.routeAction = routeAction;
            return this;
        }
        public Builder routeAction(@Nullable URLMapPathMatcherRouteRuleRouteActionGetArgs routeAction) {
            this.routeAction = Codegen.ofNullable(routeAction);
            return this;
        }
        public Builder service(@Nullable Output<String> service) {
            this.service = service;
            return this;
        }
        public Builder service(@Nullable String service) {
            this.service = Codegen.ofNullable(service);
            return this;
        }
        public Builder urlRedirect(@Nullable Output<URLMapPathMatcherRouteRuleUrlRedirectGetArgs> urlRedirect) {
            this.urlRedirect = urlRedirect;
            return this;
        }
        public Builder urlRedirect(@Nullable URLMapPathMatcherRouteRuleUrlRedirectGetArgs urlRedirect) {
            this.urlRedirect = Codegen.ofNullable(urlRedirect);
            return this;
        }        public URLMapPathMatcherRouteRuleGetArgs build() {
            return new URLMapPathMatcherRouteRuleGetArgs(headerAction, matchRules, priority, routeAction, service, urlRedirect);
        }
    }
}
