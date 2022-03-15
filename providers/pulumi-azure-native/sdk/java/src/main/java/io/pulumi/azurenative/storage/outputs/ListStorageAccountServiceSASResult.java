// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ListStorageAccountServiceSASResult {
    /**
     * List service SAS credentials of specific resource.
     * 
     */
    private final String serviceSasToken;

    @CustomType.Constructor
    private ListStorageAccountServiceSASResult(@CustomType.Parameter("serviceSasToken") String serviceSasToken) {
        this.serviceSasToken = serviceSasToken;
    }

    /**
     * List service SAS credentials of specific resource.
     * 
    */
    public String getServiceSasToken() {
        return this.serviceSasToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListStorageAccountServiceSASResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String serviceSasToken;

        public Builder() {
    	      // Empty
        }

        public Builder(ListStorageAccountServiceSASResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serviceSasToken = defaults.serviceSasToken;
        }

        public Builder serviceSasToken(String serviceSasToken) {
            this.serviceSasToken = Objects.requireNonNull(serviceSasToken);
            return this;
        }
        public ListStorageAccountServiceSASResult build() {
            return new ListStorageAccountServiceSASResult(serviceSasToken);
        }
    }
}
