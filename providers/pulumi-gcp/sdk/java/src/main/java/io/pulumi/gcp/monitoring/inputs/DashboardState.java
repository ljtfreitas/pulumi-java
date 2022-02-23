// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DashboardState extends io.pulumi.resources.ResourceArgs {

    public static final DashboardState Empty = new DashboardState();

    /**
     * The JSON representation of a dashboard, following the format at https://cloud.google.com/monitoring/api/ref_v3/rest/v1/projects.dashboards.
     * The representation of an existing dashboard can be found by using the [API Explorer](https://cloud.google.com/monitoring/api/ref_v3/rest/v1/projects.dashboards/get)
     * 
     */
    @InputImport(name="dashboardJson")
        private final @Nullable Input<String> dashboardJson;

    public Input<String> getDashboardJson() {
        return this.dashboardJson == null ? Input.empty() : this.dashboardJson;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
        private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public DashboardState(
        @Nullable Input<String> dashboardJson,
        @Nullable Input<String> project) {
        this.dashboardJson = dashboardJson;
        this.project = project;
    }

    private DashboardState() {
        this.dashboardJson = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dashboardJson;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dashboardJson = defaults.dashboardJson;
    	      this.project = defaults.project;
        }

        public Builder setDashboardJson(@Nullable Input<String> dashboardJson) {
            this.dashboardJson = dashboardJson;
            return this;
        }

        public Builder setDashboardJson(@Nullable String dashboardJson) {
            this.dashboardJson = Input.ofNullable(dashboardJson);
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
        public DashboardState build() {
            return new DashboardState(dashboardJson, project);
        }
    }
}
