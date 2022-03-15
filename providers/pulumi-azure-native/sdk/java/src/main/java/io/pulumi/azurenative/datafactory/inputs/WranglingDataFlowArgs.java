// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.DataFlowFolderArgs;
import io.pulumi.azurenative.datafactory.inputs.PowerQuerySourceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Power Query data flow.
 * 
 */
public final class WranglingDataFlowArgs extends io.pulumi.resources.ResourceArgs {

    public static final WranglingDataFlowArgs Empty = new WranglingDataFlowArgs();

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
     * Locale of the Power query mashup document.
     * 
     */
    @Import(name="documentLocale")
      private final @Nullable Output<String> documentLocale;

    public Output<String> getDocumentLocale() {
        return this.documentLocale == null ? Output.empty() : this.documentLocale;
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
     * Power query mashup script.
     * 
     */
    @Import(name="script")
      private final @Nullable Output<String> script;

    public Output<String> getScript() {
        return this.script == null ? Output.empty() : this.script;
    }

    /**
     * List of sources in Power Query.
     * 
     */
    @Import(name="sources")
      private final @Nullable Output<List<PowerQuerySourceArgs>> sources;

    public Output<List<PowerQuerySourceArgs>> getSources() {
        return this.sources == null ? Output.empty() : this.sources;
    }

    /**
     * Type of data flow.
     * Expected value is 'WranglingDataFlow'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public WranglingDataFlowArgs(
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<String> description,
        @Nullable Output<String> documentLocale,
        @Nullable Output<DataFlowFolderArgs> folder,
        @Nullable Output<String> script,
        @Nullable Output<List<PowerQuerySourceArgs>> sources,
        Output<String> type) {
        this.annotations = annotations;
        this.description = description;
        this.documentLocale = documentLocale;
        this.folder = folder;
        this.script = script;
        this.sources = sources;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private WranglingDataFlowArgs() {
        this.annotations = Output.empty();
        this.description = Output.empty();
        this.documentLocale = Output.empty();
        this.folder = Output.empty();
        this.script = Output.empty();
        this.sources = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WranglingDataFlowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<String> description;
        private @Nullable Output<String> documentLocale;
        private @Nullable Output<DataFlowFolderArgs> folder;
        private @Nullable Output<String> script;
        private @Nullable Output<List<PowerQuerySourceArgs>> sources;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(WranglingDataFlowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.description = defaults.description;
    	      this.documentLocale = defaults.documentLocale;
    	      this.folder = defaults.folder;
    	      this.script = defaults.script;
    	      this.sources = defaults.sources;
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

        public Builder documentLocale(@Nullable Output<String> documentLocale) {
            this.documentLocale = documentLocale;
            return this;
        }

        public Builder documentLocale(@Nullable String documentLocale) {
            this.documentLocale = Output.ofNullable(documentLocale);
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

        public Builder sources(@Nullable Output<List<PowerQuerySourceArgs>> sources) {
            this.sources = sources;
            return this;
        }

        public Builder sources(@Nullable List<PowerQuerySourceArgs> sources) {
            this.sources = Output.ofNullable(sources);
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
        public WranglingDataFlowArgs build() {
            return new WranglingDataFlowArgs(annotations, description, documentLocale, folder, script, sources, type);
        }
    }
}
