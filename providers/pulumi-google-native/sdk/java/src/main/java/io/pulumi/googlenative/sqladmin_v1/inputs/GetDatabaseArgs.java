// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDatabaseArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDatabaseArgs Empty = new GetDatabaseArgs();

    @InputImport(name="database", required=true)
      private final String database;

    public String getDatabase() {
        return this.database;
    }

    @InputImport(name="instance", required=true)
      private final String instance;

    public String getInstance() {
        return this.instance;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetDatabaseArgs(
        String database,
        String instance,
        @Nullable String project) {
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.instance = Objects.requireNonNull(instance, "expected parameter 'instance' to be non-null");
        this.project = project;
    }

    private GetDatabaseArgs() {
        this.database = null;
        this.instance = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String database;
        private String instance;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.instance = defaults.instance;
    	      this.project = defaults.project;
        }

        public Builder setDatabase(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder setInstance(String instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetDatabaseArgs build() {
            return new GetDatabaseArgs(database, instance, project);
        }
    }
}
