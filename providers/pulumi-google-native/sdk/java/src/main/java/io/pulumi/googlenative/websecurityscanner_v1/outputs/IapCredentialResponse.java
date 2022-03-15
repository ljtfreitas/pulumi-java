// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.websecurityscanner_v1.outputs.IapTestServiceAccountInfoResponse;
import java.util.Objects;

@CustomType
public final class IapCredentialResponse {
    /**
     * Authentication configuration when Web-Security-Scanner service account is added in Identity-Aware-Proxy (IAP) access policies.
     * 
     */
    private final IapTestServiceAccountInfoResponse iapTestServiceAccountInfo;

    @CustomType.Constructor
    private IapCredentialResponse(@CustomType.Parameter("iapTestServiceAccountInfo") IapTestServiceAccountInfoResponse iapTestServiceAccountInfo) {
        this.iapTestServiceAccountInfo = iapTestServiceAccountInfo;
    }

    /**
     * Authentication configuration when Web-Security-Scanner service account is added in Identity-Aware-Proxy (IAP) access policies.
     * 
    */
    public IapTestServiceAccountInfoResponse getIapTestServiceAccountInfo() {
        return this.iapTestServiceAccountInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IapCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IapTestServiceAccountInfoResponse iapTestServiceAccountInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(IapCredentialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iapTestServiceAccountInfo = defaults.iapTestServiceAccountInfo;
        }

        public Builder iapTestServiceAccountInfo(IapTestServiceAccountInfoResponse iapTestServiceAccountInfo) {
            this.iapTestServiceAccountInfo = Objects.requireNonNull(iapTestServiceAccountInfo);
            return this;
        }
        public IapCredentialResponse build() {
            return new IapCredentialResponse(iapTestServiceAccountInfo);
        }
    }
}
