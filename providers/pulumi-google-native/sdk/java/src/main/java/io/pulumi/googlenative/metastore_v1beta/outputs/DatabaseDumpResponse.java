// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DatabaseDumpResponse {
    /**
     * The type of the database.
     * 
     */
    private final String databaseType;
    /**
     * A Cloud Storage object or folder URI that specifies the source from which to import metadata. It must begin with gs://.
     * 
     */
    private final String gcsUri;
    /**
     * The name of the source database.
     * 
     */
    private final String sourceDatabase;
    /**
     * Optional. The type of the database dump. If unspecified, defaults to MYSQL.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"databaseType","gcsUri","sourceDatabase","type"})
    private DatabaseDumpResponse(
        String databaseType,
        String gcsUri,
        String sourceDatabase,
        String type) {
        this.databaseType = Objects.requireNonNull(databaseType);
        this.gcsUri = Objects.requireNonNull(gcsUri);
        this.sourceDatabase = Objects.requireNonNull(sourceDatabase);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The type of the database.
     * 
     */
    public String getDatabaseType() {
        return this.databaseType;
    }
    /**
     * A Cloud Storage object or folder URI that specifies the source from which to import metadata. It must begin with gs://.
     * 
     */
    public String getGcsUri() {
        return this.gcsUri;
    }
    /**
     * The name of the source database.
     * 
     */
    public String getSourceDatabase() {
        return this.sourceDatabase;
    }
    /**
     * Optional. The type of the database dump. If unspecified, defaults to MYSQL.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseDumpResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String databaseType;
        private String gcsUri;
        private String sourceDatabase;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseDumpResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseType = defaults.databaseType;
    	      this.gcsUri = defaults.gcsUri;
    	      this.sourceDatabase = defaults.sourceDatabase;
    	      this.type = defaults.type;
        }

        public Builder setDatabaseType(String databaseType) {
            this.databaseType = Objects.requireNonNull(databaseType);
            return this;
        }

        public Builder setGcsUri(String gcsUri) {
            this.gcsUri = Objects.requireNonNull(gcsUri);
            return this;
        }

        public Builder setSourceDatabase(String sourceDatabase) {
            this.sourceDatabase = Objects.requireNonNull(sourceDatabase);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public DatabaseDumpResponse build() {
            return new DatabaseDumpResponse(databaseType, gcsUri, sourceDatabase, type);
        }
    }
}
