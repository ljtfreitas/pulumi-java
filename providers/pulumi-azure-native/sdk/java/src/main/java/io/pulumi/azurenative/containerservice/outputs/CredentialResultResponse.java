// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CredentialResultResponse {
    /**
     * The name of the credential.
     * 
     */
    private final String name;
    /**
     * Base64-encoded Kubernetes configuration file.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private CredentialResultResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * The name of the credential.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Base64-encoded Kubernetes configuration file.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CredentialResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(CredentialResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public CredentialResultResponse build() {
            return new CredentialResultResponse(name, value);
        }
    }
}
