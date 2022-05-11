// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiskPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiskPoolArgs Empty = new DiskPoolArgs();

    /**
     * The Azure Region where the Disk Pool should exist. Changing this forces a new Disk Pool to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Disk Pool should exist. Changing this forces a new Disk Pool to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the Disk Pool. Changing this forces a new Disk Pool to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Disk Pool. Changing this forces a new Disk Pool to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Resource Group where the Disk Pool should exist. Changing this forces a new Disk Pool to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Disk Pool should exist. Changing this forces a new Disk Pool to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The SKU of the Disk Pool. Possible values are `Basic_B1`, `Standard_S1` and `Premium_P1`. Changing this forces a new Disk Pool to be created.
     * 
     */
    @Import(name="skuName", required=true)
    private Output<String> skuName;

    /**
     * @return The SKU of the Disk Pool. Possible values are `Basic_B1`, `Standard_S1` and `Premium_P1`. Changing this forces a new Disk Pool to be created.
     * 
     */
    public Output<String> skuName() {
        return this.skuName;
    }

    /**
     * The ID of the Subnet where the Disk Pool should be created. Changing this forces a new Disk Pool to be created.
     * 
     */
    @Import(name="subnetId", required=true)
    private Output<String> subnetId;

    /**
     * @return The ID of the Subnet where the Disk Pool should be created. Changing this forces a new Disk Pool to be created.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }

    /**
     * A mapping of tags which should be assigned to the Disk Pool.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Disk Pool.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Specifies a list of Availability Zones in which this Disk Pool should be located. Changing this forces a new Disk Pool to be created.
     * 
     */
    @Import(name="zones", required=true)
    private Output<List<String>> zones;

    /**
     * @return Specifies a list of Availability Zones in which this Disk Pool should be located. Changing this forces a new Disk Pool to be created.
     * 
     */
    public Output<List<String>> zones() {
        return this.zones;
    }

    private DiskPoolArgs() {}

    private DiskPoolArgs(DiskPoolArgs $) {
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.skuName = $.skuName;
        this.subnetId = $.subnetId;
        this.tags = $.tags;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskPoolArgs $;

        public Builder() {
            $ = new DiskPoolArgs();
        }

        public Builder(DiskPoolArgs defaults) {
            $ = new DiskPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The Azure Region where the Disk Pool should exist. Changing this forces a new Disk Pool to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Disk Pool should exist. Changing this forces a new Disk Pool to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the Disk Pool. Changing this forces a new Disk Pool to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Disk Pool. Changing this forces a new Disk Pool to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Disk Pool should exist. Changing this forces a new Disk Pool to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Disk Pool should exist. Changing this forces a new Disk Pool to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param skuName The SKU of the Disk Pool. Possible values are `Basic_B1`, `Standard_S1` and `Premium_P1`. Changing this forces a new Disk Pool to be created.
         * 
         * @return builder
         * 
         */
        public Builder skuName(Output<String> skuName) {
            $.skuName = skuName;
            return this;
        }

        /**
         * @param skuName The SKU of the Disk Pool. Possible values are `Basic_B1`, `Standard_S1` and `Premium_P1`. Changing this forces a new Disk Pool to be created.
         * 
         * @return builder
         * 
         */
        public Builder skuName(String skuName) {
            return skuName(Output.of(skuName));
        }

        /**
         * @param subnetId The ID of the Subnet where the Disk Pool should be created. Changing this forces a new Disk Pool to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The ID of the Subnet where the Disk Pool should be created. Changing this forces a new Disk Pool to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Disk Pool.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Disk Pool.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param zones Specifies a list of Availability Zones in which this Disk Pool should be located. Changing this forces a new Disk Pool to be created.
         * 
         * @return builder
         * 
         */
        public Builder zones(Output<List<String>> zones) {
            $.zones = zones;
            return this;
        }

        /**
         * @param zones Specifies a list of Availability Zones in which this Disk Pool should be located. Changing this forces a new Disk Pool to be created.
         * 
         * @return builder
         * 
         */
        public Builder zones(List<String> zones) {
            return zones(Output.of(zones));
        }

        /**
         * @param zones Specifies a list of Availability Zones in which this Disk Pool should be located. Changing this forces a new Disk Pool to be created.
         * 
         * @return builder
         * 
         */
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }

        public DiskPoolArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.skuName = Objects.requireNonNull($.skuName, "expected parameter 'skuName' to be non-null");
            $.subnetId = Objects.requireNonNull($.subnetId, "expected parameter 'subnetId' to be non-null");
            $.zones = Objects.requireNonNull($.zones, "expected parameter 'zones' to be non-null");
            return $;
        }
    }

}
