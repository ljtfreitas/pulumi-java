// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePathGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryGetArgs Empty = new PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryGetArgs();

    /**
     * Newline-delimited file of words in Cloud Storage. Only a single file is accepted.
     * Structure is documented below.
     * 
     */
    @Import(name="cloudStoragePath")
      private final @Nullable Output<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePathGetArgs> cloudStoragePath;

    public Output<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePathGetArgs> cloudStoragePath() {
        return this.cloudStoragePath == null ? Codegen.empty() : this.cloudStoragePath;
    }

    /**
     * List of words or phrases to search for.
     * Structure is documented below.
     * 
     */
    @Import(name="wordList")
      private final @Nullable Output<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListGetArgs> wordList;

    public Output<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListGetArgs> wordList() {
        return this.wordList == null ? Codegen.empty() : this.wordList;
    }

    public PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryGetArgs(
        @Nullable Output<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePathGetArgs> cloudStoragePath,
        @Nullable Output<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListGetArgs> wordList) {
        this.cloudStoragePath = cloudStoragePath;
        this.wordList = wordList;
    }

    private PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryGetArgs() {
        this.cloudStoragePath = Codegen.empty();
        this.wordList = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePathGetArgs> cloudStoragePath;
        private @Nullable Output<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListGetArgs> wordList;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudStoragePath = defaults.cloudStoragePath;
    	      this.wordList = defaults.wordList;
        }

        public Builder cloudStoragePath(@Nullable Output<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePathGetArgs> cloudStoragePath) {
            this.cloudStoragePath = cloudStoragePath;
            return this;
        }
        public Builder cloudStoragePath(@Nullable PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePathGetArgs cloudStoragePath) {
            this.cloudStoragePath = Codegen.ofNullable(cloudStoragePath);
            return this;
        }
        public Builder wordList(@Nullable Output<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListGetArgs> wordList) {
            this.wordList = wordList;
            return this;
        }
        public Builder wordList(@Nullable PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListGetArgs wordList) {
            this.wordList = Codegen.ofNullable(wordList);
            return this;
        }        public PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryGetArgs build() {
            return new PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryGetArgs(cloudStoragePath, wordList);
        }
    }
}
