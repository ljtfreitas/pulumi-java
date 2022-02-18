// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybriddata.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The pair of customer secret.
 * 
 */
public final class CustomerSecretResponse extends io.pulumi.resources.InvokeArgs {

    public static final CustomerSecretResponse Empty = new CustomerSecretResponse();

    /**
     * The encryption algorithm used to encrypt data.
     * 
     */
    @InputImport(name="algorithm", required=true)
    private final String algorithm;

    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * The identifier to the data service input object which this secret corresponds to.
     * 
     */
    @InputImport(name="keyIdentifier", required=true)
    private final String keyIdentifier;

    public String getKeyIdentifier() {
        return this.keyIdentifier;
    }

    /**
     * It contains the encrypted customer secret.
     * 
     */
    @InputImport(name="keyValue", required=true)
    private final String keyValue;

    public String getKeyValue() {
        return this.keyValue;
    }

    public CustomerSecretResponse(
        String algorithm,
        String keyIdentifier,
        String keyValue) {
        this.algorithm = Objects.requireNonNull(algorithm, "expected parameter 'algorithm' to be non-null");
        this.keyIdentifier = Objects.requireNonNull(keyIdentifier, "expected parameter 'keyIdentifier' to be non-null");
        this.keyValue = Objects.requireNonNull(keyValue, "expected parameter 'keyValue' to be non-null");
    }

    private CustomerSecretResponse() {
        this.algorithm = null;
        this.keyIdentifier = null;
        this.keyValue = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomerSecretResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algorithm;
        private String keyIdentifier;
        private String keyValue;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomerSecretResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.keyIdentifier = defaults.keyIdentifier;
    	      this.keyValue = defaults.keyValue;
        }

        public Builder setAlgorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }

        public Builder setKeyIdentifier(String keyIdentifier) {
            this.keyIdentifier = Objects.requireNonNull(keyIdentifier);
            return this;
        }

        public Builder setKeyValue(String keyValue) {
            this.keyValue = Objects.requireNonNull(keyValue);
            return this;
        }

        public CustomerSecretResponse build() {
            return new CustomerSecretResponse(algorithm, keyIdentifier, keyValue);
        }
    }
}
