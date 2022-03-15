// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.CodeRepositoryGitConfigGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CodeRepositoryState extends io.pulumi.resources.ResourceArgs {

    public static final CodeRepositoryState Empty = new CodeRepositoryState();

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Code Repository.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The name of the Code Repository (must be unique).
     * 
     */
    @Import(name="codeRepositoryName")
      private final @Nullable Output<String> codeRepositoryName;

    public Output<String> getCodeRepositoryName() {
        return this.codeRepositoryName == null ? Output.empty() : this.codeRepositoryName;
    }

    /**
     * Specifies details about the repository. see Git Config details below.
     * 
     */
    @Import(name="gitConfig")
      private final @Nullable Output<CodeRepositoryGitConfigGetArgs> gitConfig;

    public Output<CodeRepositoryGitConfigGetArgs> getGitConfig() {
        return this.gitConfig == null ? Output.empty() : this.gitConfig;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public CodeRepositoryState(
        @Nullable Output<String> arn,
        @Nullable Output<String> codeRepositoryName,
        @Nullable Output<CodeRepositoryGitConfigGetArgs> gitConfig,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.codeRepositoryName = codeRepositoryName;
        this.gitConfig = gitConfig;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private CodeRepositoryState() {
        this.arn = Output.empty();
        this.codeRepositoryName = Output.empty();
        this.gitConfig = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CodeRepositoryState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> codeRepositoryName;
        private @Nullable Output<CodeRepositoryGitConfigGetArgs> gitConfig;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(CodeRepositoryState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.codeRepositoryName = defaults.codeRepositoryName;
    	      this.gitConfig = defaults.gitConfig;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder codeRepositoryName(@Nullable Output<String> codeRepositoryName) {
            this.codeRepositoryName = codeRepositoryName;
            return this;
        }

        public Builder codeRepositoryName(@Nullable String codeRepositoryName) {
            this.codeRepositoryName = Output.ofNullable(codeRepositoryName);
            return this;
        }

        public Builder gitConfig(@Nullable Output<CodeRepositoryGitConfigGetArgs> gitConfig) {
            this.gitConfig = gitConfig;
            return this;
        }

        public Builder gitConfig(@Nullable CodeRepositoryGitConfigGetArgs gitConfig) {
            this.gitConfig = Output.ofNullable(gitConfig);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }
        public CodeRepositoryState build() {
            return new CodeRepositoryState(arn, codeRepositoryName, gitConfig, tags, tagsAll);
        }
    }
}
