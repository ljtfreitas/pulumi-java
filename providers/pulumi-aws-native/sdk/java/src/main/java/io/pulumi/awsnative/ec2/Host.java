// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.HostArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::EC2::Host
 * 
 */
@ResourceType(type="aws-native:ec2:Host")
public class Host extends io.pulumi.resources.CustomResource {
    /**
     * Indicates whether the host accepts any untargeted instance launches that match its instance type configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID.
     * 
     */
    @Export(name="autoPlacement", type=String.class, parameters={})
    private Output</* @Nullable */ String> autoPlacement;

    /**
     * @return Indicates whether the host accepts any untargeted instance launches that match its instance type configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID.
     * 
     */
    public Output</* @Nullable */ String> getAutoPlacement() {
        return this.autoPlacement;
    }
    /**
     * The Availability Zone in which to allocate the Dedicated Host.
     * 
     */
    @Export(name="availabilityZone", type=String.class, parameters={})
    private Output<String> availabilityZone;

    /**
     * @return The Availability Zone in which to allocate the Dedicated Host.
     * 
     */
    public Output<String> getAvailabilityZone() {
        return this.availabilityZone;
    }
    /**
     * Id of the host created.
     * 
     */
    @Export(name="hostId", type=String.class, parameters={})
    private Output<String> hostId;

    /**
     * @return Id of the host created.
     * 
     */
    public Output<String> getHostId() {
        return this.hostId;
    }
    /**
     * Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by default.
     * 
     */
    @Export(name="hostRecovery", type=String.class, parameters={})
    private Output</* @Nullable */ String> hostRecovery;

    /**
     * @return Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by default.
     * 
     */
    public Output</* @Nullable */ String> getHostRecovery() {
        return this.hostRecovery;
    }
    /**
     * Specifies the instance type to be supported by the Dedicated Hosts. If you specify an instance type, the Dedicated Hosts support instances of the specified instance type only.
     * 
     */
    @Export(name="instanceType", type=String.class, parameters={})
    private Output<String> instanceType;

    /**
     * @return Specifies the instance type to be supported by the Dedicated Hosts. If you specify an instance type, the Dedicated Hosts support instances of the specified instance type only.
     * 
     */
    public Output<String> getInstanceType() {
        return this.instanceType;
    }

    public interface BuilderApplicator {
        public void apply(HostArgs.Builder a);
    }
    private static io.pulumi.awsnative.ec2.HostArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.ec2.HostArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Host(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Host(String name) {
        this(name, HostArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Host(String name, HostArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Host(String name, HostArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:Host", name, args == null ? HostArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Host(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:Host", name, null, makeResourceOptions(options, id));
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
    public static Host get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Host(name, id, options);
    }
}
