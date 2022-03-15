// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aad;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.aad.DomainServiceArgs;
import io.pulumi.azurenative.aad.outputs.DomainSecuritySettingsResponse;
import io.pulumi.azurenative.aad.outputs.LdapsSettingsResponse;
import io.pulumi.azurenative.aad.outputs.MigrationPropertiesResponse;
import io.pulumi.azurenative.aad.outputs.NotificationSettingsResponse;
import io.pulumi.azurenative.aad.outputs.ReplicaSetResponse;
import io.pulumi.azurenative.aad.outputs.ResourceForestSettingsResponse;
import io.pulumi.azurenative.aad.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Domain service.
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:aad:DomainService TestDomainService.com /subscriptions/1639790a-76a2-4ac4-98d9-8562f5dfcb4d/resourceGroups/TestResourceGroup/providers/Microsoft.AAD/DomainServices/TestDomainService.com 
 * ```
 * 
 */
@ResourceType(type="azure-native:aad:DomainService")
public class DomainService extends io.pulumi.resources.CustomResource {
    /**
     * Deployment Id
     * 
     */
    @Export(name="deploymentId", type=String.class, parameters={})
    private Output<String> deploymentId;

    /**
     * @return Deployment Id
     * 
     */
    public Output<String> getDeploymentId() {
        return this.deploymentId;
    }
    /**
     * Domain Configuration Type
     * 
     */
    @Export(name="domainConfigurationType", type=String.class, parameters={})
    private Output</* @Nullable */ String> domainConfigurationType;

    /**
     * @return Domain Configuration Type
     * 
     */
    public Output</* @Nullable */ String> getDomainConfigurationType() {
        return this.domainConfigurationType;
    }
    /**
     * The name of the Azure domain that the user would like to deploy Domain Services to.
     * 
     */
    @Export(name="domainName", type=String.class, parameters={})
    private Output</* @Nullable */ String> domainName;

    /**
     * @return The name of the Azure domain that the user would like to deploy Domain Services to.
     * 
     */
    public Output</* @Nullable */ String> getDomainName() {
        return this.domainName;
    }
    /**
     * DomainSecurity Settings
     * 
     */
    @Export(name="domainSecuritySettings", type=DomainSecuritySettingsResponse.class, parameters={})
    private Output</* @Nullable */ DomainSecuritySettingsResponse> domainSecuritySettings;

    /**
     * @return DomainSecurity Settings
     * 
     */
    public Output</* @Nullable */ DomainSecuritySettingsResponse> getDomainSecuritySettings() {
        return this.domainSecuritySettings;
    }
    /**
     * Resource etag
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Resource etag
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * Enabled or Disabled flag to turn on Group-based filtered sync
     * 
     */
    @Export(name="filteredSync", type=String.class, parameters={})
    private Output</* @Nullable */ String> filteredSync;

    /**
     * @return Enabled or Disabled flag to turn on Group-based filtered sync
     * 
     */
    public Output</* @Nullable */ String> getFilteredSync() {
        return this.filteredSync;
    }
    /**
     * Secure LDAP Settings
     * 
     */
    @Export(name="ldapsSettings", type=LdapsSettingsResponse.class, parameters={})
    private Output</* @Nullable */ LdapsSettingsResponse> ldapsSettings;

    /**
     * @return Secure LDAP Settings
     * 
     */
    public Output</* @Nullable */ LdapsSettingsResponse> getLdapsSettings() {
        return this.ldapsSettings;
    }
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Migration Properties
     * 
     */
    @Export(name="migrationProperties", type=MigrationPropertiesResponse.class, parameters={})
    private Output<MigrationPropertiesResponse> migrationProperties;

    /**
     * @return Migration Properties
     * 
     */
    public Output<MigrationPropertiesResponse> getMigrationProperties() {
        return this.migrationProperties;
    }
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Notification Settings
     * 
     */
    @Export(name="notificationSettings", type=NotificationSettingsResponse.class, parameters={})
    private Output</* @Nullable */ NotificationSettingsResponse> notificationSettings;

    /**
     * @return Notification Settings
     * 
     */
    public Output</* @Nullable */ NotificationSettingsResponse> getNotificationSettings() {
        return this.notificationSettings;
    }
    /**
     * the current deployment or provisioning state, which only appears in the response.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return the current deployment or provisioning state, which only appears in the response.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * List of ReplicaSets
     * 
     */
    @Export(name="replicaSets", type=List.class, parameters={ReplicaSetResponse.class})
    private Output</* @Nullable */ List<ReplicaSetResponse>> replicaSets;

    /**
     * @return List of ReplicaSets
     * 
     */
    public Output</* @Nullable */ List<ReplicaSetResponse>> getReplicaSets() {
        return this.replicaSets;
    }
    /**
     * Resource Forest Settings
     * 
     */
    @Export(name="resourceForestSettings", type=ResourceForestSettingsResponse.class, parameters={})
    private Output</* @Nullable */ ResourceForestSettingsResponse> resourceForestSettings;

    /**
     * @return Resource Forest Settings
     * 
     */
    public Output</* @Nullable */ ResourceForestSettingsResponse> getResourceForestSettings() {
        return this.resourceForestSettings;
    }
    /**
     * Sku Type
     * 
     */
    @Export(name="sku", type=String.class, parameters={})
    private Output</* @Nullable */ String> sku;

    /**
     * @return Sku Type
     * 
     */
    public Output</* @Nullable */ String> getSku() {
        return this.sku;
    }
    /**
     * SyncOwner ReplicaSet Id
     * 
     */
    @Export(name="syncOwner", type=String.class, parameters={})
    private Output<String> syncOwner;

    /**
     * @return SyncOwner ReplicaSet Id
     * 
     */
    public Output<String> getSyncOwner() {
        return this.syncOwner;
    }
    /**
     * The system meta data relating to this resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system meta data relating to this resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Azure Active Directory Tenant Id
     * 
     */
    @Export(name="tenantId", type=String.class, parameters={})
    private Output<String> tenantId;

    /**
     * @return Azure Active Directory Tenant Id
     * 
     */
    public Output<String> getTenantId() {
        return this.tenantId;
    }
    /**
     * Resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Data Model Version
     * 
     */
    @Export(name="version", type=Integer.class, parameters={})
    private Output<Integer> version;

    /**
     * @return Data Model Version
     * 
     */
    public Output<Integer> getVersion() {
        return this.version;
    }

    public interface BuilderApplicator {
        public void apply(DomainServiceArgs.Builder a);
    }
    private static io.pulumi.azurenative.aad.DomainServiceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.aad.DomainServiceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DomainService(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DomainService(String name) {
        this(name, DomainServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DomainService(String name, DomainServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DomainService(String name, DomainServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:aad:DomainService", name, args == null ? DomainServiceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private DomainService(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:aad:DomainService", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:aad/v20170101:DomainService").build()),
                Output.of(Alias.builder().setType("azure-native:aad/v20170601:DomainService").build()),
                Output.of(Alias.builder().setType("azure-native:aad/v20200101:DomainService").build()),
                Output.of(Alias.builder().setType("azure-native:aad/v20210301:DomainService").build()),
                Output.of(Alias.builder().setType("azure-native:aad/v20210501:DomainService").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DomainService get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DomainService(name, id, options);
    }
}
