// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datastore;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.datastore.inputs.DataStoreIndexPropertyArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataStoreIndexArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataStoreIndexArgs Empty = new DataStoreIndexArgs();

    /**
     * Policy for including ancestors in the index.
     * Default value is `NONE`.
     * Possible values are `NONE` and `ALL_ANCESTORS`.
     * 
     */
    @Import(name="ancestor")
      private final @Nullable Output<String> ancestor;

    public Output<String> ancestor() {
        return this.ancestor == null ? Codegen.empty() : this.ancestor;
    }

    /**
     * The entity kind which the index applies to.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * An ordered list of properties to index on.
     * Structure is documented below.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<List<DataStoreIndexPropertyArgs>> properties;

    public Output<List<DataStoreIndexPropertyArgs>> properties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    public DataStoreIndexArgs(
        @Nullable Output<String> ancestor,
        Output<String> kind,
        @Nullable Output<String> project,
        @Nullable Output<List<DataStoreIndexPropertyArgs>> properties) {
        this.ancestor = ancestor;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.project = project;
        this.properties = properties;
    }

    private DataStoreIndexArgs() {
        this.ancestor = Codegen.empty();
        this.kind = Codegen.empty();
        this.project = Codegen.empty();
        this.properties = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataStoreIndexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ancestor;
        private Output<String> kind;
        private @Nullable Output<String> project;
        private @Nullable Output<List<DataStoreIndexPropertyArgs>> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(DataStoreIndexArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ancestor = defaults.ancestor;
    	      this.kind = defaults.kind;
    	      this.project = defaults.project;
    	      this.properties = defaults.properties;
        }

        public Builder ancestor(@Nullable Output<String> ancestor) {
            this.ancestor = ancestor;
            return this;
        }
        public Builder ancestor(@Nullable String ancestor) {
            this.ancestor = Codegen.ofNullable(ancestor);
            return this;
        }
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder properties(@Nullable Output<List<DataStoreIndexPropertyArgs>> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable List<DataStoreIndexPropertyArgs> properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }
        public Builder properties(DataStoreIndexPropertyArgs... properties) {
            return properties(List.of(properties));
        }        public DataStoreIndexArgs build() {
            return new DataStoreIndexArgs(ancestor, kind, project, properties);
        }
    }
}
