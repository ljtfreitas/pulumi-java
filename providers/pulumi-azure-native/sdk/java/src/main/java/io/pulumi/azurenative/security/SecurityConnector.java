// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.security.SecurityConnectorArgs;
import io.pulumi.azurenative.security.outputs.CspmMonitorAwsOfferingResponse;
import io.pulumi.azurenative.security.outputs.DefenderForContainersAwsOfferingResponse;
import io.pulumi.azurenative.security.outputs.DefenderForServersAwsOfferingResponse;
import io.pulumi.azurenative.security.outputs.SecurityConnectorPropertiesResponseOrganizationalData;
import io.pulumi.azurenative.security.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The security connector resource.
 * API Version: 2021-07-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:security:SecurityConnector exampleSecurityConnectorName /subscriptions/a5caac9c-5c04-49af-b3d0-e204f40345d5/resourceGroups/exampleResourceGroup/providers/Microsoft.Security/securityConnectors/exampleSecurityConnectorName 
 * ```
 * 
 */
@ResourceType(type="azure-native:security:SecurityConnector")
public class SecurityConnector extends io.pulumi.resources.CustomResource {
    /**
     * The multi cloud resource's cloud name.
     * 
     */
    @Export(name="cloudName", type=String.class, parameters={})
    private Output</* @Nullable */ String> cloudName;

    /**
     * @return The multi cloud resource's cloud name.
     * 
     */
    public Output</* @Nullable */ String> getCloudName() {
        return this.cloudName;
    }
    /**
     * Entity tag is used for comparing two or more entities from the same requested resource.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Entity tag is used for comparing two or more entities from the same requested resource.
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * The multi cloud resource identifier (account id in case of AWS connector).
     * 
     */
    @Export(name="hierarchyIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> hierarchyIdentifier;

    /**
     * @return The multi cloud resource identifier (account id in case of AWS connector).
     * 
     */
    public Output</* @Nullable */ String> getHierarchyIdentifier() {
        return this.hierarchyIdentifier;
    }
    /**
     * Kind of the resource
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of the resource
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Location where the resource is stored
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Location where the resource is stored
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
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
     * A collection of offerings for the security connector.
     * 
     */
    @Export(name="offerings", type=List.class, parameters={Object.class})
    private Output</* @Nullable */ List<Object>> offerings;

    /**
     * @return A collection of offerings for the security connector.
     * 
     */
    public Output</* @Nullable */ List<Object>> getOfferings() {
        return this.offerings;
    }
    /**
     * The multi cloud account's organizational data
     * 
     */
    @Export(name="organizationalData", type=SecurityConnectorPropertiesResponseOrganizationalData.class, parameters={})
    private Output</* @Nullable */ SecurityConnectorPropertiesResponseOrganizationalData> organizationalData;

    /**
     * @return The multi cloud account's organizational data
     * 
     */
    public Output</* @Nullable */ SecurityConnectorPropertiesResponseOrganizationalData> getOrganizationalData() {
        return this.organizationalData;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * A list of key value pairs that describe the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A list of key value pairs that describe the resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
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

    public interface BuilderApplicator {
        public void apply(SecurityConnectorArgs.Builder a);
    }
    private static io.pulumi.azurenative.security.SecurityConnectorArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.security.SecurityConnectorArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SecurityConnector(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecurityConnector(String name) {
        this(name, SecurityConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecurityConnector(String name, SecurityConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecurityConnector(String name, SecurityConnectorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:security:SecurityConnector", name, args == null ? SecurityConnectorArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private SecurityConnector(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:security:SecurityConnector", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:security/v20210701preview:SecurityConnector").build())
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
    public static SecurityConnector get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SecurityConnector(name, id, options);
    }
}
