// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managedservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.managedservices.RegistrationDefinitionArgs;
import io.pulumi.azurenative.managedservices.outputs.PlanResponse;
import io.pulumi.azurenative.managedservices.outputs.RegistrationDefinitionPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Registration definition.
 * API Version: 2019-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:managedservices:RegistrationDefinition 26c128c2-fefa-4340-9bb1-6e081c90ada2 /subscriptions/0afefe50-734e-4610-8a82-a144ahf49dea/providers/Microsoft.ManagedServices/registrationDefinitions/26c128c2-fefa-4340-9bb1-6e081c90ada2 
 * ```
 * 
 */
@ResourceType(type="azure-native:managedservices:RegistrationDefinition")
public class RegistrationDefinition extends io.pulumi.resources.CustomResource {
    /**
     * Name of the registration definition.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the registration definition.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Plan details for the managed services.
     * 
     */
    @OutputExport(name="plan", type=PlanResponse.class, parameters={})
    private Output</* @Nullable */ PlanResponse> plan;

    /**
     * @return Plan details for the managed services.
     * 
     */
    public Output</* @Nullable */ PlanResponse> getPlan() {
        return this.plan;
    }
    /**
     * Properties of a registration definition.
     * 
     */
    @OutputExport(name="properties", type=RegistrationDefinitionPropertiesResponse.class, parameters={})
    private Output<RegistrationDefinitionPropertiesResponse> properties;

    /**
     * @return Properties of a registration definition.
     * 
     */
    public Output<RegistrationDefinitionPropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * Type of the resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegistrationDefinition(String name, RegistrationDefinitionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:managedservices:RegistrationDefinition", name, args == null ? RegistrationDefinitionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RegistrationDefinition(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:managedservices:RegistrationDefinition", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:managedservices/v20180601preview:RegistrationDefinition").build()),
                Input.of(Alias.builder().setType("azure-native:managedservices/v20190401preview:RegistrationDefinition").build()),
                Input.of(Alias.builder().setType("azure-native:managedservices/v20190601:RegistrationDefinition").build()),
                Input.of(Alias.builder().setType("azure-native:managedservices/v20190901:RegistrationDefinition").build()),
                Input.of(Alias.builder().setType("azure-native:managedservices/v20200201preview:RegistrationDefinition").build())
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
    public static RegistrationDefinition get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RegistrationDefinition(name, id, options);
    }
}
