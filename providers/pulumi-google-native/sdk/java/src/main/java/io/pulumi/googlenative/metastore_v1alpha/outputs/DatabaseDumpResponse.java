// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
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

    @CustomType.Constructor
    private DatabaseDumpResponse(
        @CustomType.Parameter("databaseType") String databaseType,
        @CustomType.Parameter("gcsUri") String gcsUri,
        @CustomType.Parameter("sourceDatabase") String sourceDatabase,
        @CustomType.Parameter("type") String type) {
        this.databaseType = databaseType;
        this.gcsUri = gcsUri;
        this.sourceDatabase = sourceDatabase;
        this.type = type;
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

        public Builder databaseType(String databaseType) {
            this.databaseType = Objects.requireNonNull(databaseType);
            return this;
        }

        public Builder gcsUri(String gcsUri) {
            this.gcsUri = Objects.requireNonNull(gcsUri);
            return this;
        }

        public Builder sourceDatabase(String sourceDatabase) {
            this.sourceDatabase = Objects.requireNonNull(sourceDatabase);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public DatabaseDumpResponse build() {
            return new DatabaseDumpResponse(databaseType, gcsUri, sourceDatabase, type);
        }
    }
}
