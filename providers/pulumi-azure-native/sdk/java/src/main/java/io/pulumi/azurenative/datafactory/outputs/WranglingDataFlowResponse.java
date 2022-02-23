// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.DataFlowResponseFolder;
import io.pulumi.azurenative.datafactory.outputs.PowerQuerySourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WranglingDataFlowResponse {
    /**
     * List of tags that can be used for describing the data flow.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The description of the data flow.
     * 
     */
    private final @Nullable String description;
    /**
     * Locale of the Power query mashup document.
     * 
     */
    private final @Nullable String documentLocale;
    /**
     * The folder that this data flow is in. If not specified, Data flow will appear at the root level.
     * 
     */
    private final @Nullable DataFlowResponseFolder folder;
    /**
     * Power query mashup script.
     * 
     */
    private final @Nullable String script;
    /**
     * List of sources in Power Query.
     * 
     */
    private final @Nullable List<PowerQuerySourceResponse> sources;
    /**
     * Type of data flow.
     * Expected value is 'WranglingDataFlow'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"annotations","description","documentLocale","folder","script","sources","type"})
    private WranglingDataFlowResponse(
        @Nullable List<Object> annotations,
        @Nullable String description,
        @Nullable String documentLocale,
        @Nullable DataFlowResponseFolder folder,
        @Nullable String script,
        @Nullable List<PowerQuerySourceResponse> sources,
        String type) {
        this.annotations = annotations;
        this.description = description;
        this.documentLocale = documentLocale;
        this.folder = folder;
        this.script = script;
        this.sources = sources;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * List of tags that can be used for describing the data flow.
     * 
     */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The description of the data flow.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Locale of the Power query mashup document.
     * 
     */
    public Optional<String> getDocumentLocale() {
        return Optional.ofNullable(this.documentLocale);
    }
    /**
     * The folder that this data flow is in. If not specified, Data flow will appear at the root level.
     * 
     */
    public Optional<DataFlowResponseFolder> getFolder() {
        return Optional.ofNullable(this.folder);
    }
    /**
     * Power query mashup script.
     * 
     */
    public Optional<String> getScript() {
        return Optional.ofNullable(this.script);
    }
    /**
     * List of sources in Power Query.
     * 
     */
    public List<PowerQuerySourceResponse> getSources() {
        return this.sources == null ? List.of() : this.sources;
    }
    /**
     * Type of data flow.
     * Expected value is 'WranglingDataFlow'.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WranglingDataFlowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable String description;
        private @Nullable String documentLocale;
        private @Nullable DataFlowResponseFolder folder;
        private @Nullable String script;
        private @Nullable List<PowerQuerySourceResponse> sources;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(WranglingDataFlowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.description = defaults.description;
    	      this.documentLocale = defaults.documentLocale;
    	      this.folder = defaults.folder;
    	      this.script = defaults.script;
    	      this.sources = defaults.sources;
    	      this.type = defaults.type;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDocumentLocale(@Nullable String documentLocale) {
            this.documentLocale = documentLocale;
            return this;
        }

        public Builder setFolder(@Nullable DataFlowResponseFolder folder) {
            this.folder = folder;
            return this;
        }

        public Builder setScript(@Nullable String script) {
            this.script = script;
            return this;
        }

        public Builder setSources(@Nullable List<PowerQuerySourceResponse> sources) {
            this.sources = sources;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public WranglingDataFlowResponse build() {
            return new WranglingDataFlowResponse(annotations, description, documentLocale, folder, script, sources, type);
        }
    }
}
