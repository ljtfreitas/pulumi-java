// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.athena;

import io.pulumi.awsnative.athena.enums.WorkGroupState;
import io.pulumi.awsnative.athena.inputs.WorkGroupConfigurationArgs;
import io.pulumi.awsnative.athena.inputs.WorkGroupConfigurationUpdatesArgs;
import io.pulumi.awsnative.athena.inputs.WorkGroupTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkGroupArgs Empty = new WorkGroupArgs();

    /**
     * The workgroup description.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The workGroup name.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The option to delete the workgroup and its contents even if the workgroup contains any named queries.
     * 
     */
    @InputImport(name="recursiveDeleteOption")
        private final @Nullable Input<Boolean> recursiveDeleteOption;

    public Input<Boolean> getRecursiveDeleteOption() {
        return this.recursiveDeleteOption == null ? Input.empty() : this.recursiveDeleteOption;
    }

    /**
     * The state of the workgroup: ENABLED or DISABLED.
     * 
     */
    @InputImport(name="state")
        private final @Nullable Input<WorkGroupState> state;

    public Input<WorkGroupState> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * One or more tags, separated by commas, that you want to attach to the workgroup as you create it
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<List<WorkGroupTagArgs>> tags;

    public Input<List<WorkGroupTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The workgroup configuration
     * 
     */
    @InputImport(name="workGroupConfiguration")
        private final @Nullable Input<WorkGroupConfigurationArgs> workGroupConfiguration;

    public Input<WorkGroupConfigurationArgs> getWorkGroupConfiguration() {
        return this.workGroupConfiguration == null ? Input.empty() : this.workGroupConfiguration;
    }

    /**
     * The workgroup configuration update object
     * 
     */
    @InputImport(name="workGroupConfigurationUpdates")
        private final @Nullable Input<WorkGroupConfigurationUpdatesArgs> workGroupConfigurationUpdates;

    public Input<WorkGroupConfigurationUpdatesArgs> getWorkGroupConfigurationUpdates() {
        return this.workGroupConfigurationUpdates == null ? Input.empty() : this.workGroupConfigurationUpdates;
    }

    public WorkGroupArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<Boolean> recursiveDeleteOption,
        @Nullable Input<WorkGroupState> state,
        @Nullable Input<List<WorkGroupTagArgs>> tags,
        @Nullable Input<WorkGroupConfigurationArgs> workGroupConfiguration,
        @Nullable Input<WorkGroupConfigurationUpdatesArgs> workGroupConfigurationUpdates) {
        this.description = description;
        this.name = name;
        this.recursiveDeleteOption = recursiveDeleteOption;
        this.state = state;
        this.tags = tags;
        this.workGroupConfiguration = workGroupConfiguration;
        this.workGroupConfigurationUpdates = workGroupConfigurationUpdates;
    }

    private WorkGroupArgs() {
        this.description = Input.empty();
        this.name = Input.empty();
        this.recursiveDeleteOption = Input.empty();
        this.state = Input.empty();
        this.tags = Input.empty();
        this.workGroupConfiguration = Input.empty();
        this.workGroupConfigurationUpdates = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<Boolean> recursiveDeleteOption;
        private @Nullable Input<WorkGroupState> state;
        private @Nullable Input<List<WorkGroupTagArgs>> tags;
        private @Nullable Input<WorkGroupConfigurationArgs> workGroupConfiguration;
        private @Nullable Input<WorkGroupConfigurationUpdatesArgs> workGroupConfigurationUpdates;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.recursiveDeleteOption = defaults.recursiveDeleteOption;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.workGroupConfiguration = defaults.workGroupConfiguration;
    	      this.workGroupConfigurationUpdates = defaults.workGroupConfigurationUpdates;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
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

        public Builder setRecursiveDeleteOption(@Nullable Input<Boolean> recursiveDeleteOption) {
            this.recursiveDeleteOption = recursiveDeleteOption;
            return this;
        }

        public Builder setRecursiveDeleteOption(@Nullable Boolean recursiveDeleteOption) {
            this.recursiveDeleteOption = Input.ofNullable(recursiveDeleteOption);
            return this;
        }

        public Builder setState(@Nullable Input<WorkGroupState> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable WorkGroupState state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setTags(@Nullable Input<List<WorkGroupTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<WorkGroupTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setWorkGroupConfiguration(@Nullable Input<WorkGroupConfigurationArgs> workGroupConfiguration) {
            this.workGroupConfiguration = workGroupConfiguration;
            return this;
        }

        public Builder setWorkGroupConfiguration(@Nullable WorkGroupConfigurationArgs workGroupConfiguration) {
            this.workGroupConfiguration = Input.ofNullable(workGroupConfiguration);
            return this;
        }

        public Builder setWorkGroupConfigurationUpdates(@Nullable Input<WorkGroupConfigurationUpdatesArgs> workGroupConfigurationUpdates) {
            this.workGroupConfigurationUpdates = workGroupConfigurationUpdates;
            return this;
        }

        public Builder setWorkGroupConfigurationUpdates(@Nullable WorkGroupConfigurationUpdatesArgs workGroupConfigurationUpdates) {
            this.workGroupConfigurationUpdates = Input.ofNullable(workGroupConfigurationUpdates);
            return this;
        }
        public WorkGroupArgs build() {
            return new WorkGroupArgs(description, name, recursiveDeleteOption, state, tags, workGroupConfiguration, workGroupConfigurationUpdates);
        }
    }
}
