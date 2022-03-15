// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.PrefixListArgs;
import io.pulumi.awsnative.ec2.enums.PrefixListAddressFamily;
import io.pulumi.awsnative.ec2.outputs.PrefixListEntry;
import io.pulumi.awsnative.ec2.outputs.PrefixListTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema of AWS::EC2::PrefixList Type
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:ec2:PrefixList")
public class PrefixList extends io.pulumi.resources.CustomResource {
    /**
     * Ip Version of Prefix List.
     * 
     */
    @Export(name="addressFamily", type=PrefixListAddressFamily.class, parameters={})
    private Output<PrefixListAddressFamily> addressFamily;

    /**
     * @return Ip Version of Prefix List.
     * 
     */
    public Output<PrefixListAddressFamily> getAddressFamily() {
        return this.addressFamily;
    }
    /**
     * The Amazon Resource Name (ARN) of the Prefix List.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the Prefix List.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Entries of Prefix List.
     * 
     */
    @Export(name="entries", type=List.class, parameters={PrefixListEntry.class})
    private Output</* @Nullable */ List<PrefixListEntry>> entries;

    /**
     * @return Entries of Prefix List.
     * 
     */
    public Output</* @Nullable */ List<PrefixListEntry>> getEntries() {
        return this.entries;
    }
    /**
     * Max Entries of Prefix List.
     * 
     */
    @Export(name="maxEntries", type=Integer.class, parameters={})
    private Output<Integer> maxEntries;

    /**
     * @return Max Entries of Prefix List.
     * 
     */
    public Output<Integer> getMaxEntries() {
        return this.maxEntries;
    }
    /**
     * Owner Id of Prefix List.
     * 
     */
    @Export(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return Owner Id of Prefix List.
     * 
     */
    public Output<String> getOwnerId() {
        return this.ownerId;
    }
    /**
     * Id of Prefix List.
     * 
     */
    @Export(name="prefixListId", type=String.class, parameters={})
    private Output<String> prefixListId;

    /**
     * @return Id of Prefix List.
     * 
     */
    public Output<String> getPrefixListId() {
        return this.prefixListId;
    }
    /**
     * Name of Prefix List.
     * 
     */
    @Export(name="prefixListName", type=String.class, parameters={})
    private Output<String> prefixListName;

    /**
     * @return Name of Prefix List.
     * 
     */
    public Output<String> getPrefixListName() {
        return this.prefixListName;
    }
    /**
     * Tags for Prefix List
     * 
     */
    @Export(name="tags", type=List.class, parameters={PrefixListTag.class})
    private Output</* @Nullable */ List<PrefixListTag>> tags;

    /**
     * @return Tags for Prefix List
     * 
     */
    public Output</* @Nullable */ List<PrefixListTag>> getTags() {
        return this.tags;
    }
    /**
     * Version of Prefix List.
     * 
     */
    @Export(name="version", type=Integer.class, parameters={})
    private Output<Integer> version;

    /**
     * @return Version of Prefix List.
     * 
     */
    public Output<Integer> getVersion() {
        return this.version;
    }

    public interface BuilderApplicator {
        public void apply(PrefixListArgs.Builder a);
    }
    private static io.pulumi.awsnative.ec2.PrefixListArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.ec2.PrefixListArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public PrefixList(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrefixList(String name) {
        this(name, PrefixListArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrefixList(String name, PrefixListArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrefixList(String name, PrefixListArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:PrefixList", name, args == null ? PrefixListArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private PrefixList(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:PrefixList", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static PrefixList get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrefixList(name, id, options);
    }
}
