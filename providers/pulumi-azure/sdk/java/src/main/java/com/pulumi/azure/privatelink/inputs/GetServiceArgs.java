// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.privatelink.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServiceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceArgs Empty = new GetServiceArgs();

    /**
     * The name of the private link service.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the private link service.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the resource group in which the private link service resides.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group in which the private link service resides.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetServiceArgs() {}

    private GetServiceArgs(GetServiceArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceArgs $;

        public Builder() {
            $ = new GetServiceArgs();
        }

        public Builder(GetServiceArgs defaults) {
            $ = new GetServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the private link service.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the private link service resides.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetServiceArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
