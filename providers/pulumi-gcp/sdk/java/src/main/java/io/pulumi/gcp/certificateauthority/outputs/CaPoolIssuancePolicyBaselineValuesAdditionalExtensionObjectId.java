// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class CaPoolIssuancePolicyBaselineValuesAdditionalExtensionObjectId {
    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * 
     */
    private final List<Integer> objectIdPaths;

    @CustomType.Constructor
    private CaPoolIssuancePolicyBaselineValuesAdditionalExtensionObjectId(@CustomType.Parameter("objectIdPaths") List<Integer> objectIdPaths) {
        this.objectIdPaths = objectIdPaths;
    }

    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * 
    */
    public List<Integer> objectIdPaths() {
        return this.objectIdPaths;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolIssuancePolicyBaselineValuesAdditionalExtensionObjectId defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Integer> objectIdPaths;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolIssuancePolicyBaselineValuesAdditionalExtensionObjectId defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectIdPaths = defaults.objectIdPaths;
        }

        public Builder objectIdPaths(List<Integer> objectIdPaths) {
            this.objectIdPaths = Objects.requireNonNull(objectIdPaths);
            return this;
        }
        public Builder objectIdPaths(Integer... objectIdPaths) {
            return objectIdPaths(List.of(objectIdPaths));
        }        public CaPoolIssuancePolicyBaselineValuesAdditionalExtensionObjectId build() {
            return new CaPoolIssuancePolicyBaselineValuesAdditionalExtensionObjectId(objectIdPaths);
        }
    }
}
