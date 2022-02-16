// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotsitewise.DashboardArgs;
import io.pulumi.awsnative.iotsitewise.outputs.DashboardTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:iotsitewise:Dashboard")
public class Dashboard extends io.pulumi.resources.CustomResource {
    @OutputExport(name="dashboardArn", type=String.class, parameters={})
    private Output<String> dashboardArn;

    public Output<String> getDashboardArn() {
        return this.dashboardArn;
    }
    @OutputExport(name="dashboardDefinition", type=String.class, parameters={})
    private Output<String> dashboardDefinition;

    public Output<String> getDashboardDefinition() {
        return this.dashboardDefinition;
    }
    @OutputExport(name="dashboardDescription", type=String.class, parameters={})
    private Output<String> dashboardDescription;

    public Output<String> getDashboardDescription() {
        return this.dashboardDescription;
    }
    @OutputExport(name="dashboardId", type=String.class, parameters={})
    private Output<String> dashboardId;

    public Output<String> getDashboardId() {
        return this.dashboardId;
    }
    @OutputExport(name="dashboardName", type=String.class, parameters={})
    private Output<String> dashboardName;

    public Output<String> getDashboardName() {
        return this.dashboardName;
    }
    @OutputExport(name="projectId", type=String.class, parameters={})
    private Output</* @Nullable */ String> projectId;

    public Output</* @Nullable */ String> getProjectId() {
        return this.projectId;
    }
    @OutputExport(name="tags", type=List.class, parameters={DashboardTag.class})
    private Output</* @Nullable */ List<DashboardTag>> tags;

    public Output</* @Nullable */ List<DashboardTag>> getTags() {
        return this.tags;
    }

    public Dashboard(String name, DashboardArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotsitewise:Dashboard", name, args == null ? DashboardArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Dashboard(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotsitewise:Dashboard", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Dashboard get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Dashboard(name, id, options);
    }
}