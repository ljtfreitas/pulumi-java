// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePathArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordListArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryArgs Empty = new PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryArgs();

    /**
     * Newline-delimited file of words in Cloud Storage. Only a single file is accepted.
     * Structure is documented below.
     * 
     */
    @Import(name="cloudStoragePath")
      private final @Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePathArgs> cloudStoragePath;

    public Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePathArgs> getCloudStoragePath() {
        return this.cloudStoragePath == null ? Output.empty() : this.cloudStoragePath;
    }

    /**
     * List of words or phrases to search for.
     * Structure is documented below.
     * 
     */
    @Import(name="wordList")
      private final @Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordListArgs> wordList;

    public Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordListArgs> getWordList() {
        return this.wordList == null ? Output.empty() : this.wordList;
    }

    public PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryArgs(
        @Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePathArgs> cloudStoragePath,
        @Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordListArgs> wordList) {
        this.cloudStoragePath = cloudStoragePath;
        this.wordList = wordList;
    }

    private PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryArgs() {
        this.cloudStoragePath = Output.empty();
        this.wordList = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePathArgs> cloudStoragePath;
        private @Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordListArgs> wordList;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudStoragePath = defaults.cloudStoragePath;
    	      this.wordList = defaults.wordList;
        }

        public Builder cloudStoragePath(@Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePathArgs> cloudStoragePath) {
            this.cloudStoragePath = cloudStoragePath;
            return this;
        }

        public Builder cloudStoragePath(@Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePathArgs cloudStoragePath) {
            this.cloudStoragePath = Output.ofNullable(cloudStoragePath);
            return this;
        }

        public Builder wordList(@Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordListArgs> wordList) {
            this.wordList = wordList;
            return this;
        }

        public Builder wordList(@Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordListArgs wordList) {
            this.wordList = Output.ofNullable(wordList);
            return this;
        }
        public PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryArgs build() {
            return new PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryArgs(cloudStoragePath, wordList);
        }
    }
}
