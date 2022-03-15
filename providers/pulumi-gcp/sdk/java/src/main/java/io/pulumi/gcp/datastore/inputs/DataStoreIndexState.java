// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datastore.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.datastore.inputs.DataStoreIndexPropertyGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataStoreIndexState extends io.pulumi.resources.ResourceArgs {

    public static final DataStoreIndexState Empty = new DataStoreIndexState();

    /**
     * Policy for including ancestors in the index.
     * Default value is `NONE`.
     * Possible values are `NONE` and `ALL_ANCESTORS`.
     * 
     */
    @Import(name="ancestor")
      private final @Nullable Output<String> ancestor;

    public Output<String> getAncestor() {
        return this.ancestor == null ? Output.empty() : this.ancestor;
    }

    /**
     * The index id.
     * 
     */
    @Import(name="indexId")
      private final @Nullable Output<String> indexId;

    public Output<String> getIndexId() {
        return this.indexId == null ? Output.empty() : this.indexId;
    }

    /**
     * The entity kind which the index applies to.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * An ordered list of properties to index on.
     * Structure is documented below.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<List<DataStoreIndexPropertyGetArgs>> properties;

    public Output<List<DataStoreIndexPropertyGetArgs>> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    public DataStoreIndexState(
        @Nullable Output<String> ancestor,
        @Nullable Output<String> indexId,
        @Nullable Output<String> kind,
        @Nullable Output<String> project,
        @Nullable Output<List<DataStoreIndexPropertyGetArgs>> properties) {
        this.ancestor = ancestor;
        this.indexId = indexId;
        this.kind = kind;
        this.project = project;
        this.properties = properties;
    }

    private DataStoreIndexState() {
        this.ancestor = Output.empty();
        this.indexId = Output.empty();
        this.kind = Output.empty();
        this.project = Output.empty();
        this.properties = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataStoreIndexState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ancestor;
        private @Nullable Output<String> indexId;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> project;
        private @Nullable Output<List<DataStoreIndexPropertyGetArgs>> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(DataStoreIndexState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ancestor = defaults.ancestor;
    	      this.indexId = defaults.indexId;
    	      this.kind = defaults.kind;
    	      this.project = defaults.project;
    	      this.properties = defaults.properties;
        }

        public Builder ancestor(@Nullable Output<String> ancestor) {
            this.ancestor = ancestor;
            return this;
        }

        public Builder ancestor(@Nullable String ancestor) {
            this.ancestor = Output.ofNullable(ancestor);
            return this;
        }

        public Builder indexId(@Nullable Output<String> indexId) {
            this.indexId = indexId;
            return this;
        }

        public Builder indexId(@Nullable String indexId) {
            this.indexId = Output.ofNullable(indexId);
            return this;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder properties(@Nullable Output<List<DataStoreIndexPropertyGetArgs>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable List<DataStoreIndexPropertyGetArgs> properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }
        public DataStoreIndexState build() {
            return new DataStoreIndexState(ancestor, indexId, kind, project, properties);
        }
    }
}
