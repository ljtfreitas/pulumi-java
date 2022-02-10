// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.DatabaseBlobAuditingPolicyArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:sql:DatabaseBlobAuditingPolicy")
public class DatabaseBlobAuditingPolicy extends io.pulumi.resources.CustomResource {
    @OutputExport(name="auditActionsAndGroups", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> auditActionsAndGroups;

    public Output</* @Nullable */ List<String>> getAuditActionsAndGroups() {
        return this.auditActionsAndGroups;
    }
    @OutputExport(name="isAzureMonitorTargetEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isAzureMonitorTargetEnabled;

    public Output</* @Nullable */ Boolean> getIsAzureMonitorTargetEnabled() {
        return this.isAzureMonitorTargetEnabled;
    }
    @OutputExport(name="isStorageSecondaryKeyInUse", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isStorageSecondaryKeyInUse;

    public Output</* @Nullable */ Boolean> getIsStorageSecondaryKeyInUse() {
        return this.isStorageSecondaryKeyInUse;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="queueDelayMs", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> queueDelayMs;

    public Output</* @Nullable */ Integer> getQueueDelayMs() {
        return this.queueDelayMs;
    }
    @OutputExport(name="retentionDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> retentionDays;

    public Output</* @Nullable */ Integer> getRetentionDays() {
        return this.retentionDays;
    }
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    public Output<String> getState() {
        return this.state;
    }
    @OutputExport(name="storageAccountSubscriptionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageAccountSubscriptionId;

    public Output</* @Nullable */ String> getStorageAccountSubscriptionId() {
        return this.storageAccountSubscriptionId;
    }
    @OutputExport(name="storageEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageEndpoint;

    public Output</* @Nullable */ String> getStorageEndpoint() {
        return this.storageEndpoint;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public DatabaseBlobAuditingPolicy(String name, DatabaseBlobAuditingPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:DatabaseBlobAuditingPolicy", name, args == null ? DatabaseBlobAuditingPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DatabaseBlobAuditingPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:DatabaseBlobAuditingPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:sql/v20150501preview:DatabaseBlobAuditingPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20170301preview:DatabaseBlobAuditingPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200202preview:DatabaseBlobAuditingPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200801preview:DatabaseBlobAuditingPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20201101preview:DatabaseBlobAuditingPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210201preview:DatabaseBlobAuditingPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210501preview:DatabaseBlobAuditingPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210801preview:DatabaseBlobAuditingPolicy").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static DatabaseBlobAuditingPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DatabaseBlobAuditingPolicy(name, id, options);
    }
}