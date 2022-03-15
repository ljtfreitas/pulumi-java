// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.servicemanagement_v1.inputs.LabelDescriptorArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A description of a log type. Example in YAML format: - name: library.googleapis.com/activity_history description: The history of borrowing and returning library items. display_name: Activity labels: - key: /customer_id description: Identifier of a library customer
 * 
 */
public final class LogDescriptorArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogDescriptorArgs Empty = new LogDescriptorArgs();

    /**
     * A human-readable description of this log. This information appears in the documentation and can contain details.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The human-readable name for this log. This information appears on the user interface and should be concise.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * The set of labels that are available to describe a specific log entry. Runtime requests that contain labels not specified here are considered invalid.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<List<LabelDescriptorArgs>> labels;

    public Output<List<LabelDescriptorArgs>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * The name of the log. It must be less than 512 characters long and can include the following characters: upper- and lower-case alphanumeric characters [A-Za-z0-9], and punctuation characters including slash, underscore, hyphen, period [/_-.].
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public LogDescriptorArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<List<LabelDescriptorArgs>> labels,
        @Nullable Output<String> name) {
        this.description = description;
        this.displayName = displayName;
        this.labels = labels;
        this.name = name;
    }

    private LogDescriptorArgs() {
        this.description = Output.empty();
        this.displayName = Output.empty();
        this.labels = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogDescriptorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<List<LabelDescriptorArgs>> labels;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(LogDescriptorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }

        public Builder labels(@Nullable Output<List<LabelDescriptorArgs>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable List<LabelDescriptorArgs> labels) {
            this.labels = Output.ofNullable(labels);
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
        public LogDescriptorArgs build() {
            return new LogDescriptorArgs(description, displayName, labels, name);
        }
    }
}
