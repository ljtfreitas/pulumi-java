// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.servicefabricmesh.ApplicationArgs;
import io.pulumi.azurenative.servicefabricmesh.outputs.DiagnosticsDescriptionResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.ServiceResourceDescriptionResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * This type describes an application resource.
 * API Version: 2018-09-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:servicefabricmesh:Application sampleApplication /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/sbz_demo/providers/Microsoft.ServiceFabricMesh/applications/sampleApplication 
 * ```
 * 
 */
@ResourceType(type="azure-native:servicefabricmesh:Application")
public class Application extends io.pulumi.resources.CustomResource {
    /**
     * Internal - used by Visual Studio to setup the debugging session on the local development environment.
     * 
     */
    @Export(name="debugParams", type=String.class, parameters={})
    private Output</* @Nullable */ String> debugParams;

    /**
     * @return Internal - used by Visual Studio to setup the debugging session on the local development environment.
     * 
     */
    public Output</* @Nullable */ String> getDebugParams() {
        return this.debugParams;
    }
    /**
     * User readable description of the application.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return User readable description of the application.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Describes the diagnostics definition and usage for an application resource.
     * 
     */
    @Export(name="diagnostics", type=DiagnosticsDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ DiagnosticsDescriptionResponse> diagnostics;

    /**
     * @return Describes the diagnostics definition and usage for an application resource.
     * 
     */
    public Output</* @Nullable */ DiagnosticsDescriptionResponse> getDiagnostics() {
        return this.diagnostics;
    }
    /**
     * Describes the health state of an application resource.
     * 
     */
    @Export(name="healthState", type=String.class, parameters={})
    private Output<String> healthState;

    /**
     * @return Describes the health state of an application resource.
     * 
     */
    public Output<String> getHealthState() {
        return this.healthState;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * State of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return State of the resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Names of the services in the application.
     * 
     */
    @Export(name="serviceNames", type=List.class, parameters={String.class})
    private Output<List<String>> serviceNames;

    /**
     * @return Names of the services in the application.
     * 
     */
    public Output<List<String>> getServiceNames() {
        return this.serviceNames;
    }
    /**
     * Describes the services in the application. This property is used to create or modify services of the application. On get only the name of the service is returned. The service description can be obtained by querying for the service resource.
     * 
     */
    @Export(name="services", type=List.class, parameters={ServiceResourceDescriptionResponse.class})
    private Output</* @Nullable */ List<ServiceResourceDescriptionResponse>> services;

    /**
     * @return Describes the services in the application. This property is used to create or modify services of the application. On get only the name of the service is returned. The service description can be obtained by querying for the service resource.
     * 
     */
    public Output</* @Nullable */ List<ServiceResourceDescriptionResponse>> getServices() {
        return this.services;
    }
    /**
     * Status of the application.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of the application.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * Gives additional information about the current status of the application.
     * 
     */
    @Export(name="statusDetails", type=String.class, parameters={})
    private Output<String> statusDetails;

    /**
     * @return Gives additional information about the current status of the application.
     * 
     */
    public Output<String> getStatusDetails() {
        return this.statusDetails;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * When the application's health state is not 'Ok', this additional details from service fabric Health Manager for the user to know why the application is marked unhealthy.
     * 
     */
    @Export(name="unhealthyEvaluation", type=String.class, parameters={})
    private Output<String> unhealthyEvaluation;

    /**
     * @return When the application's health state is not 'Ok', this additional details from service fabric Health Manager for the user to know why the application is marked unhealthy.
     * 
     */
    public Output<String> getUnhealthyEvaluation() {
        return this.unhealthyEvaluation;
    }

    public interface BuilderApplicator {
        public void apply(ApplicationArgs.Builder a);
    }
    private static io.pulumi.azurenative.servicefabricmesh.ApplicationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.servicefabricmesh.ApplicationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Application(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Application(String name) {
        this(name, ApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Application(String name, ApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Application(String name, ApplicationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicefabricmesh:Application", name, args == null ? ApplicationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Application(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicefabricmesh:Application", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:servicefabricmesh/v20180701preview:Application").build()),
                Output.of(Alias.builder().setType("azure-native:servicefabricmesh/v20180901preview:Application").build())
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
    public static Application get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Application(name, id, options);
    }
}
