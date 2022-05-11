// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetResourceGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResourceGroupArgs Empty = new GetResourceGroupArgs();

    /**
     * The Name of this Resource Group.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The Name of this Resource Group.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetResourceGroupArgs() {}

    private GetResourceGroupArgs(GetResourceGroupArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResourceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResourceGroupArgs $;

        public Builder() {
            $ = new GetResourceGroupArgs();
        }

        public Builder(GetResourceGroupArgs defaults) {
            $ = new GetResourceGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The Name of this Resource Group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetResourceGroupArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
