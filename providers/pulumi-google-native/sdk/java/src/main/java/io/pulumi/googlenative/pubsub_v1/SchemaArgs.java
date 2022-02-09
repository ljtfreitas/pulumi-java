// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.pubsub_v1.enums.SchemaType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SchemaArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchemaArgs Empty = new SchemaArgs();

    @InputImport(name="definition")
    private final @Nullable Input<String> definition;

    public Input<String> getDefinition() {
        return this.definition == null ? Input.empty() : this.definition;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="schemaId")
    private final @Nullable Input<String> schemaId;

    public Input<String> getSchemaId() {
        return this.schemaId == null ? Input.empty() : this.schemaId;
    }

    @InputImport(name="type")
    private final @Nullable Input<SchemaType> type;

    public Input<SchemaType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public SchemaArgs(
        @Nullable Input<String> definition,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> schemaId,
        @Nullable Input<SchemaType> type) {
        this.definition = definition;
        this.name = name;
        this.project = project;
        this.schemaId = schemaId;
        this.type = type;
    }

    private SchemaArgs() {
        this.definition = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.schemaId = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> definition;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> schemaId;
        private @Nullable Input<SchemaType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definition = defaults.definition;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.schemaId = defaults.schemaId;
    	      this.type = defaults.type;
        }

        public Builder setDefinition(@Nullable Input<String> definition) {
            this.definition = definition;
            return this;
        }

        public Builder setDefinition(@Nullable String definition) {
            this.definition = Input.ofNullable(definition);
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

        public Builder setSchemaId(@Nullable Input<String> schemaId) {
            this.schemaId = schemaId;
            return this;
        }

        public Builder setSchemaId(@Nullable String schemaId) {
            this.schemaId = Input.ofNullable(schemaId);
            return this;
        }

        public Builder setType(@Nullable Input<SchemaType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable SchemaType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public SchemaArgs build() {
            return new SchemaArgs(definition, name, project, schemaId, type);
        }
    }
}