// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.netapp.BackupPolicyArgs;
import io.pulumi.azurenative.netapp.outputs.VolumeBackupsResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:netapp:BackupPolicy")
public class BackupPolicy extends io.pulumi.resources.CustomResource {
    @OutputExport(name="dailyBackupsToKeep", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> dailyBackupsToKeep;

    public Output</* @Nullable */ Integer> getDailyBackupsToKeep() {
        return this.dailyBackupsToKeep;
    }
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="monthlyBackupsToKeep", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> monthlyBackupsToKeep;

    public Output</* @Nullable */ Integer> getMonthlyBackupsToKeep() {
        return this.monthlyBackupsToKeep;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="volumeBackups", type=List.class, parameters={VolumeBackupsResponse.class})
    private Output</* @Nullable */ List<VolumeBackupsResponse>> volumeBackups;

    public Output</* @Nullable */ List<VolumeBackupsResponse>> getVolumeBackups() {
        return this.volumeBackups;
    }
    @OutputExport(name="volumesAssigned", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> volumesAssigned;

    public Output</* @Nullable */ Integer> getVolumesAssigned() {
        return this.volumesAssigned;
    }
    @OutputExport(name="weeklyBackupsToKeep", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> weeklyBackupsToKeep;

    public Output</* @Nullable */ Integer> getWeeklyBackupsToKeep() {
        return this.weeklyBackupsToKeep;
    }
    @OutputExport(name="yearlyBackupsToKeep", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> yearlyBackupsToKeep;

    public Output</* @Nullable */ Integer> getYearlyBackupsToKeep() {
        return this.yearlyBackupsToKeep;
    }

    public BackupPolicy(String name, BackupPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:netapp:BackupPolicy", name, args == null ? BackupPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private BackupPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:netapp:BackupPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:netapp/v20200501:BackupPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20200601:BackupPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20200701:BackupPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20200801:BackupPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20200901:BackupPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20201101:BackupPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20201201:BackupPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20210201:BackupPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20210401:BackupPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20210401preview:BackupPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20210601:BackupPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20210801:BackupPolicy").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static BackupPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BackupPolicy(name, id, options);
    }
}