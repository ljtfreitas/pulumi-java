// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs;
import io.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


public final class DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsGetArgs Empty = new DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsGetArgs();

    /**
     * When connection password protection is enabled, the Data Catalog uses a customer-provided key to encrypt the password as part of CreateConnection or UpdateConnection and store it in the ENCRYPTED_PASSWORD field in the connection properties. You can enable catalog encryption or only password encryption. see Connection Password Encryption.
     * 
     */
    @Import(name="connectionPasswordEncryption", required=true)
      private final Output<DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs> connectionPasswordEncryption;

    public Output<DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs> getConnectionPasswordEncryption() {
        return this.connectionPasswordEncryption;
    }

    /**
     * Specifies the encryption-at-rest configuration for the Data Catalog. see Encryption At Rest.
     * 
     */
    @Import(name="encryptionAtRest", required=true)
      private final Output<DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestGetArgs> encryptionAtRest;

    public Output<DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestGetArgs> getEncryptionAtRest() {
        return this.encryptionAtRest;
    }

    public DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsGetArgs(
        Output<DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs> connectionPasswordEncryption,
        Output<DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestGetArgs> encryptionAtRest) {
        this.connectionPasswordEncryption = Objects.requireNonNull(connectionPasswordEncryption, "expected parameter 'connectionPasswordEncryption' to be non-null");
        this.encryptionAtRest = Objects.requireNonNull(encryptionAtRest, "expected parameter 'encryptionAtRest' to be non-null");
    }

    private DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsGetArgs() {
        this.connectionPasswordEncryption = Output.empty();
        this.encryptionAtRest = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs> connectionPasswordEncryption;
        private Output<DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestGetArgs> encryptionAtRest;

        public Builder() {
    	      // Empty
        }

        public Builder(DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionPasswordEncryption = defaults.connectionPasswordEncryption;
    	      this.encryptionAtRest = defaults.encryptionAtRest;
        }

        public Builder connectionPasswordEncryption(Output<DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs> connectionPasswordEncryption) {
            this.connectionPasswordEncryption = Objects.requireNonNull(connectionPasswordEncryption);
            return this;
        }

        public Builder connectionPasswordEncryption(DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs connectionPasswordEncryption) {
            this.connectionPasswordEncryption = Output.of(Objects.requireNonNull(connectionPasswordEncryption));
            return this;
        }

        public Builder encryptionAtRest(Output<DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestGetArgs> encryptionAtRest) {
            this.encryptionAtRest = Objects.requireNonNull(encryptionAtRest);
            return this;
        }

        public Builder encryptionAtRest(DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestGetArgs encryptionAtRest) {
            this.encryptionAtRest = Output.of(Objects.requireNonNull(encryptionAtRest));
            return this;
        }
        public DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsGetArgs build() {
            return new DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsGetArgs(connectionPasswordEncryption, encryptionAtRest);
        }
    }
}
