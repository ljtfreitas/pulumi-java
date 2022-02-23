// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The integration account partner's business identity.
 * 
 */
public final class BusinessIdentityResponse extends io.pulumi.resources.InvokeArgs {

    public static final BusinessIdentityResponse Empty = new BusinessIdentityResponse();

    /**
     * The business identity qualifier e.g. as2identity, ZZ, ZZZ, 31, 32
     * 
     */
    @InputImport(name="qualifier", required=true)
        private final String qualifier;

    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * The user defined business identity value.
     * 
     */
    @InputImport(name="value", required=true)
        private final String value;

    public String getValue() {
        return this.value;
    }

    public BusinessIdentityResponse(
        String qualifier,
        String value) {
        this.qualifier = Objects.requireNonNull(qualifier, "expected parameter 'qualifier' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private BusinessIdentityResponse() {
        this.qualifier = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BusinessIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String qualifier;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(BusinessIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.qualifier = defaults.qualifier;
    	      this.value = defaults.value;
        }

        public Builder setQualifier(String qualifier) {
            this.qualifier = Objects.requireNonNull(qualifier);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public BusinessIdentityResponse build() {
            return new BusinessIdentityResponse(qualifier, value);
        }
    }
}
