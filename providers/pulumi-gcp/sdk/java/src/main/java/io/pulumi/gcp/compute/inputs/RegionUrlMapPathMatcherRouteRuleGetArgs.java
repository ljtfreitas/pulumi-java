// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleHeaderActionGetArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleGetArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionGetArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleUrlRedirectGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherRouteRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherRouteRuleGetArgs Empty = new RegionUrlMapPathMatcherRouteRuleGetArgs();

    @InputImport(name="headerAction")
    private final @Nullable Input<RegionUrlMapPathMatcherRouteRuleHeaderActionGetArgs> headerAction;

    public Input<RegionUrlMapPathMatcherRouteRuleHeaderActionGetArgs> getHeaderAction() {
        return this.headerAction == null ? Input.empty() : this.headerAction;
    }

    @InputImport(name="matchRules")
    private final @Nullable Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleGetArgs>> matchRules;

    public Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleGetArgs>> getMatchRules() {
        return this.matchRules == null ? Input.empty() : this.matchRules;
    }

    @InputImport(name="priority", required=true)
    private final Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority;
    }

    @InputImport(name="routeAction")
    private final @Nullable Input<RegionUrlMapPathMatcherRouteRuleRouteActionGetArgs> routeAction;

    public Input<RegionUrlMapPathMatcherRouteRuleRouteActionGetArgs> getRouteAction() {
        return this.routeAction == null ? Input.empty() : this.routeAction;
    }

    @InputImport(name="service")
    private final @Nullable Input<String> service;

    public Input<String> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    @InputImport(name="urlRedirect")
    private final @Nullable Input<RegionUrlMapPathMatcherRouteRuleUrlRedirectGetArgs> urlRedirect;

    public Input<RegionUrlMapPathMatcherRouteRuleUrlRedirectGetArgs> getUrlRedirect() {
        return this.urlRedirect == null ? Input.empty() : this.urlRedirect;
    }

    public RegionUrlMapPathMatcherRouteRuleGetArgs(
        @Nullable Input<RegionUrlMapPathMatcherRouteRuleHeaderActionGetArgs> headerAction,
        @Nullable Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleGetArgs>> matchRules,
        Input<Integer> priority,
        @Nullable Input<RegionUrlMapPathMatcherRouteRuleRouteActionGetArgs> routeAction,
        @Nullable Input<String> service,
        @Nullable Input<RegionUrlMapPathMatcherRouteRuleUrlRedirectGetArgs> urlRedirect) {
        this.headerAction = headerAction;
        this.matchRules = matchRules;
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.routeAction = routeAction;
        this.service = service;
        this.urlRedirect = urlRedirect;
    }

    private RegionUrlMapPathMatcherRouteRuleGetArgs() {
        this.headerAction = Input.empty();
        this.matchRules = Input.empty();
        this.priority = Input.empty();
        this.routeAction = Input.empty();
        this.service = Input.empty();
        this.urlRedirect = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RegionUrlMapPathMatcherRouteRuleHeaderActionGetArgs> headerAction;
        private @Nullable Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleGetArgs>> matchRules;
        private Input<Integer> priority;
        private @Nullable Input<RegionUrlMapPathMatcherRouteRuleRouteActionGetArgs> routeAction;
        private @Nullable Input<String> service;
        private @Nullable Input<RegionUrlMapPathMatcherRouteRuleUrlRedirectGetArgs> urlRedirect;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerAction = defaults.headerAction;
    	      this.matchRules = defaults.matchRules;
    	      this.priority = defaults.priority;
    	      this.routeAction = defaults.routeAction;
    	      this.service = defaults.service;
    	      this.urlRedirect = defaults.urlRedirect;
        }

        public Builder setHeaderAction(@Nullable Input<RegionUrlMapPathMatcherRouteRuleHeaderActionGetArgs> headerAction) {
            this.headerAction = headerAction;
            return this;
        }

        public Builder setHeaderAction(@Nullable RegionUrlMapPathMatcherRouteRuleHeaderActionGetArgs headerAction) {
            this.headerAction = Input.ofNullable(headerAction);
            return this;
        }

        public Builder setMatchRules(@Nullable Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleGetArgs>> matchRules) {
            this.matchRules = matchRules;
            return this;
        }

        public Builder setMatchRules(@Nullable List<RegionUrlMapPathMatcherRouteRuleMatchRuleGetArgs> matchRules) {
            this.matchRules = Input.ofNullable(matchRules);
            return this;
        }

        public Builder setPriority(Input<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Input.of(Objects.requireNonNull(priority));
            return this;
        }

        public Builder setRouteAction(@Nullable Input<RegionUrlMapPathMatcherRouteRuleRouteActionGetArgs> routeAction) {
            this.routeAction = routeAction;
            return this;
        }

        public Builder setRouteAction(@Nullable RegionUrlMapPathMatcherRouteRuleRouteActionGetArgs routeAction) {
            this.routeAction = Input.ofNullable(routeAction);
            return this;
        }

        public Builder setService(@Nullable Input<String> service) {
            this.service = service;
            return this;
        }

        public Builder setService(@Nullable String service) {
            this.service = Input.ofNullable(service);
            return this;
        }

        public Builder setUrlRedirect(@Nullable Input<RegionUrlMapPathMatcherRouteRuleUrlRedirectGetArgs> urlRedirect) {
            this.urlRedirect = urlRedirect;
            return this;
        }

        public Builder setUrlRedirect(@Nullable RegionUrlMapPathMatcherRouteRuleUrlRedirectGetArgs urlRedirect) {
            this.urlRedirect = Input.ofNullable(urlRedirect);
            return this;
        }

        public RegionUrlMapPathMatcherRouteRuleGetArgs build() {
            return new RegionUrlMapPathMatcherRouteRuleGetArgs(headerAction, matchRules, priority, routeAction, service, urlRedirect);
        }
    }
}