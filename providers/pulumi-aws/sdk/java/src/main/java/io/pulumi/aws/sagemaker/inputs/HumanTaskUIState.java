// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.HumanTaskUIUiTemplateGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HumanTaskUIState extends io.pulumi.resources.ResourceArgs {

    public static final HumanTaskUIState Empty = new HumanTaskUIState();

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Human Task UI.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The name of the Human Task UI.
     * 
     */
    @InputImport(name="humanTaskUiName")
    private final @Nullable Input<String> humanTaskUiName;

    public Input<String> getHumanTaskUiName() {
        return this.humanTaskUiName == null ? Input.empty() : this.humanTaskUiName;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * The Liquid template for the worker user interface. See UI Template below.
     * 
     */
    @InputImport(name="uiTemplate")
    private final @Nullable Input<HumanTaskUIUiTemplateGetArgs> uiTemplate;

    public Input<HumanTaskUIUiTemplateGetArgs> getUiTemplate() {
        return this.uiTemplate == null ? Input.empty() : this.uiTemplate;
    }

    public HumanTaskUIState(
        @Nullable Input<String> arn,
        @Nullable Input<String> humanTaskUiName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<HumanTaskUIUiTemplateGetArgs> uiTemplate) {
        this.arn = arn;
        this.humanTaskUiName = humanTaskUiName;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.uiTemplate = uiTemplate;
    }

    private HumanTaskUIState() {
        this.arn = Input.empty();
        this.humanTaskUiName = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.uiTemplate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HumanTaskUIState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> humanTaskUiName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<HumanTaskUIUiTemplateGetArgs> uiTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(HumanTaskUIState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.humanTaskUiName = defaults.humanTaskUiName;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.uiTemplate = defaults.uiTemplate;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setHumanTaskUiName(@Nullable Input<String> humanTaskUiName) {
            this.humanTaskUiName = humanTaskUiName;
            return this;
        }

        public Builder setHumanTaskUiName(@Nullable String humanTaskUiName) {
            this.humanTaskUiName = Input.ofNullable(humanTaskUiName);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setUiTemplate(@Nullable Input<HumanTaskUIUiTemplateGetArgs> uiTemplate) {
            this.uiTemplate = uiTemplate;
            return this;
        }

        public Builder setUiTemplate(@Nullable HumanTaskUIUiTemplateGetArgs uiTemplate) {
            this.uiTemplate = Input.ofNullable(uiTemplate);
            return this;
        }
        public HumanTaskUIState build() {
            return new HumanTaskUIState(arn, humanTaskUiName, tags, tagsAll, uiTemplate);
        }
    }
}
