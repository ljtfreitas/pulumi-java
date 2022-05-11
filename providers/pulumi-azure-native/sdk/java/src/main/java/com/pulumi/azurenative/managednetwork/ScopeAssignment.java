// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.managednetwork;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.managednetwork.ScopeAssignmentArgs;
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
 * The Managed Network resource
 * API Version: 2019-06-01-preview.
 * 
 * ## Example Usage
 * ### ScopeAssignmentsPut
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
 *         var scopeAssignment = new ScopeAssignment(&#34;scopeAssignment&#34;, ScopeAssignmentArgs.builder()        
 *             .assignedManagedNetwork(&#34;/subscriptions/subscriptionA/resourceGroups/myResourceGroup/providers/Microsoft.ManagedNetwork/managedNetworks/myManagedNetwork&#34;)
 *             .scope(&#34;subscriptions/subscriptionC&#34;)
 *             .scopeAssignmentName(&#34;subscriptionCAssignment&#34;)
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
 * $ pulumi import azure-native:managednetwork:ScopeAssignment subscriptionCAssignment /subscriptions/subscriptionC/providers/Microsoft.ManagedNetwork/scopeAssignments/subscriptionCAssignment 
 * ```
 * 
 */
@ResourceType(type="azure-native:managednetwork:ScopeAssignment")
public class ScopeAssignment extends com.pulumi.resources.CustomResource {
    /**
     * The managed network ID with scope will be assigned to.
     * 
     */
    @Export(name="assignedManagedNetwork", type=String.class, parameters={})
    private Output</* @Nullable */ String> assignedManagedNetwork;

    /**
     * @return The managed network ID with scope will be assigned to.
     * 
     */
    public Output<Optional<String>> assignedManagedNetwork() {
        return Codegen.optional(this.assignedManagedNetwork);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
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
    public Output<String> name() {
        return this.name;
    }
    /**
     * Provisioning state of the ManagedNetwork resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the ManagedNetwork resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
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
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ScopeAssignment(String name) {
        this(name, ScopeAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ScopeAssignment(String name, ScopeAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ScopeAssignment(String name, ScopeAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:managednetwork:ScopeAssignment", name, args == null ? ScopeAssignmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ScopeAssignment(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:managednetwork:ScopeAssignment", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:managednetwork/v20190601preview:ScopeAssignment").build())
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
    public static ScopeAssignment get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ScopeAssignment(name, id, options);
    }
}
