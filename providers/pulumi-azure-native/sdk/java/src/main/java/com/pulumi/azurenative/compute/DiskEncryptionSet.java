// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.compute.DiskEncryptionSetArgs;
import com.pulumi.azurenative.compute.outputs.EncryptionSetIdentityResponse;
import com.pulumi.azurenative.compute.outputs.KeyForDiskEncryptionSetResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * disk encryption set resource.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * ### Create a disk encryption set with key vault from a different subscription.
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
 *         var diskEncryptionSet = new DiskEncryptionSet(&#34;diskEncryptionSet&#34;, DiskEncryptionSetArgs.builder()        
 *             .activeKey(Map.of(&#34;keyUrl&#34;, &#34;https://myvaultdifferentsub.vault-int.azure-int.net/keys/{key}&#34;))
 *             .diskEncryptionSetName(&#34;myDiskEncryptionSet&#34;)
 *             .encryptionType(&#34;EncryptionAtRestWithCustomerKey&#34;)
 *             .identity(Map.of(&#34;type&#34;, &#34;SystemAssigned&#34;))
 *             .location(&#34;West US&#34;)
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create a disk encryption set.
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
 *         var diskEncryptionSet = new DiskEncryptionSet(&#34;diskEncryptionSet&#34;, DiskEncryptionSetArgs.builder()        
 *             .activeKey(Map.ofEntries(
 *                 Map.entry(&#34;keyUrl&#34;, &#34;https://myvmvault.vault-int.azure-int.net/keys/{key}&#34;),
 *                 Map.entry(&#34;sourceVault&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.KeyVault/vaults/myVMVault&#34;))
 *             ))
 *             .diskEncryptionSetName(&#34;myDiskEncryptionSet&#34;)
 *             .encryptionType(&#34;EncryptionAtRestWithCustomerKey&#34;)
 *             .identity(Map.of(&#34;type&#34;, &#34;SystemAssigned&#34;))
 *             .location(&#34;West US&#34;)
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
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
 * $ pulumi import azure-native:compute:DiskEncryptionSet myDiskEncryptionSet /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/diskEncryptionSets/{diskEncryptionSetName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:compute:DiskEncryptionSet")
public class DiskEncryptionSet extends com.pulumi.resources.CustomResource {
    /**
     * The key vault key which is currently used by this disk encryption set.
     * 
     */
    @Export(name="activeKey", type=KeyForDiskEncryptionSetResponse.class, parameters={})
    private Output</* @Nullable */ KeyForDiskEncryptionSetResponse> activeKey;

    /**
     * @return The key vault key which is currently used by this disk encryption set.
     * 
     */
    public Output<Optional<KeyForDiskEncryptionSetResponse>> activeKey() {
        return Codegen.optional(this.activeKey);
    }
    /**
     * The type of key used to encrypt the data of the disk.
     * 
     */
    @Export(name="encryptionType", type=String.class, parameters={})
    private Output</* @Nullable */ String> encryptionType;

    /**
     * @return The type of key used to encrypt the data of the disk.
     * 
     */
    public Output<Optional<String>> encryptionType() {
        return Codegen.optional(this.encryptionType);
    }
    /**
     * The managed identity for the disk encryption set. It should be given permission on the key vault before it can be used to encrypt disks.
     * 
     */
    @Export(name="identity", type=EncryptionSetIdentityResponse.class, parameters={})
    private Output</* @Nullable */ EncryptionSetIdentityResponse> identity;

    /**
     * @return The managed identity for the disk encryption set. It should be given permission on the key vault before it can be used to encrypt disks.
     * 
     */
    public Output<Optional<EncryptionSetIdentityResponse>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * The time when the active key of this disk encryption set was updated.
     * 
     */
    @Export(name="lastKeyRotationTimestamp", type=String.class, parameters={})
    private Output<String> lastKeyRotationTimestamp;

    /**
     * @return The time when the active key of this disk encryption set was updated.
     * 
     */
    public Output<String> lastKeyRotationTimestamp() {
        return this.lastKeyRotationTimestamp;
    }
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> location() {
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
    public Output<String> name() {
        return this.name;
    }
    /**
     * A readonly collection of key vault keys previously used by this disk encryption set while a key rotation is in progress. It will be empty if there is no ongoing key rotation.
     * 
     */
    @Export(name="previousKeys", type=List.class, parameters={KeyForDiskEncryptionSetResponse.class})
    private Output<List<KeyForDiskEncryptionSetResponse>> previousKeys;

    /**
     * @return A readonly collection of key vault keys previously used by this disk encryption set while a key rotation is in progress. It will be empty if there is no ongoing key rotation.
     * 
     */
    public Output<List<KeyForDiskEncryptionSetResponse>> previousKeys() {
        return this.previousKeys;
    }
    /**
     * The disk encryption set provisioning state.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The disk encryption set provisioning state.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Set this flag to true to enable auto-updating of this disk encryption set to the latest key version.
     * 
     */
    @Export(name="rotationToLatestKeyVersionEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> rotationToLatestKeyVersionEnabled;

    /**
     * @return Set this flag to true to enable auto-updating of this disk encryption set to the latest key version.
     * 
     */
    public Output<Optional<Boolean>> rotationToLatestKeyVersionEnabled() {
        return Codegen.optional(this.rotationToLatestKeyVersionEnabled);
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
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
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
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DiskEncryptionSet(String name) {
        this(name, DiskEncryptionSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DiskEncryptionSet(String name, DiskEncryptionSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DiskEncryptionSet(String name, DiskEncryptionSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:DiskEncryptionSet", name, args == null ? DiskEncryptionSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DiskEncryptionSet(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:DiskEncryptionSet", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:compute/v20190701:DiskEncryptionSet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20191101:DiskEncryptionSet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20200501:DiskEncryptionSet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20200630:DiskEncryptionSet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20200930:DiskEncryptionSet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20201201:DiskEncryptionSet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210401:DiskEncryptionSet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210801:DiskEncryptionSet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20211201:DiskEncryptionSet").build())
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
    public static DiskEncryptionSet get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DiskEncryptionSet(name, id, options);
    }
}
