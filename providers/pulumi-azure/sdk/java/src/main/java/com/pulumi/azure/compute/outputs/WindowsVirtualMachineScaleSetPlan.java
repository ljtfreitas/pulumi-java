// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WindowsVirtualMachineScaleSetPlan {
    /**
     * @return Specifies the name of the image from the marketplace. Changing this forces a new resource to be created.
     * 
     */
    private final String name;
    /**
     * @return Specifies the product of the image from the marketplace. Changing this forces a new resource to be created.
     * 
     */
    private final String product;
    /**
     * @return Specifies the publisher of the image. Changing this forces a new resource to be created.
     * 
     */
    private final String publisher;

    @CustomType.Constructor
    private WindowsVirtualMachineScaleSetPlan(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("product") String product,
        @CustomType.Parameter("publisher") String publisher) {
        this.name = name;
        this.product = product;
        this.publisher = publisher;
    }

    /**
     * @return Specifies the name of the image from the marketplace. Changing this forces a new resource to be created.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Specifies the product of the image from the marketplace. Changing this forces a new resource to be created.
     * 
     */
    public String product() {
        return this.product;
    }
    /**
     * @return Specifies the publisher of the image. Changing this forces a new resource to be created.
     * 
     */
    public String publisher() {
        return this.publisher;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsVirtualMachineScaleSetPlan defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String product;
        private String publisher;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsVirtualMachineScaleSetPlan defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.product = defaults.product;
    	      this.publisher = defaults.publisher;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder product(String product) {
            this.product = Objects.requireNonNull(product);
            return this;
        }
        public Builder publisher(String publisher) {
            this.publisher = Objects.requireNonNull(publisher);
            return this;
        }        public WindowsVirtualMachineScaleSetPlan build() {
            return new WindowsVirtualMachineScaleSetPlan(name, product, publisher);
        }
    }
}
