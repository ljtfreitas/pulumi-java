// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybriddata.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CustomerSecretResponse {
    /**
     * The encryption algorithm used to encrypt data.
     * 
     */
    private final String algorithm;
    /**
     * The identifier to the data service input object which this secret corresponds to.
     * 
     */
    private final String keyIdentifier;
    /**
     * It contains the encrypted customer secret.
     * 
     */
    private final String keyValue;

    @OutputCustomType.Constructor({"algorithm","keyIdentifier","keyValue"})
    private CustomerSecretResponse(
        String algorithm,
        String keyIdentifier,
        String keyValue) {
        this.algorithm = Objects.requireNonNull(algorithm);
        this.keyIdentifier = Objects.requireNonNull(keyIdentifier);
        this.keyValue = Objects.requireNonNull(keyValue);
    }

    /**
     * The encryption algorithm used to encrypt data.
     * 
     */
    public String getAlgorithm() {
        return this.algorithm;
    }
    /**
     * The identifier to the data service input object which this secret corresponds to.
     * 
     */
    public String getKeyIdentifier() {
        return this.keyIdentifier;
    }
    /**
     * It contains the encrypted customer secret.
     * 
     */
    public String getKeyValue() {
        return this.keyValue;
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
