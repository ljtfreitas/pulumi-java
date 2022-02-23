// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.sqladmin_v1.inputs.SqlServerDatabaseDetailsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseArgs Empty = new DatabaseArgs();

    /**
     * The Cloud SQL charset value.
     * 
     */
    @InputImport(name="charset")
      private final @Nullable Input<String> charset;

    public Input<String> getCharset() {
        return this.charset == null ? Input.empty() : this.charset;
    }

    /**
     * The Cloud SQL collation value.
     * 
     */
    @InputImport(name="collation")
      private final @Nullable Input<String> collation;

    public Input<String> getCollation() {
        return this.collation == null ? Input.empty() : this.collation;
    }

    /**
     * The name of the Cloud SQL instance. This does not include the project ID.
     * 
     */
    @InputImport(name="instance", required=true)
      private final Input<String> instance;

    public Input<String> getInstance() {
        return this.instance;
    }

    /**
     * This is always `sql#database`.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * The name of the database in the Cloud SQL instance. This does not include the project ID or instance name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The project ID of the project containing the Cloud SQL database. The Google apps domain is prefixed if applicable.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The URI of this resource.
     * 
     */
    @InputImport(name="selfLink")
      private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    @InputImport(name="sqlserverDatabaseDetails")
      private final @Nullable Input<SqlServerDatabaseDetailsArgs> sqlserverDatabaseDetails;

    public Input<SqlServerDatabaseDetailsArgs> getSqlserverDatabaseDetails() {
        return this.sqlserverDatabaseDetails == null ? Input.empty() : this.sqlserverDatabaseDetails;
    }

    public DatabaseArgs(
        @Nullable Input<String> charset,
        @Nullable Input<String> collation,
        Input<String> instance,
        @Nullable Input<String> kind,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> selfLink,
        @Nullable Input<SqlServerDatabaseDetailsArgs> sqlserverDatabaseDetails) {
        this.charset = charset;
        this.collation = collation;
        this.instance = Objects.requireNonNull(instance, "expected parameter 'instance' to be non-null");
        this.kind = kind;
        this.name = name;
        this.project = project;
        this.selfLink = selfLink;
        this.sqlserverDatabaseDetails = sqlserverDatabaseDetails;
    }

    private DatabaseArgs() {
        this.charset = Input.empty();
        this.collation = Input.empty();
        this.instance = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.selfLink = Input.empty();
        this.sqlserverDatabaseDetails = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> charset;
        private @Nullable Input<String> collation;
        private Input<String> instance;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> selfLink;
        private @Nullable Input<SqlServerDatabaseDetailsArgs> sqlserverDatabaseDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.charset = defaults.charset;
    	      this.collation = defaults.collation;
    	      this.instance = defaults.instance;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
    	      this.sqlserverDatabaseDetails = defaults.sqlserverDatabaseDetails;
        }

        public Builder setCharset(@Nullable Input<String> charset) {
            this.charset = charset;
            return this;
        }

        public Builder setCharset(@Nullable String charset) {
            this.charset = Input.ofNullable(charset);
            return this;
        }

        public Builder setCollation(@Nullable Input<String> collation) {
            this.collation = collation;
            return this;
        }

        public Builder setCollation(@Nullable String collation) {
            this.collation = Input.ofNullable(collation);
            return this;
        }

        public Builder setInstance(Input<String> instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }

        public Builder setInstance(String instance) {
            this.instance = Input.of(Objects.requireNonNull(instance));
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSelfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder setSelfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
            return this;
        }

        public Builder setSqlserverDatabaseDetails(@Nullable Input<SqlServerDatabaseDetailsArgs> sqlserverDatabaseDetails) {
            this.sqlserverDatabaseDetails = sqlserverDatabaseDetails;
            return this;
        }

        public Builder setSqlserverDatabaseDetails(@Nullable SqlServerDatabaseDetailsArgs sqlserverDatabaseDetails) {
            this.sqlserverDatabaseDetails = Input.ofNullable(sqlserverDatabaseDetails);
            return this;
        }
        public DatabaseArgs build() {
            return new DatabaseArgs(charset, collation, instance, kind, name, project, selfLink, sqlserverDatabaseDetails);
        }
    }
}
