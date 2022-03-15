// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databoxedge.CloudEdgeManagementRoleArgs;
import io.pulumi.azurenative.databoxedge.outputs.EdgeProfileResponse;
import io.pulumi.azurenative.databoxedge.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * CloudEdgeManagementRole role.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:databoxedge:CloudEdgeManagementRole IoTRole1 /subscriptions/4385cf00-2d3a-425a-832f-f4285b1c9dce/resourceGroups/GroupForEdgeAutomation/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/testedgedevice/roles/IoTRole1 
 * ```
 * 
 */
@ResourceType(type="azure-native:databoxedge:CloudEdgeManagementRole")
public class CloudEdgeManagementRole extends io.pulumi.resources.CustomResource {
    /**
     * Edge Profile of the resource
     * 
     */
    @Export(name="edgeProfile", type=EdgeProfileResponse.class, parameters={})
    private Output<EdgeProfileResponse> edgeProfile;

    /**
     * @return Edge Profile of the resource
     * 
     */
    public Output<EdgeProfileResponse> getEdgeProfile() {
        return this.edgeProfile;
    }
    /**
     * Role type.
     * Expected value is 'CloudEdgeManagement'.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Role type.
     * Expected value is 'CloudEdgeManagement'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Local Edge Management Status
     * 
     */
    @Export(name="localManagementStatus", type=String.class, parameters={})
    private Output<String> localManagementStatus;

    /**
     * @return Local Edge Management Status
     * 
     */
    public Output<String> getLocalManagementStatus() {
        return this.localManagementStatus;
    }
    /**
     * The object name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The object name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Role status.
     * 
     */
    @Export(name="roleStatus", type=String.class, parameters={})
    private Output<String> roleStatus;

    /**
     * @return Role status.
     * 
     */
    public Output<String> getRoleStatus() {
        return this.roleStatus;
    }
    /**
     * Role configured on ASE resource
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Role configured on ASE resource
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The hierarchical type of the object.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The hierarchical type of the object.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(CloudEdgeManagementRoleArgs.Builder a);
    }
    private static io.pulumi.azurenative.databoxedge.CloudEdgeManagementRoleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.databoxedge.CloudEdgeManagementRoleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public CloudEdgeManagementRole(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CloudEdgeManagementRole(String name) {
        this(name, CloudEdgeManagementRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CloudEdgeManagementRole(String name, CloudEdgeManagementRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CloudEdgeManagementRole(String name, CloudEdgeManagementRoleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:CloudEdgeManagementRole", name, makeArgs(args), makeResourceOptions(options, Output.empty()));
    }

    private CloudEdgeManagementRole(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:CloudEdgeManagementRole", name, null, makeResourceOptions(options, id));
    }

    private static CloudEdgeManagementRoleArgs makeArgs(CloudEdgeManagementRoleArgs args) {
        var builder = args == null ? CloudEdgeManagementRoleArgs.builder() : CloudEdgeManagementRoleArgs.builder(args);
        return builder
            .kind("CloudEdgeManagement")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:databoxedge/v20190301:CloudEdgeManagementRole").build()),
                Output.of(Alias.builder().setType("azure-native:databoxedge/v20190701:CloudEdgeManagementRole").build()),
                Output.of(Alias.builder().setType("azure-native:databoxedge/v20190801:CloudEdgeManagementRole").build()),
                Output.of(Alias.builder().setType("azure-native:databoxedge/v20200501preview:CloudEdgeManagementRole").build()),
                Output.of(Alias.builder().setType("azure-native:databoxedge/v20200901:CloudEdgeManagementRole").build()),
                Output.of(Alias.builder().setType("azure-native:databoxedge/v20200901preview:CloudEdgeManagementRole").build()),
                Output.of(Alias.builder().setType("azure-native:databoxedge/v20201201:CloudEdgeManagementRole").build()),
                Output.of(Alias.builder().setType("azure-native:databoxedge/v20210201:CloudEdgeManagementRole").build()),
                Output.of(Alias.builder().setType("azure-native:databoxedge/v20210201preview:CloudEdgeManagementRole").build()),
                Output.of(Alias.builder().setType("azure-native:databoxedge/v20210601:CloudEdgeManagementRole").build()),
                Output.of(Alias.builder().setType("azure-native:databoxedge/v20210601preview:CloudEdgeManagementRole").build())
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
    public static CloudEdgeManagementRole get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CloudEdgeManagementRole(name, id, options);
    }
}
