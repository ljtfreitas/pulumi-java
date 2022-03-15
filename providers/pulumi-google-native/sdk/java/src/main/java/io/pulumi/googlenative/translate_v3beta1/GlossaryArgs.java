// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.translate_v3beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.translate_v3beta1.inputs.GlossaryInputConfigArgs;
import io.pulumi.googlenative.translate_v3beta1.inputs.LanguageCodePairArgs;
import io.pulumi.googlenative.translate_v3beta1.inputs.LanguageCodesSetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlossaryArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlossaryArgs Empty = new GlossaryArgs();

    /**
     * Provides examples to build the glossary from. Total glossary must not exceed 10M Unicode codepoints.
     * 
     */
    @Import(name="inputConfig", required=true)
      private final Output<GlossaryInputConfigArgs> inputConfig;

    public Output<GlossaryInputConfigArgs> getInputConfig() {
        return this.inputConfig;
    }

    /**
     * Used with equivalent term set glossaries.
     * 
     */
    @Import(name="languageCodesSet")
      private final @Nullable Output<LanguageCodesSetArgs> languageCodesSet;

    public Output<LanguageCodesSetArgs> getLanguageCodesSet() {
        return this.languageCodesSet == null ? Output.empty() : this.languageCodesSet;
    }

    /**
     * Used with unidirectional glossaries.
     * 
     */
    @Import(name="languagePair")
      private final @Nullable Output<LanguageCodePairArgs> languagePair;

    public Output<LanguageCodePairArgs> getLanguagePair() {
        return this.languagePair == null ? Output.empty() : this.languagePair;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The resource name of the glossary. Glossary names have the form `projects/{project-number-or-id}/locations/{location-id}/glossaries/{glossary-id}`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    public GlossaryArgs(
        Output<GlossaryInputConfigArgs> inputConfig,
        @Nullable Output<LanguageCodesSetArgs> languageCodesSet,
        @Nullable Output<LanguageCodePairArgs> languagePair,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project) {
        this.inputConfig = Objects.requireNonNull(inputConfig, "expected parameter 'inputConfig' to be non-null");
        this.languageCodesSet = languageCodesSet;
        this.languagePair = languagePair;
        this.location = location;
        this.name = name;
        this.project = project;
    }

    private GlossaryArgs() {
        this.inputConfig = Output.empty();
        this.languageCodesSet = Output.empty();
        this.languagePair = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlossaryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<GlossaryInputConfigArgs> inputConfig;
        private @Nullable Output<LanguageCodesSetArgs> languageCodesSet;
        private @Nullable Output<LanguageCodePairArgs> languagePair;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(GlossaryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputConfig = defaults.inputConfig;
    	      this.languageCodesSet = defaults.languageCodesSet;
    	      this.languagePair = defaults.languagePair;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder inputConfig(Output<GlossaryInputConfigArgs> inputConfig) {
            this.inputConfig = Objects.requireNonNull(inputConfig);
            return this;
        }

        public Builder inputConfig(GlossaryInputConfigArgs inputConfig) {
            this.inputConfig = Output.of(Objects.requireNonNull(inputConfig));
            return this;
        }

        public Builder languageCodesSet(@Nullable Output<LanguageCodesSetArgs> languageCodesSet) {
            this.languageCodesSet = languageCodesSet;
            return this;
        }

        public Builder languageCodesSet(@Nullable LanguageCodesSetArgs languageCodesSet) {
            this.languageCodesSet = Output.ofNullable(languageCodesSet);
            return this;
        }

        public Builder languagePair(@Nullable Output<LanguageCodePairArgs> languagePair) {
            this.languagePair = languagePair;
            return this;
        }

        public Builder languagePair(@Nullable LanguageCodePairArgs languagePair) {
            this.languagePair = Output.ofNullable(languagePair);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
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
        public GlossaryArgs build() {
            return new GlossaryArgs(inputConfig, languageCodesSet, languagePair, location, name, project);
        }
    }
}
