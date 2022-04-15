// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.diagflow.inputs.EntityTypeEntityGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EntityTypeState extends io.pulumi.resources.ResourceArgs {

    public static final EntityTypeState Empty = new EntityTypeState();

    /**
     * The name of this entity type to be displayed on the console.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * Enables fuzzy entity extraction during classification.
     * 
     */
    @Import(name="enableFuzzyExtraction")
      private final @Nullable Output<Boolean> enableFuzzyExtraction;

    public Output<Boolean> enableFuzzyExtraction() {
        return this.enableFuzzyExtraction == null ? Codegen.empty() : this.enableFuzzyExtraction;
    }

    /**
     * The collection of entity entries associated with the entity type.
     * Structure is documented below.
     * 
     */
    @Import(name="entities")
      private final @Nullable Output<List<EntityTypeEntityGetArgs>> entities;

    public Output<List<EntityTypeEntityGetArgs>> entities() {
        return this.entities == null ? Codegen.empty() : this.entities;
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
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * The unique identifier of the entity type. Format: projects/<Project ID>/agent/entityTypes/<Entity type ID>.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
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

    public EntityTypeState(
        @Nullable Output<String> displayName,
        @Nullable Output<Boolean> enableFuzzyExtraction,
        @Nullable Output<List<EntityTypeEntityGetArgs>> entities,
        @Nullable Output<String> kind,
        @Nullable Output<String> name,
        @Nullable Output<String> project) {
        this.displayName = displayName;
        this.enableFuzzyExtraction = enableFuzzyExtraction;
        this.entities = entities;
        this.kind = kind;
        this.name = name;
        this.project = project;
    }

    private EntityTypeState() {
        this.displayName = Codegen.empty();
        this.enableFuzzyExtraction = Codegen.empty();
        this.entities = Codegen.empty();
        this.kind = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntityTypeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> displayName;
        private @Nullable Output<Boolean> enableFuzzyExtraction;
        private @Nullable Output<List<EntityTypeEntityGetArgs>> entities;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(EntityTypeState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.enableFuzzyExtraction = defaults.enableFuzzyExtraction;
    	      this.entities = defaults.entities;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder enableFuzzyExtraction(@Nullable Output<Boolean> enableFuzzyExtraction) {
            this.enableFuzzyExtraction = enableFuzzyExtraction;
            return this;
        }
        public Builder enableFuzzyExtraction(@Nullable Boolean enableFuzzyExtraction) {
            this.enableFuzzyExtraction = Codegen.ofNullable(enableFuzzyExtraction);
            return this;
        }
        public Builder entities(@Nullable Output<List<EntityTypeEntityGetArgs>> entities) {
            this.entities = entities;
            return this;
        }
        public Builder entities(@Nullable List<EntityTypeEntityGetArgs> entities) {
            this.entities = Codegen.ofNullable(entities);
            return this;
        }
        public Builder entities(EntityTypeEntityGetArgs... entities) {
            return entities(List.of(entities));
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public EntityTypeState build() {
            return new EntityTypeState(displayName, enableFuzzyExtraction, entities, kind, name, project);
        }
    }
}
