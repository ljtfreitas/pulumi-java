// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRouteArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRouteArgs Empty = new GetRouteArgs();

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="route", required=true)
      private final String route;

    public String getRoute() {
        return this.route;
    }

    public GetRouteArgs(
        @Nullable String project,
        String route) {
        this.project = project;
        this.route = Objects.requireNonNull(route, "expected parameter 'route' to be non-null");
    }

    private GetRouteArgs() {
        this.project = null;
        this.route = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String route;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.route = defaults.route;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder route(String route) {
            this.route = Objects.requireNonNull(route);
            return this;
        }
        public GetRouteArgs build() {
            return new GetRouteArgs(project, route);
        }
    }
}
