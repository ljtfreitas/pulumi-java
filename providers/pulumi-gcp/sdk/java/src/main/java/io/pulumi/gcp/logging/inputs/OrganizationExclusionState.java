// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationExclusionState extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationExclusionState Empty = new OrganizationExclusionState();

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
    @Import(name="filter")
      private final @Nullable Output<String> filter;

    public Output<String> getFilter() {
        return this.filter == null ? Output.empty() : this.filter;
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
     * The organization to create the exclusion in.
     * 
     */
    @Import(name="orgId")
      private final @Nullable Output<String> orgId;

    public Output<String> getOrgId() {
        return this.orgId == null ? Output.empty() : this.orgId;
    }

    public OrganizationExclusionState(
        @Nullable Output<String> description,
        @Nullable Output<Boolean> disabled,
        @Nullable Output<String> filter,
        @Nullable Output<String> name,
        @Nullable Output<String> orgId) {
        this.description = description;
        this.disabled = disabled;
        this.filter = filter;
        this.name = name;
        this.orgId = orgId;
    }

    private OrganizationExclusionState() {
        this.description = Output.empty();
        this.disabled = Output.empty();
        this.filter = Output.empty();
        this.name = Output.empty();
        this.orgId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationExclusionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> disabled;
        private @Nullable Output<String> filter;
        private @Nullable Output<String> name;
        private @Nullable Output<String> orgId;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationExclusionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
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

        public Builder filter(@Nullable Output<String> filter) {
            this.filter = filter;
            return this;
        }

        public Builder filter(@Nullable String filter) {
            this.filter = Output.ofNullable(filter);
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

        public Builder orgId(@Nullable Output<String> orgId) {
            this.orgId = orgId;
            return this;
        }

        public Builder orgId(@Nullable String orgId) {
            this.orgId = Output.ofNullable(orgId);
            return this;
        }
        public OrganizationExclusionState build() {
            return new OrganizationExclusionState(description, disabled, filter, name, orgId);
        }
    }
}
