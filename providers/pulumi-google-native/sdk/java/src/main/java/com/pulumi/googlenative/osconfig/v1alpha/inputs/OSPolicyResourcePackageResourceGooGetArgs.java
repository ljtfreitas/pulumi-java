// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig.v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A package managed by GooGet. - install: `googet -noconfirm install package` - remove: `googet -noconfirm remove package`
 * 
 */
public final class OSPolicyResourcePackageResourceGooGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourcePackageResourceGooGetArgs Empty = new OSPolicyResourcePackageResourceGooGetArgs();

    /**
     * Package name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Package name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private OSPolicyResourcePackageResourceGooGetArgs() {}

    private OSPolicyResourcePackageResourceGooGetArgs(OSPolicyResourcePackageResourceGooGetArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OSPolicyResourcePackageResourceGooGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourcePackageResourceGooGetArgs $;

        public Builder() {
            $ = new OSPolicyResourcePackageResourceGooGetArgs();
        }

        public Builder(OSPolicyResourcePackageResourceGooGetArgs defaults) {
            $ = new OSPolicyResourcePackageResourceGooGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Package name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Package name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public OSPolicyResourcePackageResourceGooGetArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
