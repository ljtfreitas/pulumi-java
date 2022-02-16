// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionArgs;
import io.pulumi.gcp.compute.inputs.URLMapDefaultUrlRedirectArgs;
import io.pulumi.gcp.compute.inputs.URLMapHeaderActionArgs;
import io.pulumi.gcp.compute.inputs.URLMapHostRuleArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherArgs;
import io.pulumi.gcp.compute.inputs.URLMapTestArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapArgs Empty = new URLMapArgs();

    @InputImport(name="defaultRouteAction")
    private final @Nullable Input<URLMapDefaultRouteActionArgs> defaultRouteAction;

    public Input<URLMapDefaultRouteActionArgs> getDefaultRouteAction() {
        return this.defaultRouteAction == null ? Input.empty() : this.defaultRouteAction;
    }

    @InputImport(name="defaultService")
    private final @Nullable Input<String> defaultService;

    public Input<String> getDefaultService() {
        return this.defaultService == null ? Input.empty() : this.defaultService;
    }

    @InputImport(name="defaultUrlRedirect")
    private final @Nullable Input<URLMapDefaultUrlRedirectArgs> defaultUrlRedirect;

    public Input<URLMapDefaultUrlRedirectArgs> getDefaultUrlRedirect() {
        return this.defaultUrlRedirect == null ? Input.empty() : this.defaultUrlRedirect;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="headerAction")
    private final @Nullable Input<URLMapHeaderActionArgs> headerAction;

    public Input<URLMapHeaderActionArgs> getHeaderAction() {
        return this.headerAction == null ? Input.empty() : this.headerAction;
    }

    @InputImport(name="hostRules")
    private final @Nullable Input<List<URLMapHostRuleArgs>> hostRules;

    public Input<List<URLMapHostRuleArgs>> getHostRules() {
        return this.hostRules == null ? Input.empty() : this.hostRules;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="pathMatchers")
    private final @Nullable Input<List<URLMapPathMatcherArgs>> pathMatchers;

    public Input<List<URLMapPathMatcherArgs>> getPathMatchers() {
        return this.pathMatchers == null ? Input.empty() : this.pathMatchers;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="tests")
    private final @Nullable Input<List<URLMapTestArgs>> tests;

    public Input<List<URLMapTestArgs>> getTests() {
        return this.tests == null ? Input.empty() : this.tests;
    }

    public URLMapArgs(
        @Nullable Input<URLMapDefaultRouteActionArgs> defaultRouteAction,
        @Nullable Input<String> defaultService,
        @Nullable Input<URLMapDefaultUrlRedirectArgs> defaultUrlRedirect,
        @Nullable Input<String> description,
        @Nullable Input<URLMapHeaderActionArgs> headerAction,
        @Nullable Input<List<URLMapHostRuleArgs>> hostRules,
        @Nullable Input<String> name,
        @Nullable Input<List<URLMapPathMatcherArgs>> pathMatchers,
        @Nullable Input<String> project,
        @Nullable Input<List<URLMapTestArgs>> tests) {
        this.defaultRouteAction = defaultRouteAction;
        this.defaultService = defaultService;
        this.defaultUrlRedirect = defaultUrlRedirect;
        this.description = description;
        this.headerAction = headerAction;
        this.hostRules = hostRules;
        this.name = name;
        this.pathMatchers = pathMatchers;
        this.project = project;
        this.tests = tests;
    }

    private URLMapArgs() {
        this.defaultRouteAction = Input.empty();
        this.defaultService = Input.empty();
        this.defaultUrlRedirect = Input.empty();
        this.description = Input.empty();
        this.headerAction = Input.empty();
        this.hostRules = Input.empty();
        this.name = Input.empty();
        this.pathMatchers = Input.empty();
        this.project = Input.empty();
        this.tests = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<URLMapDefaultRouteActionArgs> defaultRouteAction;
        private @Nullable Input<String> defaultService;
        private @Nullable Input<URLMapDefaultUrlRedirectArgs> defaultUrlRedirect;
        private @Nullable Input<String> description;
        private @Nullable Input<URLMapHeaderActionArgs> headerAction;
        private @Nullable Input<List<URLMapHostRuleArgs>> hostRules;
        private @Nullable Input<String> name;
        private @Nullable Input<List<URLMapPathMatcherArgs>> pathMatchers;
        private @Nullable Input<String> project;
        private @Nullable Input<List<URLMapTestArgs>> tests;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultRouteAction = defaults.defaultRouteAction;
    	      this.defaultService = defaults.defaultService;
    	      this.defaultUrlRedirect = defaults.defaultUrlRedirect;
    	      this.description = defaults.description;
    	      this.headerAction = defaults.headerAction;
    	      this.hostRules = defaults.hostRules;
    	      this.name = defaults.name;
    	      this.pathMatchers = defaults.pathMatchers;
    	      this.project = defaults.project;
    	      this.tests = defaults.tests;
        }

        public Builder setDefaultRouteAction(@Nullable Input<URLMapDefaultRouteActionArgs> defaultRouteAction) {
            this.defaultRouteAction = defaultRouteAction;
            return this;
        }

        public Builder setDefaultRouteAction(@Nullable URLMapDefaultRouteActionArgs defaultRouteAction) {
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

        public Builder setDefaultUrlRedirect(@Nullable Input<URLMapDefaultUrlRedirectArgs> defaultUrlRedirect) {
            this.defaultUrlRedirect = defaultUrlRedirect;
            return this;
        }

        public Builder setDefaultUrlRedirect(@Nullable URLMapDefaultUrlRedirectArgs defaultUrlRedirect) {
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

        public Builder setHeaderAction(@Nullable Input<URLMapHeaderActionArgs> headerAction) {
            this.headerAction = headerAction;
            return this;
        }

        public Builder setHeaderAction(@Nullable URLMapHeaderActionArgs headerAction) {
            this.headerAction = Input.ofNullable(headerAction);
            return this;
        }

        public Builder setHostRules(@Nullable Input<List<URLMapHostRuleArgs>> hostRules) {
            this.hostRules = hostRules;
            return this;
        }

        public Builder setHostRules(@Nullable List<URLMapHostRuleArgs> hostRules) {
            this.hostRules = Input.ofNullable(hostRules);
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

        public Builder setPathMatchers(@Nullable Input<List<URLMapPathMatcherArgs>> pathMatchers) {
            this.pathMatchers = pathMatchers;
            return this;
        }

        public Builder setPathMatchers(@Nullable List<URLMapPathMatcherArgs> pathMatchers) {
            this.pathMatchers = Input.ofNullable(pathMatchers);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setTests(@Nullable Input<List<URLMapTestArgs>> tests) {
            this.tests = tests;
            return this;
        }

        public Builder setTests(@Nullable List<URLMapTestArgs> tests) {
            this.tests = Input.ofNullable(tests);
            return this;
        }

        public URLMapArgs build() {
            return new URLMapArgs(defaultRouteAction, defaultService, defaultUrlRedirect, description, headerAction, hostRules, name, pathMatchers, project, tests);
        }
    }
}