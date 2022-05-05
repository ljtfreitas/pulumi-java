// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.ManagedPrefixListArgs;
import com.pulumi.aws.ec2.inputs.ManagedPrefixListState;
import com.pulumi.aws.ec2.outputs.ManagedPrefixListEntry;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * Basic usage
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
 *         var example = new ManagedPrefixList(&#34;example&#34;, ManagedPrefixListArgs.builder()        
 *             .addressFamily(&#34;IPv4&#34;)
 *             .maxEntries(5)
 *             .entries(            
 *                 ManagedPrefixListEntry.builder()
 *                     .cidr(aws_vpc.getExample().getCidr_block())
 *                     .description(&#34;Primary&#34;)
 *                     .build(),
 *                 ManagedPrefixListEntry.builder()
 *                     .cidr(aws_vpc_ipv4_cidr_block_association.getExample().getCidr_block())
 *                     .description(&#34;Secondary&#34;)
 *                     .build())
 *             .tags(Map.of(&#34;Env&#34;, &#34;live&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Prefix Lists can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/managedPrefixList:ManagedPrefixList default pl-0570a1d2d725c16be
 * ```
 * 
 */
@ResourceType(type="aws:ec2/managedPrefixList:ManagedPrefixList")
public class ManagedPrefixList extends com.pulumi.resources.CustomResource {
    /**
     * Address family (`IPv4` or `IPv6`) of this prefix list.
     * 
     */
    @Export(name="addressFamily", type=String.class, parameters={})
    private Output<String> addressFamily;

    /**
     * @return Address family (`IPv4` or `IPv6`) of this prefix list.
     * 
     */
    public Output<String> addressFamily() {
        return this.addressFamily;
    }
    /**
     * ARN of the prefix list.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the prefix list.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Configuration block for prefix list entry. Detailed below. Different entries may have overlapping CIDR blocks, but a particular CIDR should not be duplicated.
     * 
     */
    @Export(name="entries", type=List.class, parameters={ManagedPrefixListEntry.class})
    private Output<List<ManagedPrefixListEntry>> entries;

    /**
     * @return Configuration block for prefix list entry. Detailed below. Different entries may have overlapping CIDR blocks, but a particular CIDR should not be duplicated.
     * 
     */
    public Output<List<ManagedPrefixListEntry>> entries() {
        return this.entries;
    }
    /**
     * Maximum number of entries that this prefix list can contain.
     * 
     */
    @Export(name="maxEntries", type=Integer.class, parameters={})
    private Output<Integer> maxEntries;

    /**
     * @return Maximum number of entries that this prefix list can contain.
     * 
     */
    public Output<Integer> maxEntries() {
        return this.maxEntries;
    }
    /**
     * Name of this resource. The name must not start with `com.amazonaws`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of this resource. The name must not start with `com.amazonaws`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * ID of the AWS account that owns this prefix list.
     * 
     */
    @Export(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return ID of the AWS account that owns this prefix list.
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    /**
     * Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Latest version of this prefix list.
     * 
     */
    @Export(name="version", type=Integer.class, parameters={})
    private Output<Integer> version;

    /**
     * @return Latest version of this prefix list.
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedPrefixList(String name) {
        this(name, ManagedPrefixListArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedPrefixList(String name, ManagedPrefixListArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedPrefixList(String name, ManagedPrefixListArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/managedPrefixList:ManagedPrefixList", name, args == null ? ManagedPrefixListArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ManagedPrefixList(String name, Output<String> id, @Nullable ManagedPrefixListState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/managedPrefixList:ManagedPrefixList", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ManagedPrefixList get(String name, Output<String> id, @Nullable ManagedPrefixListState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagedPrefixList(name, id, state, options);
    }
}
