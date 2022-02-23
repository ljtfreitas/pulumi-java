// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lightsail;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.lightsail.InstanceArgs;
import io.pulumi.aws.lightsail.inputs.InstanceState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Lightsail Instance. Amazon Lightsail is a service to provide easy virtual private servers
 * with custom software already setup. See [What is Amazon Lightsail?](https://lightsail.aws.amazon.com/ls/docs/getting-started/article/what-is-amazon-lightsail)
 * for more information.
 * 
 * > **Note:** Lightsail is currently only supported in a limited number of AWS Regions, please see ["Regions and Availability Zones in Amazon Lightsail"](https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail) for more details
 * 
 * ## Example Usage
 * ## Availability Zones
 * 
 * Lightsail currently supports the following Availability Zones (e.g., `us-east-1a`):
 * 
 * - `ap-northeast-1{a,c,d}`
 * - `ap-northeast-2{a,c}`
 * - `ap-south-1{a,b}`
 * - `ap-southeast-1{a,b,c}`
 * - `ap-southeast-2{a,b,c}`
 * - `ca-central-1{a,b}`
 * - `eu-central-1{a,b,c}`
 * - `eu-west-1{a,b,c}`
 * - `eu-west-2{a,b,c}`
 * - `eu-west-3{a,b,c}`
 * - `us-east-1{a,b,c,d,e,f}`
 * - `us-east-2{a,b,c}`
 * - `us-west-2{a,b,c}`
 * 
 * ## Bundles
 * 
 * Lightsail currently supports the following Bundle IDs (e.g., an instance in `ap-northeast-1` would use `small_2_0`):
 * 
 * ### Prefix
 * 
 * A Bundle ID starts with one of the below size prefixes:
 * 
 * - `nano_`
 * - `micro_`
 * - `small_`
 * - `medium_`
 * - `large_`
 * - `xlarge_`
 * - `2xlarge_`
 * 
 * ### Suffix
 * 
 * A Bundle ID ends with one of the following suffixes depending on Availability Zone:
 * 
 * - ap-northeast-1: `2_0`
 * - ap-northeast-2: `2_0`
 * - ap-south-1: `2_1`
 * - ap-southeast-1: `2_0`
 * - ap-southeast-2: `2_2`
 * - ca-central-1: `2_0`
 * - eu-central-1: `2_0`
 * - eu-west-1: `2_0`
 * - eu-west-2: `2_0`
 * - eu-west-3: `2_0`
 * - us-east-1: `2_0`
 * - us-east-2: `2_0`
 * - us-west-2: `2_0`
 * 
 * ## Import
 * 
 * Lightsail Instances can be imported using their name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:lightsail/instance:Instance gitlab_test 'custom gitlab'
 * ```
 * 
 */
@ResourceType(type="aws:lightsail/instance:Instance")
public class Instance extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the Lightsail instance (matches `id`).
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the Lightsail instance (matches `id`).
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The Availability Zone in which to create your
     * instance (see list below)
     * 
     */
    @OutputExport(name="availabilityZone", type=String.class, parameters={})
    private Output<String> availabilityZone;

    /**
     * @return The Availability Zone in which to create your
     * instance (see list below)
     * 
     */
    public Output<String> getAvailabilityZone() {
        return this.availabilityZone;
    }
    /**
     * The ID for a virtual private server image. A list of available blueprint IDs can be obtained using the AWS CLI command: `aws lightsail get-blueprints`
     * 
     */
    @OutputExport(name="blueprintId", type=String.class, parameters={})
    private Output<String> blueprintId;

    /**
     * @return The ID for a virtual private server image. A list of available blueprint IDs can be obtained using the AWS CLI command: `aws lightsail get-blueprints`
     * 
     */
    public Output<String> getBlueprintId() {
        return this.blueprintId;
    }
    /**
     * The bundle of specification information (see list below)
     * 
     */
    @OutputExport(name="bundleId", type=String.class, parameters={})
    private Output<String> bundleId;

    /**
     * @return The bundle of specification information (see list below)
     * 
     */
    public Output<String> getBundleId() {
        return this.bundleId;
    }
    /**
     * The number of vCPUs the instance has.
     * 
     */
    @OutputExport(name="cpuCount", type=Integer.class, parameters={})
    private Output<Integer> cpuCount;

    /**
     * @return The number of vCPUs the instance has.
     * 
     */
    public Output<Integer> getCpuCount() {
        return this.cpuCount;
    }
    /**
     * The timestamp when the instance was created.
     * 
     */
    @OutputExport(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The timestamp when the instance was created.
     * 
     */
    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    /**
     * (**Deprecated**) The first IPv6 address of the Lightsail instance. Use `ipv6_addresses` attribute instead.
     * 
     * @deprecated
     * use `ipv6_addresses` attribute instead
     * 
     */
    @Deprecated /* use `ipv6_addresses` attribute instead */
    @OutputExport(name="ipv6Address", type=String.class, parameters={})
    private Output<String> ipv6Address;

    /**
     * @return (**Deprecated**) The first IPv6 address of the Lightsail instance. Use `ipv6_addresses` attribute instead.
     * 
     */
    public Output<String> getIpv6Address() {
        return this.ipv6Address;
    }
    /**
     * List of IPv6 addresses for the Lightsail instance.
     * 
     */
    @OutputExport(name="ipv6Addresses", type=List.class, parameters={String.class})
    private Output<List<String>> ipv6Addresses;

    /**
     * @return List of IPv6 addresses for the Lightsail instance.
     * 
     */
    public Output<List<String>> getIpv6Addresses() {
        return this.ipv6Addresses;
    }
    /**
     * A Boolean value indicating whether this instance has a static IP assigned to it.
     * 
     */
    @OutputExport(name="isStaticIp", type=Boolean.class, parameters={})
    private Output<Boolean> isStaticIp;

    /**
     * @return A Boolean value indicating whether this instance has a static IP assigned to it.
     * 
     */
    public Output<Boolean> getIsStaticIp() {
        return this.isStaticIp;
    }
    /**
     * The name of your key pair. Created in the
     * Lightsail console (cannot use `aws.ec2.KeyPair` at this time)
     * 
     */
    @OutputExport(name="keyPairName", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyPairName;

    /**
     * @return The name of your key pair. Created in the
     * Lightsail console (cannot use `aws.ec2.KeyPair` at this time)
     * 
     */
    public Output</* @Nullable */ String> getKeyPairName() {
        return this.keyPairName;
    }
    /**
     * The name of the Lightsail Instance. Names be unique within each AWS Region in your Lightsail account.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Lightsail Instance. Names be unique within each AWS Region in your Lightsail account.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The private IP address of the instance.
     * 
     */
    @OutputExport(name="privateIpAddress", type=String.class, parameters={})
    private Output<String> privateIpAddress;

    /**
     * @return The private IP address of the instance.
     * 
     */
    public Output<String> getPrivateIpAddress() {
        return this.privateIpAddress;
    }
    /**
     * The public IP address of the instance.
     * 
     */
    @OutputExport(name="publicIpAddress", type=String.class, parameters={})
    private Output<String> publicIpAddress;

    /**
     * @return The public IP address of the instance.
     * 
     */
    public Output<String> getPublicIpAddress() {
        return this.publicIpAddress;
    }
    /**
     * The amount of RAM in GB on the instance (e.g., 1.0).
     * 
     */
    @OutputExport(name="ramSize", type=Double.class, parameters={})
    private Output<Double> ramSize;

    /**
     * @return The amount of RAM in GB on the instance (e.g., 1.0).
     * 
     */
    public Output<Double> getRamSize() {
        return this.ramSize;
    }
    /**
     * A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * launch script to configure server with additional user data
     * 
     */
    @OutputExport(name="userData", type=String.class, parameters={})
    private Output</* @Nullable */ String> userData;

    /**
     * @return launch script to configure server with additional user data
     * 
     */
    public Output</* @Nullable */ String> getUserData() {
        return this.userData;
    }
    /**
     * The user name for connecting to the instance (e.g., ec2-user).
     * 
     */
    @OutputExport(name="username", type=String.class, parameters={})
    private Output<String> username;

    /**
     * @return The user name for connecting to the instance (e.g., ec2-user).
     * 
     */
    public Output<String> getUsername() {
        return this.username;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:lightsail/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Instance(String name, Input<String> id, @Nullable InstanceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:lightsail/instance:Instance", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
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
    public static Instance get(String name, Input<String> id, @Nullable InstanceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}
