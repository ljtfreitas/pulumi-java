// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AccountKeyVaultReference {
    /**
     * @return The Azure identifier of the Azure KeyVault to use.
     * 
     */
    private final String id;
    /**
     * @return The HTTPS URL of the Azure KeyVault to use.
     * 
     */
    private final String url;

    @CustomType.Constructor
    private AccountKeyVaultReference(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("url") String url) {
        this.id = id;
        this.url = url;
    }

    /**
     * @return The Azure identifier of the Azure KeyVault to use.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The HTTPS URL of the Azure KeyVault to use.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountKeyVaultReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountKeyVaultReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.url = defaults.url;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public AccountKeyVaultReference build() {
            return new AccountKeyVaultReference(id, url);
        }
    }
}
