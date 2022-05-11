// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.guestconfiguration;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.guestconfiguration.GuestConfigurationHCRPAssignmentArgs;
import com.pulumi.azurenative.guestconfiguration.outputs.GuestConfigurationAssignmentPropertiesResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Guest configuration assignment is an association between a machine and guest configuration.
 * API Version: 2020-06-25.
 * 
 * ## Example Usage
 * ### Create or update guest configuration assignment
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var guestConfigurationHCRPAssignment = new GuestConfigurationHCRPAssignment(&#34;guestConfigurationHCRPAssignment&#34;, GuestConfigurationHCRPAssignmentArgs.builder()        
 *             .guestConfigurationAssignmentName(&#34;WhitelistedApplication&#34;)
 *             .location(&#34;westcentralus&#34;)
 *             .machineName(&#34;myMachineName&#34;)
 *             .name(&#34;WhitelistedApplication&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;context&#34;, &#34;Azure policy&#34;),
 *                 Map.entry(&#34;guestConfiguration&#34;, Map.ofEntries(
 *                     Map.entry(&#34;assignmentType&#34;, &#34;ApplyAndAutoCorrect&#34;),
 *                     Map.entry(&#34;configurationParameter&#34;, Map.ofEntries(
 *                         Map.entry(&#34;name&#34;, &#34;[InstalledApplication]bwhitelistedapp;Name&#34;),
 *                         Map.entry(&#34;value&#34;, &#34;NotePad,sql&#34;)
 *                     )),
 *                     Map.entry(&#34;contentHash&#34;, &#34;123contenthash&#34;),
 *                     Map.entry(&#34;contentUri&#34;, &#34;https://thisisfake/pacakge&#34;),
 *                     Map.entry(&#34;name&#34;, &#34;WhitelistedApplication&#34;),
 *                     Map.entry(&#34;version&#34;, &#34;1.*&#34;)
 *                 ))
 *             ))
 *             .resourceGroupName(&#34;myResourceGroupName&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:guestconfiguration:GuestConfigurationHCRPAssignment WhitelistedApplication /subscriptions/mysubscriptionid/resourceGroups/myResourceGroupName/providers/HybridRP.Compute/virtualMachines/myvm/providers/Microsoft.GuestConfiguration/guestConfigurationAssignments/WhitelistedApplication 
 * ```
 * 
 */
@ResourceType(type="azure-native:guestconfiguration:GuestConfigurationHCRPAssignment")
public class GuestConfigurationHCRPAssignment extends com.pulumi.resources.CustomResource {
    /**
     * Region where the VM is located.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Region where the VM is located.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * Name of the guest configuration assignment.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Name of the guest configuration assignment.
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    /**
     * Properties of the Guest configuration assignment.
     * 
     */
    @Export(name="properties", type=GuestConfigurationAssignmentPropertiesResponse.class, parameters={})
    private Output<GuestConfigurationAssignmentPropertiesResponse> properties;

    /**
     * @return Properties of the Guest configuration assignment.
     * 
     */
    public Output<GuestConfigurationAssignmentPropertiesResponse> properties() {
        return this.properties;
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GuestConfigurationHCRPAssignment(String name) {
        this(name, GuestConfigurationHCRPAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GuestConfigurationHCRPAssignment(String name, GuestConfigurationHCRPAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GuestConfigurationHCRPAssignment(String name, GuestConfigurationHCRPAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:guestconfiguration:GuestConfigurationHCRPAssignment", name, args == null ? GuestConfigurationHCRPAssignmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GuestConfigurationHCRPAssignment(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:guestconfiguration:GuestConfigurationHCRPAssignment", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:guestconfiguration/v20181120:GuestConfigurationHCRPAssignment").build()),
                Output.of(Alias.builder().type("azure-native:guestconfiguration/v20200625:GuestConfigurationHCRPAssignment").build()),
                Output.of(Alias.builder().type("azure-native:guestconfiguration/v20210125:GuestConfigurationHCRPAssignment").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static GuestConfigurationHCRPAssignment get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GuestConfigurationHCRPAssignment(name, id, options);
    }
}
