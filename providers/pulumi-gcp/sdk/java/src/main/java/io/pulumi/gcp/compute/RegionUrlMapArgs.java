// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.RegionUrlMapDefaultUrlRedirectArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapHostRuleArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapTestArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapArgs Empty = new RegionUrlMapArgs();

    /**
     * A reference to a RegionBackendService resource. This will be used if
     * none of the pathRules defined by this PathMatcher is matched by
     * the URL's path portion.
     * 
     */
    @Import(name="defaultService")
      private final @Nullable Output<String> defaultService;

    public Output<String> getDefaultService() {
        return this.defaultService == null ? Output.empty() : this.defaultService;
    }

    /**
     * When none of the specified hostRules match, the request is redirected to a URL specified
     * by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or
     * defaultRouteAction must not be set.
     * Structure is documented below.
     * 
     */
    @Import(name="defaultUrlRedirect")
      private final @Nullable Output<RegionUrlMapDefaultUrlRedirectArgs> defaultUrlRedirect;

    public Output<RegionUrlMapDefaultUrlRedirectArgs> getDefaultUrlRedirect() {
        return this.defaultUrlRedirect == null ? Output.empty() : this.defaultUrlRedirect;
    }

    /**
     * Description of this test case.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The list of HostRules to use against the URL.
     * Structure is documented below.
     * 
     */
    @Import(name="hostRules")
      private final @Nullable Output<List<RegionUrlMapHostRuleArgs>> hostRules;

    public Output<List<RegionUrlMapHostRuleArgs>> getHostRules() {
        return this.hostRules == null ? Output.empty() : this.hostRules;
    }

    /**
     * The name of the query parameter to match. The query parameter must exist in the
     * request, in the absence of which the request match fails.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The name of the PathMatcher to use to match the path portion of
     * the URL if the hostRule matches the URL's host portion.
     * 
     */
    @Import(name="pathMatchers")
      private final @Nullable Output<List<RegionUrlMapPathMatcherArgs>> pathMatchers;

    public Output<List<RegionUrlMapPathMatcherArgs>> getPathMatchers() {
        return this.pathMatchers == null ? Output.empty() : this.pathMatchers;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The Region in which the url map should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    /**
     * The list of expected URL mappings. Requests to update this UrlMap will
     * succeed only if all of the test cases pass.
     * Structure is documented below.
     * 
     */
    @Import(name="tests")
      private final @Nullable Output<List<RegionUrlMapTestArgs>> tests;

    public Output<List<RegionUrlMapTestArgs>> getTests() {
        return this.tests == null ? Output.empty() : this.tests;
    }

    public RegionUrlMapArgs(
        @Nullable Output<String> defaultService,
        @Nullable Output<RegionUrlMapDefaultUrlRedirectArgs> defaultUrlRedirect,
        @Nullable Output<String> description,
        @Nullable Output<List<RegionUrlMapHostRuleArgs>> hostRules,
        @Nullable Output<String> name,
        @Nullable Output<List<RegionUrlMapPathMatcherArgs>> pathMatchers,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        @Nullable Output<List<RegionUrlMapTestArgs>> tests) {
        this.defaultService = defaultService;
        this.defaultUrlRedirect = defaultUrlRedirect;
        this.description = description;
        this.hostRules = hostRules;
        this.name = name;
        this.pathMatchers = pathMatchers;
        this.project = project;
        this.region = region;
        this.tests = tests;
    }

    private RegionUrlMapArgs() {
        this.defaultService = Output.empty();
        this.defaultUrlRedirect = Output.empty();
        this.description = Output.empty();
        this.hostRules = Output.empty();
        this.name = Output.empty();
        this.pathMatchers = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
        this.tests = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> defaultService;
        private @Nullable Output<RegionUrlMapDefaultUrlRedirectArgs> defaultUrlRedirect;
        private @Nullable Output<String> description;
        private @Nullable Output<List<RegionUrlMapHostRuleArgs>> hostRules;
        private @Nullable Output<String> name;
        private @Nullable Output<List<RegionUrlMapPathMatcherArgs>> pathMatchers;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private @Nullable Output<List<RegionUrlMapTestArgs>> tests;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultService = defaults.defaultService;
    	      this.defaultUrlRedirect = defaults.defaultUrlRedirect;
    	      this.description = defaults.description;
    	      this.hostRules = defaults.hostRules;
    	      this.name = defaults.name;
    	      this.pathMatchers = defaults.pathMatchers;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.tests = defaults.tests;
        }

        public Builder defaultService(@Nullable Output<String> defaultService) {
            this.defaultService = defaultService;
            return this;
        }

        public Builder defaultService(@Nullable String defaultService) {
            this.defaultService = Output.ofNullable(defaultService);
            return this;
        }

        public Builder defaultUrlRedirect(@Nullable Output<RegionUrlMapDefaultUrlRedirectArgs> defaultUrlRedirect) {
            this.defaultUrlRedirect = defaultUrlRedirect;
            return this;
        }

        public Builder defaultUrlRedirect(@Nullable RegionUrlMapDefaultUrlRedirectArgs defaultUrlRedirect) {
            this.defaultUrlRedirect = Output.ofNullable(defaultUrlRedirect);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder hostRules(@Nullable Output<List<RegionUrlMapHostRuleArgs>> hostRules) {
            this.hostRules = hostRules;
            return this;
        }

        public Builder hostRules(@Nullable List<RegionUrlMapHostRuleArgs> hostRules) {
            this.hostRules = Output.ofNullable(hostRules);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder pathMatchers(@Nullable Output<List<RegionUrlMapPathMatcherArgs>> pathMatchers) {
            this.pathMatchers = pathMatchers;
            return this;
        }

        public Builder pathMatchers(@Nullable List<RegionUrlMapPathMatcherArgs> pathMatchers) {
            this.pathMatchers = Output.ofNullable(pathMatchers);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }

        public Builder tests(@Nullable Output<List<RegionUrlMapTestArgs>> tests) {
            this.tests = tests;
            return this;
        }

        public Builder tests(@Nullable List<RegionUrlMapTestArgs> tests) {
            this.tests = Output.ofNullable(tests);
            return this;
        }
        public RegionUrlMapArgs build() {
            return new RegionUrlMapArgs(defaultService, defaultUrlRedirect, description, hostRules, name, pathMatchers, project, region, tests);
        }
    }
}
