// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lakeformation;

import io.pulumi.aws.lakeformation.inputs.DataLakeSettingsCreateDatabaseDefaultPermissionArgs;
import io.pulumi.aws.lakeformation.inputs.DataLakeSettingsCreateTableDefaultPermissionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataLakeSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataLakeSettingsArgs Empty = new DataLakeSettingsArgs();

    /**
     * Set of ARNs of AWS Lake Formation principals (IAM users or roles).
     * 
     */
    @Import(name="admins")
      private final @Nullable Output<List<String>> admins;

    public Output<List<String>> getAdmins() {
        return this.admins == null ? Output.empty() : this.admins;
    }

    /**
     * Identifier for the Data Catalog. By default, the account ID.
     * 
     */
    @Import(name="catalogId")
      private final @Nullable Output<String> catalogId;

    public Output<String> getCatalogId() {
        return this.catalogId == null ? Output.empty() : this.catalogId;
    }

    /**
     * Up to three configuration blocks of principal permissions for default create database permissions. Detailed below.
     * 
     */
    @Import(name="createDatabaseDefaultPermissions")
      private final @Nullable Output<List<DataLakeSettingsCreateDatabaseDefaultPermissionArgs>> createDatabaseDefaultPermissions;

    public Output<List<DataLakeSettingsCreateDatabaseDefaultPermissionArgs>> getCreateDatabaseDefaultPermissions() {
        return this.createDatabaseDefaultPermissions == null ? Output.empty() : this.createDatabaseDefaultPermissions;
    }

    /**
     * Up to three configuration blocks of principal permissions for default create table permissions. Detailed below.
     * 
     */
    @Import(name="createTableDefaultPermissions")
      private final @Nullable Output<List<DataLakeSettingsCreateTableDefaultPermissionArgs>> createTableDefaultPermissions;

    public Output<List<DataLakeSettingsCreateTableDefaultPermissionArgs>> getCreateTableDefaultPermissions() {
        return this.createTableDefaultPermissions == null ? Output.empty() : this.createTableDefaultPermissions;
    }

    /**
     * List of the resource-owning account IDs that the caller's account can use to share their user access details (user ARNs).
     * 
     */
    @Import(name="trustedResourceOwners")
      private final @Nullable Output<List<String>> trustedResourceOwners;

    public Output<List<String>> getTrustedResourceOwners() {
        return this.trustedResourceOwners == null ? Output.empty() : this.trustedResourceOwners;
    }

    public DataLakeSettingsArgs(
        @Nullable Output<List<String>> admins,
        @Nullable Output<String> catalogId,
        @Nullable Output<List<DataLakeSettingsCreateDatabaseDefaultPermissionArgs>> createDatabaseDefaultPermissions,
        @Nullable Output<List<DataLakeSettingsCreateTableDefaultPermissionArgs>> createTableDefaultPermissions,
        @Nullable Output<List<String>> trustedResourceOwners) {
        this.admins = admins;
        this.catalogId = catalogId;
        this.createDatabaseDefaultPermissions = createDatabaseDefaultPermissions;
        this.createTableDefaultPermissions = createTableDefaultPermissions;
        this.trustedResourceOwners = trustedResourceOwners;
    }

    private DataLakeSettingsArgs() {
        this.admins = Output.empty();
        this.catalogId = Output.empty();
        this.createDatabaseDefaultPermissions = Output.empty();
        this.createTableDefaultPermissions = Output.empty();
        this.trustedResourceOwners = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataLakeSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> admins;
        private @Nullable Output<String> catalogId;
        private @Nullable Output<List<DataLakeSettingsCreateDatabaseDefaultPermissionArgs>> createDatabaseDefaultPermissions;
        private @Nullable Output<List<DataLakeSettingsCreateTableDefaultPermissionArgs>> createTableDefaultPermissions;
        private @Nullable Output<List<String>> trustedResourceOwners;

        public Builder() {
    	      // Empty
        }

        public Builder(DataLakeSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.admins = defaults.admins;
    	      this.catalogId = defaults.catalogId;
    	      this.createDatabaseDefaultPermissions = defaults.createDatabaseDefaultPermissions;
    	      this.createTableDefaultPermissions = defaults.createTableDefaultPermissions;
    	      this.trustedResourceOwners = defaults.trustedResourceOwners;
        }

        public Builder admins(@Nullable Output<List<String>> admins) {
            this.admins = admins;
            return this;
        }

        public Builder admins(@Nullable List<String> admins) {
            this.admins = Output.ofNullable(admins);
            return this;
        }

        public Builder catalogId(@Nullable Output<String> catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        public Builder catalogId(@Nullable String catalogId) {
            this.catalogId = Output.ofNullable(catalogId);
            return this;
        }

        public Builder createDatabaseDefaultPermissions(@Nullable Output<List<DataLakeSettingsCreateDatabaseDefaultPermissionArgs>> createDatabaseDefaultPermissions) {
            this.createDatabaseDefaultPermissions = createDatabaseDefaultPermissions;
            return this;
        }

        public Builder createDatabaseDefaultPermissions(@Nullable List<DataLakeSettingsCreateDatabaseDefaultPermissionArgs> createDatabaseDefaultPermissions) {
            this.createDatabaseDefaultPermissions = Output.ofNullable(createDatabaseDefaultPermissions);
            return this;
        }

        public Builder createTableDefaultPermissions(@Nullable Output<List<DataLakeSettingsCreateTableDefaultPermissionArgs>> createTableDefaultPermissions) {
            this.createTableDefaultPermissions = createTableDefaultPermissions;
            return this;
        }

        public Builder createTableDefaultPermissions(@Nullable List<DataLakeSettingsCreateTableDefaultPermissionArgs> createTableDefaultPermissions) {
            this.createTableDefaultPermissions = Output.ofNullable(createTableDefaultPermissions);
            return this;
        }

        public Builder trustedResourceOwners(@Nullable Output<List<String>> trustedResourceOwners) {
            this.trustedResourceOwners = trustedResourceOwners;
            return this;
        }

        public Builder trustedResourceOwners(@Nullable List<String> trustedResourceOwners) {
            this.trustedResourceOwners = Output.ofNullable(trustedResourceOwners);
            return this;
        }
        public DataLakeSettingsArgs build() {
            return new DataLakeSettingsArgs(admins, catalogId, createDatabaseDefaultPermissions, createTableDefaultPermissions, trustedResourceOwners);
        }
    }
}
