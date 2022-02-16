// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.pinpoint.outputs;

import io.pulumi.awsnative.pinpoint.enums.InAppTemplateLayout;
import io.pulumi.awsnative.pinpoint.outputs.InAppTemplateInAppMessageContent;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetInAppTemplateResult {
    private final @Nullable String arn;
    private final @Nullable List<InAppTemplateInAppMessageContent> content;
    private final @Nullable Object customConfig;
    private final @Nullable InAppTemplateLayout layout;
    private final @Nullable Object tags;
    private final @Nullable String templateDescription;

    @OutputCustomType.Constructor({"arn","content","customConfig","layout","tags","templateDescription"})
    private GetInAppTemplateResult(
        @Nullable String arn,
        @Nullable List<InAppTemplateInAppMessageContent> content,
        @Nullable Object customConfig,
        @Nullable InAppTemplateLayout layout,
        @Nullable Object tags,
        @Nullable String templateDescription) {
        this.arn = arn;
        this.content = content;
        this.customConfig = customConfig;
        this.layout = layout;
        this.tags = tags;
        this.templateDescription = templateDescription;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public List<InAppTemplateInAppMessageContent> getContent() {
        return this.content == null ? List.of() : this.content;
    }
    public Optional<Object> getCustomConfig() {
        return Optional.ofNullable(this.customConfig);
    }
    public Optional<InAppTemplateLayout> getLayout() {
        return Optional.ofNullable(this.layout);
    }
    public Optional<Object> getTags() {
        return Optional.ofNullable(this.tags);
    }
    public Optional<String> getTemplateDescription() {
        return Optional.ofNullable(this.templateDescription);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInAppTemplateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable List<InAppTemplateInAppMessageContent> content;
        private @Nullable Object customConfig;
        private @Nullable InAppTemplateLayout layout;
        private @Nullable Object tags;
        private @Nullable String templateDescription;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInAppTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.content = defaults.content;
    	      this.customConfig = defaults.customConfig;
    	      this.layout = defaults.layout;
    	      this.tags = defaults.tags;
    	      this.templateDescription = defaults.templateDescription;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setContent(@Nullable List<InAppTemplateInAppMessageContent> content) {
            this.content = content;
            return this;
        }

        public Builder setCustomConfig(@Nullable Object customConfig) {
            this.customConfig = customConfig;
            return this;
        }

        public Builder setLayout(@Nullable InAppTemplateLayout layout) {
            this.layout = layout;
            return this;
        }

        public Builder setTags(@Nullable Object tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTemplateDescription(@Nullable String templateDescription) {
            this.templateDescription = templateDescription;
            return this;
        }

        public GetInAppTemplateResult build() {
            return new GetInAppTemplateResult(arn, content, customConfig, layout, tags, templateDescription);
        }
    }
}