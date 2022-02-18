// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.azurenative.edgeorder.inputs.AddressPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * Address details for an order item.
 * 
 */
public final class AddressDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AddressDetailsArgs Empty = new AddressDetailsArgs();

    /**
     * Customer address and contact details. It should be address resource
     * 
     */
    @InputImport(name="forwardAddress", required=true)
    private final Input<AddressPropertiesArgs> forwardAddress;

    public Input<AddressPropertiesArgs> getForwardAddress() {
        return this.forwardAddress;
    }

    public AddressDetailsArgs(Input<AddressPropertiesArgs> forwardAddress) {
        this.forwardAddress = Objects.requireNonNull(forwardAddress, "expected parameter 'forwardAddress' to be non-null");
    }

    private AddressDetailsArgs() {
        this.forwardAddress = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddressDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<AddressPropertiesArgs> forwardAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(AddressDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forwardAddress = defaults.forwardAddress;
        }

        public Builder setForwardAddress(Input<AddressPropertiesArgs> forwardAddress) {
            this.forwardAddress = Objects.requireNonNull(forwardAddress);
            return this;
        }

        public Builder setForwardAddress(AddressPropertiesArgs forwardAddress) {
            this.forwardAddress = Input.of(Objects.requireNonNull(forwardAddress));
            return this;
        }

        public AddressDetailsArgs build() {
            return new AddressDetailsArgs(forwardAddress);
        }
    }
}
