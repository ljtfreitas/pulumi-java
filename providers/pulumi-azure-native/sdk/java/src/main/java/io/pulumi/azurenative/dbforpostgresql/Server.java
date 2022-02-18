// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.dbforpostgresql.ServerArgs;
import io.pulumi.azurenative.dbforpostgresql.outputs.ResourceIdentityResponse;
import io.pulumi.azurenative.dbforpostgresql.outputs.ServerPrivateEndpointConnectionResponse;
import io.pulumi.azurenative.dbforpostgresql.outputs.SkuResponse;
import io.pulumi.azurenative.dbforpostgresql.outputs.StorageProfileResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Represents a server.
 * API Version: 2017-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:dbforpostgresql:Server targetserver /subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/testrg/providers/Microsoft.DBforPostgreSQL/servers/targetserver 
 * ```
 * 
 */
@ResourceType(type="azure-native:dbforpostgresql:Server")
public class Server extends io.pulumi.resources.CustomResource {
    /**
     * The administrator's login name of a server. Can only be specified when the server is being created (and is required for creation).
     * 
     */
    @OutputExport(name="administratorLogin", type=String.class, parameters={})
    private Output</* @Nullable */ String> administratorLogin;

    /**
     * @return The administrator's login name of a server. Can only be specified when the server is being created (and is required for creation).
     * 
     */
    public Output</* @Nullable */ String> getAdministratorLogin() {
        return this.administratorLogin;
    }
    /**
     * Status showing whether the server data encryption is enabled with customer-managed keys.
     * 
     */
    @OutputExport(name="byokEnforcement", type=String.class, parameters={})
    private Output<String> byokEnforcement;

    /**
     * @return Status showing whether the server data encryption is enabled with customer-managed keys.
     * 
     */
    public Output<String> getByokEnforcement() {
        return this.byokEnforcement;
    }
    /**
     * Earliest restore point creation time (ISO8601 format)
     * 
     */
    @OutputExport(name="earliestRestoreDate", type=String.class, parameters={})
    private Output</* @Nullable */ String> earliestRestoreDate;

    /**
     * @return Earliest restore point creation time (ISO8601 format)
     * 
     */
    public Output</* @Nullable */ String> getEarliestRestoreDate() {
        return this.earliestRestoreDate;
    }
    /**
     * The fully qualified domain name of a server.
     * 
     */
    @OutputExport(name="fullyQualifiedDomainName", type=String.class, parameters={})
    private Output</* @Nullable */ String> fullyQualifiedDomainName;

    /**
     * @return The fully qualified domain name of a server.
     * 
     */
    public Output</* @Nullable */ String> getFullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName;
    }
    /**
     * The Azure Active Directory identity of the server.
     * 
     */
    @OutputExport(name="identity", type=ResourceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ResourceIdentityResponse> identity;

    /**
     * @return The Azure Active Directory identity of the server.
     * 
     */
    public Output</* @Nullable */ ResourceIdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * Status showing whether the server enabled infrastructure encryption.
     * 
     */
    @OutputExport(name="infrastructureEncryption", type=String.class, parameters={})
    private Output</* @Nullable */ String> infrastructureEncryption;

    /**
     * @return Status showing whether the server enabled infrastructure encryption.
     * 
     */
    public Output</* @Nullable */ String> getInfrastructureEncryption() {
        return this.infrastructureEncryption;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The master server id of a replica server.
     * 
     */
    @OutputExport(name="masterServerId", type=String.class, parameters={})
    private Output</* @Nullable */ String> masterServerId;

    /**
     * @return The master server id of a replica server.
     * 
     */
    public Output</* @Nullable */ String> getMasterServerId() {
        return this.masterServerId;
    }
    /**
     * Enforce a minimal Tls version for the server.
     * 
     */
    @OutputExport(name="minimalTlsVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> minimalTlsVersion;

    /**
     * @return Enforce a minimal Tls version for the server.
     * 
     */
    public Output</* @Nullable */ String> getMinimalTlsVersion() {
        return this.minimalTlsVersion;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * List of private endpoint connections on a server
     * 
     */
    @OutputExport(name="privateEndpointConnections", type=List.class, parameters={ServerPrivateEndpointConnectionResponse.class})
    private Output<List<ServerPrivateEndpointConnectionResponse>> privateEndpointConnections;

    /**
     * @return List of private endpoint connections on a server
     * 
     */
    public Output<List<ServerPrivateEndpointConnectionResponse>> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * Whether or not public network access is allowed for this server. Value is optional but if passed in, must be 'Enabled' or 'Disabled'
     * 
     */
    @OutputExport(name="publicNetworkAccess", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicNetworkAccess;

    /**
     * @return Whether or not public network access is allowed for this server. Value is optional but if passed in, must be 'Enabled' or 'Disabled'
     * 
     */
    public Output</* @Nullable */ String> getPublicNetworkAccess() {
        return this.publicNetworkAccess;
    }
    /**
     * The maximum number of replicas that a master server can have.
     * 
     */
    @OutputExport(name="replicaCapacity", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> replicaCapacity;

    /**
     * @return The maximum number of replicas that a master server can have.
     * 
     */
    public Output</* @Nullable */ Integer> getReplicaCapacity() {
        return this.replicaCapacity;
    }
    /**
     * The replication role of the server.
     * 
     */
    @OutputExport(name="replicationRole", type=String.class, parameters={})
    private Output</* @Nullable */ String> replicationRole;

    /**
     * @return The replication role of the server.
     * 
     */
    public Output</* @Nullable */ String> getReplicationRole() {
        return this.replicationRole;
    }
    /**
     * The SKU (pricing tier) of the server.
     * 
     */
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return The SKU (pricing tier) of the server.
     * 
     */
    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Enable ssl enforcement or not when connect to server.
     * 
     */
    @OutputExport(name="sslEnforcement", type=String.class, parameters={})
    private Output</* @Nullable */ String> sslEnforcement;

    /**
     * @return Enable ssl enforcement or not when connect to server.
     * 
     */
    public Output</* @Nullable */ String> getSslEnforcement() {
        return this.sslEnforcement;
    }
    /**
     * Storage profile of a server.
     * 
     */
    @OutputExport(name="storageProfile", type=StorageProfileResponse.class, parameters={})
    private Output</* @Nullable */ StorageProfileResponse> storageProfile;

    /**
     * @return Storage profile of a server.
     * 
     */
    public Output</* @Nullable */ StorageProfileResponse> getStorageProfile() {
        return this.storageProfile;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * A state of a server that is visible to user.
     * 
     */
    @OutputExport(name="userVisibleState", type=String.class, parameters={})
    private Output</* @Nullable */ String> userVisibleState;

    /**
     * @return A state of a server that is visible to user.
     * 
     */
    public Output</* @Nullable */ String> getUserVisibleState() {
        return this.userVisibleState;
    }
    /**
     * Server version.
     * 
     */
    @OutputExport(name="version", type=String.class, parameters={})
    private Output</* @Nullable */ String> version;

    /**
     * @return Server version.
     * 
     */
    public Output</* @Nullable */ String> getVersion() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Server(String name, ServerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbforpostgresql:Server", name, args == null ? ServerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Server(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbforpostgresql:Server", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:dbforpostgresql/v20171201:Server").build()),
                Input.of(Alias.builder().setType("azure-native:dbforpostgresql/v20171201preview:Server").build())
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
    public static Server get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Server(name, id, options);
    }
}
