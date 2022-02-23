// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.SubnetCidrReservationArgs;
import io.pulumi.aws.ec2.inputs.SubnetCidrReservationState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a subnet CIDR reservation resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Existing CIDR reservations can be imported using `SUBNET_ID:RESERVATION_ID`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/subnetCidrReservation:SubnetCidrReservation example subnet-01llsxvsxabqiymcz:scr-4mnvz6wb7otksjcs9
 * ```
 * 
 */
@ResourceType(type="aws:ec2/subnetCidrReservation:SubnetCidrReservation")
public class SubnetCidrReservation extends io.pulumi.resources.CustomResource {
    /**
     * The CIDR block for the reservation.
     * 
     */
    @OutputExport(name="cidrBlock", type=String.class, parameters={})
    private Output<String> cidrBlock;

    /**
     * @return The CIDR block for the reservation.
     * 
     */
    public Output<String> getCidrBlock() {
        return this.cidrBlock;
    }
    /**
     * A brief description of the reservation.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A brief description of the reservation.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * ID of the AWS account that owns this CIDR reservation.
     * 
     */
    @OutputExport(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return ID of the AWS account that owns this CIDR reservation.
     * 
     */
    public Output<String> getOwnerId() {
        return this.ownerId;
    }
    /**
     * The type of reservation to create. Valid values: `explicit`, `prefix`
     * 
     */
    @OutputExport(name="reservationType", type=String.class, parameters={})
    private Output<String> reservationType;

    /**
     * @return The type of reservation to create. Valid values: `explicit`, `prefix`
     * 
     */
    public Output<String> getReservationType() {
        return this.reservationType;
    }
    /**
     * The ID of the subnet to create the reservation for.
     * 
     */
    @OutputExport(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    /**
     * @return The ID of the subnet to create the reservation for.
     * 
     */
    public Output<String> getSubnetId() {
        return this.subnetId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SubnetCidrReservation(String name, SubnetCidrReservationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/subnetCidrReservation:SubnetCidrReservation", name, args == null ? SubnetCidrReservationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SubnetCidrReservation(String name, Input<String> id, @Nullable SubnetCidrReservationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/subnetCidrReservation:SubnetCidrReservation", name, state, makeResourceOptions(options, id));
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
    public static SubnetCidrReservation get(String name, Input<String> id, @Nullable SubnetCidrReservationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SubnetCidrReservation(name, id, state, options);
    }
}
