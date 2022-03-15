// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.documentdb.inputs.RoleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MongoDBResourceMongoUserDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final MongoDBResourceMongoUserDefinitionArgs Empty = new MongoDBResourceMongoUserDefinitionArgs();

    /**
     * Cosmos DB database account name.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * A custom definition for the USer Definition.
     * 
     */
    @Import(name="customData")
      private final @Nullable Output<String> customData;

    public Output<String> getCustomData() {
        return this.customData == null ? Output.empty() : this.customData;
    }

    /**
     * The database name for which access is being granted for this User Definition.
     * 
     */
    @Import(name="databaseName")
      private final @Nullable Output<String> databaseName;

    public Output<String> getDatabaseName() {
        return this.databaseName == null ? Output.empty() : this.databaseName;
    }

    /**
     * The Mongo Auth mechanism. For now, we only support auth mechanism SCRAM-SHA-256.
     * 
     */
    @Import(name="mechanisms")
      private final @Nullable Output<String> mechanisms;

    public Output<String> getMechanisms() {
        return this.mechanisms == null ? Output.empty() : this.mechanisms;
    }

    /**
     * The ID for the User Definition {dbName.userName}.
     * 
     */
    @Import(name="mongoUserDefinitionId")
      private final @Nullable Output<String> mongoUserDefinitionId;

    public Output<String> getMongoUserDefinitionId() {
        return this.mongoUserDefinitionId == null ? Output.empty() : this.mongoUserDefinitionId;
    }

    /**
     * The password for User Definition. Response does not contain user password.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> getPassword() {
        return this.password == null ? Output.empty() : this.password;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The set of roles inherited by the User Definition.
     * 
     */
    @Import(name="roles")
      private final @Nullable Output<List<RoleArgs>> roles;

    public Output<List<RoleArgs>> getRoles() {
        return this.roles == null ? Output.empty() : this.roles;
    }

    /**
     * The user name for User Definition.
     * 
     */
    @Import(name="userName")
      private final @Nullable Output<String> userName;

    public Output<String> getUserName() {
        return this.userName == null ? Output.empty() : this.userName;
    }

    public MongoDBResourceMongoUserDefinitionArgs(
        Output<String> accountName,
        @Nullable Output<String> customData,
        @Nullable Output<String> databaseName,
        @Nullable Output<String> mechanisms,
        @Nullable Output<String> mongoUserDefinitionId,
        @Nullable Output<String> password,
        Output<String> resourceGroupName,
        @Nullable Output<List<RoleArgs>> roles,
        @Nullable Output<String> userName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.customData = customData;
        this.databaseName = databaseName;
        this.mechanisms = mechanisms;
        this.mongoUserDefinitionId = mongoUserDefinitionId;
        this.password = password;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.roles = roles;
        this.userName = userName;
    }

    private MongoDBResourceMongoUserDefinitionArgs() {
        this.accountName = Output.empty();
        this.customData = Output.empty();
        this.databaseName = Output.empty();
        this.mechanisms = Output.empty();
        this.mongoUserDefinitionId = Output.empty();
        this.password = Output.empty();
        this.resourceGroupName = Output.empty();
        this.roles = Output.empty();
        this.userName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoDBResourceMongoUserDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<String> customData;
        private @Nullable Output<String> databaseName;
        private @Nullable Output<String> mechanisms;
        private @Nullable Output<String> mongoUserDefinitionId;
        private @Nullable Output<String> password;
        private Output<String> resourceGroupName;
        private @Nullable Output<List<RoleArgs>> roles;
        private @Nullable Output<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoDBResourceMongoUserDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.customData = defaults.customData;
    	      this.databaseName = defaults.databaseName;
    	      this.mechanisms = defaults.mechanisms;
    	      this.mongoUserDefinitionId = defaults.mongoUserDefinitionId;
    	      this.password = defaults.password;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.roles = defaults.roles;
    	      this.userName = defaults.userName;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder customData(@Nullable Output<String> customData) {
            this.customData = customData;
            return this;
        }

        public Builder customData(@Nullable String customData) {
            this.customData = Output.ofNullable(customData);
            return this;
        }

        public Builder databaseName(@Nullable Output<String> databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        public Builder databaseName(@Nullable String databaseName) {
            this.databaseName = Output.ofNullable(databaseName);
            return this;
        }

        public Builder mechanisms(@Nullable Output<String> mechanisms) {
            this.mechanisms = mechanisms;
            return this;
        }

        public Builder mechanisms(@Nullable String mechanisms) {
            this.mechanisms = Output.ofNullable(mechanisms);
            return this;
        }

        public Builder mongoUserDefinitionId(@Nullable Output<String> mongoUserDefinitionId) {
            this.mongoUserDefinitionId = mongoUserDefinitionId;
            return this;
        }

        public Builder mongoUserDefinitionId(@Nullable String mongoUserDefinitionId) {
            this.mongoUserDefinitionId = Output.ofNullable(mongoUserDefinitionId);
            return this;
        }

        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }

        public Builder password(@Nullable String password) {
            this.password = Output.ofNullable(password);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder roles(@Nullable Output<List<RoleArgs>> roles) {
            this.roles = roles;
            return this;
        }

        public Builder roles(@Nullable List<RoleArgs> roles) {
            this.roles = Output.ofNullable(roles);
            return this;
        }

        public Builder userName(@Nullable Output<String> userName) {
            this.userName = userName;
            return this;
        }

        public Builder userName(@Nullable String userName) {
            this.userName = Output.ofNullable(userName);
            return this;
        }
        public MongoDBResourceMongoUserDefinitionArgs build() {
            return new MongoDBResourceMongoUserDefinitionArgs(accountName, customData, databaseName, mechanisms, mongoUserDefinitionId, password, resourceGroupName, roles, userName);
        }
    }
}
