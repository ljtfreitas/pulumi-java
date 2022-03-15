// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectExclusionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectExclusionArgs Empty = new ProjectExclusionArgs();

    /**
     * A human-readable description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Whether this exclusion rule should be disabled or not. This defaults to
     * false.
     * 
     */
    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> getDisabled() {
        return this.disabled == null ? Output.empty() : this.disabled;
    }

    /**
     * The filter to apply when excluding logs. Only log entries that match the filter are excluded.
     * See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
     * write a filter.
     * 
     */
    @Import(name="filter", required=true)
      private final Output<String> filter;

    public Output<String> getFilter() {
        return this.filter;
    }

    /**
     * The name of the logging exclusion.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The project to create the exclusion in. If omitted, the project associated with the provider is
     * used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    public ProjectExclusionArgs(
        @Nullable Output<String> description,
        @Nullable Output<Boolean> disabled,
        Output<String> filter,
        @Nullable Output<String> name,
        @Nullable Output<String> project) {
        this.description = description;
        this.disabled = disabled;
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.name = name;
        this.project = project;
    }

    private ProjectExclusionArgs() {
        this.description = Output.empty();
        this.disabled = Output.empty();
        this.filter = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectExclusionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> disabled;
        private Output<String> filter;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectExclusionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder disabled(@Nullable Output<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Output.ofNullable(disabled);
            return this;
        }

        public Builder filter(Output<String> filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder filter(String filter) {
            this.filter = Output.of(Objects.requireNonNull(filter));
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
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
        public ProjectExclusionArgs build() {
            return new ProjectExclusionArgs(description, disabled, filter, name, project);
        }
    }
}
