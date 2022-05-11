// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.automation.HybridRunbookWorkerGroupArgs;
import com.pulumi.azurenative.automation.outputs.HybridRunbookWorkerLegacyResponse;
import com.pulumi.azurenative.automation.outputs.RunAsCredentialAssociationPropertyResponse;
import com.pulumi.azurenative.automation.outputs.SystemDataResponse;
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
 * Definition of hybrid runbook worker group.
 * API Version: 2021-06-22.
 * 
 * ## Example Usage
 * ### Create a hybrid worker group
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
 *         var hybridRunbookWorkerGroup = new HybridRunbookWorkerGroup(&#34;hybridRunbookWorkerGroup&#34;, HybridRunbookWorkerGroupArgs.builder()        
 *             .automationAccountName(&#34;testaccount&#34;)
 *             .credential(Map.of(&#34;name&#34;, &#34;myRunAsCredentialName&#34;))
 *             .hybridRunbookWorkerGroupName(&#34;TestHybridGroup&#34;)
 *             .resourceGroupName(&#34;rg&#34;)
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
 * $ pulumi import azure-native:automation:HybridRunbookWorkerGroup TestHybridGroup /subscriptions/subid/resourceGroups/rg/providers/Microsoft.Automation/automationAccounts/testaccount/hybridRunbookWorkerGroups/TestHybridGroup 
 * ```
 * 
 */
@ResourceType(type="azure-native:automation:HybridRunbookWorkerGroup")
public class HybridRunbookWorkerGroup extends com.pulumi.resources.CustomResource {
    /**
     * Sets the credential of a worker group.
     * 
     */
    @Export(name="credential", type=RunAsCredentialAssociationPropertyResponse.class, parameters={})
    private Output</* @Nullable */ RunAsCredentialAssociationPropertyResponse> credential;

    /**
     * @return Sets the credential of a worker group.
     * 
     */
    public Output<Optional<RunAsCredentialAssociationPropertyResponse>> credential() {
        return Codegen.optional(this.credential);
    }
    /**
     * Type of the HybridWorkerGroup.
     * 
     */
    @Export(name="groupType", type=String.class, parameters={})
    private Output</* @Nullable */ String> groupType;

    /**
     * @return Type of the HybridWorkerGroup.
     * 
     */
    public Output<Optional<String>> groupType() {
        return Codegen.optional(this.groupType);
    }
    /**
     * Gets or sets the list of hybrid runbook workers.
     * 
     */
    @Export(name="hybridRunbookWorkers", type=List.class, parameters={HybridRunbookWorkerLegacyResponse.class})
    private Output</* @Nullable */ List<HybridRunbookWorkerLegacyResponse>> hybridRunbookWorkers;

    /**
     * @return Gets or sets the list of hybrid runbook workers.
     * 
     */
    public Output<Optional<List<HybridRunbookWorkerLegacyResponse>>> hybridRunbookWorkers() {
        return Codegen.optional(this.hybridRunbookWorkers);
    }
    /**
     * Gets or sets the name of the group.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Gets or sets the name of the group.
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    /**
     * Resource system metadata.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Resource system metadata.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
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
    public HybridRunbookWorkerGroup(String name) {
        this(name, HybridRunbookWorkerGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HybridRunbookWorkerGroup(String name, HybridRunbookWorkerGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HybridRunbookWorkerGroup(String name, HybridRunbookWorkerGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:HybridRunbookWorkerGroup", name, args == null ? HybridRunbookWorkerGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HybridRunbookWorkerGroup(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:HybridRunbookWorkerGroup", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:automation/v20210622:HybridRunbookWorkerGroup").build())
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
    public static HybridRunbookWorkerGroup get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HybridRunbookWorkerGroup(name, id, options);
    }
}
