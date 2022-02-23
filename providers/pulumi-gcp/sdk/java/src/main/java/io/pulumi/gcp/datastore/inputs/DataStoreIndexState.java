// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datastore.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="ancestor")
        private final @Nullable Input<String> ancestor;

    public Input<String> getAncestor() {
        return this.ancestor == null ? Input.empty() : this.ancestor;
    }

    /**
     * The index id.
     * 
     */
    @InputImport(name="indexId")
        private final @Nullable Input<String> indexId;

    public Input<String> getIndexId() {
        return this.indexId == null ? Input.empty() : this.indexId;
    }

    /**
     * The entity kind which the index applies to.
     * 
     */
    @InputImport(name="kind")
        private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
        private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * An ordered list of properties to index on.
     * Structure is documented below.
     * 
     */
    @InputImport(name="properties")
        private final @Nullable Input<List<DataStoreIndexPropertyGetArgs>> properties;

    public Input<List<DataStoreIndexPropertyGetArgs>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    public DataStoreIndexState(
        @Nullable Input<String> ancestor,
        @Nullable Input<String> indexId,
        @Nullable Input<String> kind,
        @Nullable Input<String> project,
        @Nullable Input<List<DataStoreIndexPropertyGetArgs>> properties) {
        this.ancestor = ancestor;
        this.indexId = indexId;
        this.kind = kind;
        this.project = project;
        this.properties = properties;
    }

    private DataStoreIndexState() {
        this.ancestor = Input.empty();
        this.indexId = Input.empty();
        this.kind = Input.empty();
        this.project = Input.empty();
        this.properties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataStoreIndexState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ancestor;
        private @Nullable Input<String> indexId;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> project;
        private @Nullable Input<List<DataStoreIndexPropertyGetArgs>> properties;

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

        public Builder setAncestor(@Nullable Input<String> ancestor) {
            this.ancestor = ancestor;
            return this;
        }

        public Builder setAncestor(@Nullable String ancestor) {
            this.ancestor = Input.ofNullable(ancestor);
            return this;
        }

        public Builder setIndexId(@Nullable Input<String> indexId) {
            this.indexId = indexId;
            return this;
        }

        public Builder setIndexId(@Nullable String indexId) {
            this.indexId = Input.ofNullable(indexId);
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setProperties(@Nullable Input<List<DataStoreIndexPropertyGetArgs>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable List<DataStoreIndexPropertyGetArgs> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }
        public DataStoreIndexState build() {
            return new DataStoreIndexState(ancestor, indexId, kind, project, properties);
        }
    }
}
