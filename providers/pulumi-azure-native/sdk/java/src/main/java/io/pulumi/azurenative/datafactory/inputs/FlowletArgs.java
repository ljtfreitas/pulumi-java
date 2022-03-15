// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.DataFlowFolderArgs;
import io.pulumi.azurenative.datafactory.inputs.DataFlowSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.DataFlowSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.TransformationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Data flow flowlet
 * 
 */
public final class FlowletArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowletArgs Empty = new FlowletArgs();

    /**
     * List of tags that can be used for describing the data flow.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<List<Object>> annotations;

    public Output<List<Object>> getAnnotations() {
        return this.annotations == null ? Output.empty() : this.annotations;
    }

    /**
     * The description of the data flow.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The folder that this data flow is in. If not specified, Data flow will appear at the root level.
     * 
     */
    @Import(name="folder")
      private final @Nullable Output<DataFlowFolderArgs> folder;

    public Output<DataFlowFolderArgs> getFolder() {
        return this.folder == null ? Output.empty() : this.folder;
    }

    /**
     * Flowlet script.
     * 
     */
    @Import(name="script")
      private final @Nullable Output<String> script;

    public Output<String> getScript() {
        return this.script == null ? Output.empty() : this.script;
    }

    /**
     * Flowlet script lines.
     * 
     */
    @Import(name="scriptLines")
      private final @Nullable Output<List<String>> scriptLines;

    public Output<List<String>> getScriptLines() {
        return this.scriptLines == null ? Output.empty() : this.scriptLines;
    }

    /**
     * List of sinks in Flowlet.
     * 
     */
    @Import(name="sinks")
      private final @Nullable Output<List<DataFlowSinkArgs>> sinks;

    public Output<List<DataFlowSinkArgs>> getSinks() {
        return this.sinks == null ? Output.empty() : this.sinks;
    }

    /**
     * List of sources in Flowlet.
     * 
     */
    @Import(name="sources")
      private final @Nullable Output<List<DataFlowSourceArgs>> sources;

    public Output<List<DataFlowSourceArgs>> getSources() {
        return this.sources == null ? Output.empty() : this.sources;
    }

    /**
     * List of transformations in Flowlet.
     * 
     */
    @Import(name="transformations")
      private final @Nullable Output<List<TransformationArgs>> transformations;

    public Output<List<TransformationArgs>> getTransformations() {
        return this.transformations == null ? Output.empty() : this.transformations;
    }

    /**
     * Type of data flow.
     * Expected value is 'Flowlet'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public FlowletArgs(
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<String> description,
        @Nullable Output<DataFlowFolderArgs> folder,
        @Nullable Output<String> script,
        @Nullable Output<List<String>> scriptLines,
        @Nullable Output<List<DataFlowSinkArgs>> sinks,
        @Nullable Output<List<DataFlowSourceArgs>> sources,
        @Nullable Output<List<TransformationArgs>> transformations,
        Output<String> type) {
        this.annotations = annotations;
        this.description = description;
        this.folder = folder;
        this.script = script;
        this.scriptLines = scriptLines;
        this.sinks = sinks;
        this.sources = sources;
        this.transformations = transformations;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private FlowletArgs() {
        this.annotations = Output.empty();
        this.description = Output.empty();
        this.folder = Output.empty();
        this.script = Output.empty();
        this.scriptLines = Output.empty();
        this.sinks = Output.empty();
        this.sources = Output.empty();
        this.transformations = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowletArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<String> description;
        private @Nullable Output<DataFlowFolderArgs> folder;
        private @Nullable Output<String> script;
        private @Nullable Output<List<String>> scriptLines;
        private @Nullable Output<List<DataFlowSinkArgs>> sinks;
        private @Nullable Output<List<DataFlowSourceArgs>> sources;
        private @Nullable Output<List<TransformationArgs>> transformations;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowletArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.description = defaults.description;
    	      this.folder = defaults.folder;
    	      this.script = defaults.script;
    	      this.scriptLines = defaults.scriptLines;
    	      this.sinks = defaults.sinks;
    	      this.sources = defaults.sources;
    	      this.transformations = defaults.transformations;
    	      this.type = defaults.type;
        }

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Output.ofNullable(annotations);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder folder(@Nullable Output<DataFlowFolderArgs> folder) {
            this.folder = folder;
            return this;
        }

        public Builder folder(@Nullable DataFlowFolderArgs folder) {
            this.folder = Output.ofNullable(folder);
            return this;
        }

        public Builder script(@Nullable Output<String> script) {
            this.script = script;
            return this;
        }

        public Builder script(@Nullable String script) {
            this.script = Output.ofNullable(script);
            return this;
        }

        public Builder scriptLines(@Nullable Output<List<String>> scriptLines) {
            this.scriptLines = scriptLines;
            return this;
        }

        public Builder scriptLines(@Nullable List<String> scriptLines) {
            this.scriptLines = Output.ofNullable(scriptLines);
            return this;
        }

        public Builder sinks(@Nullable Output<List<DataFlowSinkArgs>> sinks) {
            this.sinks = sinks;
            return this;
        }

        public Builder sinks(@Nullable List<DataFlowSinkArgs> sinks) {
            this.sinks = Output.ofNullable(sinks);
            return this;
        }

        public Builder sources(@Nullable Output<List<DataFlowSourceArgs>> sources) {
            this.sources = sources;
            return this;
        }

        public Builder sources(@Nullable List<DataFlowSourceArgs> sources) {
            this.sources = Output.ofNullable(sources);
            return this;
        }

        public Builder transformations(@Nullable Output<List<TransformationArgs>> transformations) {
            this.transformations = transformations;
            return this;
        }

        public Builder transformations(@Nullable List<TransformationArgs> transformations) {
            this.transformations = Output.ofNullable(transformations);
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public FlowletArgs build() {
            return new FlowletArgs(annotations, description, folder, script, scriptLines, sinks, sources, transformations, type);
        }
    }
}
