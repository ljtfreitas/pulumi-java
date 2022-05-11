// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.lb;

import com.pulumi.azure.lb.inputs.LoadBalancerFrontendIpConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerArgs Empty = new LoadBalancerArgs();

    /**
     * Specifies the Edge Zone within the Azure Region where this Load Balancer should exist. Changing this forces a new Load Balancer to be created.
     * 
     */
    @Import(name="edgeZone")
    private @Nullable Output<String> edgeZone;

    /**
     * @return Specifies the Edge Zone within the Azure Region where this Load Balancer should exist. Changing this forces a new Load Balancer to be created.
     * 
     */
    public Optional<Output<String>> edgeZone() {
        return Optional.ofNullable(this.edgeZone);
    }

    /**
     * One or multiple `frontend_ip_configuration` blocks as documented below.
     * 
     */
    @Import(name="frontendIpConfigurations")
    private @Nullable Output<List<LoadBalancerFrontendIpConfigurationArgs>> frontendIpConfigurations;

    /**
     * @return One or multiple `frontend_ip_configuration` blocks as documented below.
     * 
     */
    public Optional<Output<List<LoadBalancerFrontendIpConfigurationArgs>>> frontendIpConfigurations() {
        return Optional.ofNullable(this.frontendIpConfigurations);
    }

    /**
     * Specifies the supported Azure Region where the Load Balancer should be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure Region where the Load Balancer should be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name of the Load Balancer.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Load Balancer.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Resource Group in which to create the Load Balancer.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which to create the Load Balancer.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The SKU of the Azure Load Balancer. Accepted values are `Basic`, `Standard` and `Gateway`. Defaults to `Basic`.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<String> sku;

    /**
     * @return The SKU of the Azure Load Balancer. Accepted values are `Basic`, `Standard` and `Gateway`. Defaults to `Basic`.
     * 
     */
    public Optional<Output<String>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * `sku_tier` - (Optional) The SKU tier of this Load Balancer. Possible values are `Global` and `Regional`. Defaults to `Regional`. Changing this forces a new resource to be created.
     * *
     * 
     */
    @Import(name="skuTier")
    private @Nullable Output<String> skuTier;

    /**
     * @return `sku_tier` - (Optional) The SKU tier of this Load Balancer. Possible values are `Global` and `Regional`. Defaults to `Regional`. Changing this forces a new resource to be created.
     * *
     * 
     */
    public Optional<Output<String>> skuTier() {
        return Optional.ofNullable(this.skuTier);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private LoadBalancerArgs() {}

    private LoadBalancerArgs(LoadBalancerArgs $) {
        this.edgeZone = $.edgeZone;
        this.frontendIpConfigurations = $.frontendIpConfigurations;
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.sku = $.sku;
        this.skuTier = $.skuTier;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerArgs $;

        public Builder() {
            $ = new LoadBalancerArgs();
        }

        public Builder(LoadBalancerArgs defaults) {
            $ = new LoadBalancerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param edgeZone Specifies the Edge Zone within the Azure Region where this Load Balancer should exist. Changing this forces a new Load Balancer to be created.
         * 
         * @return builder
         * 
         */
        public Builder edgeZone(@Nullable Output<String> edgeZone) {
            $.edgeZone = edgeZone;
            return this;
        }

        /**
         * @param edgeZone Specifies the Edge Zone within the Azure Region where this Load Balancer should exist. Changing this forces a new Load Balancer to be created.
         * 
         * @return builder
         * 
         */
        public Builder edgeZone(String edgeZone) {
            return edgeZone(Output.of(edgeZone));
        }

        /**
         * @param frontendIpConfigurations One or multiple `frontend_ip_configuration` blocks as documented below.
         * 
         * @return builder
         * 
         */
        public Builder frontendIpConfigurations(@Nullable Output<List<LoadBalancerFrontendIpConfigurationArgs>> frontendIpConfigurations) {
            $.frontendIpConfigurations = frontendIpConfigurations;
            return this;
        }

        /**
         * @param frontendIpConfigurations One or multiple `frontend_ip_configuration` blocks as documented below.
         * 
         * @return builder
         * 
         */
        public Builder frontendIpConfigurations(List<LoadBalancerFrontendIpConfigurationArgs> frontendIpConfigurations) {
            return frontendIpConfigurations(Output.of(frontendIpConfigurations));
        }

        /**
         * @param frontendIpConfigurations One or multiple `frontend_ip_configuration` blocks as documented below.
         * 
         * @return builder
         * 
         */
        public Builder frontendIpConfigurations(LoadBalancerFrontendIpConfigurationArgs... frontendIpConfigurations) {
            return frontendIpConfigurations(List.of(frontendIpConfigurations));
        }

        /**
         * @param location Specifies the supported Azure Region where the Load Balancer should be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure Region where the Load Balancer should be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name of the Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which to create the Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which to create the Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sku The SKU of the Azure Load Balancer. Accepted values are `Basic`, `Standard` and `Gateway`. Defaults to `Basic`.
         * 
         * @return builder
         * 
         */
        public Builder sku(@Nullable Output<String> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku The SKU of the Azure Load Balancer. Accepted values are `Basic`, `Standard` and `Gateway`. Defaults to `Basic`.
         * 
         * @return builder
         * 
         */
        public Builder sku(String sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param skuTier `sku_tier` - (Optional) The SKU tier of this Load Balancer. Possible values are `Global` and `Regional`. Defaults to `Regional`. Changing this forces a new resource to be created.
         * *
         * 
         * @return builder
         * 
         */
        public Builder skuTier(@Nullable Output<String> skuTier) {
            $.skuTier = skuTier;
            return this;
        }

        /**
         * @param skuTier `sku_tier` - (Optional) The SKU tier of this Load Balancer. Possible values are `Global` and `Regional`. Defaults to `Regional`. Changing this forces a new resource to be created.
         * *
         * 
         * @return builder
         * 
         */
        public Builder skuTier(String skuTier) {
            return skuTier(Output.of(skuTier));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public LoadBalancerArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
