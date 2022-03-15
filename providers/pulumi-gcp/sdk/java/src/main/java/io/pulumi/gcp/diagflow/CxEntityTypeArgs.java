// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.diagflow.inputs.CxEntityTypeEntityArgs;
import io.pulumi.gcp.diagflow.inputs.CxEntityTypeExcludedPhraseArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxEntityTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxEntityTypeArgs Empty = new CxEntityTypeArgs();

    /**
     * Represents kinds of entities.
     * * AUTO_EXPANSION_MODE_UNSPECIFIED: Auto expansion disabled for the entity.
     * * AUTO_EXPANSION_MODE_DEFAULT: Allows an agent to recognize values that have not been explicitly listed in the entity.
     *   Possible values are `AUTO_EXPANSION_MODE_DEFAULT` and `AUTO_EXPANSION_MODE_UNSPECIFIED`.
     * 
     */
    @Import(name="autoExpansionMode")
      private final @Nullable Output<String> autoExpansionMode;

    public Output<String> getAutoExpansionMode() {
        return this.autoExpansionMode == null ? Output.empty() : this.autoExpansionMode;
    }

    /**
     * The human-readable name of the entity type, unique within the agent.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Enables fuzzy entity extraction during classification.
     * 
     */
    @Import(name="enableFuzzyExtraction")
      private final @Nullable Output<Boolean> enableFuzzyExtraction;

    public Output<Boolean> getEnableFuzzyExtraction() {
        return this.enableFuzzyExtraction == null ? Output.empty() : this.enableFuzzyExtraction;
    }

    /**
     * The collection of entity entries associated with the entity type.
     * Structure is documented below.
     * 
     */
    @Import(name="entities", required=true)
      private final Output<List<CxEntityTypeEntityArgs>> entities;

    public Output<List<CxEntityTypeEntityArgs>> getEntities() {
        return this.entities;
    }

    /**
     * Collection of exceptional words and phrases that shouldn't be matched. For example, if you have a size entity type with entry giant(an adjective), you might consider adding giants(a noun) as an exclusion.
     * If the kind of entity type is KIND_MAP, then the phrases specified by entities and excluded phrases should be mutually exclusive.
     * Structure is documented below.
     * 
     */
    @Import(name="excludedPhrases")
      private final @Nullable Output<List<CxEntityTypeExcludedPhraseArgs>> excludedPhrases;

    public Output<List<CxEntityTypeExcludedPhraseArgs>> getExcludedPhrases() {
        return this.excludedPhrases == null ? Output.empty() : this.excludedPhrases;
    }

    /**
     * Indicates whether the entity type can be automatically expanded.
     * * KIND_MAP: Map entity types allow mapping of a group of synonyms to a canonical value.
     * * KIND_LIST: List entity types contain a set of entries that do not map to canonical values. However, list entity types can contain references to other entity types (with or without aliases).
     * * KIND_REGEXP: Regexp entity types allow to specify regular expressions in entries values.
     *   Possible values are `KIND_MAP`, `KIND_LIST`, and `KIND_REGEXP`.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }

    /**
     * The language of the following fields in entityType:
     * EntityType.entities.value
     * EntityType.entities.synonyms
     * EntityType.excluded_phrases.value
     * If not specified, the agent's default language is used. Many languages are supported. Note: languages must be enabled in the agent before they can be used.
     * 
     */
    @Import(name="languageCode")
      private final @Nullable Output<String> languageCode;

    public Output<String> getLanguageCode() {
        return this.languageCode == null ? Output.empty() : this.languageCode;
    }

    /**
     * The agent to create a entity type for.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>.
     * 
     */
    @Import(name="parent")
      private final @Nullable Output<String> parent;

    public Output<String> getParent() {
        return this.parent == null ? Output.empty() : this.parent;
    }

    /**
     * Indicates whether parameters of the entity type should be redacted in log. If redaction is enabled, page parameters and intent parameters referring to the entity type will be replaced by parameter name when logging.
     * 
     */
    @Import(name="redact")
      private final @Nullable Output<Boolean> redact;

    public Output<Boolean> getRedact() {
        return this.redact == null ? Output.empty() : this.redact;
    }

    public CxEntityTypeArgs(
        @Nullable Output<String> autoExpansionMode,
        Output<String> displayName,
        @Nullable Output<Boolean> enableFuzzyExtraction,
        Output<List<CxEntityTypeEntityArgs>> entities,
        @Nullable Output<List<CxEntityTypeExcludedPhraseArgs>> excludedPhrases,
        Output<String> kind,
        @Nullable Output<String> languageCode,
        @Nullable Output<String> parent,
        @Nullable Output<Boolean> redact) {
        this.autoExpansionMode = autoExpansionMode;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.enableFuzzyExtraction = enableFuzzyExtraction;
        this.entities = Objects.requireNonNull(entities, "expected parameter 'entities' to be non-null");
        this.excludedPhrases = excludedPhrases;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.languageCode = languageCode;
        this.parent = parent;
        this.redact = redact;
    }

    private CxEntityTypeArgs() {
        this.autoExpansionMode = Output.empty();
        this.displayName = Output.empty();
        this.enableFuzzyExtraction = Output.empty();
        this.entities = Output.empty();
        this.excludedPhrases = Output.empty();
        this.kind = Output.empty();
        this.languageCode = Output.empty();
        this.parent = Output.empty();
        this.redact = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxEntityTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> autoExpansionMode;
        private Output<String> displayName;
        private @Nullable Output<Boolean> enableFuzzyExtraction;
        private Output<List<CxEntityTypeEntityArgs>> entities;
        private @Nullable Output<List<CxEntityTypeExcludedPhraseArgs>> excludedPhrases;
        private Output<String> kind;
        private @Nullable Output<String> languageCode;
        private @Nullable Output<String> parent;
        private @Nullable Output<Boolean> redact;

        public Builder() {
    	      // Empty
        }

        public Builder(CxEntityTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoExpansionMode = defaults.autoExpansionMode;
    	      this.displayName = defaults.displayName;
    	      this.enableFuzzyExtraction = defaults.enableFuzzyExtraction;
    	      this.entities = defaults.entities;
    	      this.excludedPhrases = defaults.excludedPhrases;
    	      this.kind = defaults.kind;
    	      this.languageCode = defaults.languageCode;
    	      this.parent = defaults.parent;
    	      this.redact = defaults.redact;
        }

        public Builder autoExpansionMode(@Nullable Output<String> autoExpansionMode) {
            this.autoExpansionMode = autoExpansionMode;
            return this;
        }

        public Builder autoExpansionMode(@Nullable String autoExpansionMode) {
            this.autoExpansionMode = Output.ofNullable(autoExpansionMode);
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

        public Builder enableFuzzyExtraction(@Nullable Output<Boolean> enableFuzzyExtraction) {
            this.enableFuzzyExtraction = enableFuzzyExtraction;
            return this;
        }

        public Builder enableFuzzyExtraction(@Nullable Boolean enableFuzzyExtraction) {
            this.enableFuzzyExtraction = Output.ofNullable(enableFuzzyExtraction);
            return this;
        }

        public Builder entities(Output<List<CxEntityTypeEntityArgs>> entities) {
            this.entities = Objects.requireNonNull(entities);
            return this;
        }

        public Builder entities(List<CxEntityTypeEntityArgs> entities) {
            this.entities = Output.of(Objects.requireNonNull(entities));
            return this;
        }

        public Builder excludedPhrases(@Nullable Output<List<CxEntityTypeExcludedPhraseArgs>> excludedPhrases) {
            this.excludedPhrases = excludedPhrases;
            return this;
        }

        public Builder excludedPhrases(@Nullable List<CxEntityTypeExcludedPhraseArgs> excludedPhrases) {
            this.excludedPhrases = Output.ofNullable(excludedPhrases);
            return this;
        }

        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder languageCode(@Nullable Output<String> languageCode) {
            this.languageCode = languageCode;
            return this;
        }

        public Builder languageCode(@Nullable String languageCode) {
            this.languageCode = Output.ofNullable(languageCode);
            return this;
        }

        public Builder parent(@Nullable Output<String> parent) {
            this.parent = parent;
            return this;
        }

        public Builder parent(@Nullable String parent) {
            this.parent = Output.ofNullable(parent);
            return this;
        }

        public Builder redact(@Nullable Output<Boolean> redact) {
            this.redact = redact;
            return this;
        }

        public Builder redact(@Nullable Boolean redact) {
            this.redact = Output.ofNullable(redact);
            return this;
        }
        public CxEntityTypeArgs build() {
            return new CxEntityTypeArgs(autoExpansionMode, displayName, enableFuzzyExtraction, entities, excludedPhrases, kind, languageCode, parent, redact);
        }
    }
}
