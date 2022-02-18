// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information of orphaned users on the SQL server database.
 * 
 */
public final class OrphanedUserInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final OrphanedUserInfoResponse Empty = new OrphanedUserInfoResponse();

    /**
     * Parent database of the user
     * 
     */
    @InputImport(name="databaseName")
    private final @Nullable String databaseName;

    public Optional<String> getDatabaseName() {
        return this.databaseName == null ? Optional.empty() : Optional.ofNullable(this.databaseName);
    }

    /**
     * Name of the orphaned user
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public OrphanedUserInfoResponse(
        @Nullable String databaseName,
        @Nullable String name) {
        this.databaseName = databaseName;
        this.name = name;
    }

    private OrphanedUserInfoResponse() {
        this.databaseName = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrphanedUserInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String databaseName;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(OrphanedUserInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.name = defaults.name;
        }

        public Builder setDatabaseName(@Nullable String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public OrphanedUserInfoResponse build() {
            return new OrphanedUserInfoResponse(databaseName, name);
        }
    }
}
