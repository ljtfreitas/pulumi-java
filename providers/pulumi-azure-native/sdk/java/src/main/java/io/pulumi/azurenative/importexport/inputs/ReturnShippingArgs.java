// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.importexport.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies the return carrier and customer's account with the carrier.
 * 
 */
public final class ReturnShippingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReturnShippingArgs Empty = new ReturnShippingArgs();

    /**
     * The customer's account number with the carrier.
     * 
     */
    @InputImport(name="carrierAccountNumber", required=true)
        private final Input<String> carrierAccountNumber;

    public Input<String> getCarrierAccountNumber() {
        return this.carrierAccountNumber;
    }

    /**
     * The carrier's name.
     * 
     */
    @InputImport(name="carrierName", required=true)
        private final Input<String> carrierName;

    public Input<String> getCarrierName() {
        return this.carrierName;
    }

    public ReturnShippingArgs(
        Input<String> carrierAccountNumber,
        Input<String> carrierName) {
        this.carrierAccountNumber = Objects.requireNonNull(carrierAccountNumber, "expected parameter 'carrierAccountNumber' to be non-null");
        this.carrierName = Objects.requireNonNull(carrierName, "expected parameter 'carrierName' to be non-null");
    }

    private ReturnShippingArgs() {
        this.carrierAccountNumber = Input.empty();
        this.carrierName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReturnShippingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> carrierAccountNumber;
        private Input<String> carrierName;

        public Builder() {
    	      // Empty
        }

        public Builder(ReturnShippingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.carrierAccountNumber = defaults.carrierAccountNumber;
    	      this.carrierName = defaults.carrierName;
        }

        public Builder setCarrierAccountNumber(Input<String> carrierAccountNumber) {
            this.carrierAccountNumber = Objects.requireNonNull(carrierAccountNumber);
            return this;
        }

        public Builder setCarrierAccountNumber(String carrierAccountNumber) {
            this.carrierAccountNumber = Input.of(Objects.requireNonNull(carrierAccountNumber));
            return this;
        }

        public Builder setCarrierName(Input<String> carrierName) {
            this.carrierName = Objects.requireNonNull(carrierName);
            return this;
        }

        public Builder setCarrierName(String carrierName) {
            this.carrierName = Input.of(Objects.requireNonNull(carrierName));
            return this;
        }
        public ReturnShippingArgs build() {
            return new ReturnShippingArgs(carrierAccountNumber, carrierName);
        }
    }
}
