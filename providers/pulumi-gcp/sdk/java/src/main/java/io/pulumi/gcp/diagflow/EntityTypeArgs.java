// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.diagflow.inputs.EntityTypeEntityArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EntityTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final EntityTypeArgs Empty = new EntityTypeArgs();

    /**
     * The name of this entity type to be displayed on the console.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Enables fuzzy entity extraction during classification.
     * 
     */
    @Import(name="enableFuzzyExtraction")
      private final @Nullable Output<Boolean> enableFuzzyExtraction;

    public Output<Boolean> getEnableFuzzyExtraction() {
        return this.enableFuzzyExtraction == null ? Output.empty() : this.enableFuzzyExtraction;
    }

    /**
     * The collection of entity entries associated with the entity type.
     * Structure is documented below.
     * 
     */
    @Import(name="entities")
      private final @Nullable Output<List<EntityTypeEntityArgs>> entities;

    public Output<List<EntityTypeEntityArgs>> getEntities() {
        return this.entities == null ? Output.empty() : this.entities;
    }

    /**
     * Indicates the kind of entity type.
     * * KIND_MAP: Map entity types allow mapping of a group of synonyms to a reference value.
     * * KIND_LIST: List entity types contain a set of entries that do not map to reference values. However, list entity
     *   types can contain references to other entity types (with or without aliases).
     * * KIND_REGEXP: Regexp entity types allow to specify regular expressions in entries values.
     *   Possible values are `KIND_MAP`, `KIND_LIST`, and `KIND_REGEXP`.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
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

    public EntityTypeArgs(
        Output<String> displayName,
        @Nullable Output<Boolean> enableFuzzyExtraction,
        @Nullable Output<List<EntityTypeEntityArgs>> entities,
        Output<String> kind,
        @Nullable Output<String> project) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.enableFuzzyExtraction = enableFuzzyExtraction;
        this.entities = entities;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.project = project;
    }

    private EntityTypeArgs() {
        this.displayName = Output.empty();
        this.enableFuzzyExtraction = Output.empty();
        this.entities = Output.empty();
        this.kind = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntityTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> displayName;
        private @Nullable Output<Boolean> enableFuzzyExtraction;
        private @Nullable Output<List<EntityTypeEntityArgs>> entities;
        private Output<String> kind;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(EntityTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.enableFuzzyExtraction = defaults.enableFuzzyExtraction;
    	      this.entities = defaults.entities;
    	      this.kind = defaults.kind;
    	      this.project = defaults.project;
        }

        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder enableFuzzyExtraction(@Nullable Output<Boolean> enableFuzzyExtraction) {
            this.enableFuzzyExtraction = enableFuzzyExtraction;
            return this;
        }

        public Builder enableFuzzyExtraction(@Nullable Boolean enableFuzzyExtraction) {
            this.enableFuzzyExtraction = Output.ofNullable(enableFuzzyExtraction);
            return this;
        }

        public Builder entities(@Nullable Output<List<EntityTypeEntityArgs>> entities) {
            this.entities = entities;
            return this;
        }

        public Builder entities(@Nullable List<EntityTypeEntityArgs> entities) {
            this.entities = Output.ofNullable(entities);
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
            this.project = Output.ofNullable(project);
            return this;
        }
        public EntityTypeArgs build() {
            return new EntityTypeArgs(displayName, enableFuzzyExtraction, entities, kind, project);
        }
    }
}
