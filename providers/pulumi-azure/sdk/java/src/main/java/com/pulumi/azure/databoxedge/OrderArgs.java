// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.databoxedge;

import com.pulumi.azure.databoxedge.inputs.OrderContactArgs;
import com.pulumi.azure.databoxedge.inputs.OrderShipmentAddressArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class OrderArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrderArgs Empty = new OrderArgs();

    /**
     * A `contact` block as defined below.
     * 
     */
    @Import(name="contact", required=true)
    private Output<OrderContactArgs> contact;

    /**
     * @return A `contact` block as defined below.
     * 
     */
    public Output<OrderContactArgs> contact() {
        return this.contact;
    }

    /**
     * The name of the Databox Edge Device this order is for. Changing this forces a new Databox Edge Order to be created.
     * 
     */
    @Import(name="deviceName", required=true)
    private Output<String> deviceName;

    /**
     * @return The name of the Databox Edge Device this order is for. Changing this forces a new Databox Edge Order to be created.
     * 
     */
    public Output<String> deviceName() {
        return this.deviceName;
    }

    /**
     * The name of the Resource Group where the Databox Edge Order should exist. Changing this forces a new Databox Edge Order to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Databox Edge Order should exist. Changing this forces a new Databox Edge Order to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A `shipment_address block as defined below.
     * 
     */
    @Import(name="shipmentAddress", required=true)
    private Output<OrderShipmentAddressArgs> shipmentAddress;

    /**
     * @return A `shipment_address block as defined below.
     * 
     */
    public Output<OrderShipmentAddressArgs> shipmentAddress() {
        return this.shipmentAddress;
    }

    private OrderArgs() {}

    private OrderArgs(OrderArgs $) {
        this.contact = $.contact;
        this.deviceName = $.deviceName;
        this.resourceGroupName = $.resourceGroupName;
        this.shipmentAddress = $.shipmentAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrderArgs $;

        public Builder() {
            $ = new OrderArgs();
        }

        public Builder(OrderArgs defaults) {
            $ = new OrderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contact A `contact` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder contact(Output<OrderContactArgs> contact) {
            $.contact = contact;
            return this;
        }

        /**
         * @param contact A `contact` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder contact(OrderContactArgs contact) {
            return contact(Output.of(contact));
        }

        /**
         * @param deviceName The name of the Databox Edge Device this order is for. Changing this forces a new Databox Edge Order to be created.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param deviceName The name of the Databox Edge Device this order is for. Changing this forces a new Databox Edge Order to be created.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Databox Edge Order should exist. Changing this forces a new Databox Edge Order to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Databox Edge Order should exist. Changing this forces a new Databox Edge Order to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param shipmentAddress A `shipment_address block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder shipmentAddress(Output<OrderShipmentAddressArgs> shipmentAddress) {
            $.shipmentAddress = shipmentAddress;
            return this;
        }

        /**
         * @param shipmentAddress A `shipment_address block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder shipmentAddress(OrderShipmentAddressArgs shipmentAddress) {
            return shipmentAddress(Output.of(shipmentAddress));
        }

        public OrderArgs build() {
            $.contact = Objects.requireNonNull($.contact, "expected parameter 'contact' to be non-null");
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.shipmentAddress = Objects.requireNonNull($.shipmentAddress, "expected parameter 'shipmentAddress' to be non-null");
            return $;
        }
    }

}
