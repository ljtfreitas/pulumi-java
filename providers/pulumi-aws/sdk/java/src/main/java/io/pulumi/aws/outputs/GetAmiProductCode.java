// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetAmiProductCode {
    private final String productCodeId;
    private final String productCodeType;

    @OutputCustomType.Constructor({"productCodeId","productCodeType"})
    private GetAmiProductCode(
        String productCodeId,
        String productCodeType) {
        this.productCodeId = Objects.requireNonNull(productCodeId);
        this.productCodeType = Objects.requireNonNull(productCodeType);
    }

    public String getProductCodeId() {
        return this.productCodeId;
    }
    public String getProductCodeType() {
        return this.productCodeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAmiProductCode defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String productCodeId;
        private String productCodeType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAmiProductCode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.productCodeId = defaults.productCodeId;
    	      this.productCodeType = defaults.productCodeType;
        }

        public Builder setProductCodeId(String productCodeId) {
            this.productCodeId = Objects.requireNonNull(productCodeId);
            return this;
        }

        public Builder setProductCodeType(String productCodeType) {
            this.productCodeType = Objects.requireNonNull(productCodeType);
            return this;
        }
        public GetAmiProductCode build() {
            return new GetAmiProductCode(productCodeId, productCodeType);
        }
    }
}
