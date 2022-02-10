// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DatabaseInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final DatabaseInfoResponse Empty = new DatabaseInfoResponse();

    @InputImport(name="sourceDatabaseName", required=true)
    private final String sourceDatabaseName;

    public String getSourceDatabaseName() {
        return this.sourceDatabaseName;
    }

    public DatabaseInfoResponse(String sourceDatabaseName) {
        this.sourceDatabaseName = Objects.requireNonNull(sourceDatabaseName, "expected parameter 'sourceDatabaseName' to be non-null");
    }

    private DatabaseInfoResponse() {
        this.sourceDatabaseName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sourceDatabaseName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceDatabaseName = defaults.sourceDatabaseName;
        }

        public Builder setSourceDatabaseName(String sourceDatabaseName) {
            this.sourceDatabaseName = Objects.requireNonNull(sourceDatabaseName);
            return this;
        }

        public DatabaseInfoResponse build() {
            return new DatabaseInfoResponse(sourceDatabaseName);
        }
    }
}