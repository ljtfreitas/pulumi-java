// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.bot;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HealthbotArgs extends com.pulumi.resources.ResourceArgs {

    public static final HealthbotArgs Empty = new HealthbotArgs();

    /**
     * Specifies The Azure Region where the resource exists. CHanging this force a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies The Azure Region where the resource exists. CHanging this force a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies The name of the Healthbot Service resource. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies The name of the Healthbot Service resource. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies The name of the Resource Group in which to create the Healthbot Service. changing this
     * forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Specifies The name of the Resource Group in which to create the Healthbot Service. changing this
     * forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name which should be used for the SKU of the service. Possible values are &#34;F0&#34; and &#34;S1&#34;.
     * 
     */
    @Import(name="skuName", required=true)
    private Output<String> skuName;

    /**
     * @return The name which should be used for the SKU of the service. Possible values are &#34;F0&#34; and &#34;S1&#34;.
     * 
     */
    public Output<String> skuName() {
        return this.skuName;
    }

    /**
     * A mapping of tags which should be assigned to the service.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the service.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private HealthbotArgs() {}

    private HealthbotArgs(HealthbotArgs $) {
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.skuName = $.skuName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HealthbotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HealthbotArgs $;

        public Builder() {
            $ = new HealthbotArgs();
        }

        public Builder(HealthbotArgs defaults) {
            $ = new HealthbotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location Specifies The Azure Region where the resource exists. CHanging this force a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies The Azure Region where the resource exists. CHanging this force a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies The name of the Healthbot Service resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies The name of the Healthbot Service resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Specifies The name of the Resource Group in which to create the Healthbot Service. changing this
         * forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies The name of the Resource Group in which to create the Healthbot Service. changing this
         * forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param skuName The name which should be used for the SKU of the service. Possible values are &#34;F0&#34; and &#34;S1&#34;.
         * 
         * @return builder
         * 
         */
        public Builder skuName(Output<String> skuName) {
            $.skuName = skuName;
            return this;
        }

        /**
         * @param skuName The name which should be used for the SKU of the service. Possible values are &#34;F0&#34; and &#34;S1&#34;.
         * 
         * @return builder
         * 
         */
        public Builder skuName(String skuName) {
            return skuName(Output.of(skuName));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the service.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the service.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public HealthbotArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.skuName = Objects.requireNonNull($.skuName, "expected parameter 'skuName' to be non-null");
            return $;
        }
    }

}
