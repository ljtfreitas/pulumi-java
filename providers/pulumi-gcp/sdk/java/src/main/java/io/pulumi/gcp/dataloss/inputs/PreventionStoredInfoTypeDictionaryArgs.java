// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeDictionaryCloudStoragePathArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeDictionaryWordListArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionStoredInfoTypeDictionaryArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionStoredInfoTypeDictionaryArgs Empty = new PreventionStoredInfoTypeDictionaryArgs();

    /**
     * Newline-delimited file of words in Cloud Storage. Only a single file is accepted.
     * Structure is documented below.
     * 
     */
    @Import(name="cloudStoragePath")
      private final @Nullable Output<PreventionStoredInfoTypeDictionaryCloudStoragePathArgs> cloudStoragePath;

    public Output<PreventionStoredInfoTypeDictionaryCloudStoragePathArgs> getCloudStoragePath() {
        return this.cloudStoragePath == null ? Output.empty() : this.cloudStoragePath;
    }

    /**
     * List of words or phrases to search for.
     * Structure is documented below.
     * 
     */
    @Import(name="wordList")
      private final @Nullable Output<PreventionStoredInfoTypeDictionaryWordListArgs> wordList;

    public Output<PreventionStoredInfoTypeDictionaryWordListArgs> getWordList() {
        return this.wordList == null ? Output.empty() : this.wordList;
    }

    public PreventionStoredInfoTypeDictionaryArgs(
        @Nullable Output<PreventionStoredInfoTypeDictionaryCloudStoragePathArgs> cloudStoragePath,
        @Nullable Output<PreventionStoredInfoTypeDictionaryWordListArgs> wordList) {
        this.cloudStoragePath = cloudStoragePath;
        this.wordList = wordList;
    }

    private PreventionStoredInfoTypeDictionaryArgs() {
        this.cloudStoragePath = Output.empty();
        this.wordList = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionStoredInfoTypeDictionaryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PreventionStoredInfoTypeDictionaryCloudStoragePathArgs> cloudStoragePath;
        private @Nullable Output<PreventionStoredInfoTypeDictionaryWordListArgs> wordList;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionStoredInfoTypeDictionaryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudStoragePath = defaults.cloudStoragePath;
    	      this.wordList = defaults.wordList;
        }

        public Builder cloudStoragePath(@Nullable Output<PreventionStoredInfoTypeDictionaryCloudStoragePathArgs> cloudStoragePath) {
            this.cloudStoragePath = cloudStoragePath;
            return this;
        }

        public Builder cloudStoragePath(@Nullable PreventionStoredInfoTypeDictionaryCloudStoragePathArgs cloudStoragePath) {
            this.cloudStoragePath = Output.ofNullable(cloudStoragePath);
            return this;
        }

        public Builder wordList(@Nullable Output<PreventionStoredInfoTypeDictionaryWordListArgs> wordList) {
            this.wordList = wordList;
            return this;
        }

        public Builder wordList(@Nullable PreventionStoredInfoTypeDictionaryWordListArgs wordList) {
            this.wordList = Output.ofNullable(wordList);
            return this;
        }
        public PreventionStoredInfoTypeDictionaryArgs build() {
            return new PreventionStoredInfoTypeDictionaryArgs(cloudStoragePath, wordList);
        }
    }
}
