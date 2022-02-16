// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail;

import io.pulumi.awsnative.lightsail.inputs.DatabaseRelationalDatabaseParameterArgs;
import io.pulumi.awsnative.lightsail.inputs.DatabaseTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseArgs Empty = new DatabaseArgs();

    @InputImport(name="availabilityZone")
    private final @Nullable Input<String> availabilityZone;

    public Input<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Input.empty() : this.availabilityZone;
    }

    @InputImport(name="backupRetention")
    private final @Nullable Input<Boolean> backupRetention;

    public Input<Boolean> getBackupRetention() {
        return this.backupRetention == null ? Input.empty() : this.backupRetention;
    }

    @InputImport(name="caCertificateIdentifier")
    private final @Nullable Input<String> caCertificateIdentifier;

    public Input<String> getCaCertificateIdentifier() {
        return this.caCertificateIdentifier == null ? Input.empty() : this.caCertificateIdentifier;
    }

    @InputImport(name="masterDatabaseName", required=true)
    private final Input<String> masterDatabaseName;

    public Input<String> getMasterDatabaseName() {
        return this.masterDatabaseName;
    }

    @InputImport(name="masterUserPassword")
    private final @Nullable Input<String> masterUserPassword;

    public Input<String> getMasterUserPassword() {
        return this.masterUserPassword == null ? Input.empty() : this.masterUserPassword;
    }

    @InputImport(name="masterUsername", required=true)
    private final Input<String> masterUsername;

    public Input<String> getMasterUsername() {
        return this.masterUsername;
    }

    @InputImport(name="preferredBackupWindow")
    private final @Nullable Input<String> preferredBackupWindow;

    public Input<String> getPreferredBackupWindow() {
        return this.preferredBackupWindow == null ? Input.empty() : this.preferredBackupWindow;
    }

    @InputImport(name="preferredMaintenanceWindow")
    private final @Nullable Input<String> preferredMaintenanceWindow;

    public Input<String> getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow == null ? Input.empty() : this.preferredMaintenanceWindow;
    }

    @InputImport(name="publiclyAccessible")
    private final @Nullable Input<Boolean> publiclyAccessible;

    public Input<Boolean> getPubliclyAccessible() {
        return this.publiclyAccessible == null ? Input.empty() : this.publiclyAccessible;
    }

    @InputImport(name="relationalDatabaseBlueprintId", required=true)
    private final Input<String> relationalDatabaseBlueprintId;

    public Input<String> getRelationalDatabaseBlueprintId() {
        return this.relationalDatabaseBlueprintId;
    }

    @InputImport(name="relationalDatabaseBundleId", required=true)
    private final Input<String> relationalDatabaseBundleId;

    public Input<String> getRelationalDatabaseBundleId() {
        return this.relationalDatabaseBundleId;
    }

    @InputImport(name="relationalDatabaseName", required=true)
    private final Input<String> relationalDatabaseName;

    public Input<String> getRelationalDatabaseName() {
        return this.relationalDatabaseName;
    }

    @InputImport(name="relationalDatabaseParameters")
    private final @Nullable Input<List<DatabaseRelationalDatabaseParameterArgs>> relationalDatabaseParameters;

    public Input<List<DatabaseRelationalDatabaseParameterArgs>> getRelationalDatabaseParameters() {
        return this.relationalDatabaseParameters == null ? Input.empty() : this.relationalDatabaseParameters;
    }

    @InputImport(name="rotateMasterUserPassword")
    private final @Nullable Input<Boolean> rotateMasterUserPassword;

    public Input<Boolean> getRotateMasterUserPassword() {
        return this.rotateMasterUserPassword == null ? Input.empty() : this.rotateMasterUserPassword;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<DatabaseTagArgs>> tags;

    public Input<List<DatabaseTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public DatabaseArgs(
        @Nullable Input<String> availabilityZone,
        @Nullable Input<Boolean> backupRetention,
        @Nullable Input<String> caCertificateIdentifier,
        Input<String> masterDatabaseName,
        @Nullable Input<String> masterUserPassword,
        Input<String> masterUsername,
        @Nullable Input<String> preferredBackupWindow,
        @Nullable Input<String> preferredMaintenanceWindow,
        @Nullable Input<Boolean> publiclyAccessible,
        Input<String> relationalDatabaseBlueprintId,
        Input<String> relationalDatabaseBundleId,
        Input<String> relationalDatabaseName,
        @Nullable Input<List<DatabaseRelationalDatabaseParameterArgs>> relationalDatabaseParameters,
        @Nullable Input<Boolean> rotateMasterUserPassword,
        @Nullable Input<List<DatabaseTagArgs>> tags) {
        this.availabilityZone = availabilityZone;
        this.backupRetention = backupRetention;
        this.caCertificateIdentifier = caCertificateIdentifier;
        this.masterDatabaseName = Objects.requireNonNull(masterDatabaseName, "expected parameter 'masterDatabaseName' to be non-null");
        this.masterUserPassword = masterUserPassword;
        this.masterUsername = Objects.requireNonNull(masterUsername, "expected parameter 'masterUsername' to be non-null");
        this.preferredBackupWindow = preferredBackupWindow;
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        this.publiclyAccessible = publiclyAccessible;
        this.relationalDatabaseBlueprintId = Objects.requireNonNull(relationalDatabaseBlueprintId, "expected parameter 'relationalDatabaseBlueprintId' to be non-null");
        this.relationalDatabaseBundleId = Objects.requireNonNull(relationalDatabaseBundleId, "expected parameter 'relationalDatabaseBundleId' to be non-null");
        this.relationalDatabaseName = Objects.requireNonNull(relationalDatabaseName, "expected parameter 'relationalDatabaseName' to be non-null");
        this.relationalDatabaseParameters = relationalDatabaseParameters;
        this.rotateMasterUserPassword = rotateMasterUserPassword;
        this.tags = tags;
    }

    private DatabaseArgs() {
        this.availabilityZone = Input.empty();
        this.backupRetention = Input.empty();
        this.caCertificateIdentifier = Input.empty();
        this.masterDatabaseName = Input.empty();
        this.masterUserPassword = Input.empty();
        this.masterUsername = Input.empty();
        this.preferredBackupWindow = Input.empty();
        this.preferredMaintenanceWindow = Input.empty();
        this.publiclyAccessible = Input.empty();
        this.relationalDatabaseBlueprintId = Input.empty();
        this.relationalDatabaseBundleId = Input.empty();
        this.relationalDatabaseName = Input.empty();
        this.relationalDatabaseParameters = Input.empty();
        this.rotateMasterUserPassword = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> availabilityZone;
        private @Nullable Input<Boolean> backupRetention;
        private @Nullable Input<String> caCertificateIdentifier;
        private Input<String> masterDatabaseName;
        private @Nullable Input<String> masterUserPassword;
        private Input<String> masterUsername;
        private @Nullable Input<String> preferredBackupWindow;
        private @Nullable Input<String> preferredMaintenanceWindow;
        private @Nullable Input<Boolean> publiclyAccessible;
        private Input<String> relationalDatabaseBlueprintId;
        private Input<String> relationalDatabaseBundleId;
        private Input<String> relationalDatabaseName;
        private @Nullable Input<List<DatabaseRelationalDatabaseParameterArgs>> relationalDatabaseParameters;
        private @Nullable Input<Boolean> rotateMasterUserPassword;
        private @Nullable Input<List<DatabaseTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.backupRetention = defaults.backupRetention;
    	      this.caCertificateIdentifier = defaults.caCertificateIdentifier;
    	      this.masterDatabaseName = defaults.masterDatabaseName;
    	      this.masterUserPassword = defaults.masterUserPassword;
    	      this.masterUsername = defaults.masterUsername;
    	      this.preferredBackupWindow = defaults.preferredBackupWindow;
    	      this.preferredMaintenanceWindow = defaults.preferredMaintenanceWindow;
    	      this.publiclyAccessible = defaults.publiclyAccessible;
    	      this.relationalDatabaseBlueprintId = defaults.relationalDatabaseBlueprintId;
    	      this.relationalDatabaseBundleId = defaults.relationalDatabaseBundleId;
    	      this.relationalDatabaseName = defaults.relationalDatabaseName;
    	      this.relationalDatabaseParameters = defaults.relationalDatabaseParameters;
    	      this.rotateMasterUserPassword = defaults.rotateMasterUserPassword;
    	      this.tags = defaults.tags;
        }

        public Builder setAvailabilityZone(@Nullable Input<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder setAvailabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Input.ofNullable(availabilityZone);
            return this;
        }

        public Builder setBackupRetention(@Nullable Input<Boolean> backupRetention) {
            this.backupRetention = backupRetention;
            return this;
        }

        public Builder setBackupRetention(@Nullable Boolean backupRetention) {
            this.backupRetention = Input.ofNullable(backupRetention);
            return this;
        }

        public Builder setCaCertificateIdentifier(@Nullable Input<String> caCertificateIdentifier) {
            this.caCertificateIdentifier = caCertificateIdentifier;
            return this;
        }

        public Builder setCaCertificateIdentifier(@Nullable String caCertificateIdentifier) {
            this.caCertificateIdentifier = Input.ofNullable(caCertificateIdentifier);
            return this;
        }

        public Builder setMasterDatabaseName(Input<String> masterDatabaseName) {
            this.masterDatabaseName = Objects.requireNonNull(masterDatabaseName);
            return this;
        }

        public Builder setMasterDatabaseName(String masterDatabaseName) {
            this.masterDatabaseName = Input.of(Objects.requireNonNull(masterDatabaseName));
            return this;
        }

        public Builder setMasterUserPassword(@Nullable Input<String> masterUserPassword) {
            this.masterUserPassword = masterUserPassword;
            return this;
        }

        public Builder setMasterUserPassword(@Nullable String masterUserPassword) {
            this.masterUserPassword = Input.ofNullable(masterUserPassword);
            return this;
        }

        public Builder setMasterUsername(Input<String> masterUsername) {
            this.masterUsername = Objects.requireNonNull(masterUsername);
            return this;
        }

        public Builder setMasterUsername(String masterUsername) {
            this.masterUsername = Input.of(Objects.requireNonNull(masterUsername));
            return this;
        }

        public Builder setPreferredBackupWindow(@Nullable Input<String> preferredBackupWindow) {
            this.preferredBackupWindow = preferredBackupWindow;
            return this;
        }

        public Builder setPreferredBackupWindow(@Nullable String preferredBackupWindow) {
            this.preferredBackupWindow = Input.ofNullable(preferredBackupWindow);
            return this;
        }

        public Builder setPreferredMaintenanceWindow(@Nullable Input<String> preferredMaintenanceWindow) {
            this.preferredMaintenanceWindow = preferredMaintenanceWindow;
            return this;
        }

        public Builder setPreferredMaintenanceWindow(@Nullable String preferredMaintenanceWindow) {
            this.preferredMaintenanceWindow = Input.ofNullable(preferredMaintenanceWindow);
            return this;
        }

        public Builder setPubliclyAccessible(@Nullable Input<Boolean> publiclyAccessible) {
            this.publiclyAccessible = publiclyAccessible;
            return this;
        }

        public Builder setPubliclyAccessible(@Nullable Boolean publiclyAccessible) {
            this.publiclyAccessible = Input.ofNullable(publiclyAccessible);
            return this;
        }

        public Builder setRelationalDatabaseBlueprintId(Input<String> relationalDatabaseBlueprintId) {
            this.relationalDatabaseBlueprintId = Objects.requireNonNull(relationalDatabaseBlueprintId);
            return this;
        }

        public Builder setRelationalDatabaseBlueprintId(String relationalDatabaseBlueprintId) {
            this.relationalDatabaseBlueprintId = Input.of(Objects.requireNonNull(relationalDatabaseBlueprintId));
            return this;
        }

        public Builder setRelationalDatabaseBundleId(Input<String> relationalDatabaseBundleId) {
            this.relationalDatabaseBundleId = Objects.requireNonNull(relationalDatabaseBundleId);
            return this;
        }

        public Builder setRelationalDatabaseBundleId(String relationalDatabaseBundleId) {
            this.relationalDatabaseBundleId = Input.of(Objects.requireNonNull(relationalDatabaseBundleId));
            return this;
        }

        public Builder setRelationalDatabaseName(Input<String> relationalDatabaseName) {
            this.relationalDatabaseName = Objects.requireNonNull(relationalDatabaseName);
            return this;
        }

        public Builder setRelationalDatabaseName(String relationalDatabaseName) {
            this.relationalDatabaseName = Input.of(Objects.requireNonNull(relationalDatabaseName));
            return this;
        }

        public Builder setRelationalDatabaseParameters(@Nullable Input<List<DatabaseRelationalDatabaseParameterArgs>> relationalDatabaseParameters) {
            this.relationalDatabaseParameters = relationalDatabaseParameters;
            return this;
        }

        public Builder setRelationalDatabaseParameters(@Nullable List<DatabaseRelationalDatabaseParameterArgs> relationalDatabaseParameters) {
            this.relationalDatabaseParameters = Input.ofNullable(relationalDatabaseParameters);
            return this;
        }

        public Builder setRotateMasterUserPassword(@Nullable Input<Boolean> rotateMasterUserPassword) {
            this.rotateMasterUserPassword = rotateMasterUserPassword;
            return this;
        }

        public Builder setRotateMasterUserPassword(@Nullable Boolean rotateMasterUserPassword) {
            this.rotateMasterUserPassword = Input.ofNullable(rotateMasterUserPassword);
            return this;
        }

        public Builder setTags(@Nullable Input<List<DatabaseTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<DatabaseTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public DatabaseArgs build() {
            return new DatabaseArgs(availabilityZone, backupRetention, caCertificateIdentifier, masterDatabaseName, masterUserPassword, masterUsername, preferredBackupWindow, preferredMaintenanceWindow, publiclyAccessible, relationalDatabaseBlueprintId, relationalDatabaseBundleId, relationalDatabaseName, relationalDatabaseParameters, rotateMasterUserPassword, tags);
        }
    }
}