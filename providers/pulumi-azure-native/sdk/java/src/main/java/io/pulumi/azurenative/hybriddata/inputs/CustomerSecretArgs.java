// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybriddata.inputs;

import io.pulumi.azurenative.hybriddata.enums.SupportedAlgorithm;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The pair of customer secret.
 * 
 */
public final class CustomerSecretArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomerSecretArgs Empty = new CustomerSecretArgs();

    /**
     * The encryption algorithm used to encrypt data.
     * 
     */
    @InputImport(name="algorithm", required=true)
    private final Input<SupportedAlgorithm> algorithm;

    public Input<SupportedAlgorithm> getAlgorithm() {
        return this.algorithm;
    }

    /**
     * The identifier to the data service input object which this secret corresponds to.
     * 
     */
    @InputImport(name="keyIdentifier", required=true)
    private final Input<String> keyIdentifier;

    public Input<String> getKeyIdentifier() {
        return this.keyIdentifier;
    }

    /**
     * It contains the encrypted customer secret.
     * 
     */
    @InputImport(name="keyValue", required=true)
    private final Input<String> keyValue;

    public Input<String> getKeyValue() {
        return this.keyValue;
    }

    public CustomerSecretArgs(
        Input<SupportedAlgorithm> algorithm,
        Input<String> keyIdentifier,
        Input<String> keyValue) {
        this.algorithm = Objects.requireNonNull(algorithm, "expected parameter 'algorithm' to be non-null");
        this.keyIdentifier = Objects.requireNonNull(keyIdentifier, "expected parameter 'keyIdentifier' to be non-null");
        this.keyValue = Objects.requireNonNull(keyValue, "expected parameter 'keyValue' to be non-null");
    }

    private CustomerSecretArgs() {
        this.algorithm = Input.empty();
        this.keyIdentifier = Input.empty();
        this.keyValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomerSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<SupportedAlgorithm> algorithm;
        private Input<String> keyIdentifier;
        private Input<String> keyValue;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomerSecretArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.keyIdentifier = defaults.keyIdentifier;
    	      this.keyValue = defaults.keyValue;
        }

        public Builder setAlgorithm(Input<SupportedAlgorithm> algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }

        public Builder setAlgorithm(SupportedAlgorithm algorithm) {
            this.algorithm = Input.of(Objects.requireNonNull(algorithm));
            return this;
        }

        public Builder setKeyIdentifier(Input<String> keyIdentifier) {
            this.keyIdentifier = Objects.requireNonNull(keyIdentifier);
            return this;
        }

        public Builder setKeyIdentifier(String keyIdentifier) {
            this.keyIdentifier = Input.of(Objects.requireNonNull(keyIdentifier));
            return this;
        }

        public Builder setKeyValue(Input<String> keyValue) {
            this.keyValue = Objects.requireNonNull(keyValue);
            return this;
        }

        public Builder setKeyValue(String keyValue) {
            this.keyValue = Input.of(Objects.requireNonNull(keyValue));
            return this;
        }

        public CustomerSecretArgs build() {
            return new CustomerSecretArgs(algorithm, keyIdentifier, keyValue);
        }
    }
}
