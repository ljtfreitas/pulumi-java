// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LinkedServiceAzureSqlDatabaseKeyVaultConnectionString {
    /**
     * @return Specifies the name of an existing Key Vault Data Factory Linked Service.
     * 
     */
    private final String linkedServiceName;
    /**
     * @return Specifies the secret name in Azure Key Vault that stores SQL Server connection string.
     * 
     */
    private final String secretName;

    @CustomType.Constructor
    private LinkedServiceAzureSqlDatabaseKeyVaultConnectionString(
        @CustomType.Parameter("linkedServiceName") String linkedServiceName,
        @CustomType.Parameter("secretName") String secretName) {
        this.linkedServiceName = linkedServiceName;
        this.secretName = secretName;
    }

    /**
     * @return Specifies the name of an existing Key Vault Data Factory Linked Service.
     * 
     */
    public String linkedServiceName() {
        return this.linkedServiceName;
    }
    /**
     * @return Specifies the secret name in Azure Key Vault that stores SQL Server connection string.
     * 
     */
    public String secretName() {
        return this.secretName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedServiceAzureSqlDatabaseKeyVaultConnectionString defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String linkedServiceName;
        private String secretName;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedServiceAzureSqlDatabaseKeyVaultConnectionString defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.secretName = defaults.secretName;
        }

        public Builder linkedServiceName(String linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }
        public Builder secretName(String secretName) {
            this.secretName = Objects.requireNonNull(secretName);
            return this;
        }        public LinkedServiceAzureSqlDatabaseKeyVaultConnectionString build() {
            return new LinkedServiceAzureSqlDatabaseKeyVaultConnectionString(linkedServiceName, secretName);
        }
    }
}
