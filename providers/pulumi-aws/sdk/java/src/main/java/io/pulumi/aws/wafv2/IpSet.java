// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.wafv2.IpSetArgs;
import io.pulumi.aws.wafv2.inputs.IpSetState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a WAFv2 IP Set Resource
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * WAFv2 IP Sets can be imported using `ID/name/scope`
 * 
 * ```sh
 *  $ pulumi import aws:wafv2/ipSet:IpSet example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc/example/REGIONAL
 * ```
 * 
 */
@ResourceType(type="aws:wafv2/ipSet:IpSet")
public class IpSet extends io.pulumi.resources.CustomResource {
    /**
     * Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless Inter-Domain Routing (CIDR) notation. AWS WAF supports all address ranges for IP versions IPv4 and IPv6.
     * 
     */
    @Export(name="addresses", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> addresses;

    /**
     * @return Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless Inter-Domain Routing (CIDR) notation. AWS WAF supports all address ranges for IP versions IPv4 and IPv6.
     * 
     */
    public Output</* @Nullable */ List<String>> getAddresses() {
        return this.addresses;
    }
    /**
     * The Amazon Resource Name (ARN) that identifies the cluster.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) that identifies the cluster.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A friendly description of the IP set.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A friendly description of the IP set.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Specify IPV4 or IPV6. Valid values are `IPV4` or `IPV6`.
     * 
     */
    @Export(name="ipAddressVersion", type=String.class, parameters={})
    private Output<String> ipAddressVersion;

    /**
     * @return Specify IPV4 or IPV6. Valid values are `IPV4` or `IPV6`.
     * 
     */
    public Output<String> getIpAddressVersion() {
        return this.ipAddressVersion;
    }
    @Export(name="lockToken", type=String.class, parameters={})
    private Output<String> lockToken;

    public Output<String> getLockToken() {
        return this.lockToken;
    }
    /**
     * A friendly name of the IP set.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A friendly name of the IP set.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the Region US East (N. Virginia).
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output<String> scope;

    /**
     * @return Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the Region US East (N. Virginia).
     * 
     */
    public Output<String> getScope() {
        return this.scope;
    }
    /**
     * An array of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return An array of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(IpSetArgs.Builder a);
    }
    private static io.pulumi.aws.wafv2.IpSetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.wafv2.IpSetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public IpSet(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IpSet(String name) {
        this(name, IpSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IpSet(String name, IpSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IpSet(String name, IpSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafv2/ipSet:IpSet", name, args == null ? IpSetArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private IpSet(String name, Output<String> id, @Nullable IpSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafv2/ipSet:IpSet", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static IpSet get(String name, Output<String> id, @Nullable IpSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IpSet(name, id, state, options);
    }
}
