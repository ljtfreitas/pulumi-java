// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.azurenative.connectedvmwarevsphere.enums.OsType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the resource properties.
 * 
 */
public final class OsProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsProfileArgs Empty = new OsProfileArgs();

    /**
     * Gets or sets administrator password.
     * 
     */
    @InputImport(name="adminPassword")
        private final @Nullable Input<String> adminPassword;

    public Input<String> getAdminPassword() {
        return this.adminPassword == null ? Input.empty() : this.adminPassword;
    }

    /**
     * Gets or sets administrator username.
     * 
     */
    @InputImport(name="adminUsername")
        private final @Nullable Input<String> adminUsername;

    public Input<String> getAdminUsername() {
        return this.adminUsername == null ? Input.empty() : this.adminUsername;
    }

    /**
     * Gets or sets computer name.
     * 
     */
    @InputImport(name="computerName")
        private final @Nullable Input<String> computerName;

    public Input<String> getComputerName() {
        return this.computerName == null ? Input.empty() : this.computerName;
    }

    /**
     * Gets or sets the type of the os.
     * 
     */
    @InputImport(name="osType")
        private final @Nullable Input<Either<String,OsType>> osType;

    public Input<Either<String,OsType>> getOsType() {
        return this.osType == null ? Input.empty() : this.osType;
    }

    public OsProfileArgs(
        @Nullable Input<String> adminPassword,
        @Nullable Input<String> adminUsername,
        @Nullable Input<String> computerName,
        @Nullable Input<Either<String,OsType>> osType) {
        this.adminPassword = adminPassword;
        this.adminUsername = adminUsername;
        this.computerName = computerName;
        this.osType = osType;
    }

    private OsProfileArgs() {
        this.adminPassword = Input.empty();
        this.adminUsername = Input.empty();
        this.computerName = Input.empty();
        this.osType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> adminPassword;
        private @Nullable Input<String> adminUsername;
        private @Nullable Input<String> computerName;
        private @Nullable Input<Either<String,OsType>> osType;

        public Builder() {
    	      // Empty
        }

        public Builder(OsProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminPassword = defaults.adminPassword;
    	      this.adminUsername = defaults.adminUsername;
    	      this.computerName = defaults.computerName;
    	      this.osType = defaults.osType;
        }

        public Builder setAdminPassword(@Nullable Input<String> adminPassword) {
            this.adminPassword = adminPassword;
            return this;
        }

        public Builder setAdminPassword(@Nullable String adminPassword) {
            this.adminPassword = Input.ofNullable(adminPassword);
            return this;
        }

        public Builder setAdminUsername(@Nullable Input<String> adminUsername) {
            this.adminUsername = adminUsername;
            return this;
        }

        public Builder setAdminUsername(@Nullable String adminUsername) {
            this.adminUsername = Input.ofNullable(adminUsername);
            return this;
        }

        public Builder setComputerName(@Nullable Input<String> computerName) {
            this.computerName = computerName;
            return this;
        }

        public Builder setComputerName(@Nullable String computerName) {
            this.computerName = Input.ofNullable(computerName);
            return this;
        }

        public Builder setOsType(@Nullable Input<Either<String,OsType>> osType) {
            this.osType = osType;
            return this;
        }

        public Builder setOsType(@Nullable Either<String,OsType> osType) {
            this.osType = Input.ofNullable(osType);
            return this;
        }
        public OsProfileArgs build() {
            return new OsProfileArgs(adminPassword, adminUsername, computerName, osType);
        }
    }
}
