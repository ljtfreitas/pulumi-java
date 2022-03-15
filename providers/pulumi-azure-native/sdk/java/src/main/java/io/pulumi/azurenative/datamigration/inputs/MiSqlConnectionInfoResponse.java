// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties required to create a connection to Azure SQL database Managed instance
 * 
 */
public final class MiSqlConnectionInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final MiSqlConnectionInfoResponse Empty = new MiSqlConnectionInfoResponse();

    /**
     * Resource id for Azure SQL database Managed instance
     * 
     */
    @Import(name="managedInstanceResourceId", required=true)
      private final String managedInstanceResourceId;

    public String getManagedInstanceResourceId() {
        return this.managedInstanceResourceId;
    }

    /**
     * Password credential.
     * 
     */
    @Import(name="password")
      private final @Nullable String password;

    public Optional<String> getPassword() {
        return this.password == null ? Optional.empty() : Optional.ofNullable(this.password);
    }

    /**
     * Type of connection info
     * Expected value is 'MiSqlConnectionInfo'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * User name
     * 
     */
    @Import(name="userName")
      private final @Nullable String userName;

    public Optional<String> getUserName() {
        return this.userName == null ? Optional.empty() : Optional.ofNullable(this.userName);
    }

    public MiSqlConnectionInfoResponse(
        String managedInstanceResourceId,
        @Nullable String password,
        String type,
        @Nullable String userName) {
        this.managedInstanceResourceId = Objects.requireNonNull(managedInstanceResourceId, "expected parameter 'managedInstanceResourceId' to be non-null");
        this.password = password;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userName = userName;
    }

    private MiSqlConnectionInfoResponse() {
        this.managedInstanceResourceId = null;
        this.password = null;
        this.type = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MiSqlConnectionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String managedInstanceResourceId;
        private @Nullable String password;
        private String type;
        private @Nullable String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(MiSqlConnectionInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managedInstanceResourceId = defaults.managedInstanceResourceId;
    	      this.password = defaults.password;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder managedInstanceResourceId(String managedInstanceResourceId) {
            this.managedInstanceResourceId = Objects.requireNonNull(managedInstanceResourceId);
            return this;
        }

        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder userName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }
        public MiSqlConnectionInfoResponse build() {
            return new MiSqlConnectionInfoResponse(managedInstanceResourceId, password, type, userName);
        }
    }
}
