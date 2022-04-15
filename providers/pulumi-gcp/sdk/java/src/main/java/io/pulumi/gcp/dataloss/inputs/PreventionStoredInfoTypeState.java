// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeDictionaryGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeLargeCustomDictionaryGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeRegexGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionStoredInfoTypeState extends io.pulumi.resources.ResourceArgs {

    public static final PreventionStoredInfoTypeState Empty = new PreventionStoredInfoTypeState();

    /**
     * A description of the info type.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Dictionary which defines the rule.
     * Structure is documented below.
     * 
     */
    @Import(name="dictionary")
      private final @Nullable Output<PreventionStoredInfoTypeDictionaryGetArgs> dictionary;

    public Output<PreventionStoredInfoTypeDictionaryGetArgs> dictionary() {
        return this.dictionary == null ? Codegen.empty() : this.dictionary;
    }

    /**
     * User set display name of the info type.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * Dictionary which defines the rule.
     * Structure is documented below.
     * 
     */
    @Import(name="largeCustomDictionary")
      private final @Nullable Output<PreventionStoredInfoTypeLargeCustomDictionaryGetArgs> largeCustomDictionary;

    public Output<PreventionStoredInfoTypeLargeCustomDictionaryGetArgs> largeCustomDictionary() {
        return this.largeCustomDictionary == null ? Codegen.empty() : this.largeCustomDictionary;
    }

    /**
     * Name describing the field.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The parent of the info type in any of the following formats:
     * * `projects/{{project}}`
     * * `projects/{{project}}/locations/{{location}}`
     * * `organizations/{{organization_id}}`
     * * `organizations/{{organization_id}}/locations/{{location}}`
     * 
     */
    @Import(name="parent")
      private final @Nullable Output<String> parent;

    public Output<String> parent() {
        return this.parent == null ? Codegen.empty() : this.parent;
    }

    /**
     * Regular expression which defines the rule.
     * Structure is documented below.
     * 
     */
    @Import(name="regex")
      private final @Nullable Output<PreventionStoredInfoTypeRegexGetArgs> regex;

    public Output<PreventionStoredInfoTypeRegexGetArgs> regex() {
        return this.regex == null ? Codegen.empty() : this.regex;
    }

    public PreventionStoredInfoTypeState(
        @Nullable Output<String> description,
        @Nullable Output<PreventionStoredInfoTypeDictionaryGetArgs> dictionary,
        @Nullable Output<String> displayName,
        @Nullable Output<PreventionStoredInfoTypeLargeCustomDictionaryGetArgs> largeCustomDictionary,
        @Nullable Output<String> name,
        @Nullable Output<String> parent,
        @Nullable Output<PreventionStoredInfoTypeRegexGetArgs> regex) {
        this.description = description;
        this.dictionary = dictionary;
        this.displayName = displayName;
        this.largeCustomDictionary = largeCustomDictionary;
        this.name = name;
        this.parent = parent;
        this.regex = regex;
    }

    private PreventionStoredInfoTypeState() {
        this.description = Codegen.empty();
        this.dictionary = Codegen.empty();
        this.displayName = Codegen.empty();
        this.largeCustomDictionary = Codegen.empty();
        this.name = Codegen.empty();
        this.parent = Codegen.empty();
        this.regex = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionStoredInfoTypeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<PreventionStoredInfoTypeDictionaryGetArgs> dictionary;
        private @Nullable Output<String> displayName;
        private @Nullable Output<PreventionStoredInfoTypeLargeCustomDictionaryGetArgs> largeCustomDictionary;
        private @Nullable Output<String> name;
        private @Nullable Output<String> parent;
        private @Nullable Output<PreventionStoredInfoTypeRegexGetArgs> regex;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionStoredInfoTypeState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.dictionary = defaults.dictionary;
    	      this.displayName = defaults.displayName;
    	      this.largeCustomDictionary = defaults.largeCustomDictionary;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.regex = defaults.regex;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder dictionary(@Nullable Output<PreventionStoredInfoTypeDictionaryGetArgs> dictionary) {
            this.dictionary = dictionary;
            return this;
        }
        public Builder dictionary(@Nullable PreventionStoredInfoTypeDictionaryGetArgs dictionary) {
            this.dictionary = Codegen.ofNullable(dictionary);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder largeCustomDictionary(@Nullable Output<PreventionStoredInfoTypeLargeCustomDictionaryGetArgs> largeCustomDictionary) {
            this.largeCustomDictionary = largeCustomDictionary;
            return this;
        }
        public Builder largeCustomDictionary(@Nullable PreventionStoredInfoTypeLargeCustomDictionaryGetArgs largeCustomDictionary) {
            this.largeCustomDictionary = Codegen.ofNullable(largeCustomDictionary);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder parent(@Nullable Output<String> parent) {
            this.parent = parent;
            return this;
        }
        public Builder parent(@Nullable String parent) {
            this.parent = Codegen.ofNullable(parent);
            return this;
        }
        public Builder regex(@Nullable Output<PreventionStoredInfoTypeRegexGetArgs> regex) {
            this.regex = regex;
            return this;
        }
        public Builder regex(@Nullable PreventionStoredInfoTypeRegexGetArgs regex) {
            this.regex = Codegen.ofNullable(regex);
            return this;
        }        public PreventionStoredInfoTypeState build() {
            return new PreventionStoredInfoTypeState(description, dictionary, displayName, largeCustomDictionary, name, parent, regex);
        }
    }
}
