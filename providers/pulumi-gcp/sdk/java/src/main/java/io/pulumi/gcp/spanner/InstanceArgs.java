// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.spanner;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * The name of the instance's configuration (similar but not
     * quite the same as a region) which defines the geographic placement and
     * replication of your databases in this instance. It determines where your data
     * is stored. Values are typically of the form `regional-europe-west1` , `us-central` etc.
     * In order to obtain a valid list please consult the
     * [Configuration section of the docs](https://cloud.google.com/spanner/docs/instances).
     * 
     */
    @Import(name="config", required=true)
      private final Output<String> config;

    public Output<String> getConfig() {
        return this.config;
    }

    /**
     * The descriptive name for this instance as it appears in UIs. Must be
     * unique per project and between 4 and 30 characters in length.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * When deleting a spanner instance, this boolean option will delete all backups of this instance.
     * This must be set to true if you created a backup manually in the console.
     * 
     */
    @Import(name="forceDestroy")
      private final @Nullable Output<Boolean> forceDestroy;

    public Output<Boolean> getForceDestroy() {
        return this.forceDestroy == null ? Output.empty() : this.forceDestroy;
    }

    /**
     * An object containing a list of "key": value pairs.
     * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * A unique identifier for the instance, which cannot be changed after
     * the instance is created. The name must be between 6 and 30 characters
     * in length.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The number of nodes allocated to this instance. Exactly one of either node_count or processing_units must be present in
     * terraform.
     * 
     */
    @Import(name="numNodes")
      private final @Nullable Output<Integer> numNodes;

    public Output<Integer> getNumNodes() {
        return this.numNodes == null ? Output.empty() : this.numNodes;
    }

    /**
     * The number of processing units allocated to this instance. Exactly one of processing_units or node_count must be present
     * in terraform.
     * 
     */
    @Import(name="processingUnits")
      private final @Nullable Output<Integer> processingUnits;

    public Output<Integer> getProcessingUnits() {
        return this.processingUnits == null ? Output.empty() : this.processingUnits;
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

    public InstanceArgs(
        Output<String> config,
        Output<String> displayName,
        @Nullable Output<Boolean> forceDestroy,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name,
        @Nullable Output<Integer> numNodes,
        @Nullable Output<Integer> processingUnits,
        @Nullable Output<String> project) {
        this.config = Objects.requireNonNull(config, "expected parameter 'config' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.forceDestroy = forceDestroy;
        this.labels = labels;
        this.name = name;
        this.numNodes = numNodes;
        this.processingUnits = processingUnits;
        this.project = project;
    }

    private InstanceArgs() {
        this.config = Output.empty();
        this.displayName = Output.empty();
        this.forceDestroy = Output.empty();
        this.labels = Output.empty();
        this.name = Output.empty();
        this.numNodes = Output.empty();
        this.processingUnits = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> config;
        private Output<String> displayName;
        private @Nullable Output<Boolean> forceDestroy;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> numNodes;
        private @Nullable Output<Integer> processingUnits;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.displayName = defaults.displayName;
    	      this.forceDestroy = defaults.forceDestroy;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.numNodes = defaults.numNodes;
    	      this.processingUnits = defaults.processingUnits;
    	      this.project = defaults.project;
        }

        public Builder config(Output<String> config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder config(String config) {
            this.config = Output.of(Objects.requireNonNull(config));
            return this;
        }

        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }

        public Builder forceDestroy(@Nullable Boolean forceDestroy) {
            this.forceDestroy = Output.ofNullable(forceDestroy);
            return this;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
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

        public Builder numNodes(@Nullable Output<Integer> numNodes) {
            this.numNodes = numNodes;
            return this;
        }

        public Builder numNodes(@Nullable Integer numNodes) {
            this.numNodes = Output.ofNullable(numNodes);
            return this;
        }

        public Builder processingUnits(@Nullable Output<Integer> processingUnits) {
            this.processingUnits = processingUnits;
            return this;
        }

        public Builder processingUnits(@Nullable Integer processingUnits) {
            this.processingUnits = Output.ofNullable(processingUnits);
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
        public InstanceArgs build() {
            return new InstanceArgs(config, displayName, forceDestroy, labels, name, numNodes, processingUnits, project);
        }
    }
}
