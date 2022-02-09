// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.bigtableadmin_v2.TableArgs;
import io.pulumi.googlenative.bigtableadmin_v2.outputs.RestoreInfoResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="google-native:bigtableadmin/v2:Table")
public class Table extends io.pulumi.resources.CustomResource {
    @OutputExport(name="clusterStates", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> clusterStates;

    public Output<Map<String,String>> getClusterStates() {
        return this.clusterStates;
    }
    @OutputExport(name="columnFamilies", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> columnFamilies;

    public Output<Map<String,String>> getColumnFamilies() {
        return this.columnFamilies;
    }
    @OutputExport(name="granularity", type=String.class, parameters={})
    private Output<String> granularity;

    public Output<String> getGranularity() {
        return this.granularity;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="restoreInfo", type=RestoreInfoResponse.class, parameters={})
    private Output<RestoreInfoResponse> restoreInfo;

    public Output<RestoreInfoResponse> getRestoreInfo() {
        return this.restoreInfo;
    }

    public Table(String name, TableArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:bigtableadmin/v2:Table", name, args == null ? TableArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Table(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:bigtableadmin/v2:Table", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Table get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Table(name, id, options);
    }
}