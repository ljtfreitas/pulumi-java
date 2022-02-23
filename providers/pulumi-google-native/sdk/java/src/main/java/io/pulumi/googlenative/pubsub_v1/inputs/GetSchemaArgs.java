// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSchemaArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSchemaArgs Empty = new GetSchemaArgs();

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="schemaId", required=true)
      private final String schemaId;

    public String getSchemaId() {
        return this.schemaId;
    }

    @InputImport(name="view")
      private final @Nullable String view;

    public Optional<String> getView() {
        return this.view == null ? Optional.empty() : Optional.ofNullable(this.view);
    }

    public GetSchemaArgs(
        @Nullable String project,
        String schemaId,
        @Nullable String view) {
        this.project = project;
        this.schemaId = Objects.requireNonNull(schemaId, "expected parameter 'schemaId' to be non-null");
        this.view = view;
    }

    private GetSchemaArgs() {
        this.project = null;
        this.schemaId = null;
        this.view = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String schemaId;
        private @Nullable String view;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.schemaId = defaults.schemaId;
    	      this.view = defaults.view;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setSchemaId(String schemaId) {
            this.schemaId = Objects.requireNonNull(schemaId);
            return this;
        }

        public Builder setView(@Nullable String view) {
            this.view = view;
            return this;
        }
        public GetSchemaArgs build() {
            return new GetSchemaArgs(project, schemaId, view);
        }
    }
}
